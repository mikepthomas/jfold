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

import java.net.URL;

/**
 *
 * @author Michael Thomas <michael4.thomas@live.uwe.ac.uk>
 */
public interface IClient {
    
    /**
     * Get the value of <code>Webside</code>
     *
     * @return the value of <code>Website</code> from <code>info</code>
     */
    URL getWebsite();
    
    /**
     * Get the value of <code>Copyright</code>
     *
     * @return the value of <code>Copyright</code> from <code>info</code>
     */
    String getCopyright();
    
    /**
     * Get the value of <code>Author</code>
     *
     * @return the value of <code>Author</code> from <code>info</code>
     */
    String getAuthor();
    
    /**
     * Get the value of <code>Args</code>
     *
     * @return the value of <code>Args</code> from <code>info</code>
     */
    String getArgs();
    
    /**
     * Get the value of <code>Config</code>
     *
     * @return the value of <code>Config</code> from <code>info</code>
     */
    String getConfig();
    
    /**
     * Set the value of <code>Webside</code>
     *
     * @param website URL value of <code>Website</code> from <code>info</code>
     */
    void setWebsite(URL website);
    
    /**
     * Set the value of <code>Copyright</code>
     *
     * @param copyright String value of <code>Copyright</code> from <code>info</code>
     */
    void setCopyright(String copyright);
    
    /**
     * Set the value of <code>Author</code>
     *
     * @param author String value of <code>Author</code> from <code>info</code>
     */
    void setAuthor(String author);
    
    /**
     * Set the value of <code>Args</code>
     *
     * @param args String value of <code>Args</code> from <code>info</code>
     */
    void setArgs(String args);
    
    /**
     * Set the value of <code>Config</code>
     *
     * @param config String value of <code>Config</code> from <code>info</code>
     */
    void setConfig(String config);
    
    /**
     *
     * @return String representation of this <code>IClient</code>
     */
    @Override
    String toString();
}
