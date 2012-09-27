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
package com.googlecode.jfold.interfaces;

/**
 *
 * @author Michael Thomas <michael4.thomas@live.uwe.ac.uk>
 */
public interface ISlot {
    
    /**
     * Get the value of <code>id</code>
     *
     * @return the value of <code>id</code> from <code>slot-info</code>
     */
    public int getId();
    
    /**
     * Get the value of <code>status</code>
     *
     * @return the value of <code>status</code> from <code>slot-info</code>
     */
    public String getStatus();
    
    /**
     * Get the value of <code>description</code>
     *
     * @return the value of <code>description</code> from <code>slot-info</code>
     */
    public String getDescription();
    
    /**
     * Get the value of <code>options</code>
     *
     * @return the value of <code>options</code> from <code>slot-info</code>
     */
    public ISlotOptions getOptions();
    
    /**
     *
     * @return
     */
    @Override
    public String toString();
}
