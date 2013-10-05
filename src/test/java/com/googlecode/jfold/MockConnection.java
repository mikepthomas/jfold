package com.googlecode.jfold;

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

import com.googlecode.jfold.model.simulation.SimulationInfo;
import com.googlecode.jfold.model.slot.Slot;
import com.googlecode.jfold.model.slot.SlotOptions;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Michael Thomas <mikepthomas@outlook.com>
 * @version $Id: $Id
 * @since 1.0
 */
public class MockConnection extends SocketConnection implements Connection {

    @Override
    protected String getSimulationInfoJson() {
        return getJson(SimulationInfo.class);
    }

    @Override
    protected String getSlotInfoJson() {
        return getJson(Slot.class);
    }

    @Override
    protected String getSlotOptionsJson() {
        return getJson(SlotOptions.class);
    }

    private String getJson(Class clazz)
    {
        try {
            URL url = clazz.getResource("Example" + clazz.getSimpleName() + ".json");
            File file = FileUtils.toFile(url);
            return FileUtils.readFileToString(file, ENCODING);
        } catch (IOException e) {
            throw new UnsupportedOperationException(e);
        }
    }
}
