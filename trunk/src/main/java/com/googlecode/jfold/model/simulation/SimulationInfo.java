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

import java.util.Date;

/**
 * <p>SimulationInfo interface.</p>
 *
 * @author Michael Thomas <mikepthomas@outlook.com>
 * @version $Id: $Id
 */
public interface SimulationInfo {

    /**
     * Get the value of <code>user</code>.
     *
     * @return the <code>user</code> from <code>simulation-info</code>
     */
    String getUser();

    /**
     * Get the value of <code>team</code>.
     *
     * @return the <code>team</code> from <code>simulation-info</code>
     */
    long getTeam();

    /**
     * Get the value of <code>project</code>.
     *
     * @return the <code>project</code> from <code>simulation-info</code>
     */
    int getProject();

    /**
     * Get the value of <code>run</code>.
     *
     * @return the <code>run</code> from <code>simulation-info</code>
     */
    int getRun();

    /**
     * Get the value of <code>clone</code>.
     *
     * @return the <code>clone</code> from <code>simulation-info</code>
     */
    int getClone();

    /**
     * Get the value of <code>gen</code>.
     *
     * @return the <code>gen</code> from <code>simulation-info</code>
     */
    int getGen();

    /**
     * Get the value of <code>core_type</code>.
     *
     * @return the <code>core_type</code> from <code>simulation-info</code>
     */
    int getCoreType();

    /**
     * Get the value of <code>core</code>.
     *
     * @return the <code>core</code> from <code>simulation-info</code>
     */
    String getCore();

    /**
     * Get the value of <code>description</code>.
     *
     * @deprecated
     * @return the <code>description</code> from <code>simulation-info</code>
     */
    String getDescription();

    /**
     * Get the value of <code>total_iterations</code>.
     *
     * @return the <code>total_iterations</code> from <code>simulation-info</code>
     */
    int getTotalIterations();

    /**
     * Get the value of <code>iterations_done</code>.
     *
     * @return the <code>iterations_done</code> from <code>simulation-info</code>
     */
    int getIterationsDone();

    /**
     * Get the value of <code>energy</code>.
     *
     * @return the <code>energy</code> from <code>simulation-info</code>
     */
    int getEnergy();

    /**
     * Get the value of <code>temperature</code>.
     *
     * @return the <code>temperature</code> from <code>simulation-info</code>
     */
    int getTemperature();

    /**
     * Get the value of <code>start_time</code>.
     *
     * @return the <code>start_time</code> from <code>simulation-info</code>
     */
    Date getStartTime();

    /**
     * Get the value of <code>timeout</code>.
     *
     * @return the <code>timeout</code> from <code>simulation-info</code>
     */
    Date getTimeout();

    /**
     * Get the value of <code>deadline</code>.
     *
     * @return the <code>deadline</code> from <code>simulation-info</code>
     */
    Date getDeadline();

    /**
     * Get the value of <code>run_time</code>.
     *
     * @deprecated
     * @return the <code>run_time</code> from <code>simulation-info</code>
     */
    Date getRunTime();

    /**
     * Get the value of <code>simulation_time</code>.
     *
     * @deprecated
     * @return the <code>simulation_time</code> from <code>simulation-info</code>
     */
    Date getSimulationTime();

    /**
     * Get the value of <code>eta</code>.
     *
     * @return the <code>eta</code> from <code>simulation-info</code>
     */
    Date getEta();

    /**
     * Get the value of <code>news</code>.
     *
     * @return the <code>news</code> from <code>simulation-info</code>
     */
    String getNews();

    /**
     * Get the value of <code>slot</code>.
     *
     * @return the <code>slot</code> from <code>simulation-info</code>
     */
    int getSlot();

    /** {@inheritDoc} */
    @Override
    String toString();
}
