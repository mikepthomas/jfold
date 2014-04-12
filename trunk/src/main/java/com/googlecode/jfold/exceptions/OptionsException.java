/*
 * #%L
 * This file is part of jFold.
 * %%
 * Copyright (C) 2012 - 2014 Michael Thomas (mikepthomas@outlook.com)
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

package com.googlecode.jfold.exceptions;

/**
 * <p>OptionsException class.</p>
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version $Id: $Id
 */
public class OptionsException extends Exception {

    /**
     * Creates a new instance of <code>OptionsException</code> without detail
     * message.
     */
    public OptionsException() {
    }

    /**
     * Constructs an instance of <code>OptionsException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public OptionsException(final String msg) {
        super(msg);
    }
}
