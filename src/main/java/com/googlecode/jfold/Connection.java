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

import com.googlecode.jfold.model.options.OptionsImpl;
import com.googlecode.jfold.model.simulation.SimulationInfoImpl;
import com.googlecode.jfold.model.slot.SlotImpl;
import com.googlecode.jfold.model.slot.SlotOptionsImpl;
import com.googlecode.jfold.model.unit.UnitImpl;
import java.net.Inet4Address;
import java.net.URL;
import java.util.List;

/**
 *
 * @author Michael Thomas <mikepthomas@outlook.com>
 * @version 7.3.6
 */
public interface Connection {

    void open();
    void close();
    boolean isConnected();

    /**
     * Bond a packet file to a outgoing debug socket connection.
     *
     * @param ip
     * @param port
     * @param input
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
     * Print application information.
     *
     * @param category to return information from
     * @param key to return information from
     * @return String value from information
     */
    String getInfo(String category, String key);

    /**
     * List application information.
     *
     * @return List
     */
    List info();

    /**
     * Inject a packet file to a listening debug socket.
     * Will wait until packet is processed.
     *
     * @param ip
     * @param port
     * @param input
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
     */
    int numSlots();

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
     * @return OptionsImpl
     */
    OptionsImpl options();

    /**
     * Pause all slots.
     */
    void pause();

    /**
     * Pause requested slot.
     *
     * @param slot number
     */
    void pause(int slot);

    /**
     * Get current total estimated Points Per Day.
     *
     * @return points per day
     */
    int ppd();

    /**
     * Get work unit queue information.
     *
     * @return List UnitImpl
     */
    List<UnitImpl> queueInfo();

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
     * @return SimulationInfoImpl
     */
    SimulationInfoImpl simulationInfo(int slot);

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
     * @return List SlotImpl
     */
    List<SlotImpl> slotInfo();

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
     * @return SlotOptionsImpl options
     */
    SlotOptionsImpl slotOptions(int slot);

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
     */
    void unpause();

    /**
     * Unpause requested slot.
     *
     * @param slot number
     */
    void unpause(int slot);

    /**
     * Print application uptime.
     *
     * @return uptime value in "HH\h MM\m SS\s" format
     */
    String uptime();

    /**
     * Wait for all running units to finish.
     */
    void waitForUnits();
}
