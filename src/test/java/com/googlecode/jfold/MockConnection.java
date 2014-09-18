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
import com.googlecode.jfold.util.Command;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;

/**
 * <p>MockConnection class.</p>
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version $Id: $Id
 * @since 1.0
 */
public class MockConnection extends ClientConnection implements Connection {
    
    public MockConnection() throws IOException {
        // Don't connect socket
        super(null, 0);
    }

    @Override
    protected String sendCommand(Command command, List<String> args) {
        switch (command) {
            case INFO:
                if (args.contains("Folding@home Client") && args.contains("Website")) {
                    return "http://folding.stanford.edu/";
                } else {
                    return getJson(InfoItem.class);
                }

            case NUM_SLOTS:
                return "1";

            case OPTIONS:
                return getJson(Options.class);

            case PPD:
                return "0";

            case QUEUE_INFO:
                return getJson(Unit.class);

            case SIMULATION_INFO:
                return getJson(SimulationInfo.class);

            case SLOT_INFO:
                return getJson(Slot.class);

            case SLOT_OPTIONS:
                return getJson(SlotOptions.class);

            case UPTIME:
                return "9d  3h 32m 33s";

            default:
                return null;
        }
    }

    private String getJson(Class clazz)
    {
        try {
            String filename = "Example" + clazz.getSimpleName() + ".json";
            URL url = clazz.getResource(filename);
            File file = FileUtils.toFile(url);
            String json = FileUtils.readFileToString(file, ENCODING);
            Logger.getLogger(this.getClass().getName()).log(Level.INFO, json);
            return json;
        } catch (IOException e) {
            throw new UnsupportedOperationException(e);
        }
    }
}
