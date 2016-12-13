/*
 * #%L
 * This file is part of jFold.
 * %%
 * Copyright (C) 2012 - 2015 Michael Thomas (mikepthomas@outlook.com)
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

import com.wordnik.swagger.annotations.ApiModel;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * <p>SlotInfoException class.</p>
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version $Id: $Id
 */
@ApiModel(value = "Exception in slot-info request")
@XmlRootElement(name = "SlotInfoException")
public class SlotInfoException extends CommandException {

    /**
     * Constructs an instance of <code>SlotInfoException</code>.
     */
    public SlotInfoException() {
        super();
    }

    /**
     * Constructs an instance of <code>SlotInfoException</code> with the
     * specified detail message.
     *
     * @param message the detail message.
     */
    public SlotInfoException(final String message) {
        super(message);
    }

    /**
     * Constructs an instance of <code>SlotInfoException</code> with the
     * specified detail message and the cause of the Exception.
     *
     * @param message the detail message.
     * @param cause the cause of the exception.
     */
    public SlotInfoException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
