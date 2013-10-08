package com.googlecode.jfold;

/*
 * #%L
 * jFold
 * %%
 * Copyright (C) 2012 - 2013 Michael Thomas <mikepthomas@outlook.com>
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public 
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <p>SocketConnection class.</p>
 *
 * @author Michael Thomas <mikepthomas@outlook.com>
 * @version $Id: $Id
 */
public class SocketConnection extends AbstractConnection implements Connection {

    private final Socket socket;
    private final BufferedReader in;
    private final PrintWriter out;

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

        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(), true);

        // Welcome to the Folding@home Client command server. TODO: check input
        Logger.getLogger(this.getClass().getName()).log(Level.INFO, in.readLine());
    }

    /**
     * <p>Constructor for SocketConnection.</p>
     *
     * @param address a {@link java.lang.String} object.
     * @param port a int.
     * @param password a {@link java.lang.String} object.
     * @param retryRate
     * @throws java.io.IOException a int.
     */
    public SocketConnection(String address, int port, String password, int retryRate) throws IOException {
        this(address, port);
    }

    /** {@inheritDoc} */
    @Override
    public String uptime() {
        sendCommand("uptime");
        return getString();
    }

    @Override
    protected String getNumSlotsJson() {
        sendCommand("num-slots");
        return PyonParser.pyonToJson(getString());
    }

    @Override
    protected String getOptionsJson(boolean listDefault, boolean listUnset) {
        String defaultValue = listDefault ? " -d" : "";
        String unsetValue = listUnset ? " -a" : "";
        sendCommand("options" + defaultValue + unsetValue);
        return PyonParser.pyonToJson(getString());
    }

    @Override
    protected String getPpdJson() {
        sendCommand("ppd");
        return PyonParser.pyonToJson(getString());
    }

    @Override
    protected String getSimulationInfoJson(int slot) {
        sendCommand("simulation-info " + slot);
        return PyonParser.pyonToJson(getString());
    }

    @Override
    protected String getSlotInfoJson() {
        sendCommand("slot-info");
        return PyonParser.pyonToJson(getString());
    }

    @Override
    protected String getSlotOptionsJson(int slot) {
        sendCommand("slot-options " + slot + " -a");
        return PyonParser.pyonToJson(getString());
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
