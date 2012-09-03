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
package com.googlecode.jfold.model;

import com.google.gson.annotations.SerializedName;
import com.googlecode.jfold.interfaces.ISimulationInfo;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Michael Thomas <michael4.thomas@live.uwe.ac.uk>
 */
public class SimulationInfo implements ISimulationInfo , Serializable {

    @SerializedName("user") private String user;
    @SerializedName("team") private int team;
    @SerializedName("project") private int project;
    @SerializedName("run") private int run;
    @SerializedName("clone") private int clone;
    @SerializedName("gen") private int gen;
    @SerializedName("core_type") private int coreType;
    @SerializedName("core") private String core;
    @SerializedName("description") private String description;
    @SerializedName("total_iterations") private int totalIterations;
    @SerializedName("iterations_done") private int iterationsDone;
    @SerializedName("energy") private int energy;
    @SerializedName("temperature") private int temperature;
    @SerializedName("start_time") private String startTime;
    @SerializedName("timeout") private int timeout;
    @SerializedName("deadline") private int deadline;
    @SerializedName("run_time") private int runTime;
    @SerializedName("simulation_time") private int simulationTime;
    @SerializedName("eta") private int eta;
    @SerializedName("news") private String news;
    
    private Calendar cal = Calendar.getInstance();
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

    public String getUser() {
        return user;
    }

    public int getTeam() {
        return team;
    }

    public int getProject() {
        return project;
    }

    public int getRun() {
        return run;
    }
    
    public int getClone() {
        return clone;
    }

    public int getGen() {
        return gen;
    }

    public int getCoreType() {
        return coreType;
    }

    public String getCore() {
        return core;
    }

    public String getDescription() {
        return description;
    }

    public int getTotalIterations() {
        return totalIterations;
    }

    public int getIterationsDone() {
        return iterationsDone;
    }

    public int getEnergy() {
        return energy;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getTimeout() {
        cal.clear();
        cal.add(Calendar.SECOND, timeout);
        Date date = cal.getTime();
        return sdf.format(date);
    }

    public String getDeadline() {
        cal.clear();
        cal.add(Calendar.SECOND, deadline);
        Date date = cal.getTime();
        return sdf.format(date);
    }

    public String getRunTime() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getSimulationTime() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getEta() {
        cal.setTime(new Date());
        cal.add(Calendar.SECOND, eta);
        Date date = cal.getTime();
        return sdf.format(date);
    }

    public String getNews() {
        return news;
    }
    
    @Override
    public String toString() {
        return "user = " + user +
               "\nteam = " + team +
               "\nproject = " + project +
               "\nrun = " + run +
               "\nclone = " + clone +
               "\ngen = " + gen +
               "\ncoreType = " + coreType +
               "\ncore = " + core +
               "\ndescription = " + description +
               "\ntotalIterations = " + totalIterations +
               "\niterationsDone = " + iterationsDone +
               "\nenergy = " + energy +
               "\ntemperature = " + temperature +
               "\nstartTime = " + startTime +
               "\ntimeout = " + timeout +
               "\ndeadline = " + deadline +
               "\nrunTime = " + runTime +
               "\nsimulationTime = " + simulationTime +
               "\neta = " + eta +
               "\nnews = " + news;
    }
}
