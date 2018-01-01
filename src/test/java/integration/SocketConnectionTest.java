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
package integration;

import info.mikethomas.jfold.Connection;
import info.mikethomas.jfold.ClientConnection;
import info.mikethomas.jfold.info.InfoItem;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version 7.4.4
 */
public class SocketConnectionTest extends TestCase {

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SocketConnectionTest(String testName) {
        super(testName);
    }

    /**
     * <p>suite.</p>
     *
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(SocketConnectionTest.class);
    }

    /**
     * Rigourous Test :-)
     *
     * @throws java.io.IOException if any.
     */
    public void testApp() throws IOException {
        Properties props = new Properties();
        String config = "/config.properties";
        try (InputStream input = this.getClass().getResourceAsStream(config)) {
            props.load(input);
        }

        String address = props.getProperty("address");
        int port = Integer.parseInt(props.getProperty("port"));
        String password = props.getProperty("password");
        int retryRate = Integer.parseInt(props.getProperty("retry_rate"));

        Connection connection = new ClientConnection(address, port);
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
