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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.googlecode.jfold.model.options.Options;
import com.googlecode.jfold.model.simulation.SimulationInfo;
import com.googlecode.jfold.model.simulation.SimulationInfoImpl;
import com.googlecode.jfold.model.slot.Slot;
import com.googlecode.jfold.model.slot.SlotImpl;
import com.googlecode.jfold.model.slot.SlotOptions;
import com.googlecode.jfold.model.slot.SlotOptionsImpl;
import com.googlecode.jfold.model.unit.Unit;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.net.Inet4Address;
import java.net.Socket;
import java.net.URL;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <p>SocketConnection class.</p>
 *
 * @author Michael Thomas <mikepthomas@outlook.com>
 * @version $Id: $Id
 */
public class SocketConnection extends Socket implements Connection {

    public static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";

    private final Gson gson;
    private final String address, password;
    private final int port, retryRate;

    /**
     * <p>Constructor for ConnectionImpl.</p>
     */
    public SocketConnection() {
        super();

        Properties props = new Properties();
        InputStream input = this.getClass().getResourceAsStream("/config.properties");
        try {
            try {
                props.load(input);
            }
            finally {
                input.close();
            }
        }
        catch (IOException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.WARNING, ex.getMessage());
        }

        this.address = props.getProperty("address");
        this.port = Integer.parseInt(props.getProperty("port"));
        this.password = props.getProperty("password");
        this.retryRate = Integer.parseInt(props.getProperty("retry_rate"));
        this.gson = getGson();
    }

    /**
     * <p>Constructor for ConnectionImpl.</p>
     *
     * @param address a {@link java.lang.String} object.
     * @param port a int.
     * @param password a {@link java.lang.String} object.
     * @param retryRate a int.
     */
    public SocketConnection(String address, int port, String password, int retryRate) {
        super();
        
        this.address = address;
        this.port = port;
        this.password = password;
        this.retryRate = retryRate;
        this.gson = getGson();
    }

    private Gson getGson()
    {
        return new GsonBuilder().setDateFormat(DATE_FORMAT).create();
    }

    /** {@inheritDoc} */
    @Override
    public void bond(Inet4Address ip, int port, String input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /** {@inheritDoc} */
    @Override
    public void configured() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /** {@inheritDoc} */
    @Override
    public void doCycle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /** {@inheritDoc} */
    @Override
    public void downloadCore(String type, URL url) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /** {@inheritDoc} */
    @Override
    public void finish() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /** {@inheritDoc} */
    @Override
    public void finish(int slot) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /** {@inheritDoc} */
    @Override
    public String getInfo(String category, String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /** {@inheritDoc} */
    @Override
    public List info() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /** {@inheritDoc} */
    @Override
    public void inject(Inet4Address ip, int port, String input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /** {@inheritDoc} */
    @Override
    public void maskUnitState() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /** {@inheritDoc} */
    @Override
    public int numSlots() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /** {@inheritDoc} */
    @Override
    public String option(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /** {@inheritDoc} */
    @Override
    public String option(String name, String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /** {@inheritDoc} */
    @Override
    public Options options() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /** {@inheritDoc} */
    @Override
    public void pause() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /** {@inheritDoc} */
    @Override
    public void pause(int slot) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /** {@inheritDoc} */
    @Override
    public int ppd() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /** {@inheritDoc} */
    @Override
    public List<Unit> queueInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /** {@inheritDoc} */
    @Override
    public void requestId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /** {@inheritDoc} */
    @Override
    public void requestWs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /** {@inheritDoc} */
    @Override
    public void save() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /** {@inheritDoc} */
    @Override
    public void save(String file) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /** {@inheritDoc} */
    @Override
    public void shutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /** {@inheritDoc} */
    @Override
    public SimulationInfo simulationInfo(int slot) {
        return gson.fromJson(getSimulationInfoJson(), SimulationInfoImpl.class);
    }

    /** {@inheritDoc} */
    @Override
    public void slotAdd(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /** {@inheritDoc} */
    @Override
    public void slotDelete(int slot) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /** {@inheritDoc} */
    @Override
    public List<Slot> slotInfo() {
        Type slotInfoType = new TypeToken<List<SlotImpl>>(){}.getType();
        return gson.fromJson(getSlotInfoJson(), slotInfoType);
    }

    /** {@inheritDoc} */
    @Override
    public void slotModify(String id, String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /** {@inheritDoc} */
    @Override
    public SlotOptions slotOptions(int slot) {
        return gson.fromJson(getSlotOptionsJson(), SlotOptionsImpl.class);
    }

    /** {@inheritDoc} */
    @Override
    public void trajectory(int slot) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /** {@inheritDoc} */
    @Override
    public void triggerSave() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /** {@inheritDoc} */
    @Override
    public void unpause() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /** {@inheritDoc} */
    @Override
    public void unpause(int slot) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /** {@inheritDoc} */
    @Override
    public String uptime() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /** {@inheritDoc} */
    @Override
    public void waitForUnits() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected String getSimulationInfoJson() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected String getSlotInfoJson() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected String getSlotOptionsJson() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
