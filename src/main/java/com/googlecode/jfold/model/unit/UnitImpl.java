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
 *
 * @author Michael Thomas <mikepthomas@outlook.com>
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
    }

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

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public int getProject() {
        return project;
    }

    @Override
    public int getRun() {
        return run;
    }

    @Override
    public int getClone() {
        return clone;
    }

    @Override
    public int getGen() {
        return gen;
    }

    @Override
    public String getCore() {
        return core;
    }

    @Override
    public String getUnit() {
        return unit;
    }

    @Override
    public String getPercentDone() {
        return percentDone;
    }

    @Override
    public int getTotalFrames() {
        return totalFrames;
    }

    @Override
    public int getFramesDone() {
        return framesDone;
    }

    @Override
    public Date getAssigned() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Date getTimeout() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Date getDeadline() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

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

    @Override
    public String getWaitingOn() {
        return waitingOn;
    }

    @Override
    public int getAttempts() {
        return attempts;
    }

    @Override
    public String getNextAttempt() {
        return nextAttempt;
    }

    @Override
    public int getSlot() {
        return slot;
    }

    @Override
    public String getEta() {
        return eta;
    }

    @Override
    public double getPpd() {
        return ppd;
    }

    @Override
    public String getTpf() {
        return tpf;
    }

    @Override
    public double getBaseCredit() {
        return baseCredit;
    }

    @Override
    public double getCreditEstimate() {
        return creditEstimate;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
