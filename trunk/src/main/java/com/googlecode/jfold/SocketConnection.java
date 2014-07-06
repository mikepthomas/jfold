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

import com.googlecode.jfold.exceptions.InfoException;
import com.googlecode.jfold.exceptions.NumSlotsException;
import com.googlecode.jfold.exceptions.OptionsException;
import com.googlecode.jfold.exceptions.PpdException;
import com.googlecode.jfold.exceptions.PyonParserException;
import com.googlecode.jfold.exceptions.QueueInfoException;
import com.googlecode.jfold.exceptions.SimulationInfoException;
import com.googlecode.jfold.exceptions.SlotInfoException;
import com.googlecode.jfold.exceptions.SlotOptionsException;
import com.googlecode.jfold.util.Command;
import com.googlecode.jfold.util.PyonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>SocketConnection class.</p>
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version $Id: $Id
 */
public class SocketConnection extends GsonConnection implements Connection {

    /** Constant <code>DEFAULT_HOST="localhost"</code>. */
    public static final String DEFAULT_HOST = "localhost";
    /** Constant <code>DEFAULT_PORT=36330</code>. */
    public static final int DEFAULT_PORT = 36330;

    /** Socket to connect to F@H Client. */
    private final Socket socket;
    /** InputStream to send commands to. */
    private final BufferedReader in;
    /** OutputStream to receive data from. */
    private final PrintStream out;
    /** Logger. */
    private static final Logger logger = LoggerFactory.getLogger(SocketConnection.class);

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
        logger.info(in.readLine());
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
    protected final String getInfoOutput(final String category, final String key)
            throws InfoException {
        sendCommand(Command.GET_INFO + " \"" + category + "\" \"" + key + "\"");
        return getString();
    }

    /** {@inheritDoc} */
    @Override
    protected final String getInfoOutput() throws InfoException {
        sendCommand(Command.INFO);
        try {
            return PyonParser.convert(getPyon());
        } catch (PyonParserException ex) {
            throw new InfoException(ex.getLocalizedMessage());
        }
    }

    /** {@inheritDoc} */
    @Override
    protected final String getNumSlotsOutput() throws NumSlotsException {
        sendCommand(Command.NUM_SLOTS);
        try {
            return PyonParser.convert(getPyon());
        } catch (PyonParserException ex) {
            throw new NumSlotsException(ex.getLocalizedMessage());
        }
    }

    /** {@inheritDoc} */
    @Override
    protected final String getOptionsOutput(
            final boolean listDefault,
            final boolean listUnset) throws OptionsException {
        String defaultValue = listDefault ? " -d" : "";
        String unsetValue = listUnset ? " -a" : "";
        sendCommand(Command.OPTIONS + defaultValue + unsetValue);
        try {
            return PyonParser.convert(getPyon());
        } catch (PyonParserException ex) {
            throw new OptionsException(ex.getLocalizedMessage());
        }
    }

    /** {@inheritDoc} */
    @Override
    protected final String getPpdOutput() throws PpdException {
        sendCommand(Command.PPD);
        try {
            return PyonParser.convert(getPyon());
        } catch (PyonParserException ex) {
            throw new PpdException(ex.getLocalizedMessage());
        }
    }

    /** {@inheritDoc} */
    @Override
    protected final String getQueueInfoOutput() throws QueueInfoException {
        sendCommand(Command.QUEUE_INFO);
        try {
            return PyonParser.convert(getPyon());
        } catch (PyonParserException ex) {
            throw new QueueInfoException(ex.getLocalizedMessage());
        }
    }

    /** {@inheritDoc} */
    @Override
    protected final String getSimulationInfoOutput(final int slot)
            throws SimulationInfoException {
        sendCommand(Command.SIMULATION_INFO + " " + slot);
        try {
            return PyonParser.convert(getPyon());
        } catch (PyonParserException ex) {
            throw new SimulationInfoException(ex.getLocalizedMessage());
        }
    }

    /** {@inheritDoc} */
    @Override
    protected final String getSlotInfoOutput() throws SlotInfoException {
        try {
            sendCommand(Command.SLOT_INFO);
            return PyonParser.convert(getPyon());
        } catch (PyonParserException ex) {
            throw new SlotInfoException(ex.getLocalizedMessage());
        }
    }

    /** {@inheritDoc} */
    @Override
    protected final String getSlotOptionsOutput(final int slot)
            throws SlotOptionsException {
        sendCommand(Command.SLOT_OPTIONS + " " + slot + " -a");
        try {
            return PyonParser.convert(getPyon());
        } catch (PyonParserException ex) {
            throw new SlotOptionsException(ex.getLocalizedMessage());
        }
    }

    /** {@inheritDoc} */
    @Override
    protected final String getUptimeOutput() {
        sendCommand(Command.UPTIME);
        return getString();
    }

    /**
     * Send a command to the Folding@home Client.
     *
     * @param command command to send to the client
     */
    private void sendCommand(final String command) {
        out.println(command);

        logger.info("Sent Command: " + command);
    }

    /**
     * Send a command to the Folding@home Client.
     *
     * @param command command to send to the client
     */
    private void sendCommand(final Command command) {
        sendCommand(command.toString());
    }

    /**
     * Receive a String response from the Folding@home Client.
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
            logger.error(null, ex);
        }

        String string = stringBuilder.toString().trim();

        logger.info("Recieved String: " + string);

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
            in.read(); // first char is '>'
            String string;
            while (!(string = in.readLine()).equals("---")) {
                stringBuilder.append(string).append('\n');
            }
        } catch (IOException ex) {
            logger.error(null, ex);
        }

        String string = stringBuilder.toString().trim();

        logger.info("Recieved PyON: " + string);

        return string;
    }
}
