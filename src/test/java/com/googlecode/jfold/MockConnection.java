/*
 * #%L
 * This file is part of jFold.
 * %%
 * Copyright (C) 2012 - 2014 Michael Thomas (mikepthomas@outlook.com)
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
package com.googlecode.jfold;

import com.googlecode.jfold.info.InfoItem;
import com.googlecode.jfold.options.Options;
import com.googlecode.jfold.simulation.SimulationInfo;
import com.googlecode.jfold.slot.Slot;
import com.googlecode.jfold.slot.SlotOptions;
import com.googlecode.jfold.unit.Unit;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import org.apache.commons.io.FileUtils;

/**
 * <p>MockConnection class.</p>
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version $Id: $Id
 * @since 1.0
 */
public class MockConnection extends GsonConnection implements Connection {

    /** {@inheritDoc} */
    @Override
    protected String getInfoOutput(String category, String key) {
        return "http://folding.stanford.edu/";
    }
    
    /** {@inheritDoc} */
    @Override
    protected String getInfoOutput() {
        return getJson(InfoItem.class);
    }
    
    /** {@inheritDoc} */
    @Override
    protected String getNumSlotsOutput() {
        return "1";
    }

    /** {@inheritDoc} */
    @Override
    protected String getOptionsOutput(boolean listDefault, boolean listUnset) {
        return getJson(Options.class);
    }

    /** {@inheritDoc} */
    @Override
    protected String getPpdOutput() {
        return "0";
    }

    /** {@inheritDoc} */
    @Override
    protected String getQueueInfoOutput() {
        return getJson(Unit.class);
    }

    /** {@inheritDoc} */
    @Override
    protected String getSimulationInfoOutput(int slot) {
        return getJson(SimulationInfo.class);
    }

    /** {@inheritDoc} */
    @Override
    protected String getSlotInfoOutput() {
        return getJson(Slot.class);
    }

    /** {@inheritDoc} */
    @Override
    protected String getSlotOptionsOutput(int slot) {
        return getJson(SlotOptions.class);
    }

    /** {@inheritDoc} */
    @Override
    protected String getUptimeOutput() {
        return "9d  3h 32m 33s";
    }

    private String getJson(Class clazz)
    {
        try {
            String filename = "Example" + clazz.getSimpleName() + ".json";
            URL url = clazz.getResource(filename);
            File file = FileUtils.toFile(url);
            return FileUtils.readFileToString(file, ENCODING);
        } catch (IOException e) {
            throw new UnsupportedOperationException(e);
        }
    }
}
