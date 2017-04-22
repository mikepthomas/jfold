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
package info.mikethomas.jfold.options;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * <p>Options class.</p>
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version 7.4.4
 */
@XmlRootElement(name = "options")
public class Options implements Serializable {
// <editor-fold defaultstate="collapsed" desc="Member Variables">
    @XmlElement(name = "allow")
    private String allow;
    @XmlElement(name = "assignment-servers")
    private String assignmentServers;
    @XmlElement(name = "auth-as")
    private boolean authAs;
    @XmlElement(name = "capture-directory")
    private String captureDirectory;
    @XmlElement(name = "capture-on-error")
    private boolean captureOnError;
    @XmlElement(name = "capture-packets")
    private boolean capturePackets;
    @XmlElement(name = "capture-requests")
    private boolean captureRequests;
    @XmlElement(name = "capture-responses")
    private boolean captureResponses;
    @XmlElement(name = "capture-sockets")
    private boolean captureSockets;
    @XmlElement(name = "cause")
    private String cause;
    @XmlElement(name = "certificate-file")
    private String certificateFile;
    @XmlElement(name = "checkpoint")
    private int checkpoint;
    @XmlElement(name = "child")
    private boolean child;
    @XmlElement(name = "client-subtype")
    private String clientSubtype;
    @XmlElement(name = "client-threads")
    private int clientThreads;
    @XmlElement(name = "client-type")
    private String clientType;
    @XmlElement(name = "command-address")
    private String commandAddress;
    /**
     * @deprecated
     */
    @XmlElement(name = "command-allow")
    private String commandAllow;
    @XmlElement(name = "command-allow-no-pass")
    private String commandAllowNoPass;
    /**
     * @deprecated
     */
    @XmlElement(name = "command-deny")
    private String commandDeny;
    @XmlElement(name = "deny")
    private String deny;
    @XmlElement(name = "command-deny-no-pass")
    private String commandDenyNoPass;
    @XmlElement(name = "command-enable")
    private boolean commandEnable;
    @XmlElement(name = "command-port")
    private int commandPort;
    @XmlElement(name = "config-rotate")
    private boolean configRotate;
    @XmlElement(name = "config-rotate-dir")
    private String configRotateDir;
    @XmlElement(name = "config-rotate-max")
    private int configRotateMax;
    @XmlElement(name = "connection-timeout")
    private int connectionTimeout;
    @XmlElement(name = "core-dir")
    private String coreDir;
    @XmlElement(name = "core-exec")
    private String coreExec;
    @XmlElement(name = "core-key")
    private String coreKey;
    @XmlElement(name = "core-prep")
    private String corePrep;
    @XmlElement(name = "core-priority")
    private String corePriority;
    @XmlElement(name = "core-server")
    private String coreServer;
    @XmlElement(name = "core-wrapper-exec")
    private String coreWrapperExec;
    @XmlElement(name = "cpu-affinity")
    private boolean cpuAffinity;
    @XmlElement(name = "cpu-species")
    private String cpuSpecies;
    @XmlElement(name = "cpu-type")
    private String cpuType;
    @XmlElement(name = "cpu-usage")
    private int cpuUsage;
    @XmlElement(name = "cpus")
    private int cpus;
    @XmlElement(name = "crl-file")
    private String crlFile;
    @XmlElement(name = "cuda-index")
    private int cudaIndex;
    @XmlElement(name = "cycle-rate")
    private int cycleRate;
    @XmlElement(name = "cycles")
    private int cycles;
    @XmlElement(name = "daemon")
    private boolean daemon;
    @XmlElement(name = "data-directory")
    private String dataDirectory;
    @XmlElement(name = "debug-sockets")
    private boolean debugSockets;
    @XmlElement(name = "disable-sleep-when-active")
    private boolean disableSleepWhenActive;
    @XmlElement(name = "dump-after-deadline")
    private boolean dumpAfterDeadline;
    @XmlElement(name = "eval")
    private String eval;
    @XmlElement(name = "exception-locations")
    private boolean exceptionLocations;
    @XmlElement(name = "exec-directory")
    private String execDirectory;
    @XmlElement(name = "exit-when-done")
    private boolean exitWhenDone;
    @XmlElement(name = "extra-core-args")
    private String extraCoreArgs;
    @XmlElement(name = "fold-anon")
    private boolean foldAnon;
    @XmlElement(name = "force-ws")
    private boolean forceWs;
    @XmlElement(name = "fork")
    private boolean fork;
    @XmlElement(name = "gpu")
    private boolean gpu;
    @XmlElement(name = "gpu-assignment-servers")
    private String gpuAssignmentServers;
    @XmlElement(name = "gpu-index")
    private String gpuIndex;
    @XmlElement(name = "gpu-usage")
    private int gpuUsage;
    @XmlElement(name = "http-addresses")
    private String httpAddresses;
    @XmlElement(name = "https-addresses")
    private String httpsAddresses;
    @XmlElement(name = "idle")
    private boolean idle;
    @XmlElement(name = "log")
    private String log;
    @XmlElement(name = "log-color")
    private boolean logColor;
    @XmlElement(name = "log-crlf")
    private boolean logCrlf;
    @XmlElement(name = "log-date")
    private boolean logDate;
    @XmlElement(name = "log-date-periodically")
    private int logDatePeriodically;
    @XmlElement(name = "log-debug")
    private boolean logDebug;
    @XmlElement(name = "log-domain")
    private boolean logDomain;
    @XmlElement(name = "log-domain-levels")
    private boolean logDomainLevels;
    @XmlElement(name = "log-header")
    private boolean logHeader;
    @XmlElement(name = "log-level")
    private boolean logLevel;
    @XmlElement(name = "log-no-info-header")
    private boolean logNoInfoHeader;
    @XmlElement(name = "log-redirect")
    private boolean logRedirect;
    @XmlElement(name = "log-rotate")
    private boolean logRotate;
    @XmlElement(name = "log-rotate-dir")
    private String logRotateDir;
    @XmlElement(name = "log-rotate-max")
    private int logRotateMax;
    @XmlElement(name = "log-short-level")
    private boolean logShortLevel;
    @XmlElement(name = "log-simple-domains")
    private boolean logSimpleDomains;
    @XmlElement(name = "log-thread-id")
    private boolean logThreadId;
    @XmlElement(name = "log-thread-prefix")
    private boolean logThreadPrefix;
    @XmlElement(name = "log-time")
    private boolean logTime;
    @XmlElement(name = "log-to-screen")
    private boolean logToScreen;
    @XmlElement(name = "log-truncate")
    private boolean logTruncate;
    @XmlElement(name = "machine-id")
    private int machineId;
    /**
     * @deprecated
     */
    @XmlElement(name = "max-delay")
    private int maxDelay;
    @XmlElement(name = "max-connect-time")
    private int maxConnectTime;
    @XmlElement(name = "max-connections")
    private int maxConnections;
    @XmlElement(name = "max-packet-size")
    private String maxPacketSize;
    @XmlElement(name = "max-queue")
    private int maxQueue;
    @XmlElement(name = "max-request-length")
    private int maxRequestLength;
    @XmlElement(name = "max-shutdown-wait")
    private int maxShutdownWait;
    @XmlElement(name = "max-slot-errors")
    private int maxSlotErrors;
    @XmlElement(name = "max-unit-errors")
    private int maxUnitErrors;
    @XmlElement(name = "max-units")
    private int maxUnits;
    @XmlElement(name = "memory")
    private String memory;
    /**
     * @deprecated
     */
    @XmlElement(name = "min-delay")
    private int minDelay;
    @XmlElement(name = "min-connect-time")
    private int minConnectTime;
    @XmlElement(name = "next-unit-percentage")
    private int nextUnitPercentage;
    @XmlElement(name = "priority")
    private String priority;
    @XmlElement(name = "no-assembly")
    private boolean noAssembly;
    @XmlElement(name = "open-web-control")
    private boolean openWebControl;
    @XmlElement(name = "opencl-index")
    private int openclIndex;
    @XmlElement(name = "os-species")
    private String osSpecies;
    @XmlElement(name = "os-type")
    private String osType;
    @XmlElement(name = "passkey")
    private String passkey;
    @XmlElement(name = "password")
    private String password;
    @XmlElement(name = "pause-on-battery")
    private boolean pauseOnBattery;
    @XmlElement(name = "pause-on-start")
    private boolean pauseOnStart;
    @XmlElement(name = "paused")
    private boolean paused;
    @XmlElement(name = "pid")
    private boolean pid;
    @XmlElement(name = "pid-file")
    private String pidFile;
    @XmlElement(name = "power")
    private String power;
    @XmlElement(name = "private-key-file")
    private String privateKeyFile;
    @XmlElement(name = "project-key")
    private int projectKey;
    /**
     * Proxy server address.
     */
    @XmlElement(name = "proxy")
    private String proxy;
    @XmlElement(name = "proxy-enable")
    private boolean proxyEnable;
    @XmlElement(name = "proxy-pass")
    private String proxyPass;
    @XmlElement(name = "proxy-user")
    private String proxyUser;
    @XmlElement(name = "respawn")
    private boolean respawn;
    @XmlElement(name = "run-as")
    private String runAs;
    @XmlElement(name = "script")
    private String script;
    @XmlElement(name = "service")
    private boolean service;
    /**
     * @deprecated
     */
    @XmlElement(name = "service-description")
    private String serviceDescription;
    /**
     * @deprecated
     */
    @XmlElement(name = "service-restart")
    private boolean serviceRestart;
    @XmlElement(name = "service-restart-delay")
    /**
     * @deprecated
     */
    private int serviceRestartDelay;
    @XmlElement(name = "session-cookie")
    private String sessionCookie;
    @XmlElement(name = "session-lifetime")
    private int sessionLifetime;
    @XmlElement(name = "session-timeout")
    private int sessionTimeout;
    @XmlElement(name = "smp")
    private boolean smp;
    @XmlElement(name = "stack-traces")
    private boolean stackTraces;
    @XmlElement(name = "stall-detection-enabled")
    private boolean stallDetectionEnabled;
    @XmlElement(name = "stall-percent")
    private int stallPercent;
    @XmlElement(name = "stall-timeout")
    private int stallTimeout;
    @XmlElement(name = "team")
    private int team;
    @XmlElement(name = "threads")
    private int threads;
    @XmlElement(name = "user")
    private String user;
    @XmlElement(name = "verbosity")
    private int verbosity;
    @XmlElement(name = "web-allow")
    private String webAllow;
    @XmlElement(name = "web-deny")
    private String webDeny;
    @XmlElement(name = "web-enable")
    private boolean webEnable;
// </editor-fold>

// <editor-fold desc="Accessors">
    /**
     * Get the value of <code>allow</code>.
     *
     * @return the <code>allow</code> from <code>options</code>
     */
    public final String getAllow() {
        return allow;
    }

    /**
     * Get the value of <code>assignment-servers</code>.
     *
     * @return the <code>assignment-servers</code> from <code>options</code>
     */
    public final String getAssignmentServers() {
        return assignmentServers;
    }

    /**
     * Get the value of <code>auth-as</code>.
     *
     * @return the <code>auth-as</code> from <code>options</code>
     */
    public final boolean getAuthAs() {
        return authAs;
    }

    /**
     * Get the value of <code>capture-directory</code>.
     *
     * @return the <code>capture-directory</code> from <code>options</code>
     */
    public final String getCaptureDirectory() {
        return captureDirectory;
    }

    /**
     * Get the value of <code>capture-on-error</code>.
     *
     * @return the <code>capture-on-error</code> from <code>options</code>
     */
    public final boolean getCaptureOnError() {
        return captureOnError;
    }

    /**
     * Get the value of <code>capture-packets</code>.
     *
     * @return the <code>capture-packets</code> from <code>options</code>
     */
    public final boolean getCapturePackets() {
        return capturePackets;
    }

    /**
     * Get the value of <code>capture-requests</code>.
     *
     * @return the <code>capture-requests</code> from <code>options</code>
     */
    public final boolean getCaptureRequests() {
        return captureRequests;
    }

    /**
     * Get the value of <code>capture-responses</code>.
     *
     * @return the <code>capture-responses</code> from <code>options</code>
     */
    public final boolean getCaptureResponses() {
        return captureResponses;
    }

    /**
     * Get the value of <code>capture-sockets</code>.
     *
     * @return the <code>capture-sockets</code> from <code>options</code>
     */
    public final boolean getCaptureSockets() {
        return captureSockets;
    }

    /**
     * Get the value of <code>cause</code>.
     *
     * @return the <code>cause</code> from <code>options</code>
     */
    public final String getCause() {
        return cause;
    }

    /**
     * Get the value of <code>certificate-file</code>.
     *
     * @return the <code>certificate-file</code> from <code>options</code>
     */
    public final String getCertificateFile() {
        return certificateFile;
    }

    /**
     * Get the value of <code>checkpoint</code>.
     *
     * @return the <code>checkpoint</code> from <code>options</code>
     */
    public final int getCheckpoint() {
        return checkpoint;
    }

    /**
     * Get the value of <code>child</code>.
     *
     * @return the <code>child</code> from <code>options</code>
     */
    public final boolean getChild() {
        return child;
    }

    /**
     * Get the value of <code>client-subtype</code>.
     *
     * @return the <code>client-subtype</code> from <code>options</code>
     */
    public final String getClientSubtype() {
        return clientSubtype;
    }

    /**
     * Get the value of <code>client-threads</code>.
     *
     * @return the <code>client-threads</code> from <code>options</code>
     */
    public final int getClientThreads() {
        return clientThreads;
    }

    /**
     * Get the value of <code>client-type</code>.
     *
     * @return the <code>client-type</code> from <code>options</code>
     */
    public final String getClientType() {
        return clientType;
    }

    /**
     * Get the value of <code>command-address</code>.
     *
     * @return the <code>command-address</code> from <code>options</code>
     */
    public final String getCommandAddress() {
        return commandAddress;
    }

    /**
     * Get the value of <code>command-allow</code>.
     *
     * @return the <code>command-allow</code> from <code>options</code>
     */
    public final String getCommandAllow() {
        return commandAllow;
    }

    /**
     * Get the value of <code>command-allow-no-pass</code>.
     *
     * @return the <code>command-allow-no-pass</code> from <code>options</code>
     */
    public final String getCommandAllowNoPass() {
        return commandAllowNoPass;
    }

    /**
     * Get the value of <code>command-deny</code>.
     *
     * @return the <code>command-deny</code> from <code>options</code>
     */
    public final String getCommandDeny() {
        return commandDeny;
    }

    /**
     * Get the value of <code>command-deny-no-pass</code>.
     *
     * @return the <code>command-deny-no-pass</code> from <code>options</code>
     */
    public final String getCommandDenyNoPass() {
        return commandDenyNoPass;
    }

    /**
     * Get the value of <code>command-port</code>.
     *
     * @return the <code>command-port</code> from <code>options</code>
     */
    public final int getCommandPort() {
        return commandPort;
    }

    /**
     * Get the value of <code>config-rotate</code>.
     *
     * @return the <code>config-rotate</code> from <code>options</code>
     */
    public final boolean getConfigRotate() {
        return configRotate;
    }

    /**
     * Get the value of <code>config-rotate-dir</code>.
     *
     * @return the <code>config-rotate-dir</code> from <code>options</code>
     */
    public final String getConfigRotateDir() {
        return configRotateDir;
    }

    /**
     * Get the value of <code>config-rotate-max</code>.
     *
     * @return the <code>config-rotate-max</code> from <code>options</code>
     */
    public final int getConfigRotateMax() {
        return configRotateMax;
    }

    /**
     * Get the value of <code>core-dir</code>.
     *
     * @return the <code>core-dir</code> from <code>options</code>
     */
    public final String getCoreDir() {
        return coreDir;
    }

    /**
     * Get the value of <code>core-key</code>.
     *
     * @return the <code>core-key</code> from <code>options</code>
     */
    public final String getCoreKey() {
        return coreKey;
    }

    /**
     * Get the value of <code>core-prep</code>.
     *
     * @return the <code>core-prep</code> from <code>options</code>
     */
    public final String getCorePrep() {
        return corePrep;
    }

    /**
     * Get the value of <code>core-priority</code>.
     *
     * @return the <code>core-priority</code> from <code>options</code>
     */
    public final String getCorePriority() {
        return corePriority;
    }

    /**
     * Get the value of <code>core-server</code>.
     *
     * @return the <code>core-server</code> from <code>options</code>
     */
    public final String getCoreServer() {
        return coreServer;
    }

    /**
     * Get the value of <code>cpu-affinity</code>.
     *
     * @return the <code>cpu-affinity</code> from <code>options</code>
     */
    public final boolean getCpuAffinity() {
        return cpuAffinity;
    }

    /**
     * Get the value of <code>cpu-species</code>.
     *
     * @return the <code>cpu-species</code> from <code>options</code>
     */
    public final String getCpuSpecies() {
        return cpuSpecies;
    }

    /**
     * Get the value of <code>cpu-type</code>.
     *
     * @return the <code>cpu-type</code> from <code>options</code>
     */
    public final String getCpuType() {
        return cpuType;
    }

    /**
     * Get the value of <code>cpu-usage</code>.
     *
     * @return the <code>cpu-usage</code> from <code>options</code>
     */
    public final int getCpuUsage() {
        return cpuUsage;
    }

    /**
     * Get the value of <code>cpus</code>.
     *
     * @return the <code>cpus</code> from <code>options</code>
     */
    public final int getCpus() {
        return cpus;
    }

    /**
     * Get the value of <code>cuda-index</code>.
     *
     * @return the <code>cuda-index</code> from <code>options</code>
     */
    public final int getCudaIndex() {
        return cudaIndex;
    }

    /**
     * Get the value of <code>cycle-rate</code>.
     *
     * @return the <code>cycle-rate</code> from <code>options</code>
     */
    public final int getCycleRate() {
        return cycleRate;
    }

    /**
     * Get the value of <code>cycles</code>.
     *
     * @return the <code>cycles</code> from <code>options</code>
     */
    public final int getCycles() {
        return cycles;
    }

    /**
     * Get the value of <code>daemon</code>.
     *
     * @return the <code>daemon</code> from <code>options</code>
     */
    public final boolean getDaemon() {
        return daemon;
    }

    /**
     * Get the value of <code>data-directory</code>.
     *
     * @return the <code>data-directory</code> from <code>options</code>
     */
    public final String getDataDirectory() {
        return dataDirectory;
    }

    /**
     * Get the value of <code>debug-sockets</code>.
     *
     * @return the <code>debug-sockets</code> from <code>options</code>
     */
    public final boolean getDebugSockets() {
        return debugSockets;
    }

    /**
     * Get the value of <code>dump-after-deadline</code>.
     *
     * @return the <code>dump-after-deadline</code> from <code>options</code>
     */
    public final boolean getDumpAfterDeadline() {
        return dumpAfterDeadline;
    }

    /**
     * Get the value of <code>eval</code>.
     *
     * @return the <code>eval</code> from <code>options</code>
     */
    public final String getEval() {
        return eval;
    }

    /**
     * Get the value of <code>exception-locations</code>.
     *
     * @return the <code>exception-locations</code> from <code>options</code>
     */
    public final boolean getExceptionLocations() {
        return exceptionLocations;
    }

    /**
     * Get the value of <code>exec-directory</code>.
     *
     * @return the <code>exec-directory</code> from <code>options</code>
     */
    public final String getExecDirectory() {
        return execDirectory;
    }

    /**
     * Get the value of <code>exit-when-done</code>.
     *
     * @return the <code>exit-when-done</code> from <code>options</code>
     */
    public final boolean getExitWhenDone() {
        return exitWhenDone;
    }

    /**
     * Get the value of <code>extra-core-args</code>.
     *
     * @return the <code>extra-core-args</code> from <code>options</code>
     */
    public final String getExtraCoreArgs() {
        return extraCoreArgs;
    }

    /**
     * Get the value of <code>force-ws</code>.
     *
     * @return the <code>force-ws</code> from <code>options</code>
     */
    public final boolean getForceWs() {
        return forceWs;
    }

    /**
     * Get the value of <code>gpu</code>.
     *
     * @return the <code>gpu</code> from <code>options</code>
     */
    public final boolean getGpu() {
        return gpu;
    }

    /**
     * Get the value of <code>gpu-assignment-servers</code>.
     *
     * @return the <code>gpu-assignment-servers</code> from <code>options</code>
     */
    public final String getGpuAssignmentServers() {
        return assignmentServers;
    }

    /**
     * Get the value of <code>gpu-index</code>.
     *
     * @return the <code>gpu-index</code> from <code>options</code>
     */
    public final String getGpuIndex() {
        return gpuIndex;
    }

    /**
     * Get the value of <code>gpu-usage</code>.
     *
     * @return the <code>gpu-usage</code> from <code>options</code>
     */
    public final int getGpuUsage() {
        return gpuUsage;
    }

    /**
     * Get the value of <code>log</code>.
     *
     * @return the <code>log</code> from <code>options</code>
     */
    public final String getLog() {
        return log;
    }

    /**
     * Get the value of <code>log-color</code>.
     *
     * @return the <code>log-color</code> from <code>options</code>
     */
    public final boolean getLogColor() {
        return logColor;
    }

    /**
     * Get the value of <code>log-crlf</code>.
     *
     * @return the <code>log-crlf</code> from <code>options</code>
     */
    public final boolean getLogCrlf() {
        return logCrlf;
    }

    /**
     * Get the value of <code>log-date</code>.
     *
     * @return the <code>log-date</code> from <code>options</code>
     */
    public final boolean getLogDate() {
        return logDate;
    }

    /**
     * Get the value of <code>log-debug</code>.
     *
     * @return the <code>log-debug</code> from <code>options</code>
     */
    public final boolean getLogDebug() {
        return logDebug;
    }

    /**
     * Get the value of <code>log-domain</code>.
     *
     * @return the <code>log-domain</code> from <code>options</code>
     */
    public final boolean getLogDomain() {
        return logDomain;
    }

    /**
     * Get the value of <code>log-domain-levels</code>.
     *
     * @return the <code>log-domain-levels</code> from <code>options</code>
     */
    public final boolean getLogDomainLevels() {
        return logDomainLevels;
    }

    /**
     * Get the value of <code>log-header</code>.
     *
     * @return the <code>log-header</code> from <code>options</code>
     */
    public final boolean getLogHeader() {
        return logHeader;
    }

    /**
     * Get the value of <code>log-level</code>.
     *
     * @return the <code>log-level</code> from <code>options</code>
     */
    public final boolean getLogLevel() {
        return logLevel;
    }

    /**
     * Get the value of <code>log-no-info-header</code>.
     *
     * @return the <code>log-no-info-header</code> from <code>options</code>
     */
    public final boolean getLogNoInfoHeader() {
        return logNoInfoHeader;
    }

    /**
     * Get the value of <code>log-redirect</code>.
     *
     * @return the <code>log-redirect</code> from <code>options</code>
     */
    public final boolean getLogRedirect() {
        return logRedirect;
    }

    /**
     * Get the value of <code>log-rotate</code>.
     *
     * @return the <code>log-rotate</code> from <code>options</code>
     */
    public final boolean getLogRotate() {
        return logRotate;
    }

    /**
     * Get the value of <code>log-rotate-dir</code>.
     *
     * @return the <code>log-rotate-dir</code> from <code>options</code>
     */
    public final String getLogRotateDir() {
        return logRotateDir;
    }

    /**
     * Get the value of <code>log-rotate-max</code>.
     *
     * @return the <code>log-rotate-max</code> from <code>options</code>
     */
    public final int getLogRotateMax() {
        return logRotateMax;
    }

    /**
     * Get the value of <code>log-short-level</code>.
     *
     * @return the <code>log-short-level</code> from <code>options</code>
     */
    public final boolean getLogShortLevel() {
        return logShortLevel;
    }

    /**
     * Get the value of <code>log-simple-domains</code>.
     *
     * @return the <code>log-simple-domains</code> from <code>options</code>
     */
    public final boolean getLogSimpleDomains() {
        return logSimpleDomains;
    }

    /**
     * Get the value of <code>log-thread-id</code>.
     *
     * @return the <code>log-thread-id</code> from <code>options</code>
     */
    public final boolean getLogThreadId() {
        return logThreadId;
    }

    /**
     * Get the value of <code>log-time</code>.
     *
     * @return the <code>log-time</code> from <code>options</code>
     */
    public final boolean getLogTime() {
        return logTime;
    }

    /**
     * Get the value of <code>log-to-screen</code>.
     *
     * @return the <code>log-to-screen</code> from <code>options</code>
     */
    public final boolean getLogToScreen() {
        return logToScreen;
    }

    /**
     * Get the value of <code>log-truncate</code>.
     *
     * @return the <code>log-truncate</code> from <code>options</code>
     */
    public final boolean getLogTruncate() {
        return logTruncate;
    }

    /**
     * Get the value of <code>machine-id</code>.
     *
     * @return the <code>machine-id</code> from <code>options</code>
     */
    public final int getMachineId() {
        return machineId;
    }

    /**
     * Get the value of <code>max-delay</code>.
     *
     * @return the <code>max-delay</code> from <code>options</code>
     */
    public final int getMaxDelay() {
        return maxDelay;
    }

    /**
     * Get the value of <code>max-packet-size</code>.
     *
     * @return the <code>max-packet-size</code> from <code>options</code>
     */
    public final String getMaxPacketSize() {
        return maxPacketSize;
    }

    /**
     * Get the value of <code>max-queue</code>.
     *
     * @return the <code>max-queue</code> from <code>options</code>
     */
    public final int getMaxQueue() {
        return maxQueue;
    }

    /**
     * Get the value of <code>max-shutdown-wait</code>.
     *
     * @return the <code>max-shutdown-wait</code> from <code>options</code>
     */
    public final int getMaxShutdownWait() {
        return maxShutdownWait;
    }

    /**
     * Get the value of <code>max-slot-errors</code>.
     *
     * @return the <code>max-slot-errors</code> from <code>options</code>
     */
    public final int getMaxSlotErrors() {
        return maxSlotErrors;
    }

    /**
     * Get the value of <code>max-unit-errors</code>.
     *
     * @return the <code>max-unit-errors</code> from <code>options</code>
     */
    public final int getMaxUnitErrors() {
        return maxUnitErrors;
    }

    /**
     * Get the value of <code>max-units</code>.
     *
     * @return the <code>max-units</code> from <code>options</code>
     */
    public final int getMaxUnits() {
        return maxUnits;
    }

    /**
     * Get the value of <code>memory</code>.
     *
     * @return the <code>memory</code> from <code>options</code>
     */
    public final String getMemory() {
        return memory;
    }

    /**
     * Get the value of <code>min-delay</code>.
     *
     * @return the <code>min-delay</code> from <code>options</code>
     */
    public final int getMinDelay() {
        return minDelay;
    }

    /**
     * Get the value of <code>next-unit-percentage</code>.
     *
     * @return the <code>next-unit-percentage</code> from <code>options</code>
     */
    public final int getNextUnitPercentage() {
        return nextUnitPercentage;
    }

    /**
     * Get the value of <code>priority</code>.
     *
     * @return the <code>priority</code> from <code>options</code>
     */
    public final String getPriority() {
        return priority;
    }

    /**
     * Get the value of <code>no-assembly</code>.
     *
     * @return the <code>no-assembly</code> from <code>options</code>
     */
    public final boolean getNoAssembly() {
        return noAssembly;
    }

    /**
     * Get the value of <code>opencl-index</code>.
     *
     * @return the <code>opencl-index</code> from <code>options</code>
     */
    public final int getOpenclIndex() {
        return openclIndex;
    }

    /**
     * Get the value of <code>os-species</code>.
     *
     * @return the <code>os-species</code> from <code>options</code>
     */
    public final String getOsSpecies() {
        return osSpecies;
    }

    /**
     * Get the value of <code>os-type</code>.
     *
     * @return the <code>os-type</code> from <code>options</code>
     */
    public final String getOsType() {
        return osType;
    }

    /**
     * Get the value of <code>passkey</code>.
     *
     * @return the <code>passkey</code> from <code>options</code>
     */
    public final String getPasskey() {
        return passkey;
    }

    /**
     * Get the value of <code>password</code>.
     *
     * @return the <code>password</code> from <code>options</code>
     */
    public final String getPassword() {
        return password;
    }

    /**
     * Get the value of <code>pause-on-battery</code>.
     *
     * @return the <code>pause-on-battery</code> from <code>options</code>
     */
    public final boolean getPauseOnBattery() {
        return pauseOnBattery;
    }

    /**
     * Get the value of <code>pause-on-start</code>.
     *
     * @return the <code>pause-on-start</code> from <code>options</code>
     */
    public final boolean getPauseOnStart() {
        return pauseOnStart;
    }

    /**
     * Get the value of <code>pid</code>.
     *
     * @return the <code>pid</code> from <code>options</code>
     */
    public final boolean getPid() {
        return pid;
    }

    /**
     * Get the value of <code>pid-file</code>.
     *
     * @return the <code>pid-file</code> from <code>options</code>
     */
    public final String getPidFile() {
        return pidFile;
    }

    /**
     * Get the value of <code>project-key</code>.
     *
     * @return the <code>project-key</code> from <code>options</code>
     */
    public final int getProjectKey() {
        return projectKey;
    }

    /**
     * Get the value of <code>proxy</code>.
     *
     * @return the <code>proxy</code> from <code>options</code>
     */
    public final String getProxy() {
        return proxy;
    }

    /**
     * Get the value of <code>proxy-enable</code>.
     *
     * @return the <code>proxy-enable</code> from <code>options</code>
     */
    public final boolean getProxyEnable() {
        return proxyEnable;
    }

    /**
     * Get the value of <code>proxy-pass</code>.
     *
     * @return the <code>proxy-pass</code> from <code>options</code>
     */
    public final String getProxyPass() {
        return proxyPass;
    }

    /**
     * Get the value of <code>proxy-user</code>.
     *
     * @return the <code>proxy-user</code> from <code>options</code>
     */
    public final String getProxyUser() {
        return proxyUser;
    }

    /**
     * Get the value of <code>respawn</code>.
     *
     * @return the <code>respawn</code> from <code>options</code>
     */
    public final boolean getRespawn() {
        return respawn;
    }

    /**
     * Get the value of <code>script</code>.
     *
     * @return the <code>script</code> from <code>options</code>
     */
    public final String getScript() {
        return script;
    }

    /**
     * Get the value of <code>service</code>.
     *
     * @return the <code>service</code> from <code>options</code>
     */
    public final boolean getService() {
        return service;
    }

    /**
     * Get the value of <code>service-description</code>.
     *
     * @return the <code>service-description</code> from <code>options</code>
     */
    public final String getServiceDescription() {
        return serviceDescription;
    }

    /**
     * Get the value of <code>service-restart</code>.
     *
     * @return the <code>service-restart</code> from <code>options</code>
     */
    public final boolean getServiceRestart() {
        return serviceRestart;
    }

    /**
     * Get the value of <code>service-restart-delay</code>.
     *
     * @return the <code>service-restart-delay</code> from <code>options</code>
     */
    public final int getServiceRestartDelay() {
        return serviceRestartDelay;
    }

    /**
     * Get the value of <code>smp</code>.
     *
     * @return the <code>smp</code> from <code>options</code>
     */
    public final boolean getSmp() {
        return smp;
    }

    /**
     * Get the value of <code>stack-traces</code>.
     *
     * @return the <code>stack-traces</code> from <code>options</code>
     */
    public final boolean getStackTraces() {
        return stackTraces;
    }

    /**
     * Get the value of <code>team</code>.
     *
     * @return the <code>team</code> from <code>options</code>
     */
    public final int getTeam() {
        return team;
    }

    /**
     * Get the value of <code>threads</code>.
     *
     * @return the <code>threads</code> from <code>options</code>
     */
    public final int getThreads() {
        return threads;
    }

    /**
     * Get the value of <code>user</code>.
     *
     * @return the <code>user</code> from <code>options</code>
     */
    public final String getUser() {
        return user;
    }

    /**
     * Get the value of <code>verbosity</code>.
     *
     * @return the <code>verbosity</code> from <code>options</code>
     */
    public final int getVerbosity() {
        return verbosity;
    }
// </editor-fold>
}
