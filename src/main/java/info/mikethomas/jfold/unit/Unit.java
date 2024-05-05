/*
 * #%L
 * This file is part of jFold.
 * %%
 * Copyright (C) 2012 - 2024 Mike Thomas <mikepthomas@outlook.com>
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
package info.mikethomas.jfold.unit;

import info.mikethomas.jfold.util.DateAdapter;

import java.io.Serializable;
import java.net.InetAddress;
import java.util.Date;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import lombok.Getter;
import lombok.ToString;

/**
 * <p>Represents a Folding@Home Work Unit.</p>
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version 7.6.21
 */
@Getter
@ToString
@XmlRootElement(name = "unit")
public class Unit implements Serializable {

    /**
     * Identifier.
     *
     * @return the <code>id</code> from <code>queue-info</code>
     */
    @XmlElement
    private String id;

    /**
     * Unit state.
     *
     * @return the <code>state</code> from <code>queue-info</code>
     */
    @XmlElement
    private String state;

    /**
     * Unit error.
     *
     * @return the <code>error</code> from <code>queue-info</code>
     */
    @XmlElement
    private String error;

    /**
     * Project this Unit belongs to.
     *
     * @return the <code>project</code> from <code>queue-info</code>
     */
    @XmlElement
    private int project;

    /**
     * Run of the Project.
     *
     * @return the <code>run</code> from <code>queue-info</code>
     */
    @XmlElement
    private int run;

    /**
     * Clone of the Project.
     *
     * @return the <code>clone</code> from <code>queue-info</code>
     */
    @XmlElement
    private int clone;

    /**
     * Generation of the Project.
     *
     * @return the <code>gen</code> from <code>queue-info</code>
     */
    @XmlElement
    private int gen;

    /**
     * Core Identifier.
     *
     * @return the <code>core</code> from <code>queue-info</code>
     */
    @XmlElement
    private String core;

    /**
     * Unique ID of the unit.
     *
     * @return the <code>unit</code> from <code>queue-info</code>
     */
    @XmlElement
    private String unit;

    /**
     * Percentage of work completed.
     *
     * @return the <code>percentdone</code> from <code>queue-info</code>
     */
    @XmlElement(name = "percentdone")
    private String percentDone;

    /**
     * Estimated time of arrival.
     *
     * @return the <code>eta</code> from <code>queue-info</code>
     */
    @XmlElement
    private String eta;

    /**
     * Points per day.
     *
     * @return the <code>ppd</code> from <code>queue-info</code>
     */
    @XmlElement
    private double ppd;

    /**
     * Estimated number of points awarded for completion of this Unit.
     *
     * @return the <code>creditestimate</code> from <code>queue-info</code>
     */
    @XmlElement(name = "creditestimate")
    private double creditEstimate;

    /**
     * Reason the Unit is waiting.
     *
     * @return the <code>waitingon</code> from <code>queue-info</code>
     */
    @XmlElement(name = "waitingon")
    private String waitingOn;

    /**
     * Time until the next attempt to send completed Unit to collection server.
     *
     * @return the <code>nextattempt</code> from <code>queue-info</code>
     */
    @XmlElement(name = "nextattempt")
    private String nextAttempt;

    /**
     * Time remaining.
     *
     * @return the <code>timeremaining</code> from <code>queue-info</code>
     */
    @XmlElement(name = "timeremaining")
    private String timeRemaining;

    /**
     * Total number of frames in this Unit.
     *
     * @return the <code>totalframes</code> from <code>queue-info</code>
     */
    @XmlElement(name = "totalframes")
    private int totalFrames;

    /**
     * Number of frames completed.
     *
     * @return the <code>framesdone</code> from <code>queue-info</code>
     */
    @XmlElement(name = "framesdone")
    private int framesDone;

    /**
     * Time and date this work unit was assigned.
     *
     * @return the <code>assigned</code> from <code>queue-info</code>
     */
    @XmlElement
    @XmlJavaTypeAdapter(DateAdapter.class)
    private Date assigned;

    /**
     * Time and date this work unit expires.
     *
     * @return the <code>timeout</code> from <code>queue-info</code>
     */
    @XmlElement
    @XmlJavaTypeAdapter(DateAdapter.class)
    private Date timeout;

    /**
     * Time and date this work unit needs to be completed by.
     *
     * @return the <code>deadline</code> from <code>queue-info</code>
     */
    @XmlElement
    @XmlJavaTypeAdapter(DateAdapter.class)
    private Date deadline;

    /**
     * Work server.
     *
     * @return the <code>ws</code> from <code>queue-info</code>
     */
    @XmlElement
    private InetAddress ws;

    /**
     * Collection server.
     *
     * @return the <code>cs</code> from <code>queue-info</code>
     */
    @XmlElement
    private InetAddress cs;

    /**
     * Number of attempts to send completed Unit to collection server.
     *
     * @return the <code>attempts</code> from <code>queue-info</code>
     */
    @XmlElement
    private int attempts;

    /**
     * Slot number this Unit belongs to.
     *
     * @return the <code>slot</code> from <code>queue-info</code>
     */
    @XmlElement
    private String slot;

    /**
     * Time per frame.
     *
     * @return the <code>tpf</code> from <code>queue-info</code>
     */
    @XmlElement
    private String tpf;

    /**
     * Baseline number of points awarded for completion of this Unit.
     *
     * @return the <code>basecredit</code> from <code>queue-info</code>
     */
    @XmlElement(name = "basecredit")
    private double baseCredit;

    /**
     * Project Description.
     *
     * @deprecated no longer returned by queue-info
     * @return the <code>description</code> from <code>queue-info</code>
     */
    @Deprecated
    @XmlElement
    private String description;
}
