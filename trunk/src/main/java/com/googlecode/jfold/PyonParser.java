package com.googlecode.jfold;

import java.util.logging.Level;
import java.util.logging.Logger;

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

    /** Constant <code>PYON_HEADER</code> */
    public static final String PYON_HEADER = "PyON 1 (.*)\n";
    /** Constant <code>PYON_TRAILER</code> */
    public static final String PYON_TRAILER = "\n---";

    /** Constant <code>NONE</code> */
    public static final String NONE = ": None,\n";
    /** Constant <code>NULL</code> */
    public static final String NULL = ": null,\n";

    /** Constant <code>True</code> */
    public static final String TRUE = "True";
    /** Constant <code>FALSE</code> */
    public static final String FALSE = "False";

    /**
     * <p>pyonToJson.</p>
     *
     * @param pyon a {@link java.lang.String} object.
     * @return a {@link java.lang.String} object.
     */
    public static String pyonToJson(String pyon) {
        if (pyon.startsWith("PyON 1 "))
        {
            // Replace PyON Header
            String json = pyon.replaceAll(PYON_HEADER, "");
            json = json.replaceAll(PYON_TRAILER, "");

            // None is used instead of null
            json = json.replaceAll(NONE, NULL);

            // Boolean values start with an upper case letter as in Python.
            json = json.replaceAll('"' + TRUE.toLowerCase() + '"', TRUE);
            json = json.replaceAll(TRUE, TRUE.toLowerCase());
            json = json.replaceAll('"' + FALSE.toLowerCase() + '"', FALSE);
            json = json.replaceAll(FALSE, FALSE.toLowerCase());

            String message = "Parsed JSON: " + json;
            Logger.getLogger(PyonParser.class.getName()).log(Level.INFO, message);

            return json;
        }

        String message = "Not PyON String: " + pyon;
        Logger.getLogger(PyonParser.class.getName()).log(Level.WARNING, message);
        
        return pyon;
    }
}
