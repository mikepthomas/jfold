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

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Michael Thomas <michael4.thomas@live.uwe.ac.uk>
 */
public interface IBuild {
    
    /**
     * Get the value of <code>Version</code>
     *
     * @return the value of <code>Version</code> from <code>info</code>
     */
    public String getVersion();
    
    /**
     * Get the value of <code>Date</code>
     *
     * @return the value of <code>Date</code> from <code>info</code>
     */
    public Date getDate();
    
    /**
     * Get the value of <code>Time</code>
     *
     * @return the value of <code>Time</code> from <code>info</code>
     */
    public Time getTime();
    
    /**
     * Get the value of <code>SVN Rev</code>
     *
     * @return the value of <code>SVN Rev</code> from <code>info</code>
     */
    public int getSvnRev();
    
    /**
     * Get the value of <code>Branch</code>
     *
     * @return the value of <code>Branch</code> from <code>info</code>
     */
    public String getBranch();
    
    /**
     * Get the value of <code>Compiler</code>
     *
     * @return the value of <code>Compiler</code> from <code>info</code>
     */
    public String getCompiler();
    
    /**
     * Get the value of <code>Options</code>
     *
     * @return the value of <code>Options</code> from <code>info</code>
     */
    public String getOptions();
    
    /**
     * Get the value of <code>Platform</code>
     *
     * @return the value of <code>Platform</code> from <code>info</code>
     */
    public String getPlatform();
    
    /**
     * Get the value of <code>Bits</code>
     *
     * @return the value of <code>Bits</code> from <code>info</code>
     */
    public int getBits();
    
    /**
     * Get the value of <code>Mode</code>
     *
     * @return the value of <code>Mode</code> from <code>info</code>
     */
    public String getMode();
    
    /**
     * Get the value of <code>Version</code>
     *
     * @param String value of <code>Version</code> from <code>info</code>
     */
    public void setVersion(String version);
    
    /**
     * Set the value of <code>Date</code>
     *
     * @param Date value of <code>Date</code> from <code>info</code>
     */
    public void setDate(Date date);
    
    /**
     * Set the value of <code>Time</code>
     *
     * @param Time value of <code>Time</code> from <code>info</code>
     */
    public void setTime(Time time);
    
    /**
     * Set the value of <code>SVN Rev</code>
     *
     * @param int value of <code>SVN Rev</code> from <code>info</code>
     */
    public void setSvnRev(int svnRev);
    
    /**
     * Set the value of <code>Branch</code>
     *
     * @param String value of <code>Branch</code> from <code>info</code>
     */
    public void setBranch(String branch);
    
    /**
     * Set the value of <code>Compiler</code>
     *
     * @param String value of <code>Compiler</code> from <code>info</code>
     */
    public void setCompiler(String compiler);
    
    /**
     * Set the value of <code>Options</code>
     *
     * @param String value of <code>Options</code> from <code>info</code>
     */
    public void setOptions(String options);
    
    /**
     * Set the value of <code>Platform</code>
     *
     * @param String value of <code>Platform</code> from <code>info</code>
     */
    public void setPlatform(String platform);
    
    /**
     * Set the value of <code>Bits</code>
     *
     * @param int value of <code>Bits</code> from <code>info</code>
     */
    public void setBits(int bits);
    
    /**
     * Set the value of <code>Mode</code>
     *
     * @param String value of <code>Mode</code> from <code>info</code>
     */
    public void setMode(String mode);
    
    /**
     *
     * @return
     */
    @Override
    public String toString();
}
