package com.googlecode.jfold.model.slot;

/*
 * #%L
 * jFold
 * %%
 * Copyright (C) 2012 - 2013 Michael Thomas <mikepthomas@outlook.com>
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public 
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

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

    @SerializedName("id")
    private String id;
    @SerializedName("status")
    private String status;
    @SerializedName("description")
    private String description;
    @SerializedName("options")
    private SlotOptionsImpl options;

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
    public SlotImpl(String json) {
        SlotImpl jsonSlot = new Gson().fromJson(json, SlotImpl.class);

        this.id = jsonSlot.id;
        this.status = jsonSlot.status;
        this.description = jsonSlot.description;
        this.options = jsonSlot.options;
    }

    /** {@inheritDoc} */
    @Override
    public String getId() {
        return id;
    }

    /** {@inheritDoc} */
    @Override
    public String getStatus() {
        return status;
    }

    /** {@inheritDoc} */
    @Override
    public String getDescription() {
        return description;
    }

    /** {@inheritDoc} */
    @Override
    public SlotOptions getOptions() {
        return options;
    }
}
