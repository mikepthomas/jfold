package com.googlecode.jfold.model.options;

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
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.net.InetAddress;

/**
 * <p>OptionsImpl class.</p>
 *
 * @author Michael Thomas <mikepthomas@outlook.com>
 * @version $Id: $Id
 */
public class OptionsImpl implements Options, Serializable {

    @SerializedName("assignment-servers")
    private String assignmentServers;
    @SerializedName("capture-directory")
    private String captureDirectory;
    @SerializedName("capture-sockets")
    private boolean captureSockets;
    @SerializedName("checkpoint")
    private int checkpoint;
    @SerializedName("child")
    private boolean child;
    @SerializedName("client-subtype")
    private String clientSubtype;
    @SerializedName("client-type")
    private String clientType;
    @SerializedName("command-address")
    private String commandAddress;
    @SerializedName("command-allow")
    private String commandAllow;
    @SerializedName("command-allow-no-pass")
    private String commandAllowNoPass;
    @SerializedName("command-deny")
    private String commandDeny;
    @SerializedName("command-deny-no-pass")
    private String commandDenyNoPass;
    @SerializedName("command-port")
    private int commandPort;
    @SerializedName("config-rotate")
    private boolean configRotate;
    @SerializedName("config-rotate-dir")
    private String configRotateDir;
    @SerializedName("config-rotate-max")
    private int configRotateMax;
    @SerializedName("core-dir")
    private String coreDir;
    @SerializedName("core-key")
    private String coreKey;
    @SerializedName("core-prep")
    private String corePrep;
    @SerializedName("core-priority")
    private String corePriority;
    @SerializedName("core-server")
    private String coreServer;
    @SerializedName("cpu-affinity")
    private boolean cpuAffinity;
    @SerializedName("cpu-species")
    private String cpuSpecies;
    @SerializedName("cpu-type")
    private String cpuType;
    @SerializedName("cpu-usage")
    private int cpuUsage;
    @SerializedName("cpus")
    private int cpus;
    @SerializedName("cuda-index")
    private int cudaIndex;
    @SerializedName("cycle-rate")
    private int cycleRate;
    @SerializedName("cycles")
    private int cycles;
    @SerializedName("daemon")
    private boolean daemon;
    @SerializedName("data-directory")
    private String dataDirectory;
    @SerializedName("debug-sockets")
    private boolean debugSockets;
    @SerializedName("dump-after-deadline")
    private boolean dumpAfterDeadline;
    @SerializedName("eval")
    private String eval;
    @SerializedName("exception-locations")
    private boolean exceptionLocations;
    @SerializedName("exec-directory")
    private String execDirectory;
    @SerializedName("exit-when-done")
    private boolean exitWhenDone;
    @SerializedName("extra-core-args")
    private String extraCoreArgs;
    @SerializedName("force-ws")
    private boolean forceWs;
    @SerializedName("gpu")
    private boolean gpu;
    @SerializedName("gpu-assignment-servers")
    private String gpuAssignmentServers;
    @SerializedName("gpu-index")
    private String gpuIndex;
    @SerializedName("gpu-usage")
    private int gpuUsage;
    @SerializedName("log")
    private String log;
    @SerializedName("log-color")
    private boolean logColor;
    @SerializedName("log-crlf")
    private boolean logCrlf;
    @SerializedName("log-date")
    private boolean logDate;
    @SerializedName("log-debug")
    private boolean logDebug;
    @SerializedName("log-domain")
    private boolean logDomain;
    @SerializedName("log-domain-levels")
    private boolean logDomainLevels;
    @SerializedName("log-header")
    private boolean logHeader;
    @SerializedName("log-level")
    private boolean logLevel;
    @SerializedName("log-no-info-header")
    private boolean logNoInfoHeader;
    @SerializedName("log-redirect")
    private boolean logRedirect;
    @SerializedName("log-rotate")
    private boolean logRotate;
    @SerializedName("log-rotate-dir")
    private String logRotateDir;
    @SerializedName("log-rotate-max")
    private int logRotateMax;
    @SerializedName("log-short-level")
    private boolean logShortLevel;
    @SerializedName("log-simple-domains")
    private boolean logSimpleDomains;
    @SerializedName("log-thread-id")
    private boolean logThreadId;
    @SerializedName("log-time")
    private boolean logTime;
    @SerializedName("log-to-screen")
    private boolean logToScreen;
    @SerializedName("log-truncate")
    private boolean logTruncate;
    @SerializedName("machine-id")
    private int machineId;
    @SerializedName("max-delay")
    private int maxDelay;
    @SerializedName("max-packet-size")
    private String maxPacketSize;
    @SerializedName("max-queue")
    private int maxQueue;
    @SerializedName("max-shutdown-wait")
    private int maxShutdownWait;
    @SerializedName("max-slot-errors")
    private int maxSlotErrors;
    @SerializedName("max-unit-errors")
    private int maxUnitErrors;
    @SerializedName("max-units")
    private int maxUnits;
    @SerializedName("memory")
    private String memory;
    @SerializedName("min-delay")
    private int minDelay;
    @SerializedName("next-unit-percentage")
    private int nextUnitPercentage;
    @SerializedName("priority")
    private String priority;
    @SerializedName("no-assembly")
    private boolean noAssembly;
    @SerializedName("opencl-index")
    private int openclIndex;
    @SerializedName("os-species")
    private String osSpecies;
    @SerializedName("os-type")
    private String osType;
    @SerializedName("passkey")
    private String passkey;
    @SerializedName("password")
    private String password;
    @SerializedName("pause-on-battery")
    private boolean pauseOnBattery;
    @SerializedName("pause-on-start")
    private boolean pauseOnStart;
    @SerializedName("pid")
    private boolean pid;
    @SerializedName("pid-file")
    private String pidFile;
    @SerializedName("project-key")
    private int projectKey;
    @SerializedName("proxy")
    private String proxy;
    @SerializedName("proxy-enable")
    private boolean proxyEnable;
    @SerializedName("proxy-pass")
    private String proxyPass;
    @SerializedName("proxy-user")
    private String proxyUser;
    @SerializedName("respawn")
    private boolean respawn;
    @SerializedName("script")
    private String script;
    @SerializedName("service")
    private boolean service;
    @SerializedName("service-description")
    private String serviceDescription;
    @SerializedName("service-restart")
    private boolean serviceRestart;
    @SerializedName("service-restart-delay")
    private int serviceRestartDelay;
    @SerializedName("smp")
    private boolean smp;
    @SerializedName("stack-traces")
    private boolean stackTraces;
    @SerializedName("team")
    private int team;
    @SerializedName("threads")
    private int threads;
    @SerializedName("user")
    private String user;
    @SerializedName("verbosity")
    private int verbosity;

    /**
     * Default constructor.
     */
    public OptionsImpl() {
    }

    /**
     * <p>Constructor for OptionsImpl.</p>
     *
     * @param json a {@link java.lang.String} object.
     */
    public OptionsImpl(String json) {
        OptionsImpl jsonOptions = new Gson().fromJson(json, OptionsImpl.class);

        this.assignmentServers = jsonOptions.assignmentServers;
        this.captureDirectory = jsonOptions.captureDirectory;
        this.captureSockets = jsonOptions.captureSockets;
        this.checkpoint = jsonOptions.checkpoint;
        this.child = jsonOptions.child;
        this.clientSubtype = jsonOptions.clientSubtype;
        this.clientType = jsonOptions.clientType;
        this.commandAddress = jsonOptions.commandAddress;
        this.commandAllow = jsonOptions.commandAllow;
        this.commandAllowNoPass = jsonOptions.commandAllowNoPass;
        this.commandDeny = jsonOptions.commandDeny;
        this.commandDenyNoPass = jsonOptions.commandDenyNoPass;
        this.commandPort = jsonOptions.commandPort;
        this.configRotate = jsonOptions.configRotate;
        this.configRotateDir = jsonOptions.configRotateDir;
        this.configRotateMax = jsonOptions.configRotateMax;
        this.coreDir = jsonOptions.coreDir;
        this.coreKey = jsonOptions.coreKey;
        this.corePrep = jsonOptions.corePrep;
        this.corePriority = jsonOptions.corePriority;
        this.coreServer = jsonOptions.coreServer;
        this.cpuAffinity = jsonOptions.cpuAffinity;
        this.cpuSpecies = jsonOptions.cpuSpecies;
        this.cpuType = jsonOptions.cpuType;
        this.cpuUsage = jsonOptions.cpuUsage;
        this.cpus = jsonOptions.cpus;
        this.cudaIndex = jsonOptions.cudaIndex;
        this.cycleRate = jsonOptions.cycleRate;
        this.cycles = jsonOptions.cycles;
        this.daemon = jsonOptions.daemon;
        this.dataDirectory = jsonOptions.dataDirectory;
        this.debugSockets = jsonOptions.debugSockets;
        this.dumpAfterDeadline = jsonOptions.dumpAfterDeadline;
        this.eval = jsonOptions.eval;
        this.exceptionLocations = jsonOptions.exceptionLocations;
        this.execDirectory = jsonOptions.execDirectory;
        this.exitWhenDone = jsonOptions.exitWhenDone;
        this.extraCoreArgs = jsonOptions.extraCoreArgs;
        this.forceWs = jsonOptions.forceWs;
        this.gpu = jsonOptions.gpu;
        this.gpuAssignmentServers = jsonOptions.gpuAssignmentServers;
        this.gpuIndex = jsonOptions.gpuIndex;
        this.gpuUsage = jsonOptions.gpuUsage;
        this.log = jsonOptions.log;
        this.logColor = jsonOptions.logColor;
        this.logCrlf = jsonOptions.logCrlf;
        this.logDate = jsonOptions.logDate;
        this.logDebug = jsonOptions.logDebug;
        this.logDomain = jsonOptions.logDomain;
        this.logDomainLevels = jsonOptions.logDomainLevels;
        this.logHeader = jsonOptions.logHeader;
        this.logLevel = jsonOptions.logLevel;
        this.logNoInfoHeader = jsonOptions.logNoInfoHeader;
        this.logRedirect = jsonOptions.logRedirect;
        this.logRotate = jsonOptions.logRotate;
        this.logRotateDir = jsonOptions.logRotateDir;
        this.logRotateMax = jsonOptions.logRotateMax;
        this.logShortLevel = jsonOptions.logShortLevel;
        this.logSimpleDomains = jsonOptions.logSimpleDomains;
        this.logThreadId = jsonOptions.logThreadId;
        this.logTime = jsonOptions.logTime;
        this.logToScreen = jsonOptions.logToScreen;
        this.logTruncate = jsonOptions.logTruncate;
        this.machineId = jsonOptions.machineId;
        this.maxDelay = jsonOptions.maxDelay;
        this.maxPacketSize = jsonOptions.maxPacketSize;
        this.maxQueue = jsonOptions.maxQueue;
        this.maxShutdownWait = jsonOptions.maxShutdownWait;
        this.maxSlotErrors = jsonOptions.maxSlotErrors;
        this.maxUnitErrors = jsonOptions.maxUnitErrors;
        this.maxUnits = jsonOptions.maxUnits;
        this.memory = jsonOptions.memory;
        this.minDelay = jsonOptions.minDelay;
        this.nextUnitPercentage = jsonOptions.nextUnitPercentage;
        this.priority = jsonOptions.priority;
        this.noAssembly = jsonOptions.noAssembly;
        this.openclIndex = jsonOptions.openclIndex;
        this.osSpecies = jsonOptions.osSpecies;
        this.osType = jsonOptions.osType;
        this.passkey = jsonOptions.passkey;
        this.password = jsonOptions.password;
        this.pauseOnBattery = jsonOptions.pauseOnBattery;
        this.pauseOnStart = jsonOptions.pauseOnStart;
        this.pid = jsonOptions.pid;
        this.pidFile = jsonOptions.pidFile;
        this.projectKey = jsonOptions.projectKey;
        this.proxy = jsonOptions.proxy;
        this.proxyEnable = jsonOptions.proxyEnable;
        this.proxyPass = jsonOptions.proxyPass;
        this.proxyUser = jsonOptions.proxyUser;
        this.respawn = jsonOptions.respawn;
        this.script = jsonOptions.script;
        this.service = jsonOptions.service;
        this.serviceDescription = jsonOptions.serviceDescription;
        this.serviceRestart = jsonOptions.serviceRestart;
        this.serviceRestartDelay = jsonOptions.serviceRestartDelay;
        this.smp = jsonOptions.smp;
        this.stackTraces = jsonOptions.stackTraces;
        this.team = jsonOptions.team;
        this.threads = jsonOptions.threads;
        this.user = jsonOptions.user;
        this.verbosity = jsonOptions.verbosity;
    }

    /** {@inheritDoc} */
    @Override
    public String getAssignmentServers() {
        return assignmentServers;
    }

    /** {@inheritDoc} */
    @Override
    public String getCaptureDirectory() {
        return captureDirectory;
    }

    /** {@inheritDoc} */
    @Override
    public boolean getCaptureSockets() {
        return captureSockets;
    }

    /** {@inheritDoc} */
    @Override
    public int getCheckpoint() {
        return checkpoint;
    }

    /** {@inheritDoc} */
    @Override
    public boolean getChild() {
        return child;
    }

    /** {@inheritDoc} */
    @Override
    public String getClientSubtype() {
        return clientSubtype;
    }

    /** {@inheritDoc} */
    @Override
    public String getClientType() {
        return clientType;
    }

    /** {@inheritDoc} */
    @Override
    public InetAddress getCommandAddress() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public InetAddress getCommandAllow() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public InetAddress getCommandAllowNoPass() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public InetAddress getCommandDeny() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public InetAddress getCommandDenyNoPass() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public int getCommandPort() {
        return commandPort;
    }

    /** {@inheritDoc} */
    @Override
    public boolean getConfigRotate() {
        return configRotate;
    }

    /** {@inheritDoc} */
    @Override
    public String getConfigRotateDir() {
        return configRotateDir;
    }

    /** {@inheritDoc} */
    @Override
    public int getConfigRotateMax() {
        return configRotateMax;
    }

    /** {@inheritDoc} */
    @Override
    public String getCoreDir() {
        return coreDir;
    }

    /** {@inheritDoc} */
    @Override
    public String getCoreKey() {
        return coreKey;
    }

    /** {@inheritDoc} */
    @Override
    public String getCorePrep() {
        return corePrep;
    }

    /** {@inheritDoc} */
    @Override
    public String getCorePriority() {
        return corePriority;
    }

    /** {@inheritDoc} */
    @Override
    public InetAddress getCoreServer() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public boolean getCpuAffinity() {
        return cpuAffinity;
    }

    /** {@inheritDoc} */
    @Override
    public String getCpuSpecies() {
        return cpuSpecies;
    }

    /** {@inheritDoc} */
    @Override
    public String getCpuType() {
        return cpuType;
    }

    /** {@inheritDoc} */
    @Override
    public int getCpuUsage() {
        return cpuUsage;
    }

    /** {@inheritDoc} */
    @Override
    public int getCpus() {
        return cpus;
    }

    /** {@inheritDoc} */
    @Override
    public int getCudaIndex() {
        return cudaIndex;
    }

    /** {@inheritDoc} */
    @Override
    public int getCycleRate() {
        return cycleRate;
    }

    /** {@inheritDoc} */
    @Override
    public int getCycles() {
        return cycles;
    }

    /** {@inheritDoc} */
    @Override
    public boolean getDaemon() {
        return daemon;
    }

    /** {@inheritDoc} */
    @Override
    public String getDataDirectory() {
        return dataDirectory;
    }

    /** {@inheritDoc} */
    @Override
    public boolean getDebugSockets() {
        return debugSockets;
    }

    /** {@inheritDoc} */
    @Override
    public boolean getDumpAfterDeadline() {
        return dumpAfterDeadline;
    }

    /** {@inheritDoc} */
    @Override
    public String getEval() {
        return eval;
    }

    /** {@inheritDoc} */
    @Override
    public boolean getExceptionLocations() {
        return exceptionLocations;
    }

    /** {@inheritDoc} */
    @Override
    public String getExecDirectory() {
        return execDirectory;
    }

    /** {@inheritDoc} */
    @Override
    public boolean getExitWhenDone() {
        return exitWhenDone;
    }

    /** {@inheritDoc} */
    @Override
    public String getExtraCoreArgs() {
        return extraCoreArgs;
    }

    /** {@inheritDoc} */
    @Override
    public boolean getForceWs() {
        return forceWs;
    }

    /** {@inheritDoc} */
    @Override
    public boolean getGpu() {
        return gpu;
    }

    /** {@inheritDoc} */
    @Override
    public String getGpuAssignmentServers() {
        return assignmentServers;
    }

    /** {@inheritDoc} */
    @Override
    public String getGpuIndex() {
        return gpuIndex;
    }

    /** {@inheritDoc} */
    @Override
    public int getGpuUsage() {
        return gpuUsage;
    }

    /** {@inheritDoc} */
    @Override
    public String getLog() {
        return log;
    }

    /** {@inheritDoc} */
    @Override
    public boolean getLogColor() {
        return logColor;
    }

    /** {@inheritDoc} */
    @Override
    public boolean getLogCrlf() {
        return logCrlf;
    }

    /** {@inheritDoc} */
    @Override
    public boolean getLogDate() {
        return logDate;
    }

    /** {@inheritDoc} */
    @Override
    public boolean getLogDebug() {
        return logDebug;
    }

    /** {@inheritDoc} */
    @Override
    public boolean getLogDomain() {
        return logDomain;
    }

    /** {@inheritDoc} */
    @Override
    public boolean getLogDomainLevels() {
        return logDomainLevels;
    }

    /** {@inheritDoc} */
    @Override
    public boolean getLogHeader() {
        return logHeader;
    }

    /** {@inheritDoc} */
    @Override
    public boolean getLogLevel() {
        return logLevel;
    }

    /** {@inheritDoc} */
    @Override
    public boolean getLogNoInfoHeader() {
        return logNoInfoHeader;
    }

    /** {@inheritDoc} */
    @Override
    public boolean getLogRedirect() {
        return logRedirect;
    }

    /** {@inheritDoc} */
    @Override
    public boolean getLogRotate() {
        return logRotate;
    }

    /** {@inheritDoc} */
    @Override
    public String getLogRotateDir() {
        return logRotateDir;
    }

    /** {@inheritDoc} */
    @Override
    public int getLogRotateMax() {
        return logRotateMax;
    }

    /** {@inheritDoc} */
    @Override
    public boolean getLogShortLevel() {
        return logShortLevel;
    }

    /** {@inheritDoc} */
    @Override
    public boolean getLogSimpleDomains() {
        return logSimpleDomains;
    }

    /** {@inheritDoc} */
    @Override
    public boolean getLogThreadId() {
        return logThreadId;
    }

    /** {@inheritDoc} */
    @Override
    public boolean getLogTime() {
        return logTime;
    }

    /** {@inheritDoc} */
    @Override
    public boolean getLogToScreen() {
        return logToScreen;
    }

    /** {@inheritDoc} */
    @Override
    public boolean getLogTruncate() {
        return logTruncate;
    }

    /** {@inheritDoc} */
    @Override
    public int getMachineId() {
        return machineId;
    }

    /** {@inheritDoc} */
    @Override
    public int getMaxDelay() {
        return maxDelay;
    }

    /** {@inheritDoc} */
    @Override
    public String getMaxPacketSize() {
        return maxPacketSize;
    }

    /** {@inheritDoc} */
    @Override
    public int getMaxQueue() {
        return maxQueue;
    }

    /** {@inheritDoc} */
    @Override
    public int getMaxShutdownWait() {
        return maxShutdownWait;
    }

    /** {@inheritDoc} */
    @Override
    public int getMaxSlotErrors() {
        return maxSlotErrors;
    }

    /** {@inheritDoc} */
    @Override
    public int getMaxUnitErrors() {
        return maxUnitErrors;
    }

    /** {@inheritDoc} */
    @Override
    public int getMaxUnits() {
        return maxUnits;
    }

    /** {@inheritDoc} */
    @Override
    public String getMemory() {
        return memory;
    }

    /** {@inheritDoc} */
    @Override
    public int getMinDelay() {
        return minDelay;
    }

    /** {@inheritDoc} */
    @Override
    public int getNextUnitPercentage() {
        return nextUnitPercentage;
    }

    /** {@inheritDoc} */
    @Override
    public String getPriority() {
        return priority;
    }

    /** {@inheritDoc} */
    @Override
    public boolean getNoAssembly() {
        return noAssembly;
    }

    /** {@inheritDoc} */
    @Override
    public int getOpenclIndex() {
        return openclIndex;
    }

    /** {@inheritDoc} */
    @Override
    public String getOsSpecies() {
        return osSpecies;
    }

    /** {@inheritDoc} */
    @Override
    public String getOsType() {
        return osType;
    }

    /** {@inheritDoc} */
    @Override
    public String getPasskey() {
        return passkey;
    }

    /** {@inheritDoc} */
    @Override
    public String getPassword() {
        return password;
    }

    /** {@inheritDoc} */
    @Override
    public boolean getPauseOnBattery() {
        return pauseOnBattery;
    }

    /** {@inheritDoc} */
    @Override
    public boolean getPauseOnStart() {
        return pauseOnStart;
    }

    /** {@inheritDoc} */
    @Override
    public boolean getPid() {
        return pid;
    }

    /** {@inheritDoc} */
    @Override
    public String getPidFile() {
        return pidFile;
    }

    /** {@inheritDoc} */
    @Override
    public int getProjectKey() {
        return projectKey;
    }

    /** {@inheritDoc} */
    @Override
    public InetAddress getProxy() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** {@inheritDoc} */
    @Override
    public boolean getProxyEnable() {
        return proxyEnable;
    }

    /** {@inheritDoc} */
    @Override
    public String getProxyPass() {
        return proxyPass;
    }

    /** {@inheritDoc} */
    @Override
    public String getProxyUser() {
        return proxyUser;
    }

    /** {@inheritDoc} */
    @Override
    public boolean getRespawn() {
        return respawn;
    }

    /** {@inheritDoc} */
    @Override
    public String getScript() {
        return script;
    }

    /** {@inheritDoc} */
    @Override
    public boolean getService() {
        return service;
    }

    /** {@inheritDoc} */
    @Override
    public String getServiceDescription() {
        return serviceDescription;
    }

    /** {@inheritDoc} */
    @Override
    public boolean getServiceRestart() {
        return serviceRestart;
    }

    /** {@inheritDoc} */
    @Override
    public int getServiceRestartDelay() {
        return serviceRestartDelay;
    }

    /** {@inheritDoc} */
    @Override
    public boolean getSmp() {
        return smp;
    }

    /** {@inheritDoc} */
    @Override
    public boolean getStackTraces() {
        return stackTraces;
    }

    /** {@inheritDoc} */
    @Override
    public int getTeam() {
        return team;
    }

    /** {@inheritDoc} */
    @Override
    public int getThreads() {
        return threads;
    }

    /** {@inheritDoc} */
    @Override
    public String getUser() {
        return user;
    }

    /** {@inheritDoc} */
    @Override
    public int getVerbosity() {
        return verbosity;
    }
}
