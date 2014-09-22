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
package com.googlecode.jfold.slot;

import com.googlecode.jfold.Connection;
import com.googlecode.jfold.MockConnection;
import com.googlecode.jfold.exceptions.SlotOptionsException;
import java.io.IOException;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * <p>SlotOptionsTest class.</p>
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version $Id: $Id
 * @since 1.0
 */
public class SlotOptionsTest {
    
    private static SlotOptions instance;
    
    /**
     * <p>setUpClass.</p>
     *
     * @throws java.io.IOException if any.
     * @throws com.googlecode.jfold.exceptions.SlotOptionsException if any.
     */
    @BeforeClass
    public static void setUpClass() throws IOException, SlotOptionsException {
        Connection connection = new MockConnection();
        instance = connection.slotOptions(0);
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
        String expResult = null;
        String result = instance.getClientType();
        assertEquals(expResult, result);
    }

    /**
     * Test of getClientSubtype method, of class SlotOptions.
     */
    @Test
    public void testGetClientSubtype() {
        System.out.println("getClientSubtype");
        String expResult = null;
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
        String expResult = null;
        String result = instance.getMaxPacketSize();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCorePriority method, of class SlotOptions.
     */
    @Test
    public void testGetCorePriority() {
        System.out.println("getCorePriority");
        String expResult = null;
        String result = instance.getCorePriority();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNextUnitPercentage method, of class SlotOptions.
     */
    @Test
    public void testGetNextUnitPercentage() {
        System.out.println("getNextUnitPercentage");
        int expResult = 0;
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
        int expResult = 0;
        int result = instance.getCheckpoint();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPauseOnStart method, of class SlotOptions.
     */
    @Test
    public void testGetPauseOnStart() {
        System.out.println("getPauseOnStart");
        boolean expResult = false;
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
        String expResult = "clientType = null" +
                           "\nclientSubtype = null" +
                           "\nmachineId = 0" +
                           "\nmaxPacketSize = null" +
                           "\ncorePriority = null" +
                           "\nnextUnitPercentage = 0" +
                           "\nmaxUnits = 0" +
                           "\ncheckpoint = 0" +
                           "\npauseOnStart = false" +
                           "\ngpuVendorId = null" +
                           "\ngpuDeviceId = null";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
