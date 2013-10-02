package com.googlecode.jfold.model.unit;

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

    @SerializedName("id")
    private String id;
    @SerializedName("state")
    private String state;
    @SerializedName("project")
    private int project;
    @SerializedName("run")
    private int run;
    @SerializedName("clone")
    private int clone;
    @SerializedName("gen")
    private int gen;
    @SerializedName("core")
    private String core;
    @SerializedName("unit")
    private String unit;
    @SerializedName("percentdone")
    private String percentDone;
    @SerializedName("totalframes")
    private int totalFrames;
    @SerializedName("framesdone")
    private int framesDone;
    @SerializedName("assigned")
    private String assigned;
    @SerializedName("timeout")
    private String timeout;
    @SerializedName("deadline")
    private String deadline;
    @SerializedName("ws")
    private String ws;
    @SerializedName("cs")
    private String cs;
    @SerializedName("waitingon")
    private String waitingOn;
    @SerializedName("attempts")
    private int attempts;
    @SerializedName("nextattempt")
    private String nextAttempt;
    @SerializedName("slot")
    private int slot;
    @SerializedName("eta")
    private String eta;
    @SerializedName("ppd")
    private double ppd;
    @SerializedName("tpf")
    private String tpf;
    @SerializedName("basecredit")
    private double baseCredit;
    @SerializedName("creditestimate")
    private double creditEstimate;
    @SerializedName("description")
    private String description;

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
    public UnitImpl(String json) {
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

    /** {@inheritDoc} */
    @Override
    public String getId() {
        return id;
    }

    /** {@inheritDoc} */
    @Override
    public String getState() {
        return state;
    }

    /** {@inheritDoc} */
    @Override
    public int getProject() {
        return project;
    }

    /** {@inheritDoc} */
    @Override
    public int getRun() {
        return run;
    }

    /** {@inheritDoc} */
    @Override
    public int getClone() {
        return clone;
    }

    /** {@inheritDoc} */
    @Override
    public int getGen() {
        return gen;
    }

    /** {@inheritDoc} */
    @Override
    public String getCore() {
        return core;
    }

    /** {@inheritDoc} */
    @Override
    public String getUnit() {
        return unit;
    }

    /** {@inheritDoc} */
    @Override
    public String getPercentDone() {
        return percentDone;
    }

    /** {@inheritDoc} */
    @Override
    public int getTotalFrames() {
        return totalFrames;
    }

    /** {@inheritDoc} */
    @Override
    public int getFramesDone() {
        return framesDone;
    }

    /** {@inheritDoc} */
    @Override
    public Date getAssigned() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public Date getTimeout() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public Date getDeadline() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public Inet4Address getWs() {
        Inet4Address workServer = null;
        try {
            workServer = (Inet4Address) Inet4Address.getByName(ws);
        }
        catch (UnknownHostException ex) {
            Logger.getLogger(UnitImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return workServer;
    }

    /** {@inheritDoc} */
    @Override
    public Inet4Address getCs() {
        Inet4Address collectionServer = null;
        try {
            collectionServer = (Inet4Address) Inet4Address.getByName(cs);
        }
        catch (UnknownHostException ex) {
            Logger.getLogger(UnitImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return collectionServer;
    }

    /** {@inheritDoc} */
    @Override
    public String getWaitingOn() {
        return waitingOn;
    }

    /** {@inheritDoc} */
    @Override
    public int getAttempts() {
        return attempts;
    }

    /** {@inheritDoc} */
    @Override
    public String getNextAttempt() {
        return nextAttempt;
    }

    /** {@inheritDoc} */
    @Override
    public int getSlot() {
        return slot;
    }

    /** {@inheritDoc} */
    @Override
    public String getEta() {
        return eta;
    }

    /** {@inheritDoc} */
    @Override
    public double getPpd() {
        return ppd;
    }

    /** {@inheritDoc} */
    @Override
    public String getTpf() {
        return tpf;
    }

    /** {@inheritDoc} */
    @Override
    public double getBaseCredit() {
        return baseCredit;
    }

    /** {@inheritDoc} */
    @Override
    public double getCreditEstimate() {
        return creditEstimate;
    }

    /** {@inheritDoc} */
    @Override
    public String getDescription() {
        return description;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
