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

    private final Socket socket;
    private final BufferedReader in;
    private final PrintStream out;

    /**
     * <p>Default Constructor for SocketConnection.</p>
     *
     * @throws java.io.IOException a int.
     */
    public SocketConnection() throws IOException {
        this("localhost", 36330);
    }

    /**
     * <p>Constructor for SocketConnection.</p>
     *
     * @param address a {@link java.lang.String} object.
     * @param port a int.
     * @throws java.io.IOException a int.
     */
    public SocketConnection(String address, int port) throws IOException {
        super();

        socket = new Socket(address, port);

        in = new BufferedReader(new InputStreamReader(socket.getInputStream(), ENCODING));
        out = new PrintStream(socket.getOutputStream(), true, ENCODING);

        // Welcome to the Folding@home Client command server. TODO: check input
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
    public SocketConnection(String address, int port, String password, int retryRate) throws IOException {
        this(address, port);
    }

    /** {@inheritDoc} */
    @Override
    protected String getNumSlotsOutput() {
        sendCommand("num-slots");
        return PyonParser.convert(getString());
    }

    /** {@inheritDoc} */
    @Override
    protected String getOptionsOutput(boolean listDefault, boolean listUnset) {
        String defaultValue = listDefault ? " -d" : "";
        String unsetValue = listUnset ? " -a" : "";
        sendCommand("options" + defaultValue + unsetValue);
        return PyonParser.convert(getString());
    }

    /** {@inheritDoc} */
    @Override
    protected String getPpdOutput() {
        sendCommand("ppd");
        return PyonParser.convert(getString());
    }

    /** {@inheritDoc} */
    @Override
    protected String getSimulationInfoOutput(int slot) {
        sendCommand("simulation-info " + slot);
        return PyonParser.convert(getString());
    }

    /** {@inheritDoc} */
    @Override
    protected String getSlotInfoOutput() {
        sendCommand("slot-info");
        return PyonParser.convert(getString());
    }

    /** {@inheritDoc} */
    @Override
    protected String getSlotOptionsOutput(int slot) {
        sendCommand("slot-options " + slot + " -a");
        return PyonParser.convert(getString());
    }

    /** {@inheritDoc} */
    @Override
    protected String getUptimeOutput() {
        sendCommand("uptime");
        return getString();
    }

    private void sendCommand(String command) {
        out.println(command);

        String message = "Sent: " + command;
        Logger.getLogger(this.getClass().getName()).log(Level.INFO, message);
    }

    private String getString() {
        StringBuilder stringBuilder = new StringBuilder();

        try {
            in.read(); // first char is '>'
            char ch;
            while((ch = (char) in.read()) != '>') {
                stringBuilder.append((char) ch);
            }
        }
        catch (IOException ex) {
            Logger.getLogger(SocketConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        String string = stringBuilder.toString().trim();
        
        String message = "Recieved String: " + string;
        Logger.getLogger(this.getClass().getName()).log(Level.INFO, message);

        return string;
    }
}
