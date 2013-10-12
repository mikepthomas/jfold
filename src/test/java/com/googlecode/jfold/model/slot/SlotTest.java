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
package com.googlecode.jfold.model.slot;

import com.googlecode.jfold.Connection;
import com.googlecode.jfold.MockConnection;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * <p>SlotTest class.</p>
 *
 * @author Michael Thomas <mikepthomas@outlook.com>
 * @version $Id: $Id
 * @since 1.0
 */
public class SlotTest {
    
    private static Slot instance;
    
    /**
     * <p>Constructor for SlotTest.</p>
     */
    public SlotTest() {
        super();
    }
    
    /**
     * <p>setUpClass.</p>
     */
    @BeforeClass
    public static void setUpClass() {
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
     * Test of getId method, of class SlotImpl.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        String expResult = "01";
        String result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getStatus method, of class SlotImpl.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        String expResult = "FINISHING";
        String result = instance.getStatus();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDescription method, of class SlotImpl.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        String expResult = "smp:4";
        String result = instance.getDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOptions method, of class SlotImpl.
     */
    @Test @Ignore
    public void testGetOptions() {
        System.out.println("getOptions");
        SlotOptions expResult = null;
        SlotOptions result = instance.getOptions();
        assertEquals(expResult, result);
    }
}
