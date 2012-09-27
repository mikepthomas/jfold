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
public interface ISystem {
    
    /**
     * Get the value of <code>CPU</code>
     *
     * @return the value of <code>CPU</code> from <code>info</code>
     */
    String getCpu();
    
    /**
     * Get the value of <code>CPU ID</code>
     *
     * @return the value of <code>CPU ID</code> from <code>info</code>
     */
    String getCpuId();
    
    /**
     * Get the value of <code>CPUs</code>
     *
     * @return the value of <code>CPUs</code> from <code>info</code>
     */
    int getCpus();
    
    /**
     * Get the value of <code>Memory</code>
     *
     * @return the value of <code>Memory</code> from <code>info</code>
     */
    String getMemory();
    
    /**
     * Get the value of <code>Free Memory</code>
     *
     * @return the value of <code>Free Memory</code> from <code>info</code>
     */
    String getFreeMemory();
    
    /**
     * Get the value of <code>Threads</code>
     *
     * @return the value of <code>Threads</code> from <code>info</code>
     */
    String getThreads();
    
    /**
     * Get the value of <code>On Battery</code>
     *
     * @return the value of <code>On Battery</code> from <code>info</code>
     */
    boolean getOnBattery();
    
    /**
     * Get the value of <code>UTC offset</code>
     *
     * @return the value of <code>UTC offset</code> from <code>info</code>
     */
    int getUtcOffset();
    
    /**
     * Get the value of <code>PID</code>
     *
     * @return the value of <code>PID</code> from <code>info</code>
     */
    int getPid();
    
    /**
     * Get the value of <code>CWD</code>
     *
     * @return the value of <code>CWD</code> from <code>info</code>
     */
    String getCwd();
    
    /**
     * Get the value of <code>OS</code>
     *
     * @return the value of <code>OS</code> from <code>info</code>
     */
    String getOs();
    
    /**
     * Get the value of <code>OS Arch</code>
     *
     * @return the value of <code>OS Arch</code> from <code>info</code>
     */
    String getOsArch();
    
    /**
     * Get the value of <code>GPUs</code>
     *
     * @return the value of <code>GPUs</code> from <code>info</code>
     */
    int getGpus();
    
    /**
     * Get the value of <code>GPU #</code>
     *
     * @return the value of <code>GPU #</code> from <code>info</code>
     */
    String[] getGpu(int index);
    
    /**
     * Get the value of <code>CUDA</code>
     *
     * @return the value of <code>CUDA</code> from <code>info</code>
     */
    String getCuda();
    
    /**
     * Get the value of <code>Win32 Service</code>
     *
     * @return the value of <code>Win32 Service</code> from <code>info</code>
     */
    String getWin32Service();
    
    /**
     * Set the value of <code>CPU</code>
     *
     * @param cpu String value of <code>CPU</code> from <code>info</code>
     */
    void setCpu(String cpu);
    
    /**
     * Set the value of <code>CPU ID</code>
     *
     * @param cpuId String value of <code>CPU ID</code> from <code>info</code>
     */
    void setCpuId(String cpuId);
    
    /**
     * Set the value of <code>CPUs</code>
     *
     * @param cpus int value of <code>CPUs</code> from <code>info</code>
     */
    void setCpus(int cpus);
    
    /**
     * Set the value of <code>Memory</code>
     *
     * @param memory String value of <code>Memory</code> from <code>info</code>
     */
    void setMemory(String memory);
    
    /**
     * Set the value of <code>Free Memory</code>
     *
     * @param freeMemory String value of <code>Free Memory</code> from <code>info</code>
     */
    void setFreeMemory(String freeMemory);
    
    /**
     * Set the value of <code>Threads</code>
     *
     * @param threads String value of <code>Threads</code> from <code>info</code>
     */
    void setThreads(String threads);
    
    /**
     * Set the value of <code>On Battery</code>
     *
     * @param onBattery boolean value of <code>On Battery</code> from <code>info</code>
     */
    void setOnBattery(boolean onBattery);
    
    /**
     * Set the value of <code>UTC offset</code>
     *
     * @param utcOffset int value of <code>UTC offset</code> from <code>info</code>
     */
    void setUtcOffset(int utcOffset);
    
    /**
     * Set the value of <code>PID</code>
     *
     * @param pid int value of <code>PID</code> from <code>info</code>
     */
    void setPid(int pid);
    
    /**
     * Set the value of <code>CWD</code>
     *
     * @param cwd String value of <code>CWD</code> from <code>info</code>
     */
    void setCwd(String cwd);
    
    /**
     * Set the value of <code>OS</code>
     *
     * @param os String value of <code>OS</code> from <code>info</code>
     */
    void SetOs(String os);
    
    /**
     * Set the value of <code>OS Arch</code>
     *
     * @param osArch String value of <code>OS Arch</code> from <code>info</code>
     */
    void setOsArch(String osArch);
    
    /**
     * Set the value of <code>GPUs</code>
     *
     * @param gpus int value of <code>GPUs</code> from <code>info</code>
     */
    void setGpus(int gpus);
    
    /**
     * Set the value of <code>GPU #</code>
     *
     * @param index
     * @param gpu String value of <code>GPU #</code> from <code>info</code> at index
     */
    String[] getGpu(int index, String gpu);
    
    /**
     * Set the value of <code>CUDA</code>
     *
     * @param cuda String value of <code>CUDA</code> from <code>info</code>
     */
    void setCuda(String cuda);
    
    /**
     * Set the value of <code>Win32 Service</code>
     *
     * @param win32Service String value of <code>Win32 Service</code> from <code>info</code>
     */
    void setWin32Service(String win32Service);
    
    /**
     *
     * @return String representation of this <code>ISystem</code>
     */
    @Override
    String toString();
}
