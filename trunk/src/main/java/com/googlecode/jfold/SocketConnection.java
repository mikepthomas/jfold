/*
 * #%L
 * This file is part of jFold.
 * %%
 * Copyright (C) 2012 - 2014 Michael Thomas (mikepthomas@outlook.com)
 * %%
 * jFold is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * %
 * jFold is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * %
 * You should have received a copy of the GNU General Public License
 * along with jFold.  If not, see <http://www.gnu.org/licenses/>.
 * #L%
 */
package com.googlecode.jfold;

import com.googlecode.jfold.exceptions.CommandException;
import com.googlecode.jfold.exceptions.PyonParserException;
import com.googlecode.jfold.util.Command;
import com.googlecode.jfold.util.PyonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>SocketConnection class.</p>
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version 7.4.4
 */
public abstract class SocketConnection implements Connection {

    /** Logger. */
    private static final Logger LOGGER = LoggerFactory.getLogger(
            SocketConnection.class);

    /** Socket to connect to F@H Client. */
    private Socket socket = null;
    /** OutputStream to receive data from. */
    private PrintStream out = null;
    /** InputStream to send commands to. */
    private BufferedReader in = null;

    /**
     * <p>Constructor for SocketConnection.</p>
     *
     * @param address a {@link java.lang.String} object.
     * @param port a int.
     * @throws java.io.IOException a int.
     */
    public SocketConnection(
            final String address, final int port) throws IOException {
        super();

        if (address != null) {
            socket = new Socket(address, port);

            out = new PrintStream(socket.getOutputStream(), true, ENCODING);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream(),
                    ENCODING));

            // Welcome to the Folding@home Client command server.
            // TODO: check input
            LOGGER.info(in.readLine());
        }
    }

    /**
     * Send a command to the Folding@home Client.
     *
     * @param command command to send to the client
     * @return String response from client
     * @throws com.googlecode.jfold.exceptions.CommandException if any.
     */
    protected String sendCommand(final Command command)
            throws CommandException {
        return sendCommand(command, new ArrayList<String>());
    }

    /**
     * Send a command to the Folding@home Client with arguments.
     *
     * @param command command to send to the client
     * @param args command arguments
     * @return String response from client
     * @throws com.googlecode.jfold.exceptions.CommandException if any.
     */
    protected String sendCommand(final Command command, final List<String> args)
            throws CommandException {
        StringBuilder arguments = new StringBuilder();

        for (String arg : args) {
            arguments.append(" '").append(arg).append("'");
        }

        // Send the command
        out.println(command + arguments.toString());
        LOGGER.info("Sent Command: " + command + arguments.toString());

        // Get the output
        switch (command.getResponseType()) {
            case PYON:
                try {
                    return PyonParser.convert(getPyon());
                } catch (PyonParserException ex) {
                    throw new CommandException(ex.getLocalizedMessage());
                }

            case STRING:
                return getString();

            case VOID:
                try {
                    in.skip(2); // ignore command prompt "> "
                }
                catch (IOException ex) {
                    throw new CommandException(ex.getLocalizedMessage());
                }

            default:
                return null;
        }
    }

    /**
     * Receive a String response from the Folding@home Client.
     *
     * @return String response
     */
    private String getString() {
        StringBuilder stringBuilder = new StringBuilder();

        try {
            in.skip(2); // ignore command prompt "> "
            char ch;
            while ((ch = (char) in.read()) != '>') {
                stringBuilder.append((char) ch);
            }
        } catch (IOException ex) {
            LOGGER.error(null, ex);
        }

        String string = stringBuilder.toString().trim();

        LOGGER.info("Recieved String: " + string);

        return string;
    }

    /**
     * Receive a PyON response from the Folding@home Client.
     *
     * @return String response
     */
    private String getPyon() {
        StringBuilder stringBuilder = new StringBuilder();

        try {
            in.skip(1); // ignore command prompt '>'
            String string;
            while (!(string = in.readLine()).equals("---")) {
                stringBuilder.append(string).append('\n');
            }
        } catch (IOException ex) {
            LOGGER.error(null, ex);
        }

        String string = stringBuilder.toString().trim();

        LOGGER.info("Recieved PyON: " + string);

        return string;
    }
}
