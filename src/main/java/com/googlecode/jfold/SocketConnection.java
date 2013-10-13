/*
 * #%L
 * This file is part of jFold.
 * %%
 * Copyright (C) 2012 - 2013 Michael Thomas <mikepthomas@outlook.com>
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <p>SocketConnection class.</p>
 *
 * @author Michael Thomas <mikepthomas@outlook.com>
 * @version $Id: $Id
 */
public class SocketConnection extends GsonConnection implements Connection {

    public static final String DEFAULT_HOST = "localhost";
    public static final int DEFAULT_PORT = 36330;

    /**
     * Socket to connect to F@H Client.
     */
    private final Socket socket;
    /**
     * InputStream to send commands to.
     */
    private final BufferedReader in;
    /**
     * OutputStream to receive data from.
     */
    private final PrintStream out;

    /**
     * <p>Default Constructor for SocketConnection.</p>
     *
     * @throws java.io.IOException a int.
     */
    public SocketConnection() throws IOException {
        this(DEFAULT_HOST, DEFAULT_PORT);
    }

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

        socket = new Socket(address, port);

        in = new BufferedReader(new InputStreamReader(socket.getInputStream(), ENCODING));
        out = new PrintStream(socket.getOutputStream(), true, ENCODING);

        // Welcome to the Folding@home Client command server.
        // TODO: check input
        Logger.getLogger(this.getClass().getName()).log(Level.INFO, in.readLine());
    }

    /**
     * <p>Constructor for SocketConnection.</p>
     *
     * @param address a {@link java.lang.String} object.
     * @param port a int.
     * @param password a {@link java.lang.String} object.
     * @param retryRate a int.
     * @throws java.io.IOException a int.
     */
    public SocketConnection(
            final String address, final int port,
            final String password, final int retryRate) throws IOException {
        this(address, port);
    }

    /** {@inheritDoc} */
    @Override
    protected final String getNumSlotsOutput() {
        sendCommand("num-slots");
        return PyonParser.convert(getString());
    }

    /** {@inheritDoc} */
    @Override
    protected final String getOptionsOutput(
            final boolean listDefault, final boolean listUnset) {
        String defaultValue = listDefault ? " -d" : "";
        String unsetValue = listUnset ? " -a" : "";
        sendCommand("options" + defaultValue + unsetValue);
        return PyonParser.convert(getString());
    }

    /** {@inheritDoc} */
    @Override
    protected final String getPpdOutput() {
        sendCommand("ppd");
        return PyonParser.convert(getString());
    }

    /** {@inheritDoc} */
    @Override
    protected final String getSimulationInfoOutput(final int slot) {
        sendCommand("simulation-info " + slot);
        return PyonParser.convert(getString());
    }

    /** {@inheritDoc} */
    @Override
    protected final String getSlotInfoOutput() {
        sendCommand("slot-info");
        return PyonParser.convert(getString());
    }

    /** {@inheritDoc} */
    @Override
    protected final String getSlotOptionsOutput(final int slot) {
        sendCommand("slot-options " + slot + " -a");
        return PyonParser.convert(getString());
    }

    /** {@inheritDoc} */
    @Override
    protected final String getUptimeOutput() {
        sendCommand("uptime");
        return getString();
    }

    /**
     * Send a command to the Folding@home Client.
     *
     * @param command
     */
    private void sendCommand(String command) {
        out.println(command);

        String message = "Sent: " + command;
        Logger.getLogger(this.getClass().getName()).log(Level.INFO, message);
    }

    /**
     * Receive the response from the Folding@home Client.
     *
     * @return String response
     */
    private String getString() {
        StringBuilder stringBuilder = new StringBuilder();

        try {
            in.read(); // first char is '>'
            char ch;
            while ((ch = (char) in.read()) != '>') {
                stringBuilder.append((char) ch);
            }
        } catch (IOException ex) {
            Logger.getLogger(SocketConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        String string = stringBuilder.toString().trim();

        String message = "Recieved String: " + string;
        Logger.getLogger(this.getClass().getName()).log(Level.INFO, message);

        return string;
    }
}