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
package integration;

import com.googlecode.jfold.Connection;
import com.googlecode.jfold.SocketConnection;
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
 * @author Michael Thomas <mikepthomas@outlook.com>
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
     */
    public void testApp() {
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
            Connection connection = new SocketConnection(address, port, password, retryRate);

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
