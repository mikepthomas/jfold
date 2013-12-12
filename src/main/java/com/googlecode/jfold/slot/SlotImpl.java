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
package com.googlecode.jfold.slot;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * <p>SlotImpl class.</p>
 *
 * @author Michael Thomas <mikepthomas@outlook.com>
 * @version $Id: $Id
 */
public class SlotImpl implements Slot, Serializable {
// <editor-fold defaultstate="collapsed" desc="Member Variables">
    /**
     * Identifier.
     */
    @SerializedName("id")
    private String id;
    /**
     * Status.
     */
    @SerializedName("status")
    private String status;
    /**
     * Description.
     */
    @SerializedName("description")
    private String description;
    /**
     * SlotOptions.
     */
    @SerializedName("options")
    private SlotOptionsImpl options;
// </editor-fold>

// <editor-fold desc="Constructors">
    /**
     * Default constructor.
     */
    public SlotImpl() {
        super();
    }

    /**
     * <p>Constructor for SlotImpl.</p>
     *
     * @param json a {@link java.lang.String} object.
     */
    public SlotImpl(final String json) {
        SlotImpl jsonSlot = new Gson().fromJson(json, SlotImpl.class);

        this.id = jsonSlot.id;
        this.status = jsonSlot.status;
        this.description = jsonSlot.description;
        this.options = jsonSlot.options;
    }
// </editor-fold>

// <editor-fold desc="Accessors">
    /** {@inheritDoc} */
    @Override
    public final String getId() {
        return id;
    }

    /** {@inheritDoc} */
    @Override
    public final String getStatus() {
        return status;
    }

    /** {@inheritDoc} */
    @Override
    public final String getDescription() {
        return description;
    }

    /** {@inheritDoc} */
    @Override
    public final SlotOptions getOptions() {
        return options;
    }
// </editor-fold>

    /** {@inheritDoc} */
    @Override
    public final String toString() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
