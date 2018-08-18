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
package info.mikethomas.jfold.options;

import info.mikethomas.jfold.MockConnection;
import info.mikethomas.jfold.exceptions.OptionsException;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * <p>OptionsTest class.</p>
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version 7.4.4
 */
public class OptionsTest {

    /** Constant <code>instance</code> */
    public static Options instance;

    /**
     * <p>setUpClass.</p>
     *
     * @throws java.io.IOException if any.
     * @throws info.mikethomas.jfold.exceptions.OptionsException if any.
     */
    @BeforeAll
    public static void setUpClass() throws IOException, OptionsException {
        var connection = new MockConnection();
        instance = connection.options();
    }

    /**
     * Test of getAssignmentServers method, of class Options.
     */
    @Test
    public void testGetAssignmentServers() {
        System.out.println("getAssignmentServers");
        var expResult = "assign3.stanford.edu:8080 assign4.stanford.edu:80";
        var result = instance.getAssignmentServers();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCaptureDirectory method, of class Options.
     */
    @Test
    public void testGetCaptureDirectory() {
        System.out.println("getCaptureDirectory");
        var expResult = "capture";
        var result = instance.getCaptureDirectory();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCaptureSockets method, of class Options.
     */
    @Test
    public void testGetCaptureSockets() {
        System.out.println("getCaptureSockets");
        var expResult = false;
        var result = instance.getCaptureSockets();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCheckpoint method, of class Options.
     */
    @Test
    public void testGetCheckpoint() {
        System.out.println("getCheckpoint");
        var expResult = 15;
        var result = instance.getCheckpoint();
        assertEquals(expResult, result);
    }

    /**
     * Test of getChild method, of class Options.
     */
    @Test
    public void testGetChild() {
        System.out.println("getChild");
        var expResult = true;
        var result = instance.getChild();
        assertEquals(expResult, result);
    }

    /**
     * Test of getClientSubtype method, of class Options.
     */
    @Test
    public void testGetClientSubtype() {
        System.out.println("getClientSubtype");
        var expResult = "MACOSX";
        var result = instance.getClientSubtype();
        assertEquals(expResult, result);
    }

    /**
     * Test of getClientType method, of class Options.
     */
    @Test
    public void testGetClientType() {
        System.out.println("getClientType");
        var expResult = "normal";
        var result = instance.getClientType();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCommandAddress method, of class Options.
     */
    @Test
    public void testGetCommandAddress() {
        System.out.println("getCommandAddress");
        var expResult = "0.0.0.0";
        var result = instance.getCommandAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCommandAllow method, of class Options.
     */
    @Test
    public void testGetCommandAllow() {
        System.out.println("getCommandAllow");
        assertNull(instance.getCommandAllow());
    }

    /**
     * Test of getCommandAllowNoPass method, of class Options.
     */
    @Test
    public void testGetCommandAllowNoPass() {
        System.out.println("getCommandAllowNoPass");
        var expResult = "127.0.0.1";
        var result = instance.getCommandAllowNoPass();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCommandDeny method, of class Options.
     */
    @Test
    public void testGetCommandDeny() {
        System.out.println("getCommandDeny");
        assertNull(instance.getCommandDeny());
    }

    /**
     * Test of getCommandDenyNoPass method, of class Options.
     */
    @Test
    public void testGetCommandDenyNoPass() {
        System.out.println("getCommandDenyNoPass");
        var expResult = "0/0";
        var result = instance.getCommandDenyNoPass();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCommandPort method, of class Options.
     */
    @Test
    public void testGetCommandPort() {
        System.out.println("getCommandPort");
        var expResult = 36330;
        var result = instance.getCommandPort();
        assertEquals(expResult, result);
    }

    /**
     * Test of getConfigRotate method, of class Options.
     */
    @Test
    public void testGetConfigRotate() {
        System.out.println("getConfigRotate");
        var expResult = true;
        var result = instance.getConfigRotate();
        assertEquals(expResult, result);
    }

    /**
     * Test of getConfigRotateDir method, of class Options.
     */
    @Test
    public void testGetConfigRotateDir() {
        System.out.println("getConfigRotateDir");
        var expResult = "configs";
        var result = instance.getConfigRotateDir();
        assertEquals(expResult, result);
    }

    /**
     * Test of getConfigRotateMax method, of class Options.
     */
    @Test
    public void testGetConfigRotateMax() {
        System.out.println("getConfigRotateMax");
        var expResult = 16;
        var result = instance.getConfigRotateMax();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCoreDir method, of class Options.
     */
    @Test
    public void testGetCoreDir() {
        System.out.println("getCoreDir");
        var expResult = "cores";
        var result = instance.getCoreDir();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCoreKey method, of class Options.
     */
    @Test
    public void testGetCoreKey() {
        System.out.println("getCoreKey");
        assertNull(instance.getCoreKey());
    }

    /**
     * Test of getCorePrep method, of class Options.
     */
    @Test
    public void testGetCorePrep() {
        System.out.println("getCorePrep");
        assertNull(instance.getCorePrep());
    }

    /**
     * Test of getCorePriority method, of class Options.
     */
    @Test
    public void testGetCorePriority() {
        System.out.println("getCorePriority");
        var expResult = "idle";
        var result = instance.getCorePriority();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCoreServer method, of class Options.
     */
    @Test
    public void testGetCoreServer() {
        System.out.println("getCoreServer");
        assertNull(instance.getCoreServer());
    }

    /**
     * Test of getCpuAffinity method, of class Options.
     */
    @Test
    public void testGetCpuAffinity() {
        System.out.println("getCpuAffinity");
        var expResult = false;
        var result = instance.getCpuAffinity();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCpuSpecies method, of class Options.
     */
    @Test
    public void testGetCpuSpecies() {
        System.out.println("getCpuSpecies");
        var expResult = "X86_PENTIUM_II";
        var result = instance.getCpuSpecies();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCpuType method, of class Options.
     */
    @Test
    public void testGetCpuType() {
        System.out.println("getCpuType");
        var expResult = "AMD64";
        var result = instance.getCpuType();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCpuUsage method, of class Options.
     */
    @Test
    public void testGetCpuUsage() {
        System.out.println("getCpuUsage");
        var expResult = 100;
        var result = instance.getCpuUsage();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCpus method, of class Options.
     */
    @Test
    public void testGetCpus() {
        System.out.println("getCpus");
        var expResult = -1;
        var result = instance.getCpus();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCudaIndex method, of class Options.
     */
    @Test
    public void testGetCudaIndex() {
        System.out.println("getCudaIndex");
        var expResult = 0;
        var result = instance.getCudaIndex();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCycleRate method, of class Options.
     */
    @Test
    public void testGetCycleRate() {
        System.out.println("getCycleRate");
        var expResult = 4;
        var result = instance.getCycleRate();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCycles method, of class Options.
     */
    @Test
    public void testGetCycles() {
        System.out.println("getCycles");
        var expResult = -1;
        var result = instance.getCycles();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDaemon method, of class Options.
     */
    @Test
    public void testGetDaemon() {
        System.out.println("getDaemon");
        var expResult = false;
        var result = instance.getDaemon();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDataDirectory method, of class Options.
     */
    @Test
    public void testGetDataDirectory() {
        System.out.println("getDataDirectory");
        var expResult = ".";
        var result = instance.getDataDirectory();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDebugSockets method, of class Options.
     */
    @Test
    public void testGetDebugSockets() {
        System.out.println("getDebugSockets");
        var expResult = false;
        var result = instance.getDebugSockets();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDumpAfterDeadline method, of class Options.
     */
    @Test
    public void testGetDumpAfterDeadline() {
        System.out.println("getDumpAfterDeadline");
        var expResult = true;
        var result = instance.getDumpAfterDeadline();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEval method, of class Options.
     */
    @Test
    public void testGetEval() {
        System.out.println("getEval");
        assertNull(instance.getEval());
    }

    /**
     * Test of getExceptionLocations method, of class Options.
     */
    @Test
    public void testGetExceptionLocations() {
        System.out.println("getExceptionLocations");
        var expResult = true;
        var result = instance.getExceptionLocations();
        assertEquals(expResult, result);
    }

    /**
     * Test of getExecDirectory method, of class Options.
     */
    @Test
    public void testGetExecDirectory() {
        System.out.println("getExecDirectory");
        var expResult = "/usr/bin";
        var result = instance.getExecDirectory();
        assertEquals(expResult, result);
    }

    /**
     * Test of getExitWhenDone method, of class Options.
     */
    @Test
    public void testGetExitWhenDone() {
        System.out.println("getExitWhenDone");
        var expResult = false;
        var result = instance.getExitWhenDone();
        assertEquals(expResult, result);
    }

    /**
     * Test of getExtraCoreArgs method, of class Options.
     */
    @Test
    public void testGetExtraCoreArgs() {
        System.out.println("getExtraCoreArgs");
        assertNull(instance.getExtraCoreArgs());
    }

    /**
     * Test of getForceWs method, of class Options.
     */
    @Test
    public void testGetForceWs() {
        System.out.println("getForceWs");
        assertNull(instance.getForceWs());
    }

    /**
     * Test of getGpu method, of class Options.
     */
    @Test
    public void testGetGpu() {
        System.out.println("getGpu");
        var expResult = false;
        var result = instance.getGpu();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGpuAssignmentServers method, of class Options.
     */
    @Test
    public void testGetGpuAssignmentServers() {
        System.out.println("getGpuAssignmentServers");
        var expResult = "assign-GPU.stanford.edu:80 assign-GPU2.stanford.edu:80";
        var result = instance.getGpuAssignmentServers();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGpuIndex method, of class Options.
     */
    @Test
    public void testGetGpuIndex() {
        System.out.println("getGpuIndex");
        assertNull(instance.getGpuIndex());
    }

    /**
     * Test of getGpuUsage method, of class Options.
     */
    @Test
    public void testGetGpuUsage() {
        System.out.println("getGpuUsage");
        var expResult = 100;
        var result = instance.getGpuUsage();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLog method, of class Options.
     */
    @Test
    public void testGetLog() {
        System.out.println("getLog");
        var expResult = "log.txt";
        var result = instance.getLog();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogColor method, of class Options.
     */
    @Test
    public void testGetLogColor() {
        System.out.println("getLogColor");
        var expResult = true;
        var result = instance.getLogColor();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogCrlf method, of class Options.
     */
    @Test
    public void testGetLogCrlf() {
        System.out.println("getLogCrlf");
        var expResult = false;
        var result = instance.getLogCrlf();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogDate method, of class Options.
     */
    @Test
    public void testGetLogDate() {
        System.out.println("getLogDate");
        var expResult = false;
        var result = instance.getLogDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogDebug method, of class Options.
     */
    @Test
    public void testGetLogDebug() {
        System.out.println("getLogDebug");
        var expResult = true;
        var result = instance.getLogDebug();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogDomain method, of class Options.
     */
    @Test
    public void testGetLogDomain() {
        System.out.println("getLogDomain");
        var expResult = false;
        var result = instance.getLogDomain();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogDomainLevels method, of class Options.
     */
    @Test
    public void testGetLogDomainLevels() {
        System.out.println("getLogDomainLevels");
        assertNull(instance.getLogDomainLevels());
    }

    /**
     * Test of getLogHeader method, of class Options.
     */
    @Test
    public void testGetLogHeader() {
        System.out.println("getLogHeader");
        var expResult = true;
        var result = instance.getLogHeader();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogLevel method, of class Options.
     */
    @Test
    public void testGetLogLevel() {
        System.out.println("getLogLevel");
        var expResult = true;
        var result = instance.getLogLevel();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogNoInfoHeader method, of class Options.
     */
    @Test
    public void testGetLogNoInfoHeader() {
        System.out.println("getLogNoInfoHeader");
        var expResult = true;
        var result = instance.getLogNoInfoHeader();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogRedirect method, of class Options.
     */
    @Test
    public void testGetLogRedirect() {
        System.out.println("getLogRedirect");
        var expResult = false;
        var result = instance.getLogRedirect();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogRotate method, of class Options.
     */
    @Test
    public void testGetLogRotate() {
        System.out.println("getLogRotate");
        var expResult = true;
        var result = instance.getLogRotate();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogRotateDir method, of class Options.
     */
    @Test
    public void testGetLogRotateDir() {
        System.out.println("getLogRotateDir");
        var expResult = "logs";
        var result = instance.getLogRotateDir();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogRotateMax method, of class Options.
     */
    @Test
    public void testGetLogRotateMax() {
        System.out.println("getLogRotateMax");
        var expResult = 16;
        var result = instance.getLogRotateMax();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogShortLevel method, of class Options.
     */
    @Test
    public void testGetLogShortLevel() {
        System.out.println("getLogShortLevel");
        var expResult = false;
        var result = instance.getLogShortLevel();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogSimpleDomains method, of class Options.
     */
    @Test
    public void testGetLogSimpleDomains() {
        System.out.println("getLogSimpleDomains");
        var expResult = true;
        var result = instance.getLogSimpleDomains();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogThreadId method, of class Options.
     */
    @Test
    public void testGetLogThreadId() {
        System.out.println("getLogThreadId");
        var expResult = false;
        var result = instance.getLogThreadId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogTime method, of class Options.
     */
    @Test
    public void testGetLogTime() {
        System.out.println("getLogTime");
        var expResult = true;
        var result = instance.getLogTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogToScreen method, of class Options.
     */
    @Test
    public void testGetLogToScreen() {
        System.out.println("getLogToScreen");
        var expResult = true;
        var result = instance.getLogToScreen();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogTruncate method, of class Options.
     */
    @Test
    public void testGetLogTruncate() {
        System.out.println("getLogTruncate");
        var expResult = false;
        var result = instance.getLogTruncate();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMachineId method, of class Options.
     */
    @Test
    public void testGetMachineId() {
        System.out.println("getMachineId");
        var expResult = 0;
        var result = instance.getMachineId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMaxDelay method, of class Options.
     */
    @Test
    public void testGetMaxDelay() {
        System.out.println("getMaxDelay");
        var expResult = 0;
        var result = instance.getMaxDelay();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMaxPacketSize method, of class Options.
     */
    @Test
    public void testGetMaxPacketSize() {
        System.out.println("getMaxPacketSize");
        var expResult = "normal";
        var result = instance.getMaxPacketSize();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMaxQueue method, of class Options.
     */
    @Test
    public void testGetMaxQueue() {
        System.out.println("getMaxQueue");
        var expResult = 16;
        var result = instance.getMaxQueue();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMaxShutdownWait method, of class Options.
     */
    @Test
    public void testGetMaxShutdownWait() {
        System.out.println("getMaxShutdownWait");
        var expResult = 60;
        var result = instance.getMaxShutdownWait();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMaxSlotErrors method, of class Options.
     */
    @Test
    public void testGetMaxSlotErrors() {
        System.out.println("getMaxSlotErrors");
        var expResult = 10;
        var result = instance.getMaxSlotErrors();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMaxUnitErrors method, of class Options.
     */
    @Test
    public void testGetMaxUnitErrors() {
        System.out.println("getMaxUnitErrors");
        var expResult = 5;
        var result = instance.getMaxUnitErrors();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMaxUnits method, of class Options.
     */
    @Test
    public void testGetMaxUnits() {
        System.out.println("getMaxUnits");
        var expResult = 0;
        var result = instance.getMaxUnits();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMemory method, of class Options.
     */
    @Test
    public void testGetMemory() {
        System.out.println("getMemory");
        assertNull(instance.getMemory());
    }

    /**
     * Test of getMinDelay method, of class Options.
     */
    @Test
    public void testGetMinDelay() {
        System.out.println("getMinDelay");
        var expResult = 0;
        var result = instance.getMinDelay();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNextUnitPercentage method, of class Options.
     */
    @Test
    public void testGetNextUnitPercentage() {
        System.out.println("getNextUnitPercentage");
        var expResult = 99;
        var result = instance.getNextUnitPercentage();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPriority method, of class Options.
     */
    @Test
    public void testGetPriority() {
        System.out.println("getPriority");
        assertNull(instance.getPriority());
    }

    /**
     * Test of getNoAssembly method, of class Options.
     */
    @Test
    public void testGetNoAssembly() {
        System.out.println("getNoAssembly");
        var expResult = false;
        var result = instance.getNoAssembly();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOpenclIndex method, of class Options.
     */
    @Test
    public void testGetOpenclIndex() {
        System.out.println("getOpenclIndex");
        var expResult = 0;
        var result = instance.getOpenclIndex();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOsSpecies method, of class Options.
     */
    @Test
    public void testGetOsSpecies() {
        System.out.println("getOsSpecies");
        var expResult = "UNKNOWN";
        var result = instance.getOsSpecies();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOsType method, of class Options.
     */
    @Test
    public void testGetOsType() {
        System.out.println("getOsType");
        var expResult = "MACOSX";
        var result = instance.getOsType();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPasskey method, of class Options.
     */
    @Test
    public void testGetPasskey() {
        System.out.println("getPasskey");
        var expResult = "passkey";
        var result = instance.getPasskey();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPassword method, of class Options.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        assertNull(instance.getPassword());
    }

    /**
     * Test of getPauseOnBattery method, of class Options.
     */
    @Test
    public void testGetPauseOnBattery() {
        System.out.println("getPauseOnBattery");
        var expResult = true;
        var result = instance.getPauseOnBattery();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPauseOnStart method, of class Options.
     */
    @Test
    public void testGetPauseOnStart() {
        System.out.println("getPauseOnStart");
        var expResult = false;
        var result = instance.getPauseOnStart();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPid method, of class Options.
     */
    @Test
    public void testGetPid() {
        System.out.println("getPid");
        var expResult = false;
        var result = instance.getPid();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPidFile method, of class Options.
     */
    @Test
    public void testGetPidFile() {
        System.out.println("getPidFile");
        var expResult = "Folding@home Client.pid";
        var result = instance.getPidFile();
        assertEquals(expResult, result);
    }

    /**
     * Test of getProjectKey method, of class Options.
     */
    @Test
    public void testGetProjectKey() {
        System.out.println("getProjectKey");
        var expResult = 0;
        var result = instance.getProjectKey();
        assertEquals(expResult, result);
    }

    /**
     * Test of getProxy method, of class Options.
     */
    @Test
    public void testGetProxy() {
        System.out.println("getProxy");
        var expResult = ":8080";
        var result = instance.getProxy();
        assertEquals(expResult, result);
    }

    /**
     * Test of getProxyEnable method, of class Options.
     */
    @Test
    public void testGetProxyEnable() {
        System.out.println("getProxyEnable");
        var expResult = false;
        var result = instance.getProxyEnable();
        assertEquals(expResult, result);
    }

    /**
     * Test of getProxyPass method, of class Options.
     */
    @Test
    public void testGetProxyPass() {
        System.out.println("getProxyPass");
        var expResult = "";
        var result = instance.getProxyPass();
        assertEquals(expResult, result);
    }

    /**
     * Test of getProxyUser method, of class Options.
     */
    @Test
    public void testGetProxyUser() {
        System.out.println("getProxyUser");
        var expResult = "";
        var result = instance.getProxyUser();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRespawn method, of class Options.
     */
    @Test
    public void testGetRespawn() {
        System.out.println("getRespawn");
        var expResult = true;
        var result = instance.getRespawn();
        assertEquals(expResult, result);
    }

    /**
     * Test of getScript method, of class Options.
     */
    @Test
    public void testGetScript() {
        System.out.println("getScript");
        assertNull(instance.getScript());
    }

    /**
     * Test of getService method, of class Options.
     */
    @Test
    public void testGetService() {
        System.out.println("getService");
        var expResult = false;
        var result = instance.getService();
        assertEquals(expResult, result);
    }

    /**
     * Test of getServiceDescription method, of class Options.
     */
    @Test
    public void testGetServiceDescription() {
        System.out.println("getServiceDescription");
        assertNull(instance.getServiceDescription());
    }

    /**
     * Test of getServiceRestart method, of class Options.
     */
    @Test
    public void testGetServiceRestart() {
        System.out.println("getServiceRestart");
        assertNull(instance.getServiceRestart());
    }

    /**
     * Test of getServiceRestartDelay method, of class Options.
     */
    @Test
    public void testGetServiceRestartDelay() {
        System.out.println("getServiceRestartDelay");
        var expResult = 0;
        var result = instance.getServiceRestartDelay();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSmp method, of class Options.
     */
    @Test
    public void testGetSmp() {
        System.out.println("getSmp");
        var expResult = true;
        var result = instance.getSmp();
        assertEquals(expResult, result);
    }

    /**
     * Test of getStackTraces method, of class Options.
     */
    @Test
    public void testGetStackTraces() {
        System.out.println("getStackTraces");
        var expResult = false;
        var result = instance.getStackTraces();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTeam method, of class Options.
     */
    @Test
    public void testGetTeam() {
        System.out.println("getTeam");
        var expResult = 39299;
        var result = instance.getTeam();
        assertEquals(expResult, result);
    }

    /**
     * Test of getThreads method, of class Options.
     */
    @Test
    public void testGetThreads() {
        System.out.println("getThreads");
        var expResult = 4;
        var result = instance.getThreads();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUser method, of class Options.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        var expResult = "montycrabapple";
        var result = instance.getUser();
        assertEquals(expResult, result);
    }

    /**
     * Test of getVerbosity method, of class Options.
     */
    @Test
    public void testGetVerbosity() {
        System.out.println("getVerbosity");
        var expResult = 3;
        var result = instance.getVerbosity();
        assertEquals(expResult, result);
    }
}
