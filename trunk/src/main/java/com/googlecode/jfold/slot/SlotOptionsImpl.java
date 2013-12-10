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
package com.googlecode.jfold.slot;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * <p>SlotOptionsImpl class.</p>
 *
 * @author Michael Thomas <mikepthomas@outlook.com>
 * @version $Id: $Id
 */
public class SlotOptionsImpl implements SlotOptions, Serializable {
// <editor-fold defaultstate="collapsed" desc="Member Variables">
    /**
     * Client type.
     */
    @SerializedName("client-type")
    private String clientType;
    /**
     * Client sub-type.
     */
    @SerializedName("client-subtype")
    private String clientSubtype;
    /**
     * Machine identifier.
     */
    @SerializedName("machine-id")
    private int machineId;
    /**
     * Maximum packet size.
     */
    @SerializedName("max-packet-size")
    private String maxPacketSize;
    /**
     * Core priority.
     */
    @SerializedName("core-priority")
    private String corePriority;
    /**
     * Next unit percentage.
     */
    @SerializedName("next-unit-percentage")
    private int nextUnitPercentage;
    /**
     * Maximum units.
     */
    @SerializedName("max-units")
    private int maxUnits;
    /**
     * Checkpoint.
     */
    @SerializedName("checkpoint")
    private int checkpoint;
    /**
     * Pause on start.
     */
    @SerializedName("pause-on-start")
    private boolean pauseOnStart;
    /**
     * Graphics processor vendor identifier.
     */
    @SerializedName("gpu-vendor-id")
    private String gpuVendorId;
    /**
     * Graphics processor device identifier.
     */
    @SerializedName("gpu-device-id")
    private String gpuDeviceId;
// </editor-fold>

// <editor-fold desc="Constructors">
    /**
     * Default constructor.
     */
    public SlotOptionsImpl() {
        super();
    }
// </editor-fold>

// <editor-fold desc="Accessors">
    /** {@inheritDoc} */
    @Override
    public final String getClientType() {
        return clientType;
    }

    /** {@inheritDoc} */
    @Override
    public final String getClientSubtype() {
        return clientSubtype;
    }

    /** {@inheritDoc} */
    @Override
    public final int getMachineId() {
        return machineId;
    }

    /** {@inheritDoc} */
    @Override
    public final String getMaxPacketSize() {
        return maxPacketSize;
    }

    /** {@inheritDoc} */
    @Override
    public final String getCorePriority() {
        return corePriority;
    }

    /** {@inheritDoc} */
    @Override
    public final int getNextUnitPercentage() {
        return nextUnitPercentage;
    }

    /** {@inheritDoc} */
    @Override
    public final int getMaxUnits() {
        return maxUnits;
    }

    /** {@inheritDoc} */
    @Override
    public final int getCheckpoint() {
        return checkpoint;
    }

    /** {@inheritDoc} */
    @Override
    public final boolean getPauseOnStart() {
        return pauseOnStart;
    }

    /** {@inheritDoc} */
    @Override
    public final String getGpuVendorId() {
        return gpuVendorId;
    }

    /** {@inheritDoc} */
    @Override
    public final String getGpuDeviceId() {
        return gpuDeviceId;
    }
// </editor-fold>

    /** {@inheritDoc} */
    @Override
    public final String toString() {
        return "clientType = " + clientType
                + "\nclientSubtype = " + clientSubtype
                + "\nmachineId = " + machineId
                + "\nmaxPacketSize = " + maxPacketSize
                + "\ncorePriority = " + corePriority
                + "\nnextUnitPercentage = " + nextUnitPercentage
                + "\nmaxUnits = " + maxUnits
                + "\ncheckpoint = " + checkpoint
                + "\npauseOnStart = " + pauseOnStart
                + "\ngpuVendorId = " + gpuVendorId
                + "\ngpuDeviceId = " + gpuDeviceId;
    }
}
