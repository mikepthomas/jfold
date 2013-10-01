package com.googlecode.jfold.model.examples;

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

import com.googlecode.jfold.model.slot.SlotOptions;
import com.googlecode.jfold.model.slot.SlotOptionsImpl;

/**
 * <p>ExampleSlotOptions class.</p>
 *
 * @author Michael Thomas <mikepthomas@outlook.com>
 * @version $Id: $Id
 */
public class ExampleSlotOptions extends SlotOptionsImpl implements SlotOptions {

    /** Constant <code>JSON="{\n  \"client-type\": \"normal\",\n  \""{trunked}</code> */
    public static final String JSON = "{\n"
            + "  \"client-type\": \"normal\",\n"
            + "  \"client-subtype\": \"SMP\",\n"
            + "  \"machine-id\": \"0\",\n"
            + "  \"max-packet-size\": \"normal\",\n"
            + "  \"core-priority\": \"idle\",\n"
            + "  \"next-unit-percentage\": \"99\",\n"
            + "  \"max-units\": \"0\",\n"
            + "  \"checkpoint\": \"15\",\n"
            + "  \"pause-on-start\": \"true\",\n"
            + "  \"gpu-vendor-id\": None,\n"
            + "  \"gpu-device-id\": None\n"
            + "}";

    /**
     * <p>Constructor for ExampleSlotOptions.</p>
     */
    public ExampleSlotOptions() {
        super(JSON);
    }
}
