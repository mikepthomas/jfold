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
 * <p>ClientInfo class.</p>
 *
 * @author Michael Thomas <mikepthomas@outlook.com>
 * @version $Id: $Id
 */
public enum ClientInfo {
    WEBSITE("Website"),
    COPYRIGHT("Copyright"),
    AUTHOR("Author"),
    ARGS("Args"),
    CONFIG("Config");

    private final String key;

    ClientInfo(String key) {
        this.key = key;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return key;
    }
}
