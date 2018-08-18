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
package info.mikethomas.jfold;

import info.mikethomas.jfold.info.InfoItem;

import java.io.IOException;
import java.util.Properties;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version 7.4.4
 */
public class SocketConnectionIT {

    /**
     * Rigourous Test :-)
     *
     * @throws java.io.IOException if any.
     */
    @Test
    public void testApp() throws IOException {
        var props = new Properties();
        var config = "/config.properties";
        try (var input = this.getClass().getResourceAsStream(config)) {
            props.load(input);
        }

        var address = props.getProperty("address");
        var port = Integer.parseInt(props.getProperty("port"));
        var password = props.getProperty("password");
        var retryRate = Integer.parseInt(props.getProperty("retry_rate"));

        var connection = new ClientConnection(address, port);
        connection.info();
        connection.getInfo(InfoItem.SYSTEM_CPU);
        connection.numSlots();
        connection.options();
        connection.options(true, true);
        connection.ppd();
        connection.simulationInfo(0);
        connection.queueInfo();
        connection.slotOptions(0);
        connection.uptime();
        connection.unpause(0);
        connection.slotInfo();
        connection.pause(0);
        connection.slotInfo();
    }
}
