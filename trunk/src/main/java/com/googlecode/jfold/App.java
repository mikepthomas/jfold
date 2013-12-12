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
package com.googlecode.jfold;

import com.googlecode.jfold.info.InfoItem;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 * @author Michael Thomas <mikepthomas@outlook.com>
 * @version $Id: $Id
 */
public class App {

    /**
     * <p>main.</p>
     *
     * @param args an array of {@link java.lang.String} objects.
     */
    public static void main(final String[] args) {
        Properties props = new Properties();
        InputStream input = App.class.getResourceAsStream("/config.properties");
        try {
            try {
                props.load(input);
            } finally {
                input.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.WARNING, ex.getMessage());
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
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
