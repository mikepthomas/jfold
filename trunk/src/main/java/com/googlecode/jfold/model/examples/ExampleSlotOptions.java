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
package com.googlecode.jfold.model.examples;

import com.googlecode.jfold.model.SlotOptions;

/**
 *
 * @author Michael Thomas <michael4.thomas@live.uwe.ac.uk>
 */
public class ExampleSlotOptions extends SlotOptions {
    
    private static String json = "{\n" +
        "  \"client-type\": \"normal\",\n" +
        "  \"client-subtype\": \"SMP\",\n" +
        "  \"machine-id\": \"0\",\n" +
        "  \"max-packet-size\": \"normal\",\n" +
        "  \"core-priority\": \"idle\",\n" +
        "  \"next-unit-percentage\": \"99\",\n" +
        "  \"max-units\": \"0\",\n" +
        "  \"checkpoint\": \"15\",\n" +
        "  \"pause-on-start\": \"true\",\n" +
        "  \"gpu-vendor-id\": None,\n" +
        "  \"gpu-device-id\": None\n" +
        "}";
            
    public ExampleSlotOptions() {
        super(json);
    }
}
