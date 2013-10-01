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

import com.googlecode.jfold.model.examples.ExampleSimulationInfo;
import java.util.Date;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author Michael Thomas <mikepthomas@outlook.com>
 */
public class SimulationInfoTest {
    
    public static SimulationInfoImpl instance;
    
    public SimulationInfoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        instance = new ExampleSimulationInfo();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getUser method, of class SimulationInfoImpl.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        String expResult = "Anonymous";
        String result = instance.getUser();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTeam method, of class SimulationInfoImpl.
     */
    @Test
    public void testGetTeam() {
        System.out.println("getTeam");
        int expResult = 0;
        int result = instance.getTeam();
        assertEquals(expResult, result);
    }

    /**
     * Test of getProject method, of class SimulationInfoImpl.
     */
    @Test
    public void testGetProject() {
        System.out.println("getProject");
        int expResult = 7647;
        int result = instance.getProject();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRun method, of class SimulationInfoImpl.
     */
    @Test
    public void testGetRun() {
        System.out.println("getRun");
        int expResult = 104;
        int result = instance.getRun();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getClone method, of class SimulationInfoImpl.
     */
    @Test
    public void testGetClone() {
        System.out.println("getClone");
        int expResult = 0;
        int result = instance.getClone();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGen method, of class SimulationInfoImpl.
     */
    @Test
    public void testGetGen() {
        System.out.println("getGen");
        int expResult = 27;
        int result = instance.getGen();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCoreType method, of class SimulationInfoImpl.
     */
    @Test
    public void testGetCoreType() {
        System.out.println("getCoreType");
        int expResult = 164;
        int result = instance.getCoreType();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCore method, of class SimulationInfoImpl.
     */
    @Test
    public void testGetCore() {
        System.out.println("getCore");
        String expResult = "GROGBA4";
        String result = instance.getCore();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDescription method, of class SimulationInfoImpl.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        String expResult = "No information is currently " +
                       "available for this project.   \n\n### _Other " +
                       "details_\n\nThis project (p7647) is set for " +
                       "2250.00 points, a preferred deadline of 10.40 days, " +
                       "and a final deadline 17.30 days. This project uses " +
                       "the GRO-A4 FAH core software and is hosted by " +
                       "Folding@home server 171.64.65.101.  \n\n### " +
                       "_Manager for this FAH project_\n\n![][3] TJ Lane has " +
                       "been a grad student in the Pande lab since 2010. His " +
                       "research focuses on applying Markov models to " +
                       "understand the kinetics that determine how proteins " +
                       "fold. He is interested in what these models, " +
                       "parameterized from data from Folding@home, can tell " +
                       "us about how proteins fold on timescales much faster " +
                       "than what would be expected from naive physics " +
                       "(Levinthal Paradox).\n";
        String result = instance.getDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTotalIterations method, of class SimulationInfoImpl.
     */
    @Test
    public void testGetTotalIterations() {
        System.out.println("getTotalIterations");
        int expResult = 2500;
        int result = instance.getTotalIterations();
        assertEquals(expResult, result);
    }

    /**
     * Test of getIterationsDone method, of class SimulationInfoImpl.
     */
    @Test
    public void testGetIterationsDone() {
        System.out.println("getIterationsDone");
        int expResult = 25;
        int result = instance.getIterationsDone();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEnergy method, of class SimulationInfoImpl.
     */
    @Test
    public void testGetEnergy() {
        System.out.println("getEnergy");
        int expResult = 0;
        int result = instance.getEnergy();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTemperature method, of class SimulationInfoImpl.
     */
    @Test
    public void testGetTemperature() {
        System.out.println("getTemperature");
        int expResult = 0;
        int result = instance.getTemperature();
        assertEquals(expResult, result);
    }

    /**
     * Test of getStartTime method, of class SimulationInfoImpl.
     */
    @Test @Ignore
    public void testGetStartTime() {
        System.out.println("getStartTime");
        Date expResult = null; // "2012-09-02T01:03:26Z"
        Date result = instance.getStartTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTimeout method, of class SimulationInfoImpl.
     */
    @Test @Ignore
    public void testGetTimeout() {
        System.out.println("getTimeout");
        Date expResult = null; // "2012-09-12T10:39:26Z"
        Date result = instance.getTimeout();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDeadline method, of class SimulationInfoImpl.
     */
    @Test @Ignore
    public void testGetDeadline() {
        System.out.println("getDeadline");
        Date expResult = null; // "2012-09-19T08:15:26Z"
        Date result = instance.getDeadline();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRunTime method, of class SimulationInfoImpl.
     */
    @Test @Ignore
    public void testGetRunTime() {
        System.out.println("getRunTime");
        String expResult = null;
        String result = instance.getRunTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSimulationTime method, of class SimulationInfoImpl.
     */
    @Test @Ignore
    public void testGetSimulationTime() {
        System.out.println("getSimulationTime");
        String expResult = null;
        String result = instance.getSimulationTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEta method, of class SimulationInfoImpl.
     */
    @Test @Ignore
    public void testGetEta() {
        System.out.println("getEta");
        Date expResult = null;
        Date result = instance.getEta();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNews method, of class SimulationInfoImpl.
     */
    @Test
    public void testGetNews() {
        System.out.println("getNews");
        String expResult = "";
        String result = instance.getNews();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class SimulationInfoImpl.
     */
    @Test @Ignore
    public void testToString() {
        System.out.println("toString");
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
