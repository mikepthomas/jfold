package com.googlecode.jfold.model.slot;

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

import com.googlecode.jfold.Connection;
import com.googlecode.jfold.MockConnection;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * <p>SlotOptionsTest class.</p>
 *
 * @author Michael Thomas <mikepthomas@outlook.com>
 * @version $Id: $Id
 * @since 1.0
 */
public class SlotOptionsTest {
    
    private static SlotOptions instance;
    
    /**
     * <p>Constructor for SlotOptionsTest.</p>
     */
    public SlotOptionsTest() {
        super();
    }
    
    /**
     * <p>setUpClass.</p>
     */
    @BeforeClass
    public static void setUpClass() {
        try {
            Connection connection = new MockConnection();
            instance = connection.slotOptions(0);
        }
        catch (IOException ex) {
            Logger.getLogger(SlotOptionsTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * <p>tearDownClass.</p>
     */
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getClientType method, of class SlotOptions.
     */
    @Test
    public void testGetClientType() {
        System.out.println("getClientType");
        String expResult = "normal";
        String result = instance.getClientType();
        assertEquals(expResult, result);
    }

    /**
     * Test of getClientSubtype method, of class SlotOptions.
     */
    @Test
    public void testGetClientSubtype() {
        System.out.println("getClientSubtype");
        String expResult = "SMP";
        String result = instance.getClientSubtype();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMachineId method, of class SlotOptions.
     */
    @Test
    public void testGetMachineId() {
        System.out.println("getMachineId");
        int expResult = 0;
        int result = instance.getMachineId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMaxPacketSize method, of class SlotOptions.
     */
    @Test
    public void testGetMaxPacketSize() {
        System.out.println("getMaxPacketSize");
        String expResult = "normal";
        String result = instance.getMaxPacketSize();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCorePriority method, of class SlotOptions.
     */
    @Test
    public void testGetCorePriority() {
        System.out.println("getCorePriority");
        String expResult = "idle";
        String result = instance.getCorePriority();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNextUnitPercentage method, of class SlotOptions.
     */
    @Test
    public void testGetNextUnitPercentage() {
        System.out.println("getNextUnitPercentage");
        int expResult = 99;
        int result = instance.getNextUnitPercentage();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMaxUnits method, of class SlotOptions.
     */
    @Test
    public void testGetMaxUnits() {
        System.out.println("getMaxUnits");
        int expResult = 0;
        int result = instance.getMaxUnits();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCheckpoint method, of class SlotOptions.
     */
    @Test
    public void testGetCheckpoint() {
        System.out.println("getCheckpoint");
        int expResult = 15;
        int result = instance.getCheckpoint();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPauseOnStart method, of class SlotOptions.
     */
    @Test
    public void testGetPauseOnStart() {
        System.out.println("getPauseOnStart");
        boolean expResult = true;
        boolean result = instance.getPauseOnStart();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGpuVendorId method, of class SlotOptions.
     */
    @Test
    public void testGetGpuVendorId() {
        System.out.println("getGpuVendorId");
        String expResult = null;
        String result = instance.getGpuVendorId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGpuDeviceId method, of class SlotOptions.
     */
    @Test
    public void testGetGpuDeviceId() {
        System.out.println("getGpuDeviceId");
        String expResult = null;
        String result = instance.getGpuDeviceId();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class SlotOptions.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "clientType = normal" +
                           "\nclientSubtype = SMP" +
                           "\nmachineId = 0" +
                           "\nmaxPacketSize = normal" +
                           "\ncorePriority = idle" +
                           "\nnextUnitPercentage = 99" +
                           "\nmaxUnits = 0" +
                           "\ncheckpoint = 15" +
                           "\npauseOnStart = true" +
                           "\ngpuVendorId = null" +
                           "\ngpuDeviceId = null";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
