package com.googlecode.jfold;

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

/**
 * <p>PyonParser class.</p>
 *
 * @author Michael Thomas <mikepthomas@outlook.com>
 * @version $Id: $Id
 */
public class PyonParser {

    /** Constant <code>PYON_HEADER="\nPyON "</code> */
    public static final String PYON_HEADER = "\nPyON ";
    /** Constant <code>PYON_TRAILER="\n---\n"</code> */
    public static final String PYON_TRAILER = "\n---\n";

    private String pyonToJson(String pyon) {
        // None is used instead of null
        // boolean values start with an upper case letter as in Python.
        // E.g. True and False. 
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
