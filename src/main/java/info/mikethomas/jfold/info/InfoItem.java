/*
 * #%L
 * This file is part of jFold.
 * %%
 * Copyright (C) 2012 - 2018 Mike Thomas <mikepthomas@outlook.com>
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
package info.mikethomas.jfold.info;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * <p>InfoItem class.</p>
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version 7.4.4
 */
@AllArgsConstructor
@Getter
public enum InfoItem {

// <editor-fold defaultstate="collapsed" desc="Client Info Items">

    /** Item <code>Website</code> in <code>Folding@home Client</code>. */
    CLIENT_WEBSITE(InfoCategory.CLIENT, "Website"),

    /** Item <code>Copyright</code> in <code>Folding@home Client</code>. */
    CLIENT_COPYRIGHT(InfoCategory.CLIENT, "Copyright"),

    /** Item <code>Author</code> in <code>Folding@home Client</code>. */
    CLIENT_AUTHOR(InfoCategory.CLIENT, "Author"),

    /** Item <code>Args</code> in <code>Folding@home Client</code>. */
    CLIENT_ARGS(InfoCategory.CLIENT, "Args"),

    /** Item <code>Config</code> in <code>Folding@home Client</code>. */
    CLIENT_CONFIG(InfoCategory.CLIENT, "Config"),

// </editor-fold>
// <editor-fold defaultstate="collapsed" desc="Build Info Items">

    /** Item <code>Build</code> in <code>Build</code>. */
    BUILD_VERSION(InfoCategory.BUILD, "Build"),

    /** Item <code>Date</code> in <code>Build</code>. */
    BUILD_DATE(InfoCategory.BUILD, "Date"),

    /** Item <code>Time</code> in <code>Build</code>. */
    BUILD_TIME(InfoCategory.BUILD, "Time"),

    /** Item <code>SVN Rev</code> in <code>Build</code>. */
    BUILD_SVN_REV(InfoCategory.BUILD, "SVN Rev"),

    /** Item <code>Branch</code> in <code>Build</code>. */
    BUILD_BRANCH(InfoCategory.BUILD, "Branch"),

    /** Item <code>Compiler</code> in <code>Build</code>. */
    BUILD_COMPILER(InfoCategory.BUILD, "Compiler"),

    /** Item <code>Options</code> in <code>Build</code>. */
    BUILD_OPTIONS(InfoCategory.BUILD, "Options"),

    /** Item <code>Platform</code> in <code>Build</code>. */
    BUILD_PLATFORM(InfoCategory.BUILD, "Platform"),

    /** Item <code>Bits</code> in <code>Build</code>. */
    BUILD_BITS(InfoCategory.BUILD, "Bits"),

    /** Item <code>Mode</code> in <code>Build</code>. */
    BUILD_MODE(InfoCategory.BUILD, "Mode"),

// </editor-fold>
// <editor-fold defaultstate="collapsed" desc="System Info Items">

    /** Item <code>CPU</code> in <code>System</code>. */
    SYSTEM_CPU(InfoCategory.SYSTEM, "CPU"),

    /** Item <code>CPU ID</code> in <code>System</code>. */
    SYSTEM_CPU_ID(InfoCategory.SYSTEM, "CPU ID"),

    /** Item <code>CPUs</code> in <code>System</code>. */
    SYSTEM_CPUS(InfoCategory.SYSTEM, "CPUs"),

    /** Item <code>Memory</code> in <code>System</code>. */
    SYSTEM_MEMORY(InfoCategory.SYSTEM, "Memory"),

    /** Item <code>Free Memory</code> in <code>System</code>. */
    SYSTEM_FREE_MEMORY(InfoCategory.SYSTEM, "Free Memory"),

    /** Item <code>Threads</code> in <code>System</code>. */
    SYSTEM_THREADS(InfoCategory.SYSTEM, "Threads"),

    /** Item <code>Has Battery</code> in <code>System</code>. */
    SYSTEM_HAS_BATTERY(InfoCategory.SYSTEM, "Has Battery"),

    /** Item <code>On Battery</code> in <code>System</code>. */
    SYSTEM_ON_BATTERY(InfoCategory.SYSTEM, "On Battery"),

    /** Item <code>UTC offset</code> in <code>System</code>. */
    SYSTEM_UTC_OFFSET(InfoCategory.SYSTEM, "UTC offset"),

    /** Item <code>PID</code> in <code>System</code>. */
    SYSTEM_PID(InfoCategory.SYSTEM, "PID"),

    /** Item <code>CWD</code> in <code>System</code>. */
    SYSTEM_CWD(InfoCategory.SYSTEM, "CWD"),

    /** Item <code>OS</code> in <code>System</code>. */
    SYSTEM_OS(InfoCategory.SYSTEM, "OS"),

    /** Item <code>OS Arch</code> in <code>System</code>. */
    SYSTEM_OS_ARCH(InfoCategory.SYSTEM, "OS Arch"),

    /** Item <code>GPUs</code> in <code>System</code>. */
    SYSTEM_GPUS(InfoCategory.SYSTEM, "GPUs"),

    /** Item <code>CUDA</code> in <code>System</code>. */
    SYSTEM_CUDA(InfoCategory.SYSTEM, "CUDA");

// </editor-fold>

    /**
     * Category type of this item.
     *
     * @return InfoCategory category.
     */
    private final InfoCategory category;

    /**
     * Key.
     *
     * @return String key.
     */
    private final String key;

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return key;
    }
}
