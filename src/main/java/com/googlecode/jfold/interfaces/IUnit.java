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

import java.net.InetAddress;
import java.util.Date;

/**
 *
 * @author Michael Thomas <michael4.thomas@live.uwe.ac.uk>
 */
public interface IUnit {
    
    /**
     * Get the value of <code>id</code>
     *
     * @return the value of <code>id</code> from <code>queue-info</code>
     */
    String getId();
    
    /**
     * Get the value of <code>state</code>
     *
     * @return the value of <code>state</code> from <code>queue-info</code>
     */
    String getState();
    
    /**
     * Get the value of <code>project</code>
     *
     * @return the value of <code>project</code> from <code>queue-info</code>
     */
    int getProject();
    
    /**
     * Get the value of <code>run</code>
     *
     * @return the value of <code>run</code> from <code>queue-info</code>
     */
    int getRun();
    
    /**
     * Get the value of <code>clone</code>
     *
     * @return the value of <code>clone</code> from <code>queue-info</code>
     */
    int getClone();
    
    /**
     * Get the value of <code>gen</code>
     *
     * @return the value of <code>gen</code> from <code>queue-info</code>
     */
    int getGen();
    
    /**
     * Get the value of <code>core</code>
     *
     * @return the value of <code>core</code> from <code>queue-info</code>
     */
    String getCore();
    
    /**
     * Get the value of <code>unit</code>
     *
     * @return the value of <code>unit</code> from <code>queue-info</code>
     */
    String getUnit();
    
    /**
     * Get the value of <code>percentdone</code>
     *
     * @return the value of <code>percentdone</code> from <code>queue-info</code>
     */
    String getPercentDone();
    
    /**
     * Get the value of <code>totalframes</code>
     *
     * @return the value of <code>totalframes</code> from <code>queue-info</code>
     */
    int getTotalFrames();
    
    /**
     * Get the value of <code>framesdone</code>
     *
     * @return the value of <code>framesdone</code> from <code>queue-info</code>
     */
    int getFramesDone();
    
    /**
     * Get the value of <code>assigned</code>
     *
     * @return the value of <code>assigned</code> from <code>queue-info</code>
     */
    Date getAssigned();
    
    /**
     * Get the value of <code>timeout</code>
     *
     * @return the value of <code>timeout</code> from <code>queue-info</code>
     */
    Date getTimeout();
    
    /**
     * Get the value of <code>deadline</code>
     *
     * @return the value of <code>deadline</code> from <code>queue-info</code>
     */
    Date getDeadline();
    
    /**
     * Get the value of <code>ws</code>
     *
     * @return the value of <code>ws</code> from <code>queue-info</code>
     */
    InetAddress getWs();
    
    /**
     * Get the value of <code>cs</code>
     *
     * @return the value of <code>cs</code> from <code>queue-info</code>
     */
    InetAddress getCs();
    
    /**
     * Get the value of <code>waitingon</code>
     *
     * @return the value of <code>waitingon</code> from <code>queue-info</code>
     */
    String getWaitingOn();
    
    /**
     * Get the value of <code>attempts</code>
     *
     * @return the value of <code>attempts</code> from <code>queue-info</code>
     */
    int getAttempts();
    
    /**
     * Get the value of <code>nextattempt</code>
     *
     * @return the value of <code>nextattempt</code> from <code>queue-info</code>
     */
    String getNextAttempt();
    
    /**
     * Get the value of <code>slot</code>
     *
     * @return the value of <code>slot</code> from <code>queue-info</code>
     */
    int getSlot();
    
    /**
     * Get the value of <code>eta</code>
     *
     * @return the value of <code>eta</code> from <code>queue-info</code>
     */
    String getEta();
    
    /**
     * Get the value of <code>ppd</code>
     *
     * @return the value of <code>ppd</code> from <code>queue-info</code>
     */
    double getPpd();
    
    /**
     * Get the value of <code>tpf</code>
     *
     * @return the value of <code>tpf</code> from <code>queue-info</code>
     */
    String getTpf();
    
    /**
     * Get the value of <code>basecredit</code>
     *
     * @return the value of <code>basecredit</code> from <code>queue-info</code>
     */
    double getBaseCredit();
    
    /**
     * Get the value of <code>creditestimate</code>
     *
     * @return the value of <code>creditestimate</code> from <code>queue-info</code>
     */
    double getCreditEstimate();
    
    /**
     * Get the value of <code>description</code>
     *
     * @return the value of <code>description</code> from <code>queue-info</code>
     */
    String getDescription();
    
    /**
     *
     * @return String representation of this <code>IUnit</code>
     */
    @Override
    String toString();
}
