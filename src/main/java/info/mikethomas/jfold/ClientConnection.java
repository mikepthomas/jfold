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

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;

import info.mikethomas.jfold.exceptions.InfoException;
import info.mikethomas.jfold.exceptions.NumSlotsException;
import info.mikethomas.jfold.exceptions.OptionsException;
import info.mikethomas.jfold.exceptions.PpdException;
import info.mikethomas.jfold.exceptions.QueueInfoException;
import info.mikethomas.jfold.exceptions.SimulationInfoException;
import info.mikethomas.jfold.exceptions.SlotInfoException;
import info.mikethomas.jfold.exceptions.SlotOptionsException;
import info.mikethomas.jfold.info.InfoItem;
import info.mikethomas.jfold.options.Options;
import info.mikethomas.jfold.simulation.SimulationInfo;
import info.mikethomas.jfold.slot.Slot;
import info.mikethomas.jfold.slot.SlotOptions;
import info.mikethomas.jfold.unit.Unit;
import info.mikethomas.jfold.util.Command;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <p>ClientConnection class.</p>
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version 7.4.4
 */
public class ClientConnection extends SocketConnection implements Connection {

    /** Constant <code>DEFAULT_HOST="localhost"</code>. */
    public static final String DEFAULT_HOST = "localhost";
    /** Constant <code>DEFAULT_PORT=36330</code>. */
    public static final int DEFAULT_PORT = 36330;

    /** Object Mapper. */
    private final ObjectMapper mapper = new ObjectMapper();

    /**
     * <p>Default Constructor for ClientConnection.</p>
     *
     * @throws java.io.IOException if any.
     */
    public ClientConnection() throws IOException {
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

        mapper.registerModule(new JaxbAnnotationModule());
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
            final String category, final String key) {
        var args = new ArrayList<String>() { {
            add(category);
            add(key);
        } };
        return sendCommand(Command.GET_INFO, args);
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
        } catch (IOException ex) {
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
        } catch (IOException ex) {
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
            var args = new ArrayList<String>();
            if (listDefault) {
                args.add("-d");
            }
            if (listUnset) {
                args.add("-a");
            }
            return mapper.readValue(sendCommand(Command.OPTIONS, args),
                    Options.class);
        } catch (IOException ex) {
            throw new OptionsException(ex.getMessage(), ex);
        }
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized void pause() {
        sendCommand(Command.PAUSE);
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized void pause(final int slot) {
        var args = Collections.singletonList(String.valueOf(slot));
        sendCommand(Command.PAUSE, args);
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized int ppd() throws PpdException {
        try {
            return mapper.readValue(sendCommand(Command.PPD), Integer.class);
        } catch (IOException ex) {
            throw new PpdException(ex.getMessage(), ex);
        }
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized List<Unit> queueInfo() throws QueueInfoException {
        try {
            var type = new TypeReference<List<Unit>>() { };
            return mapper.readValue(sendCommand(Command.QUEUE_INFO), type);
        } catch (IOException ex) {
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
            var args = Collections.singletonList(String.valueOf(slot));
            return mapper.readValue(sendCommand(Command.SIMULATION_INFO, args),
                    SimulationInfo.class);
        } catch (IOException ex) {
            throw new SimulationInfoException(ex.getMessage(), ex);
        }
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized void slotAdd(final String type) {
        var args = Collections.singletonList(type);
        sendCommand(Command.SLOT_ADD, args);
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
            var type = new TypeReference<List<Slot>>() { };
            return mapper.readValue(sendCommand(Command.SLOT_INFO), type);
        } catch (IOException ex) {
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
            var args = new ArrayList<String>() { {
                add(String.valueOf(slot));
                add("-a");
            } };
            return mapper.readValue(sendCommand(Command.SLOT_OPTIONS, args),
                    SlotOptions.class);
        } catch (IOException ex) {
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
        sendCommand(Command.UNPAUSE);
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized void unpause(final int slot) {
        var args = Collections.singletonList(String.valueOf(slot));
        sendCommand(Command.UNPAUSE, args);
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized String uptime() {
        return sendCommand(Command.UPTIME);
    }

    /** {@inheritDoc} */
    @Override
    public final synchronized void waitForUnits() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
