/*
 * #%L
 * This file is part of jFold.
 * %%
 * Copyright (C) 2012 - 2014 Michael Thomas (mikepthomas@outlook.com)
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
package com.googlecode.jfold.simulation;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * <p>SimulationInfo class.</p>
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version 7.4.4
 */
@XmlRootElement(name = "simulation-info")
public class SimulationInfo implements Serializable {
// <editor-fold defaultstate="collapsed" desc="Member Variables">
    /**
     * User name.
     */
    @XmlElement(name = "user")
    private String user;
    /**
     * Team name.
     */
    @XmlElement(name = "team")
    private long team;
    /**
     * Project this Simulation belongs to.
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
     * Core type.
     */
    @XmlElement(name = "core_type")
    private int coreType;
    /**
     * Core identifier.
     */
    @XmlElement(name = "core")
    private String core;
    /**
     * Project Description.
     *
     * @deprecated
     */
    @XmlElement(name = "description")
    private String description;
    /**
     * Total number of iterations in this Simulation.
     */
    @XmlElement(name = "total_iterations")
    private int totalIterations;
    /**
     * Number of iterations completed.
     */
    @XmlElement(name = "iterations_done")
    private int iterationsDone;
    /**
     * Energy.
     */
    @XmlElement(name = "energy")
    private int energy;
    /**
     * Temperature.
     */
    @XmlElement(name = "temperature")
    private int temperature;
    /**
     * Time and date this Simulation started.
     */
    @XmlElement(name = "start_time")
    private Date startTime;
    /**
     * Time and date this Simulation expires.
     */
    @XmlElement(name = "timeout")
    private long timeout;
    /**
     * Time and date this Simulation needs to be completed by.
     */
    @XmlElement(name = "deadline")
    private long deadline;
    /**
     * Time and date this Simulation has been running for.
     *
     * @deprecated
     */
    @XmlElement(name = "run_time")
    private long runTime;
    /**
     * Simulation time.
     *
     * @deprecated
     */
    @XmlElement(name = "simulation_time")
    private long simulationTime;
    /**
     * Estimated time of arrival.
     */
    @XmlElement(name = "eta")
    private long eta;
    /**
     * Progress.
     */
    @XmlElement(name = "progress")
    private double progress;
    /**
     * Simulation news.
     *
     * @deprecated
     */
    @XmlElement(name = "news")
    private String news;
    /**
     * Slot number.
     */
    @XmlElement(name = "slot")
    private int slot;
// </editor-fold>

// <editor-fold desc="Accessors">
    /**
     * Get the value of <code>user</code>.
     *
     * @return the <code>user</code> from <code>simulation-info</code>
     */
    public final String getUser() {
        return user;
    }

    /**
     * Get the value of <code>team</code>.
     *
     * @return the <code>team</code> from <code>simulation-info</code>
     */
    public final long getTeam() {
        return team;
    }

    /**
     * Get the value of <code>project</code>.
     *
     * @return the <code>project</code> from <code>simulation-info</code>
     */
    public final int getProject() {
        return project;
    }

    /**
     * Get the value of <code>run</code>.
     *
     * @return the <code>run</code> from <code>simulation-info</code>
     */
    public final int getRun() {
        return run;
    }

    /**
     * Get the value of <code>clone</code>.
     *
     * @return the <code>clone</code> from <code>simulation-info</code>
     */
    public final int getClone() {
        return clone;
    }

    /**
     * Get the value of <code>gen</code>.
     *
     * @return the <code>gen</code> from <code>simulation-info</code>
     */
    public final int getGen() {
        return gen;
    }

    /**
     * Get the value of <code>core_type</code>.
     *
     * @return the <code>core_type</code> from <code>simulation-info</code>
     */
    public final int getCoreType() {
        return coreType;
    }

    /**
     * Get the value of <code>core</code>.
     *
     * @return the <code>core</code> from <code>simulation-info</code>
     */
    public final String getCore() {
        return core;
    }

    /**
     * Get the value of <code>description</code>.
     *
     * @return the <code>description</code> from <code>simulation-info</code>
     */
    public final String getDescription() {
        return description;
    }

    /**
     * Get the value of <code>total_iterations</code>.
     *
     * @return the <code>total_iterations</code> from <code>simulation-info</code>
     */
    public final int getTotalIterations() {
        return totalIterations;
    }

    /**
     * Get the value of <code>iterations_done</code>.
     *
     * @return the <code>iterations_done</code> from <code>simulation-info</code>
     */
    public final int getIterationsDone() {
        return iterationsDone;
    }

    /**
     * Get the value of <code>energy</code>.
     *
     * @return the <code>energy</code> from <code>simulation-info</code>
     */
    public final int getEnergy() {
        return energy;
    }

    /**
     * Get the value of <code>temperature</code>.
     *
     * @return the <code>temperature</code> from <code>simulation-info</code>
     */
    public final int getTemperature() {
        return temperature;
    }

    /**
     * Get the value of <code>start_time</code>.
     *
     * @return the <code>start_time</code> from <code>simulation-info</code>
     */
    public final Date getStartTime() {
        return (Date) startTime.clone();
    }

    /**
     * Get the value of <code>timeout</code>.
     *
     * @return the <code>timeout</code> from <code>simulation-info</code>
     */
    public final Date getTimeout() {
        return new Date(timeout + getStartTime().getTime());
    }

    /**
     * Get the value of <code>deadline</code>.
     *
     * @return the <code>deadline</code> from <code>simulation-info</code>
     */
    public final Date getDeadline() {
        return new Date(deadline + getStartTime().getTime());
    }

    /**
     * Get the value of <code>run_time</code>.
     *
     * @return the <code>run_time</code> from <code>simulation-info</code>
     */
    public final Date getRunTime() {
        return new Date(runTime);
    }

    /**
     * Get the value of <code>simulation_time</code>.
     *
     * @return the <code>simulation_time</code> from <code>simulation-info</code>
     */
    public final Date getSimulationTime() {
        return new Date(simulationTime);
    }

    /**
     * Get the value of <code>eta</code>.
     *
     * @return the <code>eta</code> from <code>simulation-info</code>
     */
    public final Date getEta() {
        return new Date(eta + getStartTime().getTime());
    }

    /**
     * Get the value of <code>progress</code>.
     *
     * @return the <code>progress</code> from <code>simulation-info</code>
     */
    public final double getProgress() {
        return progress;
    }

    /**
     * Get the value of <code>news</code>.
     *
     * @return the <code>news</code> from <code>simulation-info</code>
     */
    public final String getNews() {
        return news;
    }

    /**
     * Get the value of <code>slot</code>.
     *
     * @return the <code>slot</code> from <code>simulation-info</code>
     */
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
