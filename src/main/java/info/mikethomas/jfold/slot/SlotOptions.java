/*
 * #%L
 * This file is part of jFold.
 * %%
 * Copyright (C) 2012 - 2019 Mike Thomas <mikepthomas@outlook.com>
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

import lombok.Getter;
import lombok.ToString;

/**
 * <p>SlotOptions class.</p>
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version 7.5.1
 */
@Getter
@ToString
@XmlRootElement(name = "slot-options")
public class SlotOptions implements Serializable {

    /**
     * Client type.
     *
     * @return the <code>client-type</code> from <code>slot-options</code>
     */
    @XmlElement(name = "client-type")
    private String clientType;

    /**
     * Client sub-type.
     *
     * @return the <code>client-subtype</code> from <code>slot-options</code>
     */
    @XmlElement(name = "client-subtype")
    private String clientSubtype;

    /**
     * Machine identifier.
     *
     * @return the <code>machine-id</code> from <code>slot-options</code>
     */
    @XmlElement(name = "machine-id")
    private Integer machineId;

    /**
     * Maximum packet size.
     *
     * @return the <code>max-packet-size</code> from <code>slot-options</code>
     */
    @XmlElement(name = "max-packet-size")
    private String maxPacketSize;

    /**
     * Core priority.
     *
     * @return the <code>core-priority</code> from <code>slot-options</code>
     */
    @XmlElement(name = "core-priority")
    private String corePriority;

    /**
     * Next unit percentage.
     *
     * @return the <code>next-unit-percentage</code> from <code>slot-options</code>
     */
    @XmlElement(name = "next-unit-percentage")
    private Integer nextUnitPercentage;

    /**
     * Maximum units.
     *
     * @return the <code>max-units</code> from <code>slot-options</code>
     */
    @XmlElement(name = "max-units")
    private Integer maxUnits;

    /**
     * Checkpoint.
     *
     * @return the <code>checkpoint</code> from <code>slot-options</code>
     */
    @XmlElement
    private Integer checkpoint;

    /**
     * Pause on start.
     *
     * @return the <code>pause-on-start</code> from <code>slot-options</code>
     */
    @XmlElement(name = "pause-on-start")
    private Boolean pauseOnStart;

    /**
     * Graphics processor vendor identifier.
     *
     * @return the <code>client-type</code> from <code>slot-options</code>
     */
    @XmlElement(name = "gpu-vendor-id")
    private String gpuVendorId;

    /**
     * Graphics processor device identifier.
     *
     * @return the <code>gpu-device-id</code> from <code>slot-options</code>
     */
    @XmlElement(name = "gpu-device-id")
    private String gpuDeviceId;

    /**
     * CPUs.
     *
     * @return the <code>cpus</code> from <code>slot-options</code>
     */
    @XmlElement
    private String cpus;

    /**
     * Idle.
     *
     * @return the <code>idle</code> from <code>slot-options</code>
     */
    @XmlElement
    private Boolean idle;

    /**
     * Paused.
     *
     * @return the <code>paused</code> from <code>slot-options</code>
     */
    @XmlElement
    private Boolean paused;
}
