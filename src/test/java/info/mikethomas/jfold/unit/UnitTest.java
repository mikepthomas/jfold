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
package info.mikethomas.jfold.unit;

import info.mikethomas.jfold.MockConnection;
import info.mikethomas.jfold.exceptions.QueueInfoException;
import info.mikethomas.jfold.util.DateAdapter;

import java.io.IOException;
import java.net.UnknownHostException;
import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * <p>UnitTest class.</p>
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version 7.4.4
 */
public class UnitTest {

    /** Constant <code>instance</code> */
    private static Unit instance;

    /**
     * <p>setUpClass.</p>
     *
     * @throws java.io.IOException if any.
     * @throws info.mikethomas.jfold.exceptions.QueueInfoException if any.
     */
    @BeforeAll
    public static void setUpClass() throws IOException, QueueInfoException {
        var connection = new MockConnection();
        instance = connection.queueInfo().get(0);
    }

    /**
     * Test of getId method, of class Unit.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        var expResult = "00";
        var result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getState method, of class Unit.
     */
    @Test
    public void testGetState() {
        System.out.println("getState");
        var expResult = "RUNNING";
        var result = instance.getState();
        assertEquals(expResult, result);
    }

    /**
     * Test of getProject method, of class Unit.
     */
    @Test
    public void testGetProject() {
        System.out.println("getProject");
        var expResult = 9500;
        var result = instance.getProject();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRun method, of class Unit.
     */
    @Test
    public void testGetRun() {
        System.out.println("getRun");
        var expResult = 850;
        var result = instance.getRun();
        assertEquals(expResult, result);
    }

    /**
     * Test of getClone method, of class Unit.
     */
    @Test
    public void testGetClone() {
        System.out.println("getClone");
        var expResult = 1;
        var result = instance.getClone();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGen method, of class Unit.
     */
    @Test
    public void testGetGen() {
        System.out.println("getGen");
        var expResult = 290;
        var result = instance.getGen();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCore method, of class Unit.
     */
    @Test
    public void testGetCore() {
        System.out.println("getCore");
        var expResult = "0xa4";
        var result = instance.getCore();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUnit method, of class Unit.
     */
    @Test
    public void testGetUnit() {
        System.out.println("getUnit");
        var expResult = "0x000001366652edcc53642c93bb74cd3a";
        var result = instance.getUnit();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPercentDone method, of class Unit.
     */
    @Test
    public void testGetPercentDone() {
        System.out.println("getPercentDone");
        var expResult = "17.79%";
        var result = instance.getPercentDone();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTotalFrames method, of class Unit.
     */
    @Test
    public void testGetTotalFrames() {
        System.out.println("getTotalFrames");
        var expResult = 250000;
        var result = instance.getTotalFrames();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFramesDone method, of class Unit.
     */
    @Test
    public void testGetFramesDone() {
        System.out.println("getFramesDone");
        var expResult = 42500;
        var result = instance.getFramesDone();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAssigned method, of class Unit.
     *
     * @throws java.text.ParseException if any.
     */
    @Test
    public void testGetAssigned() throws ParseException {
        System.out.println("getAssigned");
        var expResult = DateAdapter.DATE_FORMAT.parse("2014-09-08T22:06:28Z");
        var result = instance.getAssigned();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTimeout method, of class Unit.
     *
     * @throws java.text.ParseException if any.
     */
    @Test
    public void testGetTimeout() throws ParseException {
        System.out.println("getTimeout");
        var expResult = DateAdapter.DATE_FORMAT.parse("2014-09-10T13:56:52Z");
        var result = instance.getTimeout();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDeadline method, of class Unit.
     *
     * @throws java.text.ParseException if any.
     */
    @Test
    public void testGetDeadline() throws ParseException {
        System.out.println("getDeadline");
        var expResult = DateAdapter.DATE_FORMAT.parse("2014-09-12T12:30:28Z");
        var result = instance.getDeadline();
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
        var expResult = "171.67.108.60";
        var result = instance.getWs().getHostAddress();
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
        var expResult = "171.65.103.160";
        var result = instance.getCs().getHostAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of getWaitingOn method, of class Unit.
     */
    @Test
    public void testGetWaitingOn() {
        System.out.println("getWaitingOn");
        var expResult = "";
        var result = instance.getWaitingOn();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAttempts method, of class Unit.
     */
    @Test
    public void testGetAttempts() {
        System.out.println("getAttempts");
        var expResult = 0;
        var result = instance.getAttempts();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNextAttempt method, of class Unit.
     */
    @Test
    public void testGetNextAttempt() {
        System.out.println("getNextAttempt");
        var expResult = "0.00 secs";
        var result = instance.getNextAttempt();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSlot method, of class Unit.
     */
    @Test
    public void testGetSlot() {
        System.out.println("getSlot");
        var expResult = "00";
        var result = instance.getSlot();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEta method, of class Unit.
     */
    @Test
    public void testGetEta() {
        System.out.println("getEta");
        var expResult = "1 hours 49 mins";
        var result = instance.getEta();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPpd method, of class Unit.
     */
    @Test
    public void testGetPpd() {
        System.out.println("getPpd");
        var expResult = 1147.0;
        var result = instance.getPpd();
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of getTpf method, of class Unit.
     */
    @Test
    public void testGetTpf() {
        System.out.println("getTpf");
        var expResult = "1 mins 20 secs";
        var result = instance.getTpf();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBaseCredit method, of class Unit.
     */
    @Test
    public void testGetBaseCredit() {
        System.out.println("getBaseCredit");
        var expResult = 106.00;
        var result = instance.getBaseCredit();
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of getCreditEstimate method, of class Unit.
     */
    @Test
    public void testGetCreditEstimate() {
        System.out.println("getCreditEstimate");
        var expResult = 106.0;
        var result = instance.getCreditEstimate();
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of getDescription method, of class Unit.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        assertNull(instance.getDescription());
    }

    /**
     * Test of toString method, of class Unit.
     */
    @Disabled
    @Test
    public void testToString() {
        System.out.println("toString");
        var expResult = "";
        var result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
