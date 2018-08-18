/*
 * #%L
 * This file is part of jFold.
 * %%
 * Copyright (C) 2012 - 2018 Mike Thomas <mikepthomas@outlook.com>
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

import info.mikethomas.jfold.Connection;
import info.mikethomas.jfold.MockConnection;
import info.mikethomas.jfold.exceptions.SimulationInfoException;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * <p>SimulationInfoTest class.</p>
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version 7.4.4
 */
public class SimulationInfoTest {

    /** Constant <code>instance</code> */
    public static SimulationInfo instance;

    /**
     * <p>setUpClass.</p>
     *
     * @throws java.io.IOException if any.
     * @throws info.mikethomas.jfold.exceptions.SimulationInfoException if any.
     */
    @BeforeAll
    public static void setUpClass() throws IOException, SimulationInfoException {
        Connection connection = new MockConnection();
        instance = connection.simulationInfo(0);
    }

    /**
     * Test of getUser method, of class SimulationInfo.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        String expResult = "montycrabapple";
        String result = instance.getUser();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTeam method, of class SimulationInfo.
     */
    @Test
    public void testGetTeam() {
        System.out.println("getTeam");
        long expResult = 39299;
        long result = instance.getTeam();
        assertEquals(expResult, result);
    }

    /**
     * Test of getProject method, of class SimulationInfo.
     */
    @Test
    public void testGetProject() {
        System.out.println("getProject");
        int expResult = 9500;
        int result = instance.getProject();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRun method, of class SimulationInfo.
     */
    @Test
    public void testGetRun() {
        System.out.println("getRun");
        int expResult = 850;
        int result = instance.getRun();
        assertEquals(expResult, result);
    }

    /**
     * Test of getClone method, of class SimulationInfo.
     */
    @Test
    public void testGetClone() {
        System.out.println("getClone");
        int expResult = 1;
        int result = instance.getClone();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGen method, of class SimulationInfo.
     */
    @Test
    public void testGetGen() {
        System.out.println("getGen");
        int expResult = 290;
        int result = instance.getGen();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCoreType method, of class SimulationInfo.
     */
    @Test
    public void testGetCoreType() {
        System.out.println("getCoreType");
        int expResult = 164;
        int result = instance.getCoreType();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCore method, of class SimulationInfo.
     */
    @Test
    public void testGetCore() {
        System.out.println("getCore");
        String expResult = "GRO_A4";
        String result = instance.getCore();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDescription method, of class SimulationInfo.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        String expResult = null;
        String result = instance.getDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTotalIterations method, of class SimulationInfo.
     */
    @Test
    public void testGetTotalIterations() {
        System.out.println("getTotalIterations");
        int expResult = 250000;
        int result = instance.getTotalIterations();
        assertEquals(expResult, result);
    }

    /**
     * Test of getIterationsDone method, of class SimulationInfo.
     */
    @Test
    public void testGetIterationsDone() {
        System.out.println("getIterationsDone");
        int expResult = 40000;
        int result = instance.getIterationsDone();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEnergy method, of class SimulationInfo.
     */
    @Test
    public void testGetEnergy() {
        System.out.println("getEnergy");
        int expResult = 0;
        int result = instance.getEnergy();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTemperature method, of class SimulationInfo.
     */
    @Test
    public void testGetTemperature() {
        System.out.println("getTemperature");
        int expResult = 0;
        int result = instance.getTemperature();
        assertEquals(expResult, result);
    }

    /**
     * Test of getStartTime method, of class SimulationInfo.
     */
    @Test
    public void testGetStartTime() {
        System.out.println("getStartTime");
        String expResult = "Mon Sep 08 22:06:28 BST 2014";
        String result = instance.getStartTime().toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTimeout method, of class SimulationInfo.
     */
    @Test
    public void testGetTimeout() {
        System.out.println("getTimeout");
        long expResult = 0;
        long result = instance.getTimeout();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDeadline method, of class SimulationInfo.
     */
    @Test
    public void testGetDeadline() {
        System.out.println("getDeadline");
        long expResult = 1410525028;
        long result = instance.getDeadline();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRunTime method, of class SimulationInfo.
     */
    @Test
    public void testGetRunTime() {
        System.out.println("getRunTime");
        assertNull(instance.getRunTime());
    }

    /**
     * Test of getSimulationTime method, of class SimulationInfo.
     */
    @Test
    public void testGetSimulationTime() {
        System.out.println("getSimulationTime");
        assertNull(instance.getSimulationTime());
    }

    /**
     * Test of getEta method, of class SimulationInfo.
     */
    @Test
    public void testGetEta() {
        System.out.println("getEta");
        long expResult = 17892;
        long result = instance.getEta();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNews method, of class SimulationInfo.
     */
    @Test
    public void testGetNews() {
        System.out.println("getNews");
        String expResult = null;
        String result = instance.getNews();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSlot method, of class SimulationInfo.
     */
    @Test
    public void testGetSlot() {
        System.out.println("getSlot");
        int expResult = 0;
        int result = instance.getSlot();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class SimulationInfo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "SimulationInfo("
                + "user=montycrabapple, "
                + "team=39299, "
                + "project=9500, "
                + "run=850, "
                + "clone=1, "
                + "gen=290, "
                + "coreType=164, "
                + "core=GRO_A4, "
                + "description=null, "
                + "totalIterations=250000, "
                + "iterationsDone=40000, "
                + "energy=0, "
                + "temperature=0, "
                + "startTime=Mon Sep 08 22:06:28 BST 2014, "
                + "timeout=0, "
                + "deadline=1410525028, "
                + "runTime=null, "
                + "simulationTime=null, "
                + "eta=17892, "
                + "progress=0.16, "
                + "news=null, "
                + "slot=0)";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
