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
package info.mikethomas.jfold.unit;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * <p>Unit class.</p>
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version 7.4.4
 */
@XmlRootElement(name = "unit")
public class Unit implements Serializable {
// <editor-fold defaultstate="collapsed" desc="Member Variables">
    /**
     * Identifier.
     */
    @XmlElement(name = "id")
    private String id;
    /**
     * Unit state.
     */
    @XmlElement(name = "state")
    private String state;
    /**
     * Unit error.
     */
    @XmlElement(name = "error")
    private String error;
    /**
     * Project this Unit belongs to.
     */
    @XmlElement(name = "project")
    private int project;
    /**
     * Run of the Project.
     */
    @XmlElement(name = "run")
    private int run;
    /**
     * Clone of the Project.
     */
    @XmlElement(name = "clone")
    private int clone;
    /**
     * Generation of the Project.
     */
    @XmlElement(name = "gen")
    private int gen;
    /**
     * Core Identifier.
     */
    @XmlElement(name = "core")
    private String core;
    /**
     * Unique ID of the unit.
     */
    @XmlElement(name = "unit")
    private String unit;
    /**
     * Percentage of work completed.
     */
    @XmlElement(name = "percentdone")
    private String percentDone;
    /**
     * Total number of frames in this Unit.
     */
    @XmlElement(name = "totalframes")
    private int totalFrames;
    /**
     * Number of frames completed.
     */
    @XmlElement(name = "framesdone")
    private int framesDone;
    /**
     * Time and date this work unit was assigned.
     */
    @XmlElement(name = "assigned")
    private String assigned;
    /**
     * Time and date this work unit expires.
     */
    @XmlElement(name = "timeout")
    private String timeout;
    /**
     * Time and date this work unit needs to be completed by.
     */
    @XmlElement(name = "deadline")
    private String deadline;
    /**
     * Work server.
     */
    @XmlElement(name = "ws")
    private String ws;
    /**
     * Collection server.
     */
    @XmlElement(name = "cs")
    private String cs;
    /**
     * Reason the Unit is waiting.
     */
    @XmlElement(name = "waitingon")
    private String waitingOn;
    /**
     * Number of attempts to send completed Unit to collection server.
     */
    @XmlElement(name = "attempts")
    private int attempts;
    /**
     * Time until the next attempt to send completed Unit to collection server.
     */
    @XmlElement(name = "nextattempt")
    private String nextAttempt;
    /**
     * Time remaining.
     */
    @XmlElement(name = "timeremaining")
    private String timeRemaining;
    /**
     * Slot number this Unit belongs to.
     */
    @XmlElement(name = "slot")
    private int slot;
    /**
     * Estimated time of arrival.
     */
    @XmlElement(name = "eta")
    private String eta;
    /**
     * Points per day.
     */
    @XmlElement(name = "ppd")
    private double ppd;
    /**
     * Time per frame.
     */
    @XmlElement(name = "tpf")
    private String tpf;
    /**
     * Baseline number of points awarded for completion of this Unit.
     */
    @XmlElement(name = "basecredit")
    private double baseCredit;
    /**
     * Estimated number of points awarded for completion of this Unit.
     */
    @XmlElement(name = "creditestimate")
    private double creditEstimate;
    /**
     * Project Description.
     */
    @XmlElement(name = "description")
    private String description;
// </editor-fold>

// <editor-fold desc="Accessors">
    /**
     * Get the value of <code>id</code>.
     *
     * @return the <code>id</code> from <code>queue-info</code>
     */
    public final String getId() {
        return id;
    }

    /**
     * Get the value of <code>state</code>.
     *
     * @return the <code>state</code> from <code>queue-info</code>
     */
    public final String getState() {
        return state;
    }

    /**
     * Get the value of <code>error</code>.
     *
     * @return the <code>error</code> from <code>queue-info</code>
     */
    public final String getError() {
        return error;
    }

    /**
     * Get the value of <code>project</code>.
     *
     * @return the <code>project</code> from <code>queue-info</code>
     */
    public final int getProject() {
        return project;
    }

    /**
     * Get the value of <code>run</code>.
     *
     * @return the <code>run</code> from <code>queue-info</code>
     */
    public final int getRun() {
        return run;
    }

    /**
     * Get the value of <code>clone</code>.
     *
     * @return the <code>clone</code> from <code>queue-info</code>
     */
    public final int getClone() {
        return clone;
    }

    /**
     * Get the value of <code>gen</code>.
     *
     * @return the <code>gen</code> from <code>queue-info</code>
     */
    public final int getGen() {
        return gen;
    }

    /**
     * Get the value of <code>core</code>.
     *
     * @return the <code>core</code> from <code>queue-info</code>
     */
    public final String getCore() {
        return core;
    }

    /**
     * Get the value of <code>unit</code>.
     *
     * @return the <code>unit</code> from <code>queue-info</code>
     */
    public final String getUnit() {
        return unit;
    }

    /**
     * Get the value of <code>percentdone</code>.
     *
     * @return the <code>percentdone</code> from <code>queue-info</code>
     */
    public final String getPercentDone() {
        return percentDone;
    }

    /**
     * Get the value of <code>totalframes</code>.
     *
     * @return the <code>totalframes</code> from <code>queue-info</code>
     */
    public final int getTotalFrames() {
        return totalFrames;
    }

    /**
     * Get the value of <code>framesdone</code>.
     *
     * @return the <code>framesdone</code> from <code>queue-info</code>
     */
    public final int getFramesDone() {
        return framesDone;
    }

    /**
     * Get the value of <code>assigned</code>.
     *
     * @return the <code>assigned</code> from <code>queue-info</code>
     */
    public final String getAssigned() {
        return assigned;
    }

    /**
     * Get the value of <code>timeout</code>.
     *
     * @return the <code>timeout</code> from <code>queue-info</code>
     */
    public final String getTimeout() {
        return timeout;
    }

    /**
     * Get the value of <code>deadline</code>.
     *
     * @return the <code>deadline</code> from <code>queue-info</code>
     */
    public final String getDeadline() {
        return deadline;
    }

    /**
     * Get the value of <code>ws</code>.
     *
     * @return the <code>ws</code> from <code>queue-info</code>
     */
    public final String getWs() {
        return ws;
    }

    /**
     * Get the value of <code>cs</code>.
     *
     * @return the <code>cs</code> from <code>queue-info</code>
     */
    public final String getCs() {
        return cs;
    }

    /**
     * Get the value of <code>waitingon</code>.
     *
     * @return the <code>waitingon</code> from <code>queue-info</code>
     */
    public final String getWaitingOn() {
        return waitingOn;
    }

    /**
     * Get the value of <code>attempts</code>.
     *
     * @return the <code>attempts</code> from <code>queue-info</code>
     */
    public final int getAttempts() {
        return attempts;
    }

    /**
     * Get the value of <code>nextattempt</code>.
     *
     * @return the <code>nextattempt</code> from <code>queue-info</code>
     */
    public final String getNextAttempt() {
        return nextAttempt;
    }

    /**
     * Get the value of <code>timeremaining</code>.
     *
     * @return the <code>timeremaining</code> from <code>queue-info</code>
     */
    public final String getTimeRemaining() {
        return timeRemaining;
    }

    /**
     * Get the value of <code>slot</code>.
     *
     * @return the <code>slot</code> from <code>queue-info</code>
     */
    public final int getSlot() {
        return slot;
    }

    /**
     * Get the value of <code>eta</code>.
     *
     * @return the <code>eta</code> from <code>queue-info</code>
     */
    public final String getEta() {
        return eta;
    }

    /**
     * Get the value of <code>ppd</code>.
     *
     * @return the <code>ppd</code> from <code>queue-info</code>
     */
    public final double getPpd() {
        return ppd;
    }

    /**
     * Get the value of <code>tpf</code>.
     *
     * @return the <code>tpf</code> from <code>queue-info</code>
     */
    public final String getTpf() {
        return tpf;
    }

    /**
     * Get the value of <code>basecredit</code>.
     *
     * @return the <code>basecredit</code> from <code>queue-info</code>
     */
    public final double getBaseCredit() {
        return baseCredit;
    }

    /**
     * Get the value of <code>creditestimate</code>.
     *
     * @return the <code>creditestimate</code> from <code>queue-info</code>
     */
    public final double getCreditEstimate() {
        return creditEstimate;
    }

    /**
     * Get the value of <code>description</code>.
     *
     * @return the <code>description</code> from <code>queue-info</code>
     */
    public final String getDescription() {
        return description;
    }
// </editor-fold>

    /** {@inheritDoc} */
    @Override
    public final String toString() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
