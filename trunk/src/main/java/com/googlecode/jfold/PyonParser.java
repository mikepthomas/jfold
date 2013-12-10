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
package com.googlecode.jfold;

import com.googlecode.jfold.exceptions.PyonParserException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <p>PyonParser class.</p>
 *
 * @author Michael Thomas <mikepthomas@outlook.com>
 * @version $Id: $Id
 */
public class PyonParser {

    /** Constant <code>PYON_1</code>. */
    public static final String PYON_1 = "PyON 1 ";
    /** Constant <code>PYON_HEADER</code>. */
    public static final String PYON_HEADER = PYON_1 + "(.*)\n";
    /** Constant <code>PYON_TRAILER</code>. */
    public static final String PYON_TRAILER = "\n---";
    
    /** Constant <code>PYON_ERROR</code>. */
    public static final String PYON_ERROR = PYON_HEADER.replace("(.*)", "error");

    /** Constant <code>NONE</code>. */
    public static final String NONE = "\"(.*)\": None,\n";
    /** Constant <code>NULL</code>. */
    public static final String NULL = "\"$1\": null,\n";

    /** Constant <code>JSON_TRUE</code>. */
    public static final String JSON_TRUE = "\"$1\": true,\n";
    /** Constant <code>PYON_TRUE</code>. */
    public static final String PYON_TRUE = "\"(.*)\": True,\n";
    /** Constant <code>STRING_TRUE</code>. */
    public static final String STRING_TRUE = "\"(.*)\": \"true\",\n";

    /** Constant <code>JSON_FALSE</code>. */
    public static final String JSON_FALSE = "\"$1\": false,\n";
    /** Constant <code>PYON_FALSE</code>. */
    public static final String PYON_FALSE = "\"(.*)\": False,\n";
    /** Constant <code>STRING_FALSE</code>. */
    public static final String STRING_FALSE = "\"(.*)\": \"false\",\n";

    /**
     * <p>Convert a PyON String to JSON.</p>
     *
     * @param pyon a {@link java.lang.String} object.
     * @return a {@link java.lang.String} object.
     * @throws com.googlecode.jfold.exceptions.PyonParserException if any.
     */
    public static String convert(final String pyon) throws PyonParserException {
        // Check for valid PyON String
        if (!pyon.startsWith(PYON_1)) {
            String msg = "PyonParser cannot convert String: " + pyon;
            Logger.getLogger(PyonParser.class.getName()).log(Level.WARNING, msg);

            return pyon;
        }
        
        // Get PyON Body
        String json = pyon.replaceAll(PYON_HEADER, "");
        json = json.replaceAll(PYON_TRAILER, "");
        
        // Check for PyON Error Message
        if (pyon.contains(PYON_ERROR))
            throw new PyonParserException(json);

        // None is used instead of null
        json = json.replaceAll(NONE, NULL);

        // Boolean values start with an upper case letter as in Python.
        json = json.replaceAll(PYON_TRUE, JSON_TRUE);
        json = json.replaceAll(STRING_TRUE, JSON_TRUE);
        json = json.replaceAll(PYON_FALSE, JSON_FALSE);
        json = json.replaceAll(STRING_FALSE, JSON_FALSE);

        String msg = "Parsed JSON: " + json;
        Logger.getLogger(PyonParser.class.getName()).log(Level.INFO, msg);

        return json;
    }
}
