package com.googlecode.jfold.model.examples;

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

import com.googlecode.jfold.model.simulation.SimulationInfo;
import com.googlecode.jfold.model.simulation.SimulationInfoImpl;

/**
 * <p>ExampleSimulationInfo class.</p>
 *
 * @author Michael Thomas <mikepthomas@outlook.com>
 * @version $Id: $Id
 */
public class ExampleSimulationInfo extends SimulationInfoImpl implements SimulationInfo {

    /** Constant <code>JSON="{\n  \"user\": \"Anonymous\",\n  \"team"{trunked}</code> */
    public static final String JSON = "{\n"
            + "  \"user\": \"Anonymous\",\n"
            + "  \"team\": \"0\",\n"
            + "  \"project\": 7647,\n"
            + "  \"run\": 104,\n"
            + "  \"clone\": 0,\n"
            + "  \"gen\": 27,\n"
            + "  \"core_type\": 164,\n"
            + "  \"core\": \"GROGBA4\",\n"
            + "  \"description\": \"No information is currently "
            + "available for this project.   \\n\\n### _Other "
            + "details_\\n\\nThis project (p7647) is set for "
            + "2250.00 points, a preferred deadline of 10.40 days, "
            + "and a final deadline 17.30 days. This project uses "
            + "the GRO-A4 FAH core software and is hosted by "
            + "Folding@home server 171.64.65.101.  \\n\\n### "
            + "_Manager for this FAH project_\\n\\n![][3] TJ Lane has "
            + "been a grad student in the Pande lab since 2010. His "
            + "research focuses on applying Markov models to "
            + "understand the kinetics that determine how proteins "
            + "fold. He is interested in what these models, "
            + "parameterized from data from Folding@home, can tell "
            + "us about how proteins fold on timescales much faster "
            + "than what would be expected from naive physics "
            + "(Levinthal Paradox).\\n\",\n"
            + "  \"total_iterations\": 2500,\n"
            + "  \"iterations_done\": 25,\n"
            + "  \"energy\": 0,\n"
            + "  \"temperature\": 0,\n"
            + "  \"start_time\": \"2012-09-02T01:03:26Z\",\n"
            + "  \"timeout\": 1347446366,\n"
            + "  \"deadline\": 1348042526,\n"
            + "  \"run_time\": 13028,\n"
            + "  \"simulation_time\": 0,\n"
            + "  \"eta\": 278241,\n"
            + "  \"news\": \"\"\n"
            + "}";

    /**
     * <p>Constructor for ExampleSimulationInfo.</p>
     */
    public ExampleSimulationInfo() {
        super(JSON);
    }
}
