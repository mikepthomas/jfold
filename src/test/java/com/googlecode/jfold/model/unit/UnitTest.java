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
package com.googlecode.jfold.model.unit;

import com.googlecode.jfold.model.examples.ExampleUnit;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * <p>UnitTest class.</p>
 *
 * @author Michael Thomas <mikepthomas@outlook.com>
 * @version $Id: $Id
 * @since 1.0
 */
public class UnitTest {

    private static UnitImpl instance;

    /**
     * <p>Constructor for UnitTest.</p>
     */
    public UnitTest() {
        super();
    }

    /**
     * <p>setUpClass.</p>
     */
    @BeforeClass
    public static void setUpClass() {
        instance = new ExampleUnit();
    }

    /**
     * <p>tearDownClass.</p>
     */
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getId method, of class UnitImpl.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        String expResult = "01";
        String result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getState method, of class UnitImpl.
     */
    @Test
    public void testGetState() {
        System.out.println("getState");
        String expResult = "RUNNING";
        String result = instance.getState();
        assertEquals(expResult, result);
    }

    /**
     * Test of getProject method, of class UnitImpl.
     */
    @Test
    public void testGetProject() {
        System.out.println("getProject");
        int expResult = 8004;
        int result = instance.getProject();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRun method, of class UnitImpl.
     */
    @Test
    public void testGetRun() {
        System.out.println("getRun");
        int expResult = 144;
        int result = instance.getRun();
        assertEquals(expResult, result);
    }

    /**
     * Test of getClone method, of class UnitImpl.
     */
    @Test
    public void testGetClone() {
        System.out.println("getClone");
        int expResult = 23;
        int result = instance.getClone();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGen method, of class UnitImpl.
     */
    @Test
    public void testGetGen() {
        System.out.println("getGen");
        int expResult = 198;
        int result = instance.getGen();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCore method, of class UnitImpl.
     */
    @Test
    public void testGetCore() {
        System.out.println("getCore");
        String expResult = "0xa4";
        String result = instance.getCore();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUnit method, of class UnitImpl.
     */
    @Test
    public void testGetUnit() {
        System.out.println("getUnit");
        String expResult = "0x0000010b6652edcb4ee90281779a3dbf";
        String result = instance.getUnit();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPercentDone method, of class UnitImpl.
     */
    @Test
    public void testGetPercentDone() {
        System.out.println("getPercentDone");
        String expResult = "49.53%";
        String result = instance.getPercentDone();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTotalFrames method, of class UnitImpl.
     */
    @Test
    public void testGetTotalFrames() {
        System.out.println("getTotalFrames");
        int expResult = 250;
        int result = instance.getTotalFrames();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFramesDone method, of class UnitImpl.
     */
    @Test
    public void testGetFramesDone() {
        System.out.println("getFramesDone");
        int expResult = 122;
        int result = instance.getFramesDone();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAssigned method, of class UnitImpl.
     */
    @Test @Ignore
    public void testGetAssigned() {
        System.out.println("getAssigned");
        Date expResult = null;
        Date result = instance.getAssigned();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeout method, of class UnitImpl.
     */
    @Test @Ignore
    public void testGetTimeout() {
        System.out.println("getTimeout");
        Date expResult = null;
        Date result = instance.getTimeout();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeadline method, of class UnitImpl.
     */
    @Test @Ignore
    public void testGetDeadline() {
        System.out.println("getDeadline");
        Date expResult = null;
        Date result = instance.getDeadline();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWs method, of class UnitImpl.
     *
     * @throws java.net.UnknownHostException if any.
     */
    @Test
    public void testGetWs() throws UnknownHostException {
        System.out.println("getWs");
        Inet4Address expResult = (Inet4Address) InetAddress.getByName("171.67.108.59");
        Inet4Address result = instance.getWs();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCs method, of class UnitImpl.
     *
     * @throws java.net.UnknownHostException if any.
     */
    @Test
    public void testGetCs() throws UnknownHostException {
        System.out.println("getCs");
        Inet4Address expResult = (Inet4Address) InetAddress.getByName("171.65.103.160");
        Inet4Address result = instance.getCs();
        assertEquals(expResult, result);
    }

    /**
     * Test of getWaitingOn method, of class UnitImpl.
     */
    @Test
    public void testGetWaitingOn() {
        System.out.println("getWaitingOn");
        String expResult = "";
        String result = instance.getWaitingOn();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAttempts method, of class UnitImpl.
     */
    @Test
    public void testGetAttempts() {
        System.out.println("getAttempts");
        int expResult = 0;
        int result = instance.getAttempts();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNextAttempt method, of class UnitImpl.
     */
    @Test
    public void testGetNextAttempt() {
        System.out.println("getNextAttempt");
        String expResult = "0.00 secs";
        String result = instance.getNextAttempt();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSlot method, of class UnitImpl.
     */
    @Test
    public void testGetSlot() {
        System.out.println("getSlot");
        int expResult = 0;
        int result = instance.getSlot();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEta method, of class UnitImpl.
     */
    @Test
    public void testGetEta() {
        System.out.println("getEta");
        String expResult = "1 hours 28 mins";
        String result = instance.getEta();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPpd method, of class UnitImpl.
     */
    @Test
    public void testGetPpd() {
        System.out.println("getPpd");
        double expResult = 3320.17;
        double result = instance.getPpd();
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of getTpf method, of class UnitImpl.
     */
    @Test
    public void testGetTpf() {
        System.out.println("getTpf");
        String expResult = "1 mins 45 secs";
        String result = instance.getTpf();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBaseCredit method, of class UnitImpl.
     */
    @Test
    public void testGetBaseCredit() {
        System.out.println("getBaseCredit");
        double expResult = 88.59;
        double result = instance.getBaseCredit();
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of getCreditEstimate method, of class UnitImpl.
     */
    @Test
    public void testGetCreditEstimate() {
        System.out.println("getCreditEstimate");
        double expResult = 403.49;
        double result = instance.getCreditEstimate();
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of getDescription method, of class UnitImpl.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        String expResult = "The folding of B1 IgG binding domain of "
            + "peptostreptococcal protein ( commonly referred as Protein L ) "
            + "has been studied extensively using a variety of experimental "
            + "techniques. It is a small two state folder which is used as a "
            + "model system for characterizing the protein unfolded states, "
            + "folding kinetics, Coil-globule transitions during folding etc. "
            + "Recent work by a former Pande group Lab member (Vincent Voelz) "
            + "studied the unfolded state dynamics and structure of Protein L "
            + "using folding@home simulations and experiments. (Voelz et. al., "
            + "The Journal of American Chemical Society, Vol. 132, Page "
            + "4702-4709). \n\nIn this project, we perform "
            + "constant-temperature simulations of the alpha/beta protein L, "
            + "started from folded and unfolded states, using an explicit "
            + "solvation model to elucidate the folding mechanism of this "
            + "protein, which would help in interpreting and validating the "
            + "vast amount of experimental data related to this protein. \n\n"
            + "**Points and deadlines:**  \n\nproject\npoints\ndeadline\n"
            + "timeout\nforcefield\ntemperature\n\np8001\n89\n4 days\n"
            + "2 days\nff99sbILDN\n370K\n\np8004\n89\n4 days\n2 days\n"
            + "ff99sbILDN\n370K\n\n### _Other details_\n\nThis project "
            + "(p8004) is set for 88.59 points, a preferred deadline of 1.64 "
            + "days, and a final deadline 3.54 days. This project uses the "
            + "GRO-A4 FAH core software and is hosted by Folding@home server "
            + "171.67.108.59.  \n\n### _Manager for this FAH project_\n\n"
            + "![][3] Dr. Diwakar Shukla is a postdoctoral scholar in the lab "
            + "of Vijay Pande at Stanford University. Dr. Shukla's research "
            + "focuses on using large-scale simulation methods to unravel the "
            + "mysteries of Alzheimer's Disease. We are continuing to use "
            + "Folding@home in order to learn more about Alzheimer's Disease, "
            + "in particular to discover new therapeutics, such as [this "
            + "recent work from our group][4].\n";
        String result = instance.getDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class UnitImpl.
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
