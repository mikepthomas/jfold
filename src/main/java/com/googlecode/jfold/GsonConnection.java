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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.googlecode.jfold.exceptions.InfoException;
import com.googlecode.jfold.exceptions.NumSlotsException;
import com.googlecode.jfold.exceptions.OptionsException;
import com.googlecode.jfold.exceptions.PpdException;
import com.googlecode.jfold.exceptions.SimulationInfoException;
import com.googlecode.jfold.exceptions.SlotInfoException;
import com.googlecode.jfold.exceptions.SlotOptionsException;
import com.googlecode.jfold.info.InfoItem;
import com.googlecode.jfold.options.Options;
import com.googlecode.jfold.options.OptionsImpl;
import com.googlecode.jfold.simulation.SimulationInfo;
import com.googlecode.jfold.simulation.SimulationInfoImpl;
import com.googlecode.jfold.slot.Slot;
import com.googlecode.jfold.slot.SlotImpl;
import com.googlecode.jfold.slot.SlotOptions;
import com.googlecode.jfold.slot.SlotOptionsImpl;
import com.googlecode.jfold.unit.Unit;
import java.lang.reflect.Type;
import java.net.Inet4Address;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>Abstract GsonConnection class.</p>
 *
 * @author Michael Thomas <mikepthomas@outlook.com>
 * @version $Id: $Id
 */
public abstract class GsonConnection implements Connection {

    /** Constant <code>DATE_FORMAT="yyyy-MM-dd'T'HH:mm:ss'Z'"</code>. */
    public static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";

    /** Gson JSON Converter. */
    private final Gson gson;
    /** Logger. */
    private static final Logger logger = LoggerFactory.getLogger(GsonConnection.class);

    /**
     * <p>Constructor for AbstractConnection.</p>
     */
    public GsonConnection() {
        super();

        gson = new GsonBuilder().setDateFormat(DATE_FORMAT).create();
    }

    /** {@inheritDoc} */
    @Override
    public final void bond(
            final Inet4Address ip, final int port, final String input) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final void configured() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final void doCycle() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final void downloadCore(final String type, final URL url) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final void finish() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final void finish(final int slot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final String getInfo(final String category, final String key) {
        try {
            return getInfoOutput(category, key);
        } catch (InfoException ex) {
            logger.warn("Failed to get Info Output", ex);

            return "";
        }
    }

    /** {@inheritDoc} */
    @Override
    public final String getInfo(final InfoItem infoItem) {
        return getInfo(infoItem.getCategory().toString(), infoItem.toString());
    }

    /** {@inheritDoc} */
    @Override
    public final List info() {
        try {
            return gson.fromJson(getInfoOutput(), List.class);
        } catch (InfoException ex) {
            logger.warn("Failed to get Info Output", ex);

            return new ArrayList();
        }
    }

    /** {@inheritDoc} */
    @Override
    public final void inject(
            final Inet4Address ip, final int port, final String input) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final void maskUnitState() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final int numSlots() {
        try {
            return gson.fromJson(getNumSlotsOutput(), Integer.class);
        } catch (NumSlotsException ex) {
            // Log Error
            logger.warn("Failed to get Num Slots Output", ex);

            return 0;
        }
    }

    /** {@inheritDoc} */
    @Override
    public final String option(final String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final String option(final String name, final String value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final Options options() {
        return options(false, false);
    }

    /** {@inheritDoc} */
    @Override
    public final Options options(
            final boolean listDefault, final boolean listUnset) {
        try {
            return gson.fromJson(getOptionsOutput(listDefault, listUnset), OptionsImpl.class);
        } catch (OptionsException ex) {
            logger.warn("Failed to get Options Output", ex);

            return new OptionsImpl();
        }
    }

    /** {@inheritDoc} */
    @Override
    public final void pause() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final void pause(final int slot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final int ppd() {
        try {
            return gson.fromJson(getPpdOutput(), Integer.class);
        } catch (PpdException ex) {
            logger.warn("Failed to get PPD Output", ex);

            return 0;
        }
    }

    /** {@inheritDoc} */
    @Override
    public final List<Unit> queueInfo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final void requestId() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final void requestWs() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final void save() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final void save(final String file) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final void shutdown() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final SimulationInfo simulationInfo(final int slot) {
        try {
            return gson.fromJson(getSimulationInfoOutput(slot), SimulationInfoImpl.class);
        } catch (SimulationInfoException ex) {
            logger.warn("Failed to get Simulation Info Output", ex);

            return new SimulationInfoImpl();
        }
    }

    /** {@inheritDoc} */
    @Override
    public final void slotAdd(final String type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final void slotDelete(final int slot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final List<Slot> slotInfo() {
        Type slotInfoType = new TypeToken<List<SlotImpl>>() { } .getType();
        try {
            return gson.fromJson(getSlotInfoOutput(), slotInfoType);
        } catch (SlotInfoException ex) {
            logger.warn("Failed to get Slot Info Output", ex);

            return new ArrayList<Slot>();
        }
    }

    /** {@inheritDoc} */
    @Override
    public final void slotModify(final String id, final String type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final SlotOptions slotOptions(final int slot) {
        try {
            return gson.fromJson(getSlotOptionsOutput(slot), SlotOptionsImpl.class);
        } catch (SlotOptionsException ex) {
            logger.warn("Failed to get Slot Options Output", ex);

            return new SlotOptionsImpl();
        }
    }

    /** {@inheritDoc} */
    @Override
    public final void trajectory(final int slot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final void triggerSave() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final void unpause() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final void unpause(final int slot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final String uptime() {
        return getUptimeOutput();
    }

    /** {@inheritDoc} */
    @Override
    public final void waitForUnits() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * <p>getInfoOutput.</p>
     *
     * @param category to return information from
     * @param key to return information from
     * @return a {@link java.lang.String} object.
     * @throws com.googlecode.jfold.exceptions.InfoException if any.
     */
    protected abstract String getInfoOutput(String category, String key)
            throws InfoException;

    /**
     * <p>getInfoOutput.</p>
     *
     * @return a {@link java.lang.String} object.
     * @throws com.googlecode.jfold.exceptions.InfoException if any.
     */
    protected abstract String getInfoOutput() throws InfoException;

    /**
     * <p>getNumSlotsOutput.</p>
     *
     * @return a {@link java.lang.String} object.
     * @throws com.googlecode.jfold.exceptions.NumSlotsException if any.
     */
    protected abstract String getNumSlotsOutput() throws NumSlotsException;

    /**
     * <p>getOptionsOutput.</p>
     *
     * @param listDefault a boolean.
     * @param listUnset a boolean.
     * @return a {@link java.lang.String} object.
     * @throws com.googlecode.jfold.exceptions.OptionsException if any.
     */
    protected abstract String getOptionsOutput(
            boolean listDefault, boolean listUnset) throws OptionsException;

    /**
     * <p>getPpdOutput.</p>
     *
     * @return a {@link java.lang.String} object.
     * @throws com.googlecode.jfold.exceptions.PpdException if any.
     */
    protected abstract String getPpdOutput() throws PpdException;

    /**
     * <p>getSimulationInfoOutput.</p>
     *
     * @param slot a int.
     * @return a {@link java.lang.String} object.
     * @throws com.googlecode.jfold.exceptions.SimulationInfoException if any.
     */
    protected abstract String getSimulationInfoOutput(int slot)
            throws SimulationInfoException;

    /**
     * <p>getSlotInfoOutput.</p>
     *
     * @return a {@link java.lang.String} object.
     * @throws com.googlecode.jfold.exceptions.SlotInfoException if any.
     */
    protected abstract String getSlotInfoOutput() throws SlotInfoException;

    /**
     * <p>getSlotOptionsOutput.</p>
     *
     * @param slot a int.
     * @return a {@link java.lang.String} object.
     * @throws com.googlecode.jfold.exceptions.SlotOptionsException if any.
     */
    protected abstract String getSlotOptionsOutput(int slot)
            throws SlotOptionsException;

    /**
     * <p>getUptimeOutput.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    protected abstract String getUptimeOutput();
}
