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
import com.googlecode.jfold.exceptions.PauseException;
import com.googlecode.jfold.exceptions.PpdException;
import com.googlecode.jfold.exceptions.QueueInfoException;
import com.googlecode.jfold.exceptions.SimulationInfoException;
import com.googlecode.jfold.exceptions.SlotInfoException;
import com.googlecode.jfold.exceptions.SlotOptionsException;
import com.googlecode.jfold.exceptions.UnpauseException;
import com.googlecode.jfold.exceptions.UptimeException;
import com.googlecode.jfold.info.InfoItem;
import com.googlecode.jfold.options.Options;
import com.googlecode.jfold.simulation.SimulationInfo;
import com.googlecode.jfold.slot.Slot;
import com.googlecode.jfold.slot.SlotOptions;
import com.googlecode.jfold.unit.Unit;
import java.net.Inet4Address;
import java.net.URL;
import java.util.List;

/**
 * <p>Connection interface.</p>
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version 7.4.4
 */
public interface Connection {
    /** Constant <code>ENCODING="UTF-8"</code>. */
    String ENCODING = "UTF-8";

    /**
     * Bond a packet file to a outgoing debug socket connection.
     *
     * @param ip a {@link java.net.Inet4Address} object.
     * @param port a int.
     * @param input a {@link java.lang.String} object.
     */
    void bond(Inet4Address ip, int port, String input);

    /**
     * Return a configuration indicating if the client has set a user,
     * team or passkey.
     */
    void configured();

    /**
     * Run one client cycle.
     */
    void doCycle();

    /**
     * Download a core.
     *
     * @param type of core
     * @param url of core
     */
    void downloadCore(String type, URL url);

    /**
     * Finish all slots.
     */
    void finish();

    /**
     * Finish requested slot.
     *
     * @param slot number
     */
    void finish(int slot);

    /**
     * Print application information for requested <code>category</code> and
     * <code>key</code>.
     *
     * @param category to return information from
     * @param key to return information from
     * @return String value from information
     * @throws com.googlecode.jfold.exceptions.InfoException if any.
     */
    String getInfo(String category, String key) throws InfoException;

    /**
     * Print application information for requested <code>InfoItem</code>.
     *
     * @param infoItem a {@link com.googlecode.jfold.info.InfoItem} object.
     * @return a {@link java.lang.String} object.
     * @throws com.googlecode.jfold.exceptions.InfoException if any.
     */
    String getInfo(InfoItem infoItem) throws InfoException;

    /**
     * List application information.
     *
     * @return List
     * @throws com.googlecode.jfold.exceptions.InfoException if any.
     */
    List info() throws InfoException;

    /**
     * Inject a packet file to a listening debug socket.
     * Will wait until packet is processed.
     *
     * @param ip a {@link java.net.Inet4Address} object.
     * @param port a int.
     * @param input a {@link java.lang.String} object.
     */
    void inject(Inet4Address ip, int port, String input);

    /**
     * Disable specified unit states.
     */
    void maskUnitState();

    /**
     * Get number of slots.
     *
     * @return integer number of slots
     * @throws com.googlecode.jfold.exceptions.NumSlotsException if any.
     */
    int numSlots() throws NumSlotsException;

    /**
     * Get a configuration option.
     *
     * @param name of option
     * @return requested option
     */
    String option(String name);

    /**
     * Set a configuration option.
     *
     * @param name of option
     * @param value to set
     * @return requested option
     */
    String option(String name, String value);

    /**
     * List all options with their non-default values.
     *
     * @return Options
     * @throws com.googlecode.jfold.exceptions.OptionsException if any.
     */
    Options options() throws OptionsException;

    /**
     * List all options with their non-default values.
     *
     * @param listDefault if true defaulted options will be listed
     * @param listUnset if true unset options will also be listed
     * @return Options
     * @throws com.googlecode.jfold.exceptions.OptionsException if any.
     */
    Options options(boolean listDefault, boolean listUnset)
            throws OptionsException;

    /**
     * Pause all slots.
     *
     * @throws com.googlecode.jfold.exceptions.PauseException if any.
     */
    void pause() throws PauseException;

    /**
     * Pause requested slot.
     *
     * @param slot number
     * @throws com.googlecode.jfold.exceptions.PauseException if any.
     */
    void pause(int slot) throws PauseException;

    /**
     * Get current total estimated Points Per Day.
     *
     * @return points per day
     * @throws com.googlecode.jfold.exceptions.PpdException if any.
     */
    int ppd() throws PpdException;

    /**
     * Get work unit queue information.
     *
     * @return List Unit
     * @throws com.googlecode.jfold.exceptions.QueueInfoException if any.
     */
    List<Unit> queueInfo() throws QueueInfoException;

    /**
     * Request an ID from the assignment server.
     */
    void requestId();

    /**
     * Request work server assignment from the assignment server.
     */
    void requestWs();

    /**
     * Save the configuration either to the file the configuration was last
     * loaded from.
     */
    void save();

    /**
     * Save the configuration either to the specified file.
     *
     * @param file to save to
     */
    void save(String file);

    /**
     * Shutdown the application.
     */
    void shutdown();

    /**
     * Get current simulation information.
     *
     * @param slot number
     * @return SimulationInfo
     * @throws com.googlecode.jfold.exceptions.SimulationInfoException if any.
     */
    SimulationInfo simulationInfo(int slot) throws SimulationInfoException;

    /**
     * Add a new slot.
     *
     * @param type of slot
     */
    void slotAdd(String type);

    /**
     * Delete a slot.
     * If it is running a unit it will be stopped.
     *
     * @param slot number
     */
    void slotDelete(int slot);

    /**
     * Get slot information.
     *
     * @return List Slot
     * @throws com.googlecode.jfold.exceptions.SlotInfoException if any.
     */
    List<Slot> slotInfo() throws SlotInfoException;

    /**
     * Modify an existing slot.
     *
     * @param id string
     * @param type string
     */
    void slotModify(String id, String type);

    /**
     * Get slot options.
     *
     * @return SlotOptions options
     * @param slot a int.
     * @throws com.googlecode.jfold.exceptions.SlotOptionsException if any.
     */
    SlotOptions slotOptions(int slot) throws SlotOptionsException;

    /**
     * Get current protein trajectory.
     *
     * @param slot number
     */
    void trajectory(int slot);

    /**
     * Trigger config save after a delay.
     */
    void triggerSave();

    /**
     * Unpause all slots.
     *
     * @throws com.googlecode.jfold.exceptions.UnpauseException if any.
     */
    void unpause() throws UnpauseException;

    /**
     * Unpause requested slot.
     *
     * @param slot number
     * @throws com.googlecode.jfold.exceptions.UnpauseException if any.
     */
    void unpause(int slot) throws UnpauseException;

    /**
     * Print application uptime.
     *
     * @return uptime value in "HH\h MM\m SS\s" format
     * @throws com.googlecode.jfold.exceptions.UptimeException if any.
     */
    String uptime() throws UptimeException;

    /**
     * Wait for all running units to finish.
     */
    void waitForUnits();
}
