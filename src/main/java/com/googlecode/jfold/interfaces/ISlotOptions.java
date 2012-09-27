/*
 * Copyright (C) 2012 Michael Thomas <michael4.thomas@live.uwe.ac.uk>
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
package com.googlecode.jfold.interfaces;

/**
 *
 * @author Michael Thomas <michael4.thomas@live.uwe.ac.uk>
 */
public interface ISlotOptions {
    
    /**
     * Get the value of <code>client-type</code>
     *
     * @return the value of <code>client-type</code> from <code>slot-options</code>
     */
    public String getClientType();
    
    /**
     * Get the value of <code>client-subtype</code>
     *
     * @return the value of <code>client-subtype</code> from <code>slot-options</code>
     */
    public String getClientSubtype();
    
    /**
     * Get the value of <code>machine-id</code>
     *
     * @return the value of <code>machine-id</code> from <code>slot-options</code>
     */
    public int getMachineId();
    
    /**
     * Get the value of <code>max-packet-size</code>
     *
     * @return the value of <code>max-packet-size</code> from <code>slot-options</code>
     */
    public String getMaxPacketSize();
    
    /**
     * Get the value of <code>core-priority</code>
     *
     * @return the value of <code>core-priority</code> from <code>slot-options</code>
     */
    public String getCorePriority();
    
    /**
     * Get the value of <code>next-unit-percentage</code>
     *
     * @return the value of <code>next-unit-percentage</code> from <code>slot-options</code>
     */
    public int getNextUnitPercentage();
    
    /**
     * Get the value of <code>max-units</code>
     *
     * @return the value of <code>max-units</code> from <code>slot-options</code>
     */
    public int getMaxUnits();
    
    /**
     * Get the value of <code>checkpoint</code>
     *
     * @return the value of <code>checkpoint</code> from <code>slot-options</code>
     */
    public int getCheckpoint();
    
    /**
     * Get the value of <code>pause-on-start</code>
     *
     * @return the value of <code>pause-on-start</code> from <code>slot-options</code>
     */
    public boolean getPauseOnStart();
    
    /**
     * Get the value of <code>gpu-vendor-id</code>
     *
     * @return the value of <code>client-type</code> from <code>slot-options</code>
     */
    public String getGpuVendorId();
    
    /**
     * Get the value of <code>gpu-device-id</code>
     *
     * @return the value of <code>gpu-device-id</code> from <code>slot-options</code>
     */
    public String getGpuDeviceId();
    
    /**
     *
     * @return
     */
    @Override
    public String toString();
}
