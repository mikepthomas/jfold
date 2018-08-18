/*
 * #%L
 * This file is part of jFold.
 * %%
 * Copyright (C) 2012 - 2018 Mike Thomas <mikepthomas@outlook.com>
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
package info.mikethomas.jfold.util;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.XSlf4j;

/**
 * <p>PyonParser class.</p>
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version 7.4.4
 */
@XSlf4j
@UtilityClass
public final class PyonParser {

    /** Constant <code>PYON_1</code>. */
    public static final String PYON_1 = "PyON 1 ";
    /** Constant <code>PYON_HEADER</code>. */
    public static final String PYON_HEADER = PYON_1 + "(.*)\n";
    /** Constant <code>PYON_TRAILER</code>. */
    public static final String PYON_TRAILER = "\n---";

    /** Constant <code>ERROR</code>. */
    public static final String ERROR = "error";
    /** Constant <code>PYON_ERROR</code>. */
    public static final String PYON_ERROR = PYON_HEADER.replace("(.*)", ERROR);

    /** Constant <code>NONE</code>. */
    public static final String NONE = "\"(.*)\": None";
    /** Constant <code>NULL</code>. */
    public static final String NULL = "\"$1\": null";

    /** Constant <code>JSON_TRUE</code>. */
    public static final String JSON_TRUE = "\"$1\": true";
    /** Constant <code>PYON_TRUE</code>. */
    public static final String PYON_TRUE = "\"(.*)\": True";
    /** Constant <code>STRING_TRUE</code>. */
    public static final String STRING_TRUE = "\"(.*)\": \"true\"";

    /** Constant <code>JSON_FALSE</code>. */
    public static final String JSON_FALSE = "\"$1\": false";
    /** Constant <code>PYON_FALSE</code>. */
    public static final String PYON_FALSE = "\"(.*)\": False";
    /** Constant <code>STRING_FALSE</code>. */
    public static final String STRING_FALSE = "\"(.*)\": \"false\"";

    /**
     * <p>Convert a PyON String to JSON.</p>
     *
     * @param pyon a {@link java.lang.String} object.
     * @return a {@link java.lang.String} object.
     */
    public String convert(final String pyon) {
        log.entry(pyon);

        // Check for valid PyON String
        if (!pyon.startsWith(PYON_1)) {
            log.warn("PyonParser cannot convert String: {}", pyon);
            return pyon;
        }

        // Get PyON Body
        var json = pyon
                .replaceAll(PYON_HEADER, "")
                .replaceAll(PYON_TRAILER, "");

        // Check for PyON Error Message
        if (pyon.contains(PYON_ERROR)) {
            json = json.replaceAll("\"", "");
        }

        // Add '\n' to make format of PyON to JSON replacements nicer
        json = json
                .replaceAll("\\[", "[\n") // New Line after Start Array
                .replaceAll("\\]", "\n]") // New Line after End Array
                .replaceAll("\\{", "{\n") // New Line after Start Object
                .replaceAll("\\}", "\n}") // New Line after End Object
                .replaceAll(", ", ",\n");

        // None is used instead of null
        json = json.replaceAll(NONE, NULL);

        // Boolean values start with an upper case letter as in Python.
        json = json
                .replaceAll(PYON_TRUE, JSON_TRUE)
                .replaceAll(STRING_TRUE, JSON_TRUE)
                .replaceAll(PYON_FALSE, JSON_FALSE)
                .replaceAll(STRING_FALSE, JSON_FALSE);

        // Format JSON
        var mapper = new ObjectMapper();
        var writer = mapper.writerWithDefaultPrettyPrinter();
        try {
            var jsonNode = mapper.readValue(json, JsonNode.class);
            json = writer.writeValueAsString(jsonNode);
        } catch (IOException ex) {
            log.error("Unable to format json string", ex);
        }

        return log.exit(json);
    }
}
