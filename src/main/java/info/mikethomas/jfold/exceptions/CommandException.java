/*
 * #%L
 * This file is part of jFold.
 * %%
 * Copyright (C) 2012 - 2017 Mike Thomas <mikepthomas@outlook.com>
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

package info.mikethomas.jfold.exceptions;

import java.io.IOException;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * <p>CommandException class.</p>
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version $Id: $Id
 */
@XmlRootElement(name = "CommandException")
public class CommandException extends IOException {

    /**
     * Constructs an instance of <code>PauseException</code>.
     */
    public CommandException() {
        super();
    }

    /**
     * Constructs an instance of <code>CommandException</code> with the
     * specified detail message.
     *
     * @param message the detail message.
     */
    public CommandException(final String message) {
        super(message);
    }

    /**
     * Constructs an instance of <code>InfoException</code> with the
     * specified detail message and the cause of the Exception.
     *
     * @param message the detail message.
     * @param cause the cause of the exception.
     */
    public CommandException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /** {@inheritDoc} */
    @Override
    @XmlElement()
    public final String getMessage() {
        return super.getMessage();
    }

    /** {@inheritDoc} */
    @Override
    @XmlElement()
    public final StackTraceElement[] getStackTrace() {
        return super.getStackTrace();
    }
}
