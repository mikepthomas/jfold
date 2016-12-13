/*
 * #%L
 * This file is part of jFold.
 * %%
 * Copyright (C) 2012 - 2015 Michael Thomas (mikepthomas@outlook.com)
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
package info.mikethomas.jfold.slot;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * <p>SlotOptions class.</p>
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version 7.4.4
 */
@XmlRootElement(name = "slot-options")
public class SlotOptions implements Serializable {
// <editor-fold defaultstate="collapsed" desc="Member Variables">
    /**
     * Client type.
     */
    @XmlElement(name = "client-type")
    private String clientType;
    /**
     * Client sub-type.
     */
    @XmlElement(name = "client-subtype")
    private String clientSubtype;
    /**
     * Machine identifier.
     */
    @XmlElement(name = "machine-id")
    private int machineId;
    /**
     * Maximum packet size.
     */
    @XmlElement(name = "max-packet-size")
    private String maxPacketSize;
    /**
     * Core priority.
     */
    @XmlElement(name = "core-priority")
    private String corePriority;
    /**
     * Next unit percentage.
     */
    @XmlElement(name = "next-unit-percentage")
    private int nextUnitPercentage;
    /**
     * Maximum units.
     */
    @XmlElement(name = "max-units")
    private int maxUnits;
    /**
     * Checkpoint.
     */
    @XmlElement(name = "checkpoint")
    private int checkpoint;
    /**
     * Pause on start.
     */
    @XmlElement(name = "pause-on-start")
    private boolean pauseOnStart;
    /**
     * Graphics processor vendor identifier.
     */
    @XmlElement(name = "gpu-vendor-id")
    private String gpuVendorId;
    /**
     * Graphics processor device identifier.
     */
    @XmlElement(name = "gpu-device-id")
    private String gpuDeviceId;
    /**
     * CPUs.
     */
    @XmlElement(name = "cpus")
    private String cpus;
    /**
     * Idle.
     */
    @XmlElement(name = "idle")
    private boolean idle;
    /**
     * Paused.
     */
    @XmlElement(name = "paused")
    private boolean paused;
// </editor-fold>

// <editor-fold desc="Accessors">
    /**
     * Get the value of <code>client-type</code>.
     *
     * @return the <code>client-type</code> from <code>slot-options</code>
     */
    public final String getClientType() {
        return clientType;
    }

    /**
     * Get the value of <code>client-subtype</code>.
     *
     * @return the <code>client-subtype</code> from <code>slot-options</code>
     */
    public final String getClientSubtype() {
        return clientSubtype;
    }

    /**
     * Get the value of <code>machine-id</code>.
     *
     * @return the <code>machine-id</code> from <code>slot-options</code>
     */
    public final int getMachineId() {
        return machineId;
    }

    /**
     * Get the value of <code>max-packet-size</code>.
     *
     * @return the <code>max-packet-size</code> from <code>slot-options</code>
     */
    public final String getMaxPacketSize() {
        return maxPacketSize;
    }

    /**
     * Get the value of <code>core-priority</code>.
     *
     * @return the <code>core-priority</code> from <code>slot-options</code>
     */
    public final String getCorePriority() {
        return corePriority;
    }

    /**
     * Get the value of <code>next-unit-percentage</code>.
     *
     * @return the <code>next-unit-percentage</code> from <code>slot-options</code>
     */
    public final int getNextUnitPercentage() {
        return nextUnitPercentage;
    }

    /**
     * Get the value of <code>max-units</code>.
     *
     * @return the <code>max-units</code> from <code>slot-options</code>
     */
    public final int getMaxUnits() {
        return maxUnits;
    }

    /**
     * Get the value of <code>checkpoint</code>.
     *
     * @return the <code>checkpoint</code> from <code>slot-options</code>
     */
    public final int getCheckpoint() {
        return checkpoint;
    }

    /**
     * Get the value of <code>pause-on-start</code>.
     *
     * @return the <code>pause-on-start</code> from <code>slot-options</code>
     */
    public final boolean getPauseOnStart() {
        return pauseOnStart;
    }

    /**
     * Get the value of <code>gpu-vendor-id</code>.
     *
     * @return the <code>client-type</code> from <code>slot-options</code>
     */
    public final String getGpuVendorId() {
        return gpuVendorId;
    }

    /**
     * Get the value of <code>gpu-device-id</code>.
     *
     * @return the <code>gpu-device-id</code> from <code>slot-options</code>
     */
    public final String getGpuDeviceId() {
        return gpuDeviceId;
    }

    /**
     * Get the value of <code>cpus</code>.
     *
     * @return the <code>cpus</code> from <code>slot-options</code>
     */
    public final String getCpus() {
        return cpus;
    }

    /**
     * Get the value of <code>idle</code>.
     *
     * @return the <code>idle</code> from <code>slot-options</code>
     */
    public final boolean getIdle() {
        return idle;
    }

    /**
     * Get the value of <code>paused</code>.
     *
     * @return the <code>paused</code> from <code>slot-options</code>
     */
    public final boolean getPaused() {
        return paused;
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
