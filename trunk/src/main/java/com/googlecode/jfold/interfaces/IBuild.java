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
    String getVersion();
    
    /**
     * Get the value of <code>Date</code>
     *
     * @return the value of <code>Date</code> from <code>info</code>
     */
    Date getDate();
    
    /**
     * Get the value of <code>Time</code>
     *
     * @return the value of <code>Time</code> from <code>info</code>
     */
    Time getTime();
    
    /**
     * Get the value of <code>SVN Rev</code>
     *
     * @return the value of <code>SVN Rev</code> from <code>info</code>
     */
    int getSvnRev();
    
    /**
     * Get the value of <code>Branch</code>
     *
     * @return the value of <code>Branch</code> from <code>info</code>
     */
    String getBranch();
    
    /**
     * Get the value of <code>Compiler</code>
     *
     * @return the value of <code>Compiler</code> from <code>info</code>
     */
    String getCompiler();
    
    /**
     * Get the value of <code>Options</code>
     *
     * @return the value of <code>Options</code> from <code>info</code>
     */
    String getOptions();
    
    /**
     * Get the value of <code>Platform</code>
     *
     * @return the value of <code>Platform</code> from <code>info</code>
     */
    String getPlatform();
    
    /**
     * Get the value of <code>Bits</code>
     *
     * @return the value of <code>Bits</code> from <code>info</code>
     */
    int getBits();
    
    /**
     * Get the value of <code>Mode</code>
     *
     * @return the value of <code>Mode</code> from <code>info</code>
     */
    String getMode();
    
    /**
     * Get the value of <code>Version</code>
     *
     * @param version String value of <code>Version</code> from <code>info</code>
     */
    void setVersion(String version);
    
    /**
     * Set the value of <code>Date</code>
     *
     * @param date Date value of <code>Date</code> from <code>info</code>
     */
    void setDate(Date date);
    
    /**
     * Set the value of <code>Time</code>
     *
     * @param time Time value of <code>Time</code> from <code>info</code>
     */
    void setTime(Time time);
    
    /**
     * Set the value of <code>SVN Rev</code>
     *
     * @param svnRev int value of <code>SVN Rev</code> from <code>info</code>
     */
    void setSvnRev(int svnRev);
    
    /**
     * Set the value of <code>Branch</code>
     *
     * @param branch String value of <code>Branch</code> from <code>info</code>
     */
    void setBranch(String branch);
    
    /**
     * Set the value of <code>Compiler</code>
     *
     * @param compiler String value of <code>Compiler</code> from <code>info</code>
     */
    void setCompiler(String compiler);
    
    /**
     * Set the value of <code>Options</code>
     *
     * @param options String value of <code>Options</code> from <code>info</code>
     */
    void setOptions(String options);
    
    /**
     * Set the value of <code>Platform</code>
     *
     * @param platform String value of <code>Platform</code> from <code>info</code>
     */
    void setPlatform(String platform);
    
    /**
     * Set the value of <code>Bits</code>
     *
     * @param bits int value of <code>Bits</code> from <code>info</code>
     */
    void setBits(int bits);
    
    /**
     * Set the value of <code>Mode</code>
     *
     * @param mode String value of <code>Mode</code> from <code>info</code>
     */
    void setMode(String mode);
    
    /**
     *
     * @return String representation of this <code>IBuild</code>
     */
    @Override
    String toString();
}
