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

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * <p>SlotOptionsImpl class.</p>
 *
 * @author Michael Thomas <mikepthomas@outlook.com>
 * @version $Id: $Id
 */
public class SlotOptionsImpl implements SlotOptions, Serializable {

    @SerializedName("client-type")
    private String clientType;
    @SerializedName("client-subtype")
    private String clientSubtype;
    @SerializedName("machine-id")
    private int machineId;
    @SerializedName("max-packet-size")
    private String maxPacketSize;
    @SerializedName("core-priority")
    private String corePriority;
    @SerializedName("next-unit-percentage")
    private int nextUnitPercentage;
    @SerializedName("max-units")
    private int maxUnits;
    @SerializedName("checkpoint")
    private int checkpoint;
    @SerializedName("pause-on-start")
    private boolean pauseOnStart;
    @SerializedName("gpu-vendor-id")
    private String gpuVendorId;
    @SerializedName("gpu-device-id")
    private String gpuDeviceId;

    /**
     * Default constructor.
     */
    public SlotOptionsImpl() {
        super();
    }

    /** {@inheritDoc} */
    @Override
    public String getClientType() {
        return clientType;
    }

    /** {@inheritDoc} */
    @Override
    public String getClientSubtype() {
        return clientSubtype;
    }

    /** {@inheritDoc} */
    @Override
    public int getMachineId() {
        return machineId;
    }

    /** {@inheritDoc} */
    @Override
    public String getMaxPacketSize() {
        return maxPacketSize;
    }

    /** {@inheritDoc} */
    @Override
    public String getCorePriority() {
        return corePriority;
    }

    /** {@inheritDoc} */
    @Override
    public int getNextUnitPercentage() {
        return nextUnitPercentage;
    }

    /** {@inheritDoc} */
    @Override
    public int getMaxUnits() {
        return maxUnits;
    }

    /** {@inheritDoc} */
    @Override
    public int getCheckpoint() {
        return checkpoint;
    }

    /** {@inheritDoc} */
    @Override
    public boolean getPauseOnStart() {
        return pauseOnStart;
    }

    /** {@inheritDoc} */
    @Override
    public String getGpuVendorId() {
        return gpuVendorId;
    }

    /** {@inheritDoc} */
    @Override
    public String getGpuDeviceId() {
        return gpuDeviceId;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
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
