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
package integration;

import com.googlecode.jfold.Connection;
import com.googlecode.jfold.ClientConnection;
import com.googlecode.jfold.SocketConnection;
import com.googlecode.jfold.exceptions.InfoException;
import com.googlecode.jfold.exceptions.NumSlotsException;
import com.googlecode.jfold.exceptions.OptionsException;
import com.googlecode.jfold.exceptions.PpdException;
import com.googlecode.jfold.exceptions.SimulationInfoException;
import com.googlecode.jfold.exceptions.SlotInfoException;
import com.googlecode.jfold.exceptions.SlotOptionsException;
import com.googlecode.jfold.exceptions.UptimeException;
import com.googlecode.jfold.info.InfoItem;
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
     * @throws com.googlecode.jfold.exceptions.SlotInfoException
     * @throws com.googlecode.jfold.exceptions.InfoException
     * @throws com.googlecode.jfold.exceptions.NumSlotsException
     * @throws com.googlecode.jfold.exceptions.OptionsException
     * @throws com.googlecode.jfold.exceptions.PpdException
     * @throws com.googlecode.jfold.exceptions.SlotOptionsException
     * @throws com.googlecode.jfold.exceptions.SimulationInfoException
     */
    public void testApp() throws SlotInfoException, InfoException, NumSlotsException, OptionsException, PpdException, SlotOptionsException, SimulationInfoException, UptimeException {
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
            connection.getInfo(InfoItem.CLIENT_WEBSITE);
            connection.numSlots();
            connection.options();
            connection.options(true, true);
            connection.ppd();
            connection.simulationInfo(0);
            connection.slotInfo();
            connection.slotOptions(0);
            connection.uptime();
        } catch (IOException ex) {
            logger.error(null, ex);
        }
    }
}
