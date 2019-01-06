/*
 * #%L
 * This file is part of jFold.
 * %%
 * Copyright (C) 2012 - 2019 Mike Thomas <mikepthomas@outlook.com>
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
package info.mikethomas.jfold.simulation;

import info.mikethomas.jfold.util.DateAdapter;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import lombok.Getter;
import lombok.ToString;

/**
 * <p>SimulationInfo class.</p>
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version 7.5.1
 */
@Getter
@ToString
@XmlRootElement(name = "simulation-info")
public class SimulationInfo implements Serializable {

    /**
     * User name.
     *
     * @return the <code>user</code> from <code>simulation-info</code>
     */
    @XmlElement
    private String user;

    /**
     * Team name.
     *
     * @return the <code>team</code> from <code>simulation-info</code>
     */
    @XmlElement
    private long team;

    /**
     * Project this Simulation belongs to.
     *
     * @return the <code>project</code> from <code>simulation-info</code>
     */
    @XmlElement
    private int project;

    /**
     * Run of the Project.
     *
     * @return the <code>run</code> from <code>simulation-info</code>
     */
    @XmlElement
    private int run;

    /**
     * Clone of the Project.
     *
     * @return the <code>clone</code> from <code>simulation-info</code>
     */
    @XmlElement
    private int clone;

    /**
     * Generation of the Project.
     *
     * @return the <code>gen</code> from <code>simulation-info</code>
     */
    @XmlElement
    private int gen;

    /**
     * Core type.
     *
     * @return the <code>core_type</code> from <code>simulation-info</code>
     */
    @XmlElement(name = "core_type")
    private int coreType;

    /**
     * Core identifier.
     *
     * @return the <code>core</code> from <code>simulation-info</code>
     */
    @XmlElement
    private String core;

    /**
     * Project Description.
     *
     * @deprecated
     * @return the <code>description</code> from <code>simulation-info</code>
     */
    @Deprecated
    @XmlElement
    private String description;

    /**
     * Total number of iterations in this Simulation.
     *
     * @return the <code>total_iterations</code> from <code>simulation-info</code>
     */
    @XmlElement(name = "total_iterations")
    private int totalIterations;

    /**
     * Number of iterations completed.
     *
     * @return the <code>iterations_done</code> from <code>simulation-info</code>
     */
    @XmlElement(name = "iterations_done")
    private int iterationsDone;

    /**
     * Energy.
     *
     * @return the <code>energy</code> from <code>simulation-info</code>
     */
    @XmlElement
    private int energy;

    /**
     * Temperature.
     *
     * @return the <code>temperature</code> from <code>simulation-info</code>
     */
    @XmlElement
    private int temperature;

    /**
     * Time and date this Simulation started.
     *
     * @return the <code>start_time</code> from <code>simulation-info</code>
     */
    @XmlElement(name = "start_time")
    @XmlJavaTypeAdapter(DateAdapter.class)
    private Date startTime;

    /**
     * Time and date this Simulation expires.
     *
     * @return the <code>timeout</code> from <code>simulation-info</code>
     */
    @XmlElement
    private long timeout;

    /**
     * Time and date this Simulation needs to be completed by.
     *
     * @return the <code>deadline</code> from <code>simulation-info</code>
     */
    @XmlElement
    private long deadline;

    /**
     * Time and date this Simulation has been running for.
     *
     * @deprecated
     * @return the <code>run_time</code> from <code>simulation-info</code>
     */
    @Deprecated
    @XmlElement(name = "run_time")
    private Long runTime;

    /**
     * Simulation time.
     *
     * @deprecated
     * @return the <code>simulation_time</code> from <code>simulation-info</code>
     */
    @Deprecated
    @XmlElement(name = "simulation_time")
    private Long simulationTime;

    /**
     * Estimated time of arrival.
     *
     * @return the <code>eta</code> from <code>simulation-info</code>
     */
    @XmlElement
    private long eta;

    /**
     * Progress.
     *
     * @return the <code>progress</code> from <code>simulation-info</code>
     */
    @XmlElement
    private double progress;

    /**
     * Simulation news.
     *
     * @deprecated
     * @return the <code>news</code> from <code>simulation-info</code>
     */
    @Deprecated
    @XmlElement
    private String news;

    /**
     * Slot number.
     *
     * @return the <code>slot</code> from <code>simulation-info</code>
     */
    @XmlElement
    private int slot;
}
