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
import com.googlecode.jfold.model.options.Options;
import com.googlecode.jfold.model.options.OptionsImpl;
import com.googlecode.jfold.model.simulation.SimulationInfo;
import com.googlecode.jfold.model.simulation.SimulationInfoImpl;
import com.googlecode.jfold.model.slot.Slot;
import com.googlecode.jfold.model.slot.SlotImpl;
import com.googlecode.jfold.model.slot.SlotOptions;
import com.googlecode.jfold.model.slot.SlotOptionsImpl;
import com.googlecode.jfold.model.unit.Unit;
import java.lang.reflect.Type;
import java.net.Inet4Address;
import java.net.URL;
import java.util.List;

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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final List info() {
        throw new UnsupportedOperationException("Not supported yet.");
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
        return gson.fromJson(getNumSlotsOutput(), Integer.class);
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
        return gson.fromJson(getOptionsOutput(listDefault, listUnset), OptionsImpl.class);
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
        return gson.fromJson(getPpdOutput(), Integer.class);
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
        return gson.fromJson(getSimulationInfoOutput(slot), SimulationInfoImpl.class);
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
        return gson.fromJson(getSlotInfoOutput(), slotInfoType);
    }

    /** {@inheritDoc} */
    @Override
    public final void slotModify(final String id, final String type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final SlotOptions slotOptions(final int slot) {
        return gson.fromJson(getSlotOptionsOutput(slot), SlotOptionsImpl.class);
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
     * <p>getNumSlotsOutput.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    protected abstract String getNumSlotsOutput();

    /**
     * <p>getOptionsOutput.</p>
     *
     * @param listDefault a boolean.
     * @param listUnset a boolean.
     * @return a {@link java.lang.String} object.
     */
    protected abstract String getOptionsOutput(
            boolean listDefault, boolean listUnset);

    /**
     * <p>getPpdOutput.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    protected abstract String getPpdOutput();

    /**
     * <p>getSimulationInfoOutput.</p>
     *
     * @param slot a int.
     * @return a {@link java.lang.String} object.
     */
    protected abstract String getSimulationInfoOutput(int slot);

    /**
     * <p>getSlotInfoOutput.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    protected abstract String getSlotInfoOutput();

    /**
     * <p>getSlotOptionsOutput.</p>
     *
     * @param slot a int.
     * @return a {@link java.lang.String} object.
     */
    protected abstract String getSlotOptionsOutput(int slot);

    /**
     * <p>getUptimeOutput.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    protected abstract String getUptimeOutput();
}
