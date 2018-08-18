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

import info.mikethomas.jfold.MockConnection;
import info.mikethomas.jfold.exceptions.SimulationInfoException;
import info.mikethomas.jfold.util.DateAdapter;

import java.io.IOException;
import java.text.ParseException;

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
        var connection = new MockConnection();
        instance = connection.simulationInfo(0);
    }

    /**
     * Test of getUser method, of class SimulationInfo.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        var expResult = "montycrabapple";
        var result = instance.getUser();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTeam method, of class SimulationInfo.
     */
    @Test
    public void testGetTeam() {
        System.out.println("getTeam");
        var expResult = 39299;
        var result = instance.getTeam();
        assertEquals(expResult, result);
    }

    /**
     * Test of getProject method, of class SimulationInfo.
     */
    @Test
    public void testGetProject() {
        System.out.println("getProject");
        var expResult = 9500;
        var result = instance.getProject();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRun method, of class SimulationInfo.
     */
    @Test
    public void testGetRun() {
        System.out.println("getRun");
        var expResult = 850;
        var result = instance.getRun();
        assertEquals(expResult, result);
    }

    /**
     * Test of getClone method, of class SimulationInfo.
     */
    @Test
    public void testGetClone() {
        System.out.println("getClone");
        var expResult = 1;
        var result = instance.getClone();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGen method, of class SimulationInfo.
     */
    @Test
    public void testGetGen() {
        System.out.println("getGen");
        var expResult = 290;
        var result = instance.getGen();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCoreType method, of class SimulationInfo.
     */
    @Test
    public void testGetCoreType() {
        System.out.println("getCoreType");
        var expResult = 164;
        var result = instance.getCoreType();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCore method, of class SimulationInfo.
     */
    @Test
    public void testGetCore() {
        System.out.println("getCore");
        var expResult = "GRO_A4";
        var result = instance.getCore();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDescription method, of class SimulationInfo.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        assertNull(instance.getDescription());
    }

    /**
     * Test of getTotalIterations method, of class SimulationInfo.
     */
    @Test
    public void testGetTotalIterations() {
        System.out.println("getTotalIterations");
        var expResult = 250000;
        var result = instance.getTotalIterations();
        assertEquals(expResult, result);
    }

    /**
     * Test of getIterationsDone method, of class SimulationInfo.
     */
    @Test
    public void testGetIterationsDone() {
        System.out.println("getIterationsDone");
        var expResult = 40000;
        var result = instance.getIterationsDone();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEnergy method, of class SimulationInfo.
     */
    @Test
    public void testGetEnergy() {
        System.out.println("getEnergy");
        var expResult = 0;
        var result = instance.getEnergy();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTemperature method, of class SimulationInfo.
     */
    @Test
    public void testGetTemperature() {
        System.out.println("getTemperature");
        var expResult = 0;
        var result = instance.getTemperature();
        assertEquals(expResult, result);
    }

    /**
     * Test of getStartTime method, of class SimulationInfo.
     *
     * @throws java.text.ParseException if any.
     */
    @Test
    public void testGetStartTime() throws ParseException {
        System.out.println("getStartTime");
        var expResult = DateAdapter.DATE_FORMAT.parse("2014-09-08T22:06:28Z");
        var result = instance.getStartTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTimeout method, of class SimulationInfo.
     */
    @Test
    public void testGetTimeout() {
        System.out.println("getTimeout");
        var expResult = 0;
        var result = instance.getTimeout();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDeadline method, of class SimulationInfo.
     */
    @Test
    public void testGetDeadline() {
        System.out.println("getDeadline");
        var expResult = 1410525028;
        var result = instance.getDeadline();
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
        var expResult = 17892;
        var result = instance.getEta();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNews method, of class SimulationInfo.
     */
    @Test
    public void testGetNews() {
        System.out.println("getNews");
        assertNull(instance.getNews());
    }

    /**
     * Test of getSlot method, of class SimulationInfo.
     */
    @Test
    public void testGetSlot() {
        System.out.println("getSlot");
        var expResult = 0;
        var result = instance.getSlot();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class SimulationInfo.
     *
     * @throws java.text.ParseException if any.
     */
    @Test
    public void testToString() throws ParseException {
        System.out.println("toString");
        var startTime = DateAdapter.DATE_FORMAT.parse("2014-09-08T22:06:28Z");
        var expResult = "SimulationInfo("
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
                + "startTime=" + startTime + ", "
                + "timeout=0, "
                + "deadline=1410525028, "
                + "runTime=null, "
                + "simulationTime=null, "
                + "eta=17892, "
                + "progress=0.16, "
                + "news=null, "
                + "slot=0)";
        var result = instance.toString();
        assertEquals(expResult, result);
    }
}
