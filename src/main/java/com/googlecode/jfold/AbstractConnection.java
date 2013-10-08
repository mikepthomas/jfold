/*
 * Copyright (C) 2013 Michael Thomas <michael4.thomas@live.uwe.ac.uk>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
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
 *
 * @author Michael Thomas <mikepthomas@outlook.com>
 */
public abstract class AbstractConnection implements Connection {
    
    public static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";

    private final Gson gson;

    public AbstractConnection()
    {
        super();

        gson = new GsonBuilder().setDateFormat(DATE_FORMAT).create();
    }

    /** {@inheritDoc} */
    @Override
    public void bond(Inet4Address ip, int port, String input) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public void configured() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public void doCycle() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public void downloadCore(String type, URL url) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public void finish() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public void finish(int slot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public String getInfo(String category, String key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public List info() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public void inject(Inet4Address ip, int port, String input) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public void maskUnitState() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public int numSlots() {
        return gson.fromJson(getNumSlotsJson(), Integer.class);
    }

    /** {@inheritDoc} */
    @Override
    public String option(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public String option(String name, String value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public Options options() {
        return options(false, false);
    }

    /** {@inheritDoc} */
    @Override
    public Options options(boolean listDefault, boolean listUnset) {
        return gson.fromJson(getOptionsJson(listDefault, listUnset), OptionsImpl.class);
    }

    /** {@inheritDoc} */
    @Override
    public void pause() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public void pause(int slot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public int ppd() {
        return gson.fromJson(getPpdJson(), Integer.class);
    }

    /** {@inheritDoc} */
    @Override
    public List<Unit> queueInfo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public void requestId() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public void requestWs() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public void save() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public void save(String file) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public void shutdown() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public SimulationInfo simulationInfo(int slot) {
        return gson.fromJson(getSimulationInfoJson(slot), SimulationInfoImpl.class);
    }

    /** {@inheritDoc} */
    @Override
    public void slotAdd(String type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public void slotDelete(int slot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public List<Slot> slotInfo() {
        Type slotInfoType = new TypeToken<List<SlotImpl>>(){}.getType();
        return gson.fromJson(getSlotInfoJson(), slotInfoType);
    }

    /** {@inheritDoc} */
    @Override
    public void slotModify(String id, String type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public SlotOptions slotOptions(int slot) {
        return gson.fromJson(getSlotOptionsJson(slot), SlotOptionsImpl.class);
    }

    /** {@inheritDoc} */
    @Override
    public void trajectory(int slot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public void triggerSave() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public void unpause() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public void unpause(int slot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public String uptime() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public void waitForUnits() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    protected abstract String getNumSlotsJson();

    protected abstract String getOptionsJson(boolean listDefault, boolean listUnset);

    protected abstract String getPpdJson();

    protected abstract String getSimulationInfoJson(int slot);

    protected abstract String getSlotInfoJson();

    protected abstract String getSlotOptionsJson(int slot);
}
