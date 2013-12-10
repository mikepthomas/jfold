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
package com.googlecode.jfold.unit;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <p>UnitImpl class.</p>
 *
 * @author Michael Thomas <mikepthomas@outlook.com>
 * @version $Id: $Id
 */
public class UnitImpl implements Unit, Serializable {
// <editor-fold defaultstate="collapsed" desc="Member Variables">
    /**
     * Identifier.
     */
    @SerializedName("id")
    private String id;
    /**
     * Unit state.
     */
    @SerializedName("state")
    private String state;
    /**
     * Project this Unit belongs to.
     */
    @SerializedName("project")
    private int project;
    /**
     * Run of the Project.
     */
    @SerializedName("run")
    private int run;
    /**
     * Clone of the Project.
     */
    @SerializedName("clone")
    private int clone;
    /**
     * Generation of the Project.
     */
    @SerializedName("gen")
    private int gen;
    /**
     * Core Identifier.
     */
    @SerializedName("core")
    private String core;
    /**
     * Unique ID of the unit.
     */
    @SerializedName("unit")
    private String unit;
    /**
     * Percentage of work completed.
     */
    @SerializedName("percentdone")
    private String percentDone;
    /**
     * Total number of frames in this Unit.
     */
    @SerializedName("totalframes")
    private int totalFrames;
    /**
     * Number of frames completed.
     */
    @SerializedName("framesdone")
    private int framesDone;
    /**
     * Time and date this work unit was assigned.
     */
    @SerializedName("assigned")
    private String assigned;
    /**
     * Time and date this work unit expires.
     */
    @SerializedName("timeout")
    private String timeout;
    /**
     * Time and date this work unit needs to be completed by.
     */
    @SerializedName("deadline")
    private String deadline;
    /**
     * Work server.
     */
    @SerializedName("ws")
    private String ws;
    /**
     * Collection server.
     */
    @SerializedName("cs")
    private String cs;
    /**
     * Reason the Unit is waiting.
     */
    @SerializedName("waitingon")
    private String waitingOn;
    /**
     * Number of attempts to send completed Unit to collection server.
     */
    @SerializedName("attempts")
    private int attempts;
    /**
     * Time until the next attempt to send completed Unit to collection server.
     */
    @SerializedName("nextattempt")
    private String nextAttempt;
    /**
     * Slot number this Unit belongs to.
     */
    @SerializedName("slot")
    private int slot;
    /**
     * Estimated time of arrival.
     */
    @SerializedName("eta")
    private String eta;
    /**
     * Points per day.
     */
    @SerializedName("ppd")
    private double ppd;
    /**
     * Time per frame.
     */
    @SerializedName("tpf")
    private String tpf;
    /**
     * Baseline number of points awarded for completion of this Unit.
     */
    @SerializedName("basecredit")
    private double baseCredit;
    /**
     * Estimated number of points awarded for completion of this Unit.
     */
    @SerializedName("creditestimate")
    private double creditEstimate;
    /**
     * Project Description.
     */
    @SerializedName("description")
    private String description;
// </editor-fold>

// <editor-fold desc="Constructors">
    /**
     * Default constructor.
     */
    public UnitImpl() {
        super();
    }

    /**
     * <p>Constructor for UnitImpl.</p>
     *
     * @param json a {@link java.lang.String} object.
     */
    public UnitImpl(final String json) {
        this();

        UnitImpl jsonUnit = new Gson().fromJson(json, UnitImpl.class);

        this.id = jsonUnit.id;
        this.state = jsonUnit.state;
        this.project = jsonUnit.project;
        this.run = jsonUnit.run;
        this.clone = jsonUnit.clone;
        this.gen = jsonUnit.gen;
        this.core = jsonUnit.core;
        this.unit = jsonUnit.unit;
        this.percentDone = jsonUnit.percentDone;
        this.totalFrames = jsonUnit.totalFrames;
        this.framesDone = jsonUnit.framesDone;
        this.assigned = jsonUnit.assigned;
        this.timeout = jsonUnit.timeout;
        this.deadline = jsonUnit.deadline;
        this.ws = jsonUnit.ws;
        this.cs = jsonUnit.cs;
        this.waitingOn = jsonUnit.waitingOn;
        this.attempts = jsonUnit.attempts;
        this.nextAttempt = jsonUnit.nextAttempt;
        this.slot = jsonUnit.slot;
        this.eta = jsonUnit.eta;
        this.ppd = jsonUnit.ppd;
        this.tpf = jsonUnit.tpf;
        this.baseCredit = jsonUnit.baseCredit;
        this.creditEstimate = jsonUnit.creditEstimate;
        this.description = jsonUnit.description;
    }
// </editor-fold>

// <editor-fold desc="Accessors">
    /** {@inheritDoc} */
    @Override
    public final String getId() {
        return id;
    }

    /** {@inheritDoc} */
    @Override
    public final String getState() {
        return state;
    }

    /** {@inheritDoc} */
    @Override
    public final int getProject() {
        return project;
    }

    /** {@inheritDoc} */
    @Override
    public final int getRun() {
        return run;
    }

    /** {@inheritDoc} */
    @Override
    public final int getClone() {
        return clone;
    }

    /** {@inheritDoc} */
    @Override
    public final int getGen() {
        return gen;
    }

    /** {@inheritDoc} */
    @Override
    public final String getCore() {
        return core;
    }

    /** {@inheritDoc} */
    @Override
    public final String getUnit() {
        return unit;
    }

    /** {@inheritDoc} */
    @Override
    public final String getPercentDone() {
        return percentDone;
    }

    /** {@inheritDoc} */
    @Override
    public final int getTotalFrames() {
        return totalFrames;
    }

    /** {@inheritDoc} */
    @Override
    public final int getFramesDone() {
        return framesDone;
    }

    /** {@inheritDoc} */
    @Override
    public final Date getAssigned() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final Date getTimeout() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final Date getDeadline() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public final Inet4Address getWs() {
        Inet4Address workServer = null;
        try {
            workServer = (Inet4Address) Inet4Address.getByName(ws);
        } catch (UnknownHostException ex) {
            Logger.getLogger(UnitImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return workServer;
    }

    /** {@inheritDoc} */
    @Override
    public final Inet4Address getCs() {
        Inet4Address collectionServer = null;
        try {
            collectionServer = (Inet4Address) Inet4Address.getByName(cs);
        } catch (UnknownHostException ex) {
            Logger.getLogger(UnitImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return collectionServer;
    }

    /** {@inheritDoc} */
    @Override
    public final String getWaitingOn() {
        return waitingOn;
    }

    /** {@inheritDoc} */
    @Override
    public final int getAttempts() {
        return attempts;
    }

    /** {@inheritDoc} */
    @Override
    public final String getNextAttempt() {
        return nextAttempt;
    }

    /** {@inheritDoc} */
    @Override
    public final int getSlot() {
        return slot;
    }

    /** {@inheritDoc} */
    @Override
    public final String getEta() {
        return eta;
    }

    /** {@inheritDoc} */
    @Override
    public final double getPpd() {
        return ppd;
    }

    /** {@inheritDoc} */
    @Override
    public final String getTpf() {
        return tpf;
    }

    /** {@inheritDoc} */
    @Override
    public final double getBaseCredit() {
        return baseCredit;
    }

    /** {@inheritDoc} */
    @Override
    public final double getCreditEstimate() {
        return creditEstimate;
    }

    /** {@inheritDoc} */
    @Override
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
