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
package com.googlecode.jfold.model.simulation;

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
// <editor-fold defaultstate="collapsed" desc="Member Variables">
    /**
     * User name.
     */
    @SerializedName("user")
    private String user;
    /**
     * Team name.
     */
    @SerializedName("team")
    private long team;
    /**
     * Project this Simulation belongs to.
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
     * Core type.
     */
    @SerializedName("core_type")
    private int coreType;
    /**
     * Core identifier.
     */
    @SerializedName("core")
    private String core;
    /**
     * Project Description.
     */
    @SerializedName("description")
    private String description;
    /**
     * Total number of iterations in this Simulation.
     */
    @SerializedName("total_iterations")
    private int totalIterations;
    /**
     * Number of iterations completed.
     */
    @SerializedName("iterations_done")
    private int iterationsDone;
    /**
     * Energy.
     */
    @SerializedName("energy")
    private int energy;
    /**
     * Temperature.
     */
    @SerializedName("temperature")
    private int temperature;
    /**
     * Time and date this Simulation started.
     */
    @SerializedName("start_time")
    private Date startTime;
    /**
     * Time and date this Simulation expires.
     */
    @SerializedName("timeout")
    private long timeout;
    /**
     * Time and date this Simulation needs to be completed by.
     */
    @SerializedName("deadline")
    private long deadline;
    /**
     * Time and date this Simulation has been running for.
     */
    @SerializedName("run_time")
    private long runTime;
    /**
     * Simulation time.
     */
    @SerializedName("simulation_time")
    private long simulationTime;
    /**
     * Estimated time of arrival.
     */
    @SerializedName("eta")
    private long eta;
    /**
     * Simulation news.
     */
    @SerializedName("news")
    private String news;
    /**
     * Slot number.
     */
    @SerializedName("slot")
    private int slot;
// </editor-fold>

// <editor-fold desc="Constructors">
    /**
     * Default constructor.
     */
    public SimulationInfoImpl() {
        super();
    }
// </editor-fold>

// <editor-fold desc="Accessors">
    /** {@inheritDoc} */
    @Override
    public final String getUser() {
        return user;
    }

    /** {@inheritDoc} */
    @Override
    public final long getTeam() {
        return team;
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
    public final int getCoreType() {
        return coreType;
    }

    /** {@inheritDoc} */
    @Override
    public final String getCore() {
        return core;
    }

    /** {@inheritDoc} */
    @Override
    public final String getDescription() {
        return description;
    }

    /** {@inheritDoc} */
    @Override
    public final int getTotalIterations() {
        return totalIterations;
    }

    /** {@inheritDoc} */
    @Override
    public final int getIterationsDone() {
        return iterationsDone;
    }

    /** {@inheritDoc} */
    @Override
    public final int getEnergy() {
        return energy;
    }

    /** {@inheritDoc} */
    @Override
    public final int getTemperature() {
        return temperature;
    }

    /** {@inheritDoc} */
    @Override
    public final Date getStartTime() {
        return (Date) startTime.clone();
    }

    /** {@inheritDoc} */
    @Override
    public final Date getTimeout() {
        return new Date(timeout + getStartTime().getTime());
    }

    /** {@inheritDoc} */
    @Override
    public final Date getDeadline() {
        return new Date(deadline + getStartTime().getTime());
    }

    /** {@inheritDoc} */
    @Override
    public final Date getRunTime() {
        return new Date(runTime);
    }

    /** {@inheritDoc} */
    @Override
    public final Date getSimulationTime() {
        return new Date(simulationTime);
    }

    /** {@inheritDoc} */
    @Override
    public final Date getEta() {
        return new Date(eta + getStartTime().getTime());
    }

    /** {@inheritDoc} */
    @Override
    public final String getNews() {
        return news;
    }

    /** {@inheritDoc} */
    @Override
    public final int getSlot() {
        return slot;
    }
// </editor-fold>

    /** {@inheritDoc} */
    @Override
    public final String toString() {
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
