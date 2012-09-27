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
    public URL getWebsite();
    
    /**
     * Get the value of <code>Copyright</code>
     *
     * @return the value of <code>Copyright</code> from <code>info</code>
     */
    public String getCopyright();
    
    /**
     * Get the value of <code>Author</code>
     *
     * @return the value of <code>Author</code> from <code>info</code>
     */
    public String getAuthor();
    
    /**
     * Get the value of <code>Args</code>
     *
     * @return the value of <code>Args</code> from <code>info</code>
     */
    public String getArgs();
    
    /**
     * Get the value of <code>Config</code>
     *
     * @return the value of <code>Config</code> from <code>info</code>
     */
    public String getConfig();
    
    /**
     * Set the value of <code>Webside</code>
     *
     * @param URL value of <code>Website</code> from <code>info</code>
     */
    public void setWebsite(URL website);
    
    /**
     * Set the value of <code>Copyright</code>
     *
     * @param String value of <code>Copyright</code> from <code>info</code>
     */
    public void setCopyright(String copyright);
    
    /**
     * Set the value of <code>Author</code>
     *
     * @param String value of <code>Author</code> from <code>info</code>
     */
    public void setAuthor(String author);
    
    /**
     * Set the value of <code>Args</code>
     *
     * @param String value of <code>Args</code> from <code>info</code>
     */
    public void setArgs(String args);
    
    /**
     * Set the value of <code>Config</code>
     *
     * @param String value of <code>Config</code> from <code>info</code>
     */
    public void setConfig(String config);
    
    /**
     *
     * @return
     */
    @Override
    public String toString();
}
