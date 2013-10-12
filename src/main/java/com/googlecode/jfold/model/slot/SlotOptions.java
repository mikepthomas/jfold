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
package com.googlecode.jfold.model.slot;

/**
 * <p>SlotOptions interface.</p>
 *
 * @author Michael Thomas <mikepthomas@outlook.com>
 * @version $Id: $Id
 */
public interface SlotOptions {

    /**
     * Get the value of <code>client-type</code>.
     *
     * @return the <code>client-type</code> from <code>slot-options</code>
     */
    String getClientType();

    /**
     * Get the value of <code>client-subtype</code>.
     *
     * @return the <code>client-subtype</code> from <code>slot-options</code>
     */
    String getClientSubtype();

    /**
     * Get the value of <code>machine-id</code>.
     *
     * @return the <code>machine-id</code> from <code>slot-options</code>
     */
    int getMachineId();

    /**
     * Get the value of <code>max-packet-size</code>.
     *
     * @return the <code>max-packet-size</code> from <code>slot-options</code>
     */
    String getMaxPacketSize();

    /**
     * Get the value of <code>core-priority</code>.
     *
     * @return the <code>core-priority</code> from <code>slot-options</code>
     */
    String getCorePriority();

    /**
     * Get the value of <code>next-unit-percentage</code>.
     *
     * @return the <code>next-unit-percentage</code> from <code>slot-options</code>
     */
    int getNextUnitPercentage();

    /**
     * Get the value of <code>max-units</code>.
     *
     * @return the <code>max-units</code> from <code>slot-options</code>
     */
    int getMaxUnits();

    /**
     * Get the value of <code>checkpoint</code>.
     *
     * @return the <code>checkpoint</code> from <code>slot-options</code>
     */
    int getCheckpoint();

    /**
     * Get the value of <code>pause-on-start</code>.
     *
     * @return the <code>pause-on-start</code> from <code>slot-options</code>
     */
    boolean getPauseOnStart();

    /**
     * Get the value of <code>gpu-vendor-id</code>.
     *
     * @return the <code>client-type</code> from <code>slot-options</code>
     */
    String getGpuVendorId();

    /**
     * Get the value of <code>gpu-device-id</code>.
     *
     * @return the <code>gpu-device-id</code> from <code>slot-options</code>
     */
    String getGpuDeviceId();

    /** {@inheritDoc} */
    @Override
    String toString();
}
