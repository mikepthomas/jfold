/*
 * Copyright (C) 2012 Michael Thomas <michael4.thomas@live.uwe.ac.uk>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.googlecode.jfold.model.simulation;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author Michael Thomas <michael4.thomas@live.uwe.ac.uk>
 */
public class SimulationInfoImpl implements SimulationInfo, Serializable {

    @SerializedName("user")
    private String user;
    @SerializedName("team")
    private int team;
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
    private String startTime;
    @SerializedName("timeout")
    private int timeout;
    @SerializedName("deadline")
    private int deadline;
    @SerializedName("run_time")
    private int runTime;
    @SerializedName("simulation_time")
    private int simulationTime;
    @SerializedName("eta")
    private int eta;
    @SerializedName("news")
    private String news;
    private Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

    /**
     * Default constructor.
     */
    public SimulationInfoImpl() {
    }

    public SimulationInfoImpl(String json) {
        SimulationInfoImpl jsonSimulationInfo = new Gson().fromJson(json, SimulationInfoImpl.class);

        this.user = jsonSimulationInfo.user;
        this.team = jsonSimulationInfo.team;
        this.project = jsonSimulationInfo.project;
        this.run = jsonSimulationInfo.run;
        this.clone = jsonSimulationInfo.clone;
        this.gen = jsonSimulationInfo.gen;
        this.coreType = jsonSimulationInfo.coreType;
        this.core = jsonSimulationInfo.core;
        this.description = jsonSimulationInfo.description;
        this.totalIterations = jsonSimulationInfo.totalIterations;
        this.iterationsDone = jsonSimulationInfo.iterationsDone;
        this.energy = jsonSimulationInfo.energy;
        this.temperature = jsonSimulationInfo.temperature;
        this.startTime = jsonSimulationInfo.startTime;
        this.timeout = jsonSimulationInfo.timeout;
        this.deadline = jsonSimulationInfo.deadline;
        this.runTime = jsonSimulationInfo.runTime;
        this.simulationTime = jsonSimulationInfo.simulationTime;
        this.eta = jsonSimulationInfo.eta;
        this.news = jsonSimulationInfo.news;
    }

    @Override
    public String getUser() {
        return user;
    }

    @Override
    public int getTeam() {
        return team;
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
    public int getCoreType() {
        return coreType;
    }

    @Override
    public String getCore() {
        return core;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getTotalIterations() {
        return totalIterations;
    }

    @Override
    public int getIterationsDone() {
        return iterationsDone;
    }

    @Override
    public int getEnergy() {
        return energy;
    }

    @Override
    public int getTemperature() {
        return temperature;
    }

    @Override
    public Date getStartTime() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Date getTimeout() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     *
     * @return String representation of the timeout
     */
    private String getTimeoutString() {
        cal.clear();
        cal.add(Calendar.SECOND, timeout);
        Date date = cal.getTime();
        return sdf.format(date);
    }

    @Override
    public Date getDeadline() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     *
     * @return String representation of the deadline
     */
    private String getDeadlineString() {
        cal.clear();
        cal.add(Calendar.SECOND, deadline);
        Date date = cal.getTime();
        return sdf.format(date);
    }

    @Override
    public String getRunTime() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getSimulationTime() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Date getEta() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     *
     * @return String representation of the eta
     */
    private String getEtaString() {
        cal.setTime(new Date());
        cal.add(Calendar.SECOND, eta);
        Date date = cal.getTime();
        return sdf.format(date);
    }

    @Override
    public String getNews() {
        return news;
    }

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
                + "\nnews = " + news;
    }
}
