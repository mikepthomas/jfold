/*
 * #%L
 * This file is part of jFold.
 * %%
 * Copyright (C) 2012 - 2019 Mike Thomas <mikepthomas@outlook.com>
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
package info.mikethomas.jfold.slot;

import info.mikethomas.jfold.MockConnection;
import info.mikethomas.jfold.exceptions.SlotOptionsException;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * <p>SlotOptionsTest class.</p>
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version 7.5.1
 */
public class SlotOptionsTest {

    /** Constant <code>instance</code> */
    private static SlotOptions instance;

    /**
     * <p>setUpClass.</p>
     *
     * @throws java.io.IOException if any.
     * @throws info.mikethomas.jfold.exceptions.SlotOptionsException if any.
     */
    @BeforeAll
    public static void setUpClass() throws IOException, SlotOptionsException {
        var connection = new MockConnection();
        instance = connection.slotOptions(0);
    }

    /**
     * Test of getClientType method, of class SlotOptions.
     */
    @Test
    public void testGetClientType() {
        System.out.println("getClientType");
        assertNull(instance.getClientType());
    }

    /**
     * Test of getClientSubtype method, of class SlotOptions.
     */
    @Test
    public void testGetClientSubtype() {
        System.out.println("getClientSubtype");
        assertNull(instance.getClientSubtype());
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
        assertNull(instance.getMaxPacketSize());
    }

    /**
     * Test of getCorePriority method, of class SlotOptions.
     */
    @Test
    public void testGetCorePriority() {
        System.out.println("getCorePriority");
        assertNull(instance.getCorePriority());
    }

    /**
     * Test of getNextUnitPercentage method, of class SlotOptions.
     */
    @Test
    public void testGetNextUnitPercentage() {
        System.out.println("getNextUnitPercentage");
        assertNull(instance.getNextUnitPercentage());
    }

    /**
     * Test of getMaxUnits method, of class SlotOptions.
     */
    @Test
    public void testGetMaxUnits() {
        System.out.println("getMaxUnits");
        assertNull(instance.getMaxUnits());
    }

    /**
     * Test of getCheckpoint method, of class SlotOptions.
     */
    @Test
    public void testGetCheckpoint() {
        System.out.println("getCheckpoint");
        assertNull(instance.getCheckpoint());
    }

    /**
     * Test of getPauseOnStart method, of class SlotOptions.
     */
    @Test
    public void testGetPauseOnStart() {
        System.out.println("getPauseOnStart");
        assertNull(instance.getPauseOnStart());
    }

    /**
     * Test of getGpuVendorId method, of class SlotOptions.
     */
    @Test
    public void testGetGpuVendorId() {
        System.out.println("getGpuVendorId");
        assertNull(instance.getGpuVendorId());
    }

    /**
     * Test of getGpuDeviceId method, of class SlotOptions.
     */
    @Test
    public void testGetGpuDeviceId() {
        System.out.println("getGpuDeviceId");
        assertNull(instance.getGpuDeviceId());
    }

    /**
     * Test of toString method, of class SlotOptions.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        var expResult = "SlotOptions("
                + "clientType=null, "
                + "clientSubtype=null, "
                + "machineId=0, "
                + "maxPacketSize=null, "
                + "corePriority=null, "
                + "nextUnitPercentage=null, "
                + "maxUnits=null, "
                + "checkpoint=null, "
                + "pauseOnStart=null, "
                + "gpuVendorId=null, "
                + "gpuDeviceId=null, "
                + "cpus=-1, "
                + "idle=null, "
                + "paused=false)";
        var result = instance.toString();
        assertEquals(expResult, result);
    }
}
