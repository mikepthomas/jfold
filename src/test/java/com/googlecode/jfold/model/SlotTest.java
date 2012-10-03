/*
 * Copyright (C) 2012 Michael Thomas <michael4.thomas@live.uwe.ac.uk>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.googlecode.jfold.model;

import com.googlecode.jfold.interfaces.ISlotOptions;
import com.googlecode.jfold.model.examples.ExampleSlot;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Michael Thomas <michael4.thomas@live.uwe.ac.uk>
 */
public class SlotTest {
    
    private static Slot instance;
    
    public SlotTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        instance = new ExampleSlot();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getId method, of class Slot.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        String expResult = "01";
        String result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getStatus method, of class Slot.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        String expResult = "FINISHING";
        String result = instance.getStatus();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDescription method, of class Slot.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        String expResult = "smp:4";
        String result = instance.getDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOptions method, of class Slot.
     */
    @Test
    public void testGetOptions() {
        System.out.println("getOptions");
        ISlotOptions expResult = null;
        ISlotOptions result = instance.getOptions();
        assertEquals(expResult, result);
    }
}
