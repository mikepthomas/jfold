/*
 * #%L
 * This file is part of jFold.
 * %%
 * Copyright (C) 2012 - 2015 Michael Thomas (mikepthomas@outlook.com)
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

import info.mikethomas.jfold.slot.SlotOptions;
import info.mikethomas.jfold.slot.Slot;
import info.mikethomas.jfold.Connection;
import info.mikethomas.jfold.MockConnection;
import info.mikethomas.jfold.exceptions.SlotInfoException;
import java.io.IOException;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * <p>SlotTest class.</p>
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version $Id: $Id
 * @since 1.0
 */
public class SlotTest {
    
    private static Slot instance;
    
    /**
     * <p>setUpClass.</p>
     *
     * @throws java.io.IOException if any.
     * @throws info.mikethomas.jfold.exceptions.SlotInfoException if any.
     */
    @BeforeClass
    public static void setUpClass() throws IOException, SlotInfoException {
        Connection connection = new MockConnection();
        instance = connection.slotInfo().get(0);
    }
    
    /**
     * <p>tearDownClass.</p>
     */
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getId method, of class Slot.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        String expResult = "00";
        String result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getStatus method, of class Slot.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        String expResult = "RUNNING";
        String result = instance.getStatus();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDescription method, of class Slot.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        String expResult = "cpu:2";
        String result = instance.getDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOptions method, of class Slot.
     */
    @Test @Ignore
    public void testGetOptions() {
        System.out.println("getOptions");
        SlotOptions expResult = null;
        SlotOptions result = instance.getOptions();
        assertEquals(expResult, result);
    }
}
