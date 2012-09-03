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
package com.googlecode.jfold.model;

import com.google.gson.annotations.SerializedName;
import com.googlecode.jfold.interfaces.ISlotOptions;
import java.io.Serializable;

/**
 *
 * @author Michael Thomas <michael4.thomas@live.uwe.ac.uk>
 */
public class SlotOptions implements ISlotOptions, Serializable {
    
    @SerializedName("client-type") private String clientType;
    @SerializedName("client-subtype") private String clientSubtype;
    @SerializedName("machine-id") private int machineId;
    @SerializedName("max-packet-size") private String maxPacketSize;
    @SerializedName("core-priority") private String corePriority;
    @SerializedName("next-unit-percentage") private int nextUnitPercentage;
    @SerializedName("max-units") private int maxUnits;
    @SerializedName("checkpoint") private int checkpoint;
    @SerializedName("pause-on-start") private boolean pauseOnStart;
    @SerializedName("gpu-vendor-id") private String gpuVendorId;
    @SerializedName("gpu-device-id") private String gpuDeviceId;

    public String getClientType() {
        return clientType;
    }

    public String getClientSubtype() {
        return clientSubtype;
    }

    public int getMachineId() {
        return machineId;
    }

    public String getMaxPacketSize() {
        return maxPacketSize;
    }

    public String getCorePriority() {
        return corePriority;
    }

    public int getNextUnitPercentage() {
        return nextUnitPercentage;
    }

    public int getMaxUnits() {
        return maxUnits;
    }

    public int getCheckpoint() {
        return checkpoint;
    }

    public boolean getPauseOnStart() {
        return pauseOnStart;
    }

    public String getGpuVendorId() {
        return gpuVendorId;
    }

    public String getGpuDeviceId() {
        return gpuDeviceId;
    }
    
    @Override
    public String toString() {
        return "clientType = " + clientType +
               "\nclientSubtype = " + clientSubtype +
               "\nmachineId = " + machineId +
               "\nmaxPacketSize = " + maxPacketSize +
               "\ncorePriority = " + corePriority +
               "\nnextUnitPercentage = " + nextUnitPercentage +
               "\nmaxUnits = " + maxUnits +
               "\ncheckpoint = " + checkpoint +
               "\npauseOnStart = " + pauseOnStart +
               "\ngpuVendorId = " + gpuVendorId +
               "\ngpuDeviceId = " + gpuDeviceId;
    }
}
