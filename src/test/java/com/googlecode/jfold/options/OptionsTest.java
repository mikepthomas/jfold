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
package com.googlecode.jfold.options;

import com.googlecode.jfold.Connection;
import com.googlecode.jfold.MockConnection;
import com.googlecode.jfold.exceptions.OptionsException;
import java.io.IOException;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * <p>OptionsTest class.</p>
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version $Id: $Id
 * @since 1.0
 */
public class OptionsTest {
    
    /** Constant <code>instance</code> */
    public static Options instance;
    
    /**
     * <p>setUpClass.</p>
     *
     * @throws java.io.IOException
     * @throws com.googlecode.jfold.exceptions.OptionsException
     */
    @BeforeClass
    public static void setUpClass() throws IOException, OptionsException {
        Connection connection = new MockConnection();
        instance = connection.options();
    }
    
    /**
     * <p>tearDownClass.</p>
     */
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getAssignmentServers method, of class Options.
     */
    @Test
    public void testGetAssignmentServers() {
        System.out.println("getAssignmentServers");
        String expResult = "assign3.stanford.edu:8080 assign4.stanford.edu:80";
        String result = instance.getAssignmentServers();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCaptureDirectory method, of class Options.
     */
    @Test
    public void testGetCaptureDirectory() {
        System.out.println("getCaptureDirectory");
        String expResult = "capture";
        String result = instance.getCaptureDirectory();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCaptureSockets method, of class Options.
     */
    @Test
    public void testGetCaptureSockets() {
        System.out.println("getCaptureSockets");
        boolean expResult = false;
        boolean result = instance.getCaptureSockets();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCheckpoint method, of class Options.
     */
    @Test
    public void testGetCheckpoint() {
        System.out.println("getCheckpoint");
        int expResult = 15;
        int result = instance.getCheckpoint();
        assertEquals(expResult, result);
    }

    /**
     * Test of getChild method, of class Options.
     */
    @Test
    public void testGetChild() {
        System.out.println("getChild");
        boolean expResult = true;
        boolean result = instance.getChild();
        assertEquals(expResult, result);
    }

    /**
     * Test of getClientSubtype method, of class Options.
     */
    @Test
    public void testGetClientSubtype() {
        System.out.println("getClientSubtype");
        String expResult = "MACOSX";
        String result = instance.getClientSubtype();
        assertEquals(expResult, result);
    }

    /**
     * Test of getClientType method, of class Options.
     */
    @Test
    public void testGetClientType() {
        System.out.println("getClientType");
        String expResult = "normal";
        String result = instance.getClientType();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCommandAddress method, of class Options.
     */
    @Test
    public void testGetCommandAddress() {
        System.out.println("getCommandAddress");
        String expResult = "0.0.0.0";
        String result = instance.getCommandAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCommandAllow method, of class Options.
     */
    @Test
    public void testGetCommandAllow() {
        System.out.println("getCommandAllow");
        String expResult = null;
        String result = instance.getCommandAllow();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCommandAllowNoPass method, of class Options.
     */
    @Test
    public void testGetCommandAllowNoPass() {
        System.out.println("getCommandAllowNoPass");
        String expResult = "127.0.0.1";
        String result = instance.getCommandAllowNoPass();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCommandDeny method, of class Options.
     */
    @Test
    public void testGetCommandDeny() {
        System.out.println("getCommandDeny");
        String expResult = null;
        String result = instance.getCommandDeny();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCommandDenyNoPass method, of class Options.
     */
    @Test
    public void testGetCommandDenyNoPass() {
        System.out.println("getCommandDenyNoPass");
        String expResult = "0/0";
        String result = instance.getCommandDenyNoPass();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCommandPort method, of class Options.
     */
    @Test
    public void testGetCommandPort() {
        System.out.println("getCommandPort");
        int expResult = 36330;
        int result = instance.getCommandPort();
        assertEquals(expResult, result);
    }

    /**
     * Test of getConfigRotate method, of class Options.
     */
    @Test
    public void testGetConfigRotate() {
        System.out.println("getConfigRotate");
        boolean expResult = true;
        boolean result = instance.getConfigRotate();
        assertEquals(expResult, result);
    }

    /**
     * Test of getConfigRotateDir method, of class Options.
     */
    @Test
    public void testGetConfigRotateDir() {
        System.out.println("getConfigRotateDir");
        String expResult = "configs";
        String result = instance.getConfigRotateDir();
        assertEquals(expResult, result);
    }

    /**
     * Test of getConfigRotateMax method, of class Options.
     */
    @Test
    public void testGetConfigRotateMax() {
        System.out.println("getConfigRotateMax");
        int expResult = 16;
        int result = instance.getConfigRotateMax();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCoreDir method, of class Options.
     */
    @Test
    public void testGetCoreDir() {
        System.out.println("getCoreDir");
        String expResult = "cores";
        String result = instance.getCoreDir();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCoreKey method, of class Options.
     */
    @Test
    public void testGetCoreKey() {
        System.out.println("getCoreKey");
        String expResult = null;
        String result = instance.getCoreKey();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCorePrep method, of class Options.
     */
    @Test
    public void testGetCorePrep() {
        System.out.println("getCorePrep");
        String expResult = null;
        String result = instance.getCorePrep();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCorePriority method, of class Options.
     */
    @Test
    public void testGetCorePriority() {
        System.out.println("getCorePriority");
        String expResult = "idle";
        String result = instance.getCorePriority();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCoreServer method, of class Options.
     */
    @Test
    public void testGetCoreServer() {
        System.out.println("getCoreServer");
        String expResult = null;
        String result = instance.getCoreServer();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCpuAffinity method, of class Options.
     */
    @Test
    public void testGetCpuAffinity() {
        System.out.println("getCpuAffinity");
        boolean expResult = false;
        boolean result = instance.getCpuAffinity();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCpuSpecies method, of class Options.
     */
    @Test
    public void testGetCpuSpecies() {
        System.out.println("getCpuSpecies");
        String expResult = "X86_PENTIUM_II";
        String result = instance.getCpuSpecies();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCpuType method, of class Options.
     */
    @Test
    public void testGetCpuType() {
        System.out.println("getCpuType");
        String expResult = "AMD64";
        String result = instance.getCpuType();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCpuUsage method, of class Options.
     */
    @Test
    public void testGetCpuUsage() {
        System.out.println("getCpuUsage");
        int expResult = 100;
        int result = instance.getCpuUsage();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCpus method, of class Options.
     */
    @Test
    public void testGetCpus() {
        System.out.println("getCpus");
        int expResult = -1;
        int result = instance.getCpus();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCudaIndex method, of class Options.
     */
    @Test
    public void testGetCudaIndex() {
        System.out.println("getCudaIndex");
        int expResult = 0;
        int result = instance.getCudaIndex();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCycleRate method, of class Options.
     */
    @Test
    public void testGetCycleRate() {
        System.out.println("getCycleRate");
        int expResult = 4;
        int result = instance.getCycleRate();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCycles method, of class Options.
     */
    @Test
    public void testGetCycles() {
        System.out.println("getCycles");
        int expResult = -1;
        int result = instance.getCycles();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDaemon method, of class Options.
     */
    @Test
    public void testGetDaemon() {
        System.out.println("getDaemon");
        boolean expResult = false;
        boolean result = instance.getDaemon();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDataDirectory method, of class Options.
     */
    @Test
    public void testGetDataDirectory() {
        System.out.println("getDataDirectory");
        String expResult = ".";
        String result = instance.getDataDirectory();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDebugSockets method, of class Options.
     */
    @Test
    public void testGetDebugSockets() {
        System.out.println("getDebugSockets");
        boolean expResult = false;
        boolean result = instance.getDebugSockets();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDumpAfterDeadline method, of class Options.
     */
    @Test
    public void testGetDumpAfterDeadline() {
        System.out.println("getDumpAfterDeadline");
        boolean expResult = true;
        boolean result = instance.getDumpAfterDeadline();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEval method, of class Options.
     */
    @Test
    public void testGetEval() {
        System.out.println("getEval");
        String expResult = null;
        String result = instance.getEval();
        assertEquals(expResult, result);
    }

    /**
     * Test of getExceptionLocations method, of class Options.
     */
    @Test
    public void testGetExceptionLocations() {
        System.out.println("getExceptionLocations");
        boolean expResult = true;
        boolean result = instance.getExceptionLocations();
        assertEquals(expResult, result);
    }

    /**
     * Test of getExecDirectory method, of class Options.
     */
    @Test
    public void testGetExecDirectory() {
        System.out.println("getExecDirectory");
        String expResult = "/usr/bin";
        String result = instance.getExecDirectory();
        assertEquals(expResult, result);
    }

    /**
     * Test of getExitWhenDone method, of class Options.
     */
    @Test
    public void testGetExitWhenDone() {
        System.out.println("getExitWhenDone");
        boolean expResult = false;
        boolean result = instance.getExitWhenDone();
        assertEquals(expResult, result);
    }

    /**
     * Test of getExtraCoreArgs method, of class Options.
     */
    @Test
    public void testGetExtraCoreArgs() {
        System.out.println("getExtraCoreArgs");
        String expResult = null;
        String result = instance.getExtraCoreArgs();
        assertEquals(expResult, result);
    }

    /**
     * Test of getForceWs method, of class Options.
     */
    @Test
    public void testGetForceWs() {
        System.out.println("getForceWs");
        boolean expResult = false;
        boolean result = instance.getForceWs();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGpu method, of class Options.
     */
    @Test
    public void testGetGpu() {
        System.out.println("getGpu");
        boolean expResult = false;
        boolean result = instance.getGpu();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGpuAssignmentServers method, of class Options.
     */
    @Test
    public void testGetGpuAssignmentServers() {
        System.out.println("getGpuAssignmentServers");
        String expResult = "assign3.stanford.edu:8080 assign4.stanford.edu:80";
        String result = instance.getGpuAssignmentServers();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGpuIndex method, of class Options.
     */
    @Test
    public void testGetGpuIndex() {
        System.out.println("getGpuIndex");
        String expResult = null;
        String result = instance.getGpuIndex();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGpuUsage method, of class Options.
     */
    @Test
    public void testGetGpuUsage() {
        System.out.println("getGpuUsage");
        int expResult = 100;
        int result = instance.getGpuUsage();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLog method, of class Options.
     */
    @Test
    public void testGetLog() {
        System.out.println("getLog");
        String expResult = "log.txt";
        String result = instance.getLog();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogColor method, of class Options.
     */
    @Test
    public void testGetLogColor() {
        System.out.println("getLogColor");
        boolean expResult = true;
        boolean result = instance.getLogColor();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogCrlf method, of class Options.
     */
    @Test
    public void testGetLogCrlf() {
        System.out.println("getLogCrlf");
        boolean expResult = false;
        boolean result = instance.getLogCrlf();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogDate method, of class Options.
     */
    @Test
    public void testGetLogDate() {
        System.out.println("getLogDate");
        boolean expResult = false;
        boolean result = instance.getLogDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogDebug method, of class Options.
     */
    @Test
    public void testGetLogDebug() {
        System.out.println("getLogDebug");
        boolean expResult = true;
        boolean result = instance.getLogDebug();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogDomain method, of class Options.
     */
    @Test
    public void testGetLogDomain() {
        System.out.println("getLogDomain");
        boolean expResult = false;
        boolean result = instance.getLogDomain();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogDomainLevels method, of class Options.
     */
    @Test
    public void testGetLogDomainLevels() {
        System.out.println("getLogDomainLevels");
        boolean expResult = false;
        boolean result = instance.getLogDomainLevels();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogHeader method, of class Options.
     */
    @Test
    public void testGetLogHeader() {
        System.out.println("getLogHeader");
        boolean expResult = true;
        boolean result = instance.getLogHeader();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogLevel method, of class Options.
     */
    @Test
    public void testGetLogLevel() {
        System.out.println("getLogLevel");
        boolean expResult = true;
        boolean result = instance.getLogLevel();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogNoInfoHeader method, of class Options.
     */
    @Test
    public void testGetLogNoInfoHeader() {
        System.out.println("getLogNoInfoHeader");
        boolean expResult = true;
        boolean result = instance.getLogNoInfoHeader();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogRedirect method, of class Options.
     */
    @Test
    public void testGetLogRedirect() {
        System.out.println("getLogRedirect");
        boolean expResult = false;
        boolean result = instance.getLogRedirect();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogRotate method, of class Options.
     */
    @Test
    public void testGetLogRotate() {
        System.out.println("getLogRotate");
        boolean expResult = true;
        boolean result = instance.getLogRotate();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogRotateDir method, of class Options.
     */
    @Test
    public void testGetLogRotateDir() {
        System.out.println("getLogRotateDir");
        String expResult = "logs";
        String result = instance.getLogRotateDir();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogRotateMax method, of class Options.
     */
    @Test
    public void testGetLogRotateMax() {
        System.out.println("getLogRotateMax");
        int expResult = 16;
        int result = instance.getLogRotateMax();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogShortLevel method, of class Options.
     */
    @Test
    public void testGetLogShortLevel() {
        System.out.println("getLogShortLevel");
        boolean expResult = false;
        boolean result = instance.getLogShortLevel();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogSimpleDomains method, of class Options.
     */
    @Test
    public void testGetLogSimpleDomains() {
        System.out.println("getLogSimpleDomains");
        boolean expResult = true;
        boolean result = instance.getLogSimpleDomains();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogThreadId method, of class Options.
     */
    @Test
    public void testGetLogThreadId() {
        System.out.println("getLogThreadId");
        boolean expResult = false;
        boolean result = instance.getLogThreadId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogTime method, of class Options.
     */
    @Test
    public void testGetLogTime() {
        System.out.println("getLogTime");
        boolean expResult = true;
        boolean result = instance.getLogTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogToScreen method, of class Options.
     */
    @Test
    public void testGetLogToScreen() {
        System.out.println("getLogToScreen");
        boolean expResult = true;
        boolean result = instance.getLogToScreen();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogTruncate method, of class Options.
     */
    @Test
    public void testGetLogTruncate() {
        System.out.println("getLogTruncate");
        boolean expResult = false;
        boolean result = instance.getLogTruncate();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMachineId method, of class Options.
     */
    @Test
    public void testGetMachineId() {
        System.out.println("getMachineId");
        int expResult = 0;
        int result = instance.getMachineId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMaxDelay method, of class Options.
     */
    @Test
    public void testGetMaxDelay() {
        System.out.println("getMaxDelay");
        int expResult = 0;
        int result = instance.getMaxDelay();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMaxPacketSize method, of class Options.
     */
    @Test
    public void testGetMaxPacketSize() {
        System.out.println("getMaxPacketSize");
        String expResult = "normal";
        String result = instance.getMaxPacketSize();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMaxQueue method, of class Options.
     */
    @Test
    public void testGetMaxQueue() {
        System.out.println("getMaxQueue");
        int expResult = 16;
        int result = instance.getMaxQueue();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMaxShutdownWait method, of class Options.
     */
    @Test
    public void testGetMaxShutdownWait() {
        System.out.println("getMaxShutdownWait");
        int expResult = 60;
        int result = instance.getMaxShutdownWait();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMaxSlotErrors method, of class Options.
     */
    @Test
    public void testGetMaxSlotErrors() {
        System.out.println("getMaxSlotErrors");
        int expResult = 10;
        int result = instance.getMaxSlotErrors();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMaxUnitErrors method, of class Options.
     */
    @Test
    public void testGetMaxUnitErrors() {
        System.out.println("getMaxUnitErrors");
        int expResult = 5;
        int result = instance.getMaxUnitErrors();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMaxUnits method, of class Options.
     */
    @Test
    public void testGetMaxUnits() {
        System.out.println("getMaxUnits");
        int expResult = 0;
        int result = instance.getMaxUnits();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMemory method, of class Options.
     */
    @Test
    public void testGetMemory() {
        System.out.println("getMemory");
        String expResult = null;
        String result = instance.getMemory();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMinDelay method, of class Options.
     */
    @Test
    public void testGetMinDelay() {
        System.out.println("getMinDelay");
        int expResult = 0;
        int result = instance.getMinDelay();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNextUnitPercentage method, of class Options.
     */
    @Test
    public void testGetNextUnitPercentage() {
        System.out.println("getNextUnitPercentage");
        int expResult = 99;
        int result = instance.getNextUnitPercentage();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPriority method, of class Options.
     */
    @Test
    public void testGetPriority() {
        System.out.println("getPriority");
        String expResult = null;
        String result = instance.getPriority();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNoAssembly method, of class Options.
     */
    @Test
    public void testGetNoAssembly() {
        System.out.println("getNoAssembly");
        boolean expResult = false;
        boolean result = instance.getNoAssembly();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOpenclIndex method, of class Options.
     */
    @Test
    public void testGetOpenclIndex() {
        System.out.println("getOpenclIndex");
        int expResult = 0;
        int result = instance.getOpenclIndex();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOsSpecies method, of class Options.
     */
    @Test
    public void testGetOsSpecies() {
        System.out.println("getOsSpecies");
        String expResult = "UNKNOWN";
        String result = instance.getOsSpecies();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOsType method, of class Options.
     */
    @Test
    public void testGetOsType() {
        System.out.println("getOsType");
        String expResult = "MACOSX";
        String result = instance.getOsType();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPasskey method, of class Options.
     */
    @Test
    public void testGetPasskey() {
        System.out.println("getPasskey");
        String expResult = "passkey";
        String result = instance.getPasskey();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPassword method, of class Options.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        String expResult = null;
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPauseOnBattery method, of class Options.
     */
    @Test
    public void testGetPauseOnBattery() {
        System.out.println("getPauseOnBattery");
        boolean expResult = true;
        boolean result = instance.getPauseOnBattery();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPauseOnStart method, of class Options.
     */
    @Test
    public void testGetPauseOnStart() {
        System.out.println("getPauseOnStart");
        boolean expResult = false;
        boolean result = instance.getPauseOnStart();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPid method, of class Options.
     */
    @Test
    public void testGetPid() {
        System.out.println("getPid");
        boolean expResult = false;
        boolean result = instance.getPid();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPidFile method, of class Options.
     */
    @Test
    public void testGetPidFile() {
        System.out.println("getPidFile");
        String expResult = "Folding@home Client.pid";
        String result = instance.getPidFile();
        assertEquals(expResult, result);
    }

    /**
     * Test of getProjectKey method, of class Options.
     */
    @Test
    public void testGetProjectKey() {
        System.out.println("getProjectKey");
        int expResult = 0;
        int result = instance.getProjectKey();
        assertEquals(expResult, result);
    }

    /**
     * Test of getProxy method, of class Options.
     */
    @Test
    public void testGetProxy() {
        System.out.println("getProxy");
        String expResult = ":8080";
        String result = instance.getProxy();
        assertEquals(expResult, result);
    }

    /**
     * Test of getProxyEnable method, of class Options.
     */
    @Test
    public void testGetProxyEnable() {
        System.out.println("getProxyEnable");
        boolean expResult = false;
        boolean result = instance.getProxyEnable();
        assertEquals(expResult, result);
    }

    /**
     * Test of getProxyPass method, of class Options.
     */
    @Test
    public void testGetProxyPass() {
        System.out.println("getProxyPass");
        String expResult = "";
        String result = instance.getProxyPass();
        assertEquals(expResult, result);
    }

    /**
     * Test of getProxyUser method, of class Options.
     */
    @Test
    public void testGetProxyUser() {
        System.out.println("getProxyUser");
        String expResult = "";
        String result = instance.getProxyUser();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRespawn method, of class Options.
     */
    @Test
    public void testGetRespawn() {
        System.out.println("getRespawn");
        boolean expResult = true;
        boolean result = instance.getRespawn();
        assertEquals(expResult, result);
    }

    /**
     * Test of getScript method, of class Options.
     */
    @Test
    public void testGetScript() {
        System.out.println("getScript");
        String expResult = null;
        String result = instance.getScript();
        assertEquals(expResult, result);
    }

    /**
     * Test of getService method, of class Options.
     */
    @Test
    public void testGetService() {
        System.out.println("getService");
        boolean expResult = false;
        boolean result = instance.getService();
        assertEquals(expResult, result);
    }

    /**
     * Test of getServiceDescription method, of class Options.
     */
    @Test
    public void testGetServiceDescription() {
        System.out.println("getServiceDescription");
        String expResult = null;
        String result = instance.getServiceDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of getServiceRestart method, of class Options.
     */
    @Test
    public void testGetServiceRestart() {
        System.out.println("getServiceRestart");
        boolean expResult = false;
        boolean result = instance.getServiceRestart();
        assertEquals(expResult, result);
    }

    /**
     * Test of getServiceRestartDelay method, of class Options.
     */
    @Test
    public void testGetServiceRestartDelay() {
        System.out.println("getServiceRestartDelay");
        int expResult = 0;
        int result = instance.getServiceRestartDelay();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSmp method, of class Options.
     */
    @Test
    public void testGetSmp() {
        System.out.println("getSmp");
        boolean expResult = true;
        boolean result = instance.getSmp();
        assertEquals(expResult, result);
    }

    /**
     * Test of getStackTraces method, of class Options.
     */
    @Test
    public void testGetStackTraces() {
        System.out.println("getStackTraces");
        boolean expResult = false;
        boolean result = instance.getStackTraces();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTeam method, of class Options.
     */
    @Test
    public void testGetTeam() {
        System.out.println("getTeam");
        int expResult = 39299;
        int result = instance.getTeam();
        assertEquals(expResult, result);
    }

    /**
     * Test of getThreads method, of class Options.
     */
    @Test
    public void testGetThreads() {
        System.out.println("getThreads");
        int expResult = 4;
        int result = instance.getThreads();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUser method, of class Options.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        String expResult = "montycrabapple";
        String result = instance.getUser();
        assertEquals(expResult, result);
    }

    /**
     * Test of getVerbosity method, of class Options.
     */
    @Test
    public void testGetVerbosity() {
        System.out.println("getVerbosity");
        int expResult = 3;
        int result = instance.getVerbosity();
        assertEquals(expResult, result);
    }
}
