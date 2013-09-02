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
package com.googlecode.jfold.model.examples;

import com.googlecode.jfold.model.unit.Unit;
import com.googlecode.jfold.model.unit.UnitImpl;

/**
 *
 * @author Michael Thomas <michael4.thomas@live.uwe.ac.uk>
 */
public class ExampleUnit extends UnitImpl implements Unit {

    public static final String JSON = "{"
            + "  \"id\": \"01\","
            + "  \"state\": \"RUNNING\","
            + "  \"error\": \"OK\","
            + "  \"project\": 8004,"
            + "  \"run\": 144,"
            + "  \"clone\": 23,"
            + "  \"gen\": 198,"
            + "  \"core\": \"0xa4\","
            + "  \"unit\": \"0x0000010b6652edcb4ee90281779a3dbf\","
            + "  \"percentdone\": \"49.53%\","
            + "  \"totalframes\": 250,"
            + "  \"framesdone\": 122,"
            + "  \"assigned\": \"2012-09-24T12:08:34Z\","
            + "  \"timeout\": \"2012-09-26T03:22:58Z\","
            + "  \"deadline\": \"2012-09-28T01:06:10Z\","
            + "  \"ws\": \"171.67.108.59\","
            + "  \"cs\": \"171.65.103.160\","
            + "  \"waitingon\": \"\","
            + "  \"attempts\": 0,"
            + "  \"nextattempt\": \"0.00 secs\","
            + "  \"slot\": \"00\","
            + "  \"eta\": \"1 hours 28 mins\","
            + "  \"ppd\": \"3320.17\","
            + "  \"tpf\": \"1 mins 45 secs\","
            + "  \"basecredit\": \"88.59\","
            + "  \"creditestimate\": \"403.49\","
            + "  \"description\": \"The folding of B1 IgG binding domain of "
            + "peptostreptococcal protein ( commonly referred as Protein L ) "
            + "has been studied extensively using a variety of experimental "
            + "techniques. It is a small two state folder which is used as a "
            + "model system for characterizing the protein unfolded states, "
            + "folding kinetics, Coil-globule transitions during folding etc. "
            + "Recent work by a former Pande group Lab member (Vincent Voelz) "
            + "studied the unfolded state dynamics and structure of Protein L "
            + "using folding@home simulations and experiments. (Voelz et. al., "
            + "The Journal of American Chemical Society, Vol. 132, Page "
            + "4702-4709). \\n\\nIn this project, we perform "
            + "constant-temperature simulations of the alpha/beta protein L, "
            + "started from folded and unfolded states, using an explicit "
            + "solvation model to elucidate the folding mechanism of this "
            + "protein, which would help in interpreting and validating the "
            + "vast amount of experimental data related to this protein. \\n\\n"
            + "**Points and deadlines:**  \\n\\nproject\\npoints\\ndeadline\\n"
            + "timeout\\nforcefield\\ntemperature\\n\\np8001\\n89\\n4 days\\n"
            + "2 days\\nff99sbILDN\\n370K\\n\\np8004\\n89\\n4 days\\n2 days\\n"
            + "ff99sbILDN\\n370K\\n\\n### _Other details_\\n\\nThis project "
            + "(p8004) is set for 88.59 points, a preferred deadline of 1.64 "
            + "days, and a final deadline 3.54 days. This project uses the "
            + "GRO-A4 FAH core software and is hosted by Folding@home server "
            + "171.67.108.59.  \\n\\n### _Manager for this FAH project_\\n\\n"
            + "![][3] Dr. Diwakar Shukla is a postdoctoral scholar in the lab "
            + "of Vijay Pande at Stanford University. Dr. Shukla's research "
            + "focuses on using large-scale simulation methods to unravel the "
            + "mysteries of Alzheimer's Disease. We are continuing to use "
            + "Folding@home in order to learn more about Alzheimer's Disease, "
            + "in particular to discover new therapeutics, such as [this "
            + "recent work from our group][4].\\n\""
            + "}";

    public ExampleUnit() {
        super(JSON);
    }
}
