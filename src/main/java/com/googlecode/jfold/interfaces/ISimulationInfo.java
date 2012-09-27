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
package com.googlecode.jfold.interfaces;

import java.util.Date;

/**
 *
 * @author Michael Thomas <michael4.thomas@live.uwe.ac.uk>
 */
public interface ISimulationInfo {

    /**
     * Get the value of
     * <code>user</code>
     *
     * @return the value of <code>user</code> from <code>simulation-info</code>
     */
    public String getUser();

    /**
     * Get the value of
     * <code>team</code>
     *
     * @return the value of <code>team</code> from <code>simulation-info</code>
     */
    public int getTeam();

    /**
     * Get the value of
     * <code>project</code>
     *
     * @return the value of <code>project</code>
     * from <code>simulation-info</code>
     */
    public int getProject();

    /**
     * Get the value of
     * <code>run</code>
     *
     * @return the value of <code>run</code> from <code>simulation-info</code>
     */
    public int getRun();

    /**
     * Get the value of
     * <code>clone</code>
     *
     * @return the value of <code>clone</code> from <code>simulation-info</code>
     */
    public int getClone();
    
    /**
     * Get the value of
     * <code>gen</code>
     *
     * @return the value of <code>gen</code> from <code>simulation-info</code>
     */
    public int getGen();

    /**
     * Get the value of
     * <code>core_type</code>
     *
     * @return the value of <code>core_type</code>
     * from <code>simulation-info</code>
     */
    public int getCoreType();

    /**
     * Get the value of
     * <code>core</code>
     *
     * @return the value of <code>core</code> from <code>simulation-info</code>
     */
    public String getCore();

    /**
     * Get the value of
     * <code>description</code>
     *
     * @return the value of <code>description</code>
     * from <code>simulation-info</code>
     */
    public String getDescription();

    /**
     * Get the value of
     * <code>total_iterations</code>
     *
     * @return the value of <code>total_iterations</code>
     * from <code>simulation-info</code>
     */
    public int getTotalIterations();

    /**
     * Get the value of
     * <code>iterations_done</code>
     *
     * @return the value of <code>iterations_done</code>
     * from <code>simulation-info</code>
     */
    public int getIterationsDone();

    /**
     * Get the value of
     * <code>energy</code>
     *
     * @return the value of <code>energy</code>
     * from <code>simulation-info</code>
     */
    public int getEnergy();

    /**
     * Get the value of
     * <code>temperature</code>
     *
     * @return the value of <code>temperature</code>
     * from <code>simulation-info</code>
     */
    public int getTemperature();

    /**
     * Get the value of
     * <code>start_time</code>
     *
     * @return the value of <code>start_time</code>
     * from <code>simulation-info</code>
     */
    public Date getStartTime();

    /**
     * Get the value of
     * <code>timeout</code>
     *
     * @return the value of <code>timeout</code>
     * from <code>simulation-info</code>
     */
    public Date getTimeout();

    /**
     * Get the value of
     * <code>deadline</code>
     *
     * @return the value of <code>deadline</code>
     * from <code>simulation-info</code>
     */
    public Date getDeadline();

    /**
     * Get the value of
     * <code>run_time</code>
     *
     * @deprecated 
     * @return the value of <code>run_time</code>
     * from <code>simulation-info</code>
     */
    public String getRunTime();

    /**
     * Get the value of
     * <code>simulation_time</code>
     *
     * @deprecated 
     * @return the value of <code>simulation_time</code>
     * from <code>simulation-info</code>
     */
    public String getSimulationTime();

    /**
     * Get the value of
     * <code>eta</code>
     *
     * @return the value of <code>eta</code>
     * from <code>simulation-info</code>
     */
    public Date getEta();

    /**
     * Get the value of
     * <code>news</code>
     *
     * @return the value of <code>news</code> from <code>simulation-info</code>
     */
    public String getNews();
    
    /**
     *
     * @return
     */
    @Override
    public String toString();
}
