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

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;
import com.googlecode.jfold.exceptions.CommandException;
import com.googlecode.jfold.exceptions.InfoException;
import com.googlecode.jfold.exceptions.NumSlotsException;
import com.googlecode.jfold.exceptions.OptionsException;
import com.googlecode.jfold.exceptions.PpdException;
import com.googlecode.jfold.exceptions.QueueInfoException;
import com.googlecode.jfold.exceptions.SimulationInfoException;
import com.googlecode.jfold.exceptions.SlotInfoException;
import com.googlecode.jfold.exceptions.SlotOptionsException;
import com.googlecode.jfold.exceptions.UptimeException;
import com.googlecode.jfold.info.InfoItem;
import com.googlecode.jfold.options.Options;
import com.googlecode.jfold.simulation.SimulationInfo;
import com.googlecode.jfold.slot.Slot;
import com.googlecode.jfold.slot.SlotOptions;
import com.googlecode.jfold.unit.Unit;
import com.googlecode.jfold.util.Command;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>ClientConnection class.</p>
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version $Id: $Id
 */
public class ClientConnection extends SocketConnection implements Connection {

    /** Constant <code>DATE_FORMAT="yyyy-MM-dd'T'HH:mm:ss'Z'"</code>. */
    public static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    /** Constant <code>DEFAULT_HOST="localhost"</code>. */
    public static final String DEFAULT_HOST = "localhost";
    /** Constant <code>DEFAULT_PORT=36330</code>. */
    public static final int DEFAULT_PORT = 36330;

    /** Logger. */
    private static final Logger LOGGER = LoggerFactory.getLogger(
            ClientConnection.class);

    /** Object Mapper. */
    private final ObjectMapper mapper = new ObjectMapper();

    /**
     * <p>Default Constructor for ClientConnection.</p>
     *
     * @throws java.io.IOException on error
     */
    public ClientConnection()
            throws IOException {
        this(DEFAULT_HOST, DEFAULT_PORT);
    }

    /**
     * <p>Constructor for ClientConnection.</p>
     *
     * @param address a {@link java.lang.String} object.
     * @param port a int.
     * @throws java.io.IOException a int.
     */
    public ClientConnection(final String address, final int port)
            throws IOException {
        super(address, port);

        JaxbAnnotationModule module = new JaxbAnnotationModule();
        mapper.registerModule(module);
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized void bond(
            final Inet4Address ip, final int port, final String input) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized void configured() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized void doCycle() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized void downloadCore(
            final String type, final URL url) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized void finish() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized void finish(final int slot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized String getInfo(
            final String category, final String key) throws InfoException {
        try {
            List<String> args = new ArrayList<String>() { {
                add(category);
                add(key);
            } };
            return sendCommand(Command.GET_INFO, args);
        } catch (CommandException ex) {
            throw new InfoException(ex.getMessage(), ex);
        }
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized String getInfo(final InfoItem infoItem)
            throws InfoException {
        return getInfo(infoItem.getCategory().toString(), infoItem.toString());
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized List info() throws InfoException {
        try {
            return mapper.readValue(sendCommand(Command.INFO), List.class);
        } catch (IOException | CommandException ex) {
            throw new InfoException(ex.getMessage(), ex);
        }
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized void inject(
            final Inet4Address ip, final int port, final String input) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized void maskUnitState() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized int numSlots() throws NumSlotsException {
        try {
            return mapper.readValue(sendCommand(Command.NUM_SLOTS),
                    Integer.class);
        } catch (IOException | CommandException ex) {
            throw new NumSlotsException(ex.getMessage(), ex);
        }
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized String option(final String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized String option(
            final String name, final String value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized Options options() throws OptionsException {
        return options(false, false);
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized Options options(
            final boolean listDefault, final boolean listUnset)
            throws OptionsException {
        try {
            List<String> args = new ArrayList<>();
            if (listDefault) {
                args.add("-d");
            }
            if (listUnset) {
                args.add("-a");
            }
            return mapper.readValue(sendCommand(Command.OPTIONS, args),
                    Options.class);
        } catch (IOException | CommandException ex) {
            throw new OptionsException(ex.getMessage(), ex);
        }
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized void pause() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized void pause(final int slot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized int ppd() throws PpdException {
        try {
            return mapper.readValue(sendCommand(Command.PPD), Integer.class);
        } catch (IOException | CommandException ex) {
            throw new PpdException(ex.getMessage(), ex);
        }
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized List<Unit> queueInfo() throws QueueInfoException {
        try {
            TypeReference type = new TypeReference<List<Unit>>() { };
            return mapper.readValue(sendCommand(Command.QUEUE_INFO), type);
        } catch (IOException | CommandException ex) {
            throw new QueueInfoException(ex.getMessage(), ex);
        }
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized void requestId() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized void requestWs() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized void save() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized void save(final String file) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized void shutdown() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized SimulationInfo simulationInfo(
            final int slot) throws SimulationInfoException {
        try {
            List<String> args = new ArrayList<String>() { {
                add(String.valueOf(slot));
            } };
            return mapper.readValue(sendCommand(Command.SIMULATION_INFO, args),
                    SimulationInfo.class);
        } catch (IOException | CommandException ex) {
            throw new SimulationInfoException(ex.getMessage(), ex);
        }
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized void slotAdd(final String type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized void slotDelete(final int slot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized List<Slot> slotInfo() throws SlotInfoException {
        try {
            TypeReference type = new TypeReference<List<Slot>>() { };
            return mapper.readValue(sendCommand(Command.SLOT_INFO), type);
        } catch (IOException | CommandException ex) {
            throw new SlotInfoException(ex.getMessage(), ex);
        }
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized void slotModify(
            final String id, final String type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized SlotOptions slotOptions(final int slot)
            throws SlotOptionsException {
        try {
            List<String> args = new ArrayList<String>() { {
                add(String.valueOf(slot));
                add("-a");
            } };
            return mapper.readValue(sendCommand(Command.SLOT_OPTIONS, args),
                    SlotOptions.class);
        } catch (IOException | CommandException ex) {
            throw new SlotOptionsException(ex.getMessage(), ex);
        }
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized void trajectory(final int slot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized void triggerSave() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized void unpause() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized void unpause(final int slot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized String uptime() throws UptimeException {
        try {
            return sendCommand(Command.UPTIME);
        } catch (CommandException ex) {
            throw new UptimeException(ex.getMessage(), ex);
        }
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized void waitForUnits() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}