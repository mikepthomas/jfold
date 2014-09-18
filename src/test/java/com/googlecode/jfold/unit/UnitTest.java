/*
 * #%L
 * This file is part of jFold.
 * %%
 * Copyright (C) 2012 - 2014 Michael Thomas (mikepthomas@outlook.com)
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
package com.googlecode.jfold.unit;

import com.googlecode.jfold.Connection;
import com.googlecode.jfold.MockConnection;
import com.googlecode.jfold.exceptions.QueueInfoException;
import java.io.IOException;
import java.net.UnknownHostException;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * <p>UnitTest class.</p>
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version $Id: $Id
 * @since 1.0
 */
public class UnitTest {

    private static Unit instance;

    /**
     * <p>setUpClass.</p>
     *
     * @throws java.io.IOException
     * @throws com.googlecode.jfold.exceptions.QueueInfoException
     */
    @BeforeClass
    public static void setUpClass() throws IOException, QueueInfoException {
        Connection connection = new MockConnection();
        instance = connection.queueInfo().get(0);
    }

    /**
     * <p>tearDownClass.</p>
     */
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getId method, of class Unit.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        String expResult = "00";
        String result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getState method, of class Unit.
     */
    @Test
    public void testGetState() {
        System.out.println("getState");
        String expResult = "RUNNING";
        String result = instance.getState();
        assertEquals(expResult, result);
    }

    /**
     * Test of getProject method, of class Unit.
     */
    @Test
    public void testGetProject() {
        System.out.println("getProject");
        int expResult = 9500;
        int result = instance.getProject();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRun method, of class Unit.
     */
    @Test
    public void testGetRun() {
        System.out.println("getRun");
        int expResult = 850;
        int result = instance.getRun();
        assertEquals(expResult, result);
    }

    /**
     * Test of getClone method, of class Unit.
     */
    @Test
    public void testGetClone() {
        System.out.println("getClone");
        int expResult = 1;
        int result = instance.getClone();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGen method, of class Unit.
     */
    @Test
    public void testGetGen() {
        System.out.println("getGen");
        int expResult = 290;
        int result = instance.getGen();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCore method, of class Unit.
     */
    @Test
    public void testGetCore() {
        System.out.println("getCore");
        String expResult = "0xa4";
        String result = instance.getCore();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUnit method, of class Unit.
     */
    @Test
    public void testGetUnit() {
        System.out.println("getUnit");
        String expResult = "0x000001366652edcc53642c93bb74cd3a";
        String result = instance.getUnit();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPercentDone method, of class Unit.
     */
    @Test
    public void testGetPercentDone() {
        System.out.println("getPercentDone");
        String expResult = "17.79%";
        String result = instance.getPercentDone();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTotalFrames method, of class Unit.
     */
    @Test
    public void testGetTotalFrames() {
        System.out.println("getTotalFrames");
        int expResult = 250000;
        int result = instance.getTotalFrames();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFramesDone method, of class Unit.
     */
    @Test
    public void testGetFramesDone() {
        System.out.println("getFramesDone");
        int expResult = 42500;
        int result = instance.getFramesDone();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAssigned method, of class Unit.
     */
    @Test
    public void testGetAssigned() {
        System.out.println("getAssigned");
        String expResult = "2014-09-08T22:06:28Z";
        String result = instance.getAssigned();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTimeout method, of class Unit.
     */
    @Test
    public void testGetTimeout() {
        System.out.println("getTimeout");
        String expResult = "2014-09-10T13:56:52Z";
        String result = instance.getTimeout();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDeadline method, of class Unit.
     */
    @Test
    public void testGetDeadline() {
        System.out.println("getDeadline");
        String expResult = "2014-09-12T12:30:28Z";
        String result = instance.getDeadline();
        assertEquals(expResult, result);
    }

    /**
     * Test of getWs method, of class Unit.
     *
     * @throws java.net.UnknownHostException if any.
     */
    @Test
    public void testGetWs() throws UnknownHostException {
        System.out.println("getWs");
        String expResult = "171.67.108.60";
        String result = instance.getWs();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCs method, of class Unit.
     *
     * @throws java.net.UnknownHostException if any.
     */
    @Test
    public void testGetCs() throws UnknownHostException {
        System.out.println("getCs");
        String expResult = "171.65.103.160";
        String result = instance.getCs();
        assertEquals(expResult, result);
    }

    /**
     * Test of getWaitingOn method, of class Unit.
     */
    @Test
    public void testGetWaitingOn() {
        System.out.println("getWaitingOn");
        String expResult = "";
        String result = instance.getWaitingOn();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAttempts method, of class Unit.
     */
    @Test
    public void testGetAttempts() {
        System.out.println("getAttempts");
        int expResult = 0;
        int result = instance.getAttempts();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNextAttempt method, of class Unit.
     */
    @Test
    public void testGetNextAttempt() {
        System.out.println("getNextAttempt");
        String expResult = "0.00 secs";
        String result = instance.getNextAttempt();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSlot method, of class Unit.
     */
    @Test
    public void testGetSlot() {
        System.out.println("getSlot");
        int expResult = 0;
        int result = instance.getSlot();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEta method, of class Unit.
     */
    @Test
    public void testGetEta() {
        System.out.println("getEta");
        String expResult = "1 hours 49 mins";
        String result = instance.getEta();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPpd method, of class Unit.
     */
    @Test
    public void testGetPpd() {
        System.out.println("getPpd");
        double expResult = 1147.0;
        double result = instance.getPpd();
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of getTpf method, of class Unit.
     */
    @Test
    public void testGetTpf() {
        System.out.println("getTpf");
        String expResult = "1 mins 20 secs";
        String result = instance.getTpf();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBaseCredit method, of class Unit.
     */
    @Test
    public void testGetBaseCredit() {
        System.out.println("getBaseCredit");
        double expResult = 106.00;
        double result = instance.getBaseCredit();
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of getCreditEstimate method, of class Unit.
     */
    @Test
    public void testGetCreditEstimate() {
        System.out.println("getCreditEstimate");
        double expResult = 106.0;
        double result = instance.getCreditEstimate();
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of getDescription method, of class Unit.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        String expResult = null;
        String result = instance.getDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Unit.
     */
    @Test @Ignore
    public void testToString() {
        System.out.println("toString");
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
