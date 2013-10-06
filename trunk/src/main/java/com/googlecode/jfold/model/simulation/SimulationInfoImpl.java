package com.googlecode.jfold.model.simulation;

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

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>SimulationInfoImpl class.</p>
 *
 * @author Michael Thomas <mikepthomas@outlook.com>
 * @version 7.3.6
 */
public class SimulationInfoImpl implements SimulationInfo, Serializable {

    @SerializedName("user")
    private String user;
    @SerializedName("team")
    private long team;
    @SerializedName("project")
    private int project;
    @SerializedName("run")
    private int run;
    @SerializedName("clone")
    private int clone;
    @SerializedName("gen")
    private int gen;
    @SerializedName("core_type")
    private int coreType;
    @SerializedName("core")
    private String core;
    @SerializedName("description")
    private String description;
    @SerializedName("total_iterations")
    private int totalIterations;
    @SerializedName("iterations_done")
    private int iterationsDone;
    @SerializedName("energy")
    private int energy;
    @SerializedName("temperature")
    private int temperature;
    @SerializedName("start_time")
    private Date startTime;
    @SerializedName("timeout")
    private long timeout;
    @SerializedName("deadline")
    private long deadline;
    @SerializedName("run_time")
    private long runTime;
    @SerializedName("simulation_time")
    private long simulationTime;
    @SerializedName("eta")
    private long eta;
    @SerializedName("news")
    private String news;
    @SerializedName("slot")
    private int slot;

    /**
     * Default constructor.
     */
    public SimulationInfoImpl() {
        super();
    }

    /** {@inheritDoc} */
    @Override
    public String getUser() {
        return user;
    }

    /** {@inheritDoc} */
    @Override
    public long getTeam() {
        return team;
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
    public int getCoreType() {
        return coreType;
    }

    /** {@inheritDoc} */
    @Override
    public String getCore() {
        return core;
    }

    /** {@inheritDoc} */
    @Override
    public String getDescription() {
        return description;
    }

    /** {@inheritDoc} */
    @Override
    public int getTotalIterations() {
        return totalIterations;
    }

    /** {@inheritDoc} */
    @Override
    public int getIterationsDone() {
        return iterationsDone;
    }

    /** {@inheritDoc} */
    @Override
    public int getEnergy() {
        return energy;
    }

    /** {@inheritDoc} */
    @Override
    public int getTemperature() {
        return temperature;
    }

    /** {@inheritDoc} */
    @Override
    public Date getStartTime() {
        return (Date) startTime.clone();
    }

    /** {@inheritDoc} */
    @Override
    public Date getTimeout() {
        return new Date(timeout + getStartTime().getTime());
    }

    /** {@inheritDoc} */
    @Override
    public Date getDeadline() {
        return new Date(deadline + getStartTime().getTime());
    }

    /** {@inheritDoc} */
    @Override
    public Date getRunTime() {
        return new Date(runTime);
    }

    /** {@inheritDoc} */
    @Override
    public Date getSimulationTime() {
        return new Date(simulationTime);
    }

    /** {@inheritDoc} */
    @Override
    public Date getEta() {
        return new Date(eta + getStartTime().getTime());
    }

    /** {@inheritDoc} */
    @Override
    public String getNews() {
        return news;
    }

    /** {@inheritDoc} */
    @Override
    public int getSlot() {
        return slot;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "user = " + user
                + "\nteam = " + team
                + "\nproject = " + project
                + "\nrun = " + run
                + "\nclone = " + clone
                + "\ngen = " + gen
                + "\ncoreType = " + coreType
                + "\ncore = " + core
                + "\ndescription = " + description
                + "\ntotalIterations = " + totalIterations
                + "\niterationsDone = " + iterationsDone
                + "\nenergy = " + energy
                + "\ntemperature = " + temperature
                + "\nstartTime = " + startTime
                + "\ntimeout = " + timeout
                + "\ndeadline = " + deadline
                + "\nrunTime = " + runTime
                + "\nsimulationTime = " + simulationTime
                + "\neta = " + eta
                + "\nnews = " + news
                + "\nslot = " + slot;
    }
}
