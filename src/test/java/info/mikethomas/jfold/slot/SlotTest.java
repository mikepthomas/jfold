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
import info.mikethomas.jfold.exceptions.SlotInfoException;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * <p>SlotTest class.</p>
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version 7.5.1
 */
public class SlotTest {

    /** Constant <code>instance</code> */
    private static Slot instance;

    /**
     * <p>setUpClass.</p>
     *
     * @throws java.io.IOException if any.
     * @throws info.mikethomas.jfold.exceptions.SlotInfoException if any.
     */
    @BeforeAll
    public static void setUpClass() throws IOException, SlotInfoException {
        var connection = new MockConnection();
        instance = connection.slotInfo().get(1);
    }

    /**
     * Test of getId method, of class Slot.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        var expResult = "01";
        var result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getStatus method, of class Slot.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        var expResult = "PAUSED";
        var result = instance.getStatus();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDescription method, of class Slot.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        var expResult = "cpu:2";
        var result = instance.getDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOptions method, of class Slot.
     */
    @Test
    public void testGetOptions() {
        System.out.println("getOptions");
        var expResult = true;
        var result = instance.getOptions();
        assertNotNull(result);
        assertEquals(expResult, result.getPaused());
    }
}
