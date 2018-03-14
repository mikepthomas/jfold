/*
 * #%L
 * This file is part of jFold.
 * %%
 * Copyright (C) 2012 - 2018 Mike Thomas <mikepthomas@outlook.com>
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

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.extern.slf4j.XSlf4j;

import org.slf4j.profiler.Profiler;

/**
 * <p>SocketConnection class.</p>
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version 7.4.4
 */
@XSlf4j
public class SocketConnection {

    /** Clear Screen. */
    public static final String CLRSCR = "\033[H\033[2J";
    /** Command Prompt. */
    public static final String COMMAND_PROMPT = "> ";
    /** Encoding. */
    public static final String ENCODING = "UTF-8";
    /** Welcome Message. */
    public static final String WELCOME_MSG
            = "Welcome to the Folding@home Client command server.";

    /** Socket to connect to F@H Client. */
    private Socket socket = null;
    /** OutputStream to send commands to. */
    private PrintStream out = null;
    /** InputStream to receive data from. */
    private Scanner in = null;

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
            in = new Scanner(socket.getInputStream(), ENCODING);
            in.useDelimiter(COMMAND_PROMPT);

            String welcome = in.nextLine();
            log.info(welcome);
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
        return sendCommand(command, new ArrayList<>());
    }

    /**
     * Send a command to the Folding@home Client with arguments.
     *
     * @param command command to send to the client
     * @param args command arguments
     * @return String response from client
     * @throws info.mikethomas.jfold.exceptions.CommandException if any.
     */
    protected String sendCommand(final Command command,
            final List<String> args) throws CommandException {
        log.entry(command, args);

        Profiler profiler = new Profiler(command.toString());
        profiler.setLogger(log);

        StringBuilder arguments = new StringBuilder();
        args.forEach(arg -> arguments.append(" '").append(arg).append("'"));

        // Send the command
        profiler.start("Send Command");
        out.println(command + arguments.toString());
        log.info("Sent Command: {} {}", command, arguments.toString());

        // Get the output
        String response = "";
        switch (command.getResponseType()) {
            case PYON:
            case STRING:
                profiler.start("Get Response");
                response = in.next().replaceFirst(COMMAND_PROMPT, "");
                if (response.startsWith(PyonParser.PYON_1)) {
                    profiler.start("Convert to JSON");
                    response = PyonParser.convert(response);
                } else if (response.equals("")) {
                    // TODO: remove dirty hack to stop ObjectMapper breaking
                    response = "[]";
                }

            default:
                log.info("Recieved Response: {}", response);
                profiler.stop().log();
        }
        return log.exit(response);
    }
}
