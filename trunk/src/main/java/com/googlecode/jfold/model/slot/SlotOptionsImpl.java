package com.googlecode.jfold.model.slot;

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

import com.google.gson.Gson;
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
    }

    /**
     * <p>Constructor for SlotOptionsImpl.</p>
     *
     * @param json a {@link java.lang.String} object.
     */
    public SlotOptionsImpl(String json) {
        SlotOptionsImpl jsonSlotOptions = new Gson().fromJson(json, SlotOptionsImpl.class);

        this.clientType = jsonSlotOptions.clientType;
        this.clientSubtype = jsonSlotOptions.clientSubtype;
        this.machineId = jsonSlotOptions.machineId;
        this.maxPacketSize = jsonSlotOptions.maxPacketSize;
        this.corePriority = jsonSlotOptions.corePriority;
        this.nextUnitPercentage = jsonSlotOptions.nextUnitPercentage;
        this.maxUnits = jsonSlotOptions.maxUnits;
        this.checkpoint = jsonSlotOptions.checkpoint;
        this.pauseOnStart = jsonSlotOptions.pauseOnStart;
        this.gpuVendorId = jsonSlotOptions.gpuVendorId;
        this.gpuDeviceId = jsonSlotOptions.gpuDeviceId;
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
