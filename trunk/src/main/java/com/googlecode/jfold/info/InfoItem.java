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
package com.googlecode.jfold.info;

/**
 * <p>InfoItem class.</p>
 *
 * @author Michael Thomas <mikepthomas@outlook.com>
 * @version $Id: $Id
 */
public enum InfoItem {
    // Client Info
    CLIENT_WEBSITE(InfoCategory.CLIENT, "Website"),
    CLIENT_COPYRIGHT(InfoCategory.CLIENT, "Copyright"),
    CLIENT_AUTHOR(InfoCategory.CLIENT, "Author"),
    CLIENT_ARGS(InfoCategory.CLIENT, "Args"),
    CLIENT_CONFIG(InfoCategory.CLIENT, "Config"),
    
    // Build Info
    BUILD_VERSION(InfoCategory.BUILD, "Build"),
    BUILD_DATE(InfoCategory.BUILD, "Date"),
    BUILD_TIME(InfoCategory.BUILD, "Time"),
    BUILD_SVN_REV(InfoCategory.BUILD, "SVN Rev"),
    BUILD_BRANCH(InfoCategory.BUILD, "Branch"),
    BUILD_COMPILER(InfoCategory.BUILD, "Compiler"),
    BUILD_OPTIONS(InfoCategory.BUILD, "Options"),
    BUILD_PLATFORM(InfoCategory.BUILD, "Platform"),
    BUILD_BITS(InfoCategory.BUILD, "Bits"),
    BUILD_MODE(InfoCategory.BUILD, "Mode"),
    
    // System Info
    SYSTEM_CPU(InfoCategory.SYSTEM, "CPU"),
    SYSTEM_CPU_ID(InfoCategory.SYSTEM, "CPU ID"),
    SYSTEM_CPUS(InfoCategory.SYSTEM, "CPUs"),
    SYSTEM_MEMORY(InfoCategory.SYSTEM, "Memory"),
    SYSTEM_FREE_MEMORY(InfoCategory.SYSTEM, "Free Memory"),
    SYSTEM_THREADS(InfoCategory.SYSTEM, "Threads"),
    SYSTEM_HAS_BATTERY(InfoCategory.SYSTEM, "Has Battery"),
    SYSTEM_ON_BATTERY(InfoCategory.SYSTEM, "On Battery"),
    SYSTEM_UTC_OFFSET(InfoCategory.SYSTEM, "UTC offset"),
    SYSTEM_PID(InfoCategory.SYSTEM, "PID"),
    SYSTEM_CWD(InfoCategory.SYSTEM, "CWD"),
    SYSTEM_OS(InfoCategory.SYSTEM, "OS"),
    SYSTEM_OS_ARCH(InfoCategory.SYSTEM, "OS Arch"),
    SYSTEM_GPUS(InfoCategory.SYSTEM, "GPUs"),
    SYSTEM_CUDA(InfoCategory.SYSTEM, "CUDA");

    private final InfoCategory category;
    private final String key;

    InfoItem(InfoCategory category, String key) {
        this.category = category;
        this.key = key;
    }

    /**
     * <p>Getter for the field <code>category</code>.</p>
     *
     * @return a {@link com.googlecode.jfold.info.InfoCategory} object.
     */
    public InfoCategory getCategory() {
        return category;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return key;
    }
}
