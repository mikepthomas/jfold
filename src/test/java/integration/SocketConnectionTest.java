/*
 * #%L
 * This file is part of jFold.
 * %%
 * Copyright (C) 2012 - 2017 Mike Thomas <mikepthomas@outlook.com>
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
import info.mikethomas.jfold.SocketConnection;
import info.mikethomas.jfold.exceptions.InfoException;
import info.mikethomas.jfold.exceptions.NumSlotsException;
import info.mikethomas.jfold.exceptions.OptionsException;
import info.mikethomas.jfold.exceptions.PauseException;
import info.mikethomas.jfold.exceptions.PpdException;
import info.mikethomas.jfold.exceptions.QueueInfoException;
import info.mikethomas.jfold.exceptions.SimulationInfoException;
import info.mikethomas.jfold.exceptions.SlotInfoException;
import info.mikethomas.jfold.exceptions.SlotOptionsException;
import info.mikethomas.jfold.exceptions.UnpauseException;
import info.mikethomas.jfold.exceptions.UptimeException;
import info.mikethomas.jfold.info.InfoItem;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Unit test for simple App.
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version $Id: $Id
 * @since 1.0
 */
public class SocketConnectionTest extends TestCase {

    /** Logger. */
    private static final Logger logger = LoggerFactory.getLogger(SocketConnectionTest.class);

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
     * @throws info.mikethomas.jfold.exceptions.SlotInfoException if any.
     * @throws info.mikethomas.jfold.exceptions.InfoException if any.
     * @throws info.mikethomas.jfold.exceptions.NumSlotsException if any.
     * @throws info.mikethomas.jfold.exceptions.OptionsException if any.
     * @throws info.mikethomas.jfold.exceptions.PpdException if any.
     * @throws info.mikethomas.jfold.exceptions.SlotOptionsException if any.
     * @throws info.mikethomas.jfold.exceptions.SimulationInfoException if any.
     * @throws info.mikethomas.jfold.exceptions.UptimeException if any.
     * @throws info.mikethomas.jfold.exceptions.QueueInfoException if any.
     * @throws info.mikethomas.jfold.exceptions.UnpauseException if any.
     * @throws info.mikethomas.jfold.exceptions.PauseException if any.
     */
    public void testApp() throws SlotInfoException, InfoException, NumSlotsException, OptionsException, PpdException, SlotOptionsException, SimulationInfoException, UptimeException, QueueInfoException, UnpauseException, PauseException {
        Properties props = new Properties();
        InputStream input = SocketConnection.class.getResourceAsStream("/config.properties");
        try {
            try {
                props.load(input);
            } finally {
                input.close();
            }
        } catch (IOException ex) {
            logger.warn(null, ex);
        }

        String address = props.getProperty("address");
        int port = Integer.parseInt(props.getProperty("port"));
        String password = props.getProperty("password");
        int retryRate = Integer.parseInt(props.getProperty("retry_rate"));

        try {
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
        } catch (IOException ex) {
            logger.error(null, ex);
        }
    }
}
