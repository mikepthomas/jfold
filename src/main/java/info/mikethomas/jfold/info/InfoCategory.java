/*
 * #%L
 * This file is part of jFold.
 * %%
 * Copyright (C) 2012 - 2019 Mike Thomas <mikepthomas@outlook.com>
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
 * <p>InfoCategory class.</p>
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version 7.5.1
 */
@AllArgsConstructor
@Getter
public enum InfoCategory {

// <editor-fold defaultstate="collapsed" desc="Info Categories">

    /** Represents <code>Folding@home Client</code> category. */
    CLIENT("Folding@home Client"),

    /** Represents <code>Build</code> category. */
    BUILD("Build"),

    /** Represents <code>System</code> category. */
    SYSTEM("System");

// </editor-fold>

    /**
     * Info Category Key.
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
