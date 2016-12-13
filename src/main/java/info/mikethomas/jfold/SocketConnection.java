/*
 * #%L
 * This file is part of jFold.
 * %%
 * Copyright (C) 2012 - 2015 Michael Thomas (mikepthomas@outlook.com)
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
package info.mikethomas.jfold;

import info.mikethomas.jfold.exceptions.CommandException;
import info.mikethomas.jfold.util.Command;
import info.mikethomas.jfold.util.PyonParser;
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

    /** Clear Screen. */
    public static final String CLRSCR = "\033[H\033[2J";
    /** Command Prompt. */
    public static final String COMMAND_PROMPT = "> ";
    /** Welcome Message. */
    public static final String WELCOME_MSG
            = "Welcome to the Folding@home Client command server.";
    /** Logger. */
    private static final Logger LOGGER
            = LoggerFactory.getLogger(SocketConnection.class);

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
            in = new BufferedReader(new InputStreamReader(
                    socket.getInputStream(), ENCODING));

            String welcome = in.readLine();
            LOGGER.info(welcome);
            if (!(CLRSCR + WELCOME_MSG).equals(welcome)) {
                throw new IOException(
                        "Unexpected welcome message, check client version");
            }
        }
    }

    /**
     * Send a command to the Folding@home Client.
     *
     * @param command command to send to the client
     * @return String response from client
     * @throws info.mikethomas.jfold.exceptions.CommandException if any.
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
     * @throws info.mikethomas.jfold.exceptions.CommandException if any.
     */
    protected String sendCommand(final Command command, final List<String> args)
            throws CommandException {
        StringBuilder arguments = new StringBuilder();

        for (String arg : args) {
            arguments.append(" '").append(arg).append("'");
        }

        // Send the command
        try {
            out.println(command + arguments.toString());
            LOGGER.info("Sent Command: " + command + arguments.toString());

            if (in.skip(COMMAND_PROMPT.length()) != 2) {
                throw new IOException("Failed to ignore command prompt \"> \"");
            }

            // Get the output
            switch (command.getResponseType()) {
                case PYON:
                    return PyonParser.convert(getPyon());

                case STRING:
                    return getString();

                case VOID:
                    in.mark(COMMAND_PROMPT.length());
                    char[] cbuf = new char[COMMAND_PROMPT.length()];
                    in.read(cbuf);
                    in.reset();

                    if (!String.valueOf(cbuf).equals(COMMAND_PROMPT)) {
                        String error = PyonParser.convert(getPyon());
                        throw new CommandException(error);
                    }

                default:
                    return null;
            }
        } catch (IOException ex) {
            throw new CommandException(ex.getLocalizedMessage());
        }
    }

    /**
     * Receive a String response from the Folding@home Client.
     *
     * @return String response
     * @throws java.io.IOException if any.
     */
    private String getString() throws IOException {
        StringBuilder stringBuilder = new StringBuilder();

        char ch;
        do {
            in.mark(1);
            ch = (char) in.read();
            stringBuilder.append(ch);
        } while (ch != '>');
        in.reset();

        String string = stringBuilder.toString().replace(ch, '\0').trim();

        LOGGER.info("Recieved String: " + string);

        return string;
    }

    /**
     * Receive a PyON response from the Folding@home Client.
     *
     * @return String response
     * @throws java.io.IOException if any.
     */
    private String getPyon() throws IOException {
        StringBuilder stringBuilder = new StringBuilder();

        String line;
        while (!"---".equals(line = in.readLine())) {
            stringBuilder.append(line).append('\n');
        }

        String string = stringBuilder.toString().trim();

        LOGGER.info("Recieved PyON:\n" + string);

        return string;
    }
}
