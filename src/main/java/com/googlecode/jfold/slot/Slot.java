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
package com.googlecode.jfold.slot;

/**
 * <p>Slot interface.</p>
 *
 * @author Michael Thomas <mikepthomas@outlook.com>
 * @version $Id: $Id
 */
public interface Slot {

    /**
     * Get the value of <code>id</code>.
     *
     * @return the <code>id</code> from <code>slot-info</code>
     */
    String getId();

    /**
     * Get the value of <code>status</code>.
     *
     * @return the <code>status</code> from <code>slot-info</code>
     */
    String getStatus();

    /**
     * Get the value of <code>description</code>.
     *
     * @return the <code>description</code> from <code>slot-info</code>
     */
    String getDescription();

    /**
     * Get the value of <code>options</code>.
     *
     * @return the <code>options</code> from <code>slot-info</code>
     */
    SlotOptions getOptions();

    /** {@inheritDoc} */
    @Override
    String toString();
}
