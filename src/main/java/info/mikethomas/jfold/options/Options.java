/*
 * #%L
 * This file is part of jFold.
 * %%
 * Copyright (C) 2012 - 2024 Mike Thomas <mikepthomas@outlook.com>
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

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.ToString;

/**
 * <p>Options class.</p>
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version 7.6.21
 */
@Getter
@ToString
@XmlRootElement(name = "options")
public class Options implements Serializable {

    /**
     * Allow.
     *
     * @return the <code>allow</code> from <code>options</code>
     */
    @XmlElement
    private String allow;

    /**
     * AutoConf.
     *
     * @return the <code>auto-conf</code> from <code>options</code>
     * @since 7.6.21
     */
    @XmlElement(name = "auto-conf")
    private Boolean autoConf;

    /**
     * Assignment servers.
     *
     * @deprecated no longer returned by options
     * @return the <code>assignment-servers</code> from <code>options</code>
     */
    @Deprecated
    @XmlElement(name = "assignment-servers")
    private String assignmentServers;

    /**
     * Auth as.
     *
     * @deprecated no longer returned by options
     * @return the <code>auth-as</code> from <code>options</code>
     */
    @Deprecated
    @XmlElement(name = "auth-as")
    private Boolean authAs;

    /**
     * Capture directory.
     *
     * @return the <code>capture-directory</code> from <code>options</code>
     */
    @XmlElement(name = "capture-directory")
    private String captureDirectory;

    /**
     * Capture on error.
     *
     * @return the <code>capture-on-error</code> from <code>options</code>
     */
    @XmlElement(name = "capture-on-error")
    private Boolean captureOnError;

    /**
     * Capture packets.
     *
     * @return the <code>capture-packets</code> from <code>options</code>
     */
    @XmlElement(name = "capture-packets")
    private Boolean capturePackets;

    /**
     * Capture requests.
     *
     * @return the <code>capture-requests</code> from <code>options</code>
     */
    @XmlElement(name = "capture-requests")
    private Boolean captureRequests;

    /**
     * Capture responses.
     *
     * @return the <code>capture-responses</code> from <code>options</code>
     */
    @XmlElement(name = "capture-responses")
    private Boolean captureResponses;

    /**
     * Capture sockets.
     *
     * @return the <code>capture-sockets</code> from <code>options</code>
     */
    @XmlElement(name = "capture-sockets")
    private Boolean captureSockets;

    /**
     * Cause.
     *
     * @return the <code>cause</code> from <code>options</code>
     */
    @XmlElement
    private String cause;

    /**
     * Certificate file.
     *
     * @return the <code>certificate-file</code> from <code>options</code>
     */
    @XmlElement(name = "certificate-file")
    private String certificateFile;

    /**
     * Checkpoint.
     *
     * @return the <code>checkpoint</code> from <code>options</code>
     */
    @XmlElement
    private int checkpoint;

    /**
     * Child.
     *
     * @return the <code>child</code> from <code>options</code>
     */
    @XmlElement
    private Boolean child;

    /**
     * Client subtype.
     *
     * @return the <code>client-subtype</code> from <code>options</code>
     */
    @XmlElement(name = "client-subtype")
    private String clientSubtype;

    /**
     * Client threads.
     *
     * @return the <code>client-threads</code> from <code>options</code>
     */
    @XmlElement(name = "client-threads")
    private int clientThreads;

    /**
     * Client type.
     *
     * @return the <code>client-type</code> from <code>options</code>
     */
    @XmlElement(name = "client-type")
    private String clientType;

    /**
     * Command address.
     *
     * @return the <code>command-address</code> from <code>options</code>
     */
    @XmlElement(name = "command-address")
    private String commandAddress;


    /**
     * Command allow.
     *
     * @deprecated no longer returned by options
     * @return the <code>command-allow</code> from <code>options</code>
     */
    @Deprecated
    @XmlElement(name = "command-allow")
    private String commandAllow;

    /**
     * Command allow no pass.
     *
     * @return the <code>command-allow-no-pass</code> from <code>options</code>
     */
    @XmlElement(name = "command-allow-no-pass")
    private String commandAllowNoPass;

    /**
     * Command deny.
     *
     * @deprecated no longer returned by options
     * @return the <code>command-deny</code> from <code>options</code>
     */
    @Deprecated
    @XmlElement(name = "command-deny")
    private String commandDeny;

    /**
     * Deny.
     *
     * @return the <code>deny</code> from <code>options</code>
     */
    @XmlElement
    private String deny;

    /**
     * Command deny no pass.
     *
     * @return the <code>command-deny-no-pass</code> from <code>options</code>
     */
    @XmlElement(name = "command-deny-no-pass")
    private String commandDenyNoPass;

    /**
     * Command enable.
     *
     * @return the <code>command-enable</code> from <code>options</code>
     */
    @XmlElement(name = "command-enable")
    private Boolean commandEnable;

    /**
     * Command port.
     *
     * @return the <code>command-port</code> from <code>options</code>
     */
    @XmlElement(name = "command-port")
    private int commandPort;

    /**
     * Config rotate.
     *
     * @return the <code>config-rotate</code> from <code>options</code>
     */
    @XmlElement(name = "config-rotate")
    private Boolean configRotate;

    /**
     * Config rotate dir.
     *
     * @return the <code>config-rotate-dir</code> from <code>options</code>
     */
    @XmlElement(name = "config-rotate-dir")
    private String configRotateDir;

    /**
     * Config rotate max.
     *
     * @return the <code>config-rotate-max</code> from <code>options</code>
     */
    @XmlElement(name = "config-rotate-max")
    private int configRotateMax;

    /**
     * Connection timeout.
     *
     * @return the <code>connection-timeout</code> from <code>options</code>
     */
    @XmlElement(name = "connection-timeout")
    private int connectionTimeout;

    /**
     * Core dir.
     *
     * @deprecated no longer returned by options
     * @return the <code>core-dir</code> from <code>options</code>
     */
    @Deprecated
    @XmlElement(name = "core-dir")
    private String coreDir;

    /**
     * Core exec.
     *
     * @deprecated no longer returned by options
     * @return the <code>core-exec</code> from <code>options</code>
     */
    @Deprecated
    @XmlElement(name = "core-exec")
    private String coreExec;

    /**
     * Core key.
     *
     * @deprecated no longer returned by options
     * @return the <code>core-key</code> from <code>options</code>
     */
    @Deprecated
    @XmlElement(name = "core-key")
    private String coreKey;

    /**
     * Core prep.
     *
     * @deprecated no longer returned by options
     * @return the <code>core-prep</code> from <code>options</code>
     */
    @Deprecated
    @XmlElement(name = "core-prep")
    private String corePrep;

    /**
     * Core priority.
     *
     * @return the <code>core-priority</code> from <code>options</code>
     */
    @XmlElement(name = "core-priority")
    private String corePriority;

    /**
     * Core server.
     *
     * @deprecated no longer returned by options
     * @return the <code>core-server</code> from <code>options</code>
     */
    @Deprecated
    @XmlElement(name = "core-server")
    private String coreServer;

    /**
     * Core wrapper exec.
     *
     * @deprecated no longer returned by options
     * @return the <code>core-wrapper-exec</code> from <code>options</code>
     */
    @Deprecated
    @XmlElement(name = "core-wrapper-exec")
    private String coreWrapperExec;

    /**
     * CPU affinity.
     *
     * @deprecated no longer returned by options
     * @return the <code>cpu-affinity</code> from <code>options</code>
     */
    @Deprecated
    @XmlElement(name = "cpu-affinity")
    private Boolean cpuAffinity;

    /**
     * CPU species.
     *
     * @return the <code>cpu-species</code> from <code>options</code>
     */
    @XmlElement(name = "cpu-species")
    private String cpuSpecies;

    /**
     * CPU type.
     *
     * @return the <code>cpu-type</code> from <code>options</code>
     */
    @XmlElement(name = "cpu-type")
    private String cpuType;

    /**
     * CPU usage.
     *
     * @return the <code>cpu-usage</code> from <code>options</code>
     */
    @XmlElement(name = "cpu-usage")
    private int cpuUsage;

    /**
     * CPUs.
     *
     * @return the <code>cpus</code> from <code>options</code>
     */
    @XmlElement
    private int cpus;

    /**
     * CRL file.
     *
     * @return the <code>crl-file</code> from <code>options</code>
     */
    @XmlElement(name = "crl-file")
    private String crlFile;

    /**
     * CUDA index.
     *
     * @return the <code>cuda-index</code> from <code>options</code>
     */
    @XmlElement(name = "cuda-index")
    private int cudaIndex;

    /**
     * Cycle rate.
     *
     * @return the <code>cycle-rate</code> from <code>options</code>
     */
    @XmlElement(name = "cycle-rate")
    private int cycleRate;

    /**
     * Cycles.
     *
     * @return the <code>cycles</code> from <code>options</code>
     */
    @XmlElement
    private int cycles;

    /**
     * Daemon.
     *
     * @return the <code>daemon</code> from <code>options</code>
     */
    @XmlElement
    private Boolean daemon;

    /**
     * Data directory.
     *
     * @deprecated no longer returned by options
     * @return the <code>data-directory</code> from <code>options</code>
     */
    @Deprecated
    @XmlElement(name = "data-directory")
    private String dataDirectory;

    /**
     * Debug sockets.
     *
     * @return the <code>debug-sockets</code> from <code>options</code>
     */
    @XmlElement(name = "debug-sockets")
    private Boolean debugSockets;

    /**
     * Disable sleep when active.
     *
     * @return the <code>disable-sleep-when-active</code> from <code>options</code>
     */
    @XmlElement(name = "disable-sleep-when-active")
    private Boolean disableSleepWhenActive;

    /**
     * Disable viz.
     *
     * @return the <code>disable-viz</code> from <code>options</code>
     * @since 7.5.1
     */
    @XmlElement(name = "disable-viz")
    private Boolean disableViz;

    /**
     * Dump after deadline.
     *
     * @return the <code>dump-after-deadline</code> from <code>options</code>
     */
    @XmlElement(name = "dump-after-deadline")
    private Boolean dumpAfterDeadline;

    /**
     * Eval.
     *
     * @deprecated no longer returned by options
     * @return the <code>eval</code> from <code>options</code>
     */
    @Deprecated
    @XmlElement
    private String eval;

    /**
     * Exception locations.
     *
     * @return the <code>exception-locations</code> from <code>options</code>
     */
    @XmlElement(name = "exception-locations")
    private Boolean exceptionLocations;

    /**
     * Exec directory.
     *
     * @deprecated no longer returned by options
     * @return the <code>exec-directory</code> from <code>options</code>
     */
    @Deprecated
    @XmlElement(name = "exec-directory")
    private String execDirectory;

    /**
     * Exit when done.
     *
     * @return the <code>exit-when-done</code> from <code>options</code>
     */
    @XmlElement(name = "exit-when-done")
    private Boolean exitWhenDone;

    /**
     * Extra core args.
     *
     * @return the <code>extra-core-args</code> from <code>options</code>
     */
    @XmlElement(name = "extra-core-args")
    private String extraCoreArgs;

    /**
     * Fold anon.
     *
     * @return the <code>fold-anon</code> from <code>options</code>
     */
    @XmlElement(name = "fold-anon")
    private Boolean foldAnon;

    /**
     * Force WS.
     *
     * @deprecated no longer returned by options
     * @return the <code>force-ws</code> from <code>options</code>
     */
    @Deprecated
    @XmlElement(name = "force-ws")
    private Boolean forceWs;

    /**
     * Fork.
     *
     * @return the <code>fork</code> from <code>options</code>
     */
    @XmlElement
    private Boolean fork;

    /**
     * GPU.
     *
     * @return the <code>gpu</code> from <code>options</code>
     */
    @XmlElement
    private Boolean gpu;

    /**
     * GPU beta.
     *
     * @return the <code>gpu-beta</code> from <code>options</code>
     * @since 7.6.21
     */
    @XmlElement(name = "gpu-beta")
    private String gpuBeta;

    /**
     * GPU assignment servers.
     *
     * @deprecated no longer returned by options
     * @return the <code>gpu-assignment-servers</code> from <code>options</code>
     */
    @Deprecated
    @XmlElement(name = "gpu-assignment-servers")
    private String gpuAssignmentServers;

    /**
     * GPU index.
     *
     * @return the <code>gpu-index</code> from <code>options</code>
     */
    @XmlElement(name = "gpu-index")
    private String gpuIndex;

    /**
     * GPU usage.
     *
     * @return the <code>gpu-usage</code> from <code>options</code>
     */
    @XmlElement(name = "gpu-usage")
    private int gpuUsage;

    /**
     * GUI enabled.
     *
     * @return the <code>gui-enabled</code> from <code>options</code>
     * @since 7.5.1
     */
    @XmlElement(name = "gui-enabled")
    private Boolean guiEnabled;

    /**
     * HTTP addresses.
     *
     * @return the <code>http-addresses</code> from <code>options</code>
     */
    @XmlElement(name = "http-addresses")
    private String httpAddresses;

    /**
     * HTTPS addresses.
     *
     * @return the <code>https-addresses</code> from <code>options</code>
     */
    @XmlElement(name = "https-addresses")
    private String httpsAddresses;

    /**
     * Idle.
     *
     * @return the <code>idle</code> from <code>options</code>
     */
    @XmlElement
    private Boolean idle;

    /**
     * Idle Seconds.
     *
     * @return the <code>idle-seconds</code> from <code>options</code>
     * @since 7.6.21
     */
    @XmlElement(name = "idle-seconds")
    private int idleSeconds;

    /**
     * Log.
     *
     * @return the <code>log</code> from <code>options</code>
     */
    @XmlElement
    private String log;

    /**
     * Log color.
     *
     * @return the <code>log-color</code> from <code>options</code>
     */
    @XmlElement(name = "log-color")
    private Boolean logColor;

    /**
     * Log CRLF.
     *
     * @return the <code>log-crlf</code> from <code>options</code>
     */
    @XmlElement(name = "log-crlf")
    private Boolean logCrlf;

    /**
     * Log date.
     *
     * @return the <code>log-date</code> from <code>options</code>
     */
    @XmlElement(name = "log-date")
    private Boolean logDate;

    /**
     * Log date periodically.
     *
     * @return the <code>log-date-periodically</code> from <code>options</code>
     */
    @XmlElement(name = "log-date-periodically")
    private int logDatePeriodically;

    /**
     * Log debug.
     *
     * @deprecated no longer returned by options
     * @return the <code>log-debug</code> from <code>options</code>
     */
    @Deprecated
    @XmlElement(name = "log-debug")
    private Boolean logDebug;

    /**
     * Log domain.
     *
     * @return the <code>log-domain</code> from <code>options</code>
     */
    @XmlElement(name = "log-domain")
    private Boolean logDomain;

    /**
     * Log domain levels.
     *
     * @return the <code>log-domain-levels</code> from <code>options</code>
     */
    @XmlElement(name = "log-domain-levels")
    private Boolean logDomainLevels;

    /**
     * Log header.
     *
     * @return the <code>log-header</code> from <code>options</code>
     */
    @XmlElement(name = "log-header")
    private Boolean logHeader;

    /**
     * Log level.
     *
     * @return the <code>log-level</code> from <code>options</code>
     */
    @XmlElement(name = "log-level")
    private Boolean logLevel;

    /**
     * Log no info header.
     *
     * @return the <code>log-no-info-header</code> from <code>options</code>
     */
    @XmlElement(name = "log-no-info-header")
    private Boolean logNoInfoHeader;

    /**
     * Log redirect.
     *
     * @return the <code>log-redirect</code> from <code>options</code>
     */
    @XmlElement(name = "log-redirect")
    private Boolean logRedirect;

    /**
     * Log rotate.
     *
     * @return the <code>log-rotate</code> from <code>options</code>
     */
    @XmlElement(name = "log-rotate")
    private Boolean logRotate;

    /**
     * Log rotate dir.
     *
     * @return the <code>log-rotate-dir</code> from <code>options</code>
     */
    @XmlElement(name = "log-rotate-dir")
    private String logRotateDir;

    /**
     * Log rotate max.
     *
     * @return the <code>log-rotate-max</code> from <code>options</code>
     */
    @XmlElement(name = "log-rotate-max")
    private int logRotateMax;

    /**
     * Log short level.
     *
     * @return the <code>log-short-level</code> from <code>options</code>
     */
    @XmlElement(name = "log-short-level")
    private Boolean logShortLevel;

    /**
     * Log simple domains.
     *
     * @return the <code>log-simple-domains</code> from <code>options</code>
     */
    @XmlElement(name = "log-simple-domains")
    private Boolean logSimpleDomains;

    /**
     * Log thread id.
     *
     * @return the <code>log-thread-id</code> from <code>options</code>
     */
    @XmlElement(name = "log-thread-id")
    private Boolean logThreadId;

    /**
     * Log thread prefix.
     *
     * @return the <code>log-thread-prefix</code> from <code>options</code>
     */
    @XmlElement(name = "log-thread-prefix")
    private Boolean logThreadPrefix;

    /**
     * Log time.
     *
     * @return the <code>log-time</code> from <code>options</code>
     */
    @XmlElement(name = "log-time")
    private Boolean logTime;

    /**
     * Log to screen.
     *
     * @return the <code>log-to-screen</code> from <code>options</code>
     */
    @XmlElement(name = "log-to-screen")
    private Boolean logToScreen;

    /**
     * Log truncate.
     *
     * @return the <code>log-truncate</code> from <code>options</code>
     */
    @XmlElement(name = "log-truncate")
    private Boolean logTruncate;

    /**
     * Machine id.
     *
     * @return the <code>machine-id</code> from <code>options</code>
     */
    @XmlElement(name = "machine-id")
    private int machineId;

    /**
     * Max delay.
     *
     * @deprecated no longer returned by options
     * @return the <code>max-delay</code> from <code>options</code>
     */
    @Deprecated
    @XmlElement(name = "max-delay")
    private int maxDelay;

    /**
     * Max connect time.
     *
     * @return the <code>max-connect-time</code> from <code>options</code>
     */
    @XmlElement(name = "max-connect-time")
    private int maxConnectTime;

    /**
     * Max connections.
     *
     * @return the <code>max-connections</code> from <code>options</code>
     */
    @XmlElement(name = "max-connections")
    private int maxConnections;

    /**
     * Max packet size.
     *
     * @return the <code>max-packet-size</code> from <code>options</code>
     */
    @XmlElement(name = "max-packet-size")
    private String maxPacketSize;

    /**
     * Max queue.
     *
     * @return the <code>max-queue</code> from <code>options</code>
     */
    @XmlElement(name = "max-queue")
    private int maxQueue;

    /**
     * Max request length.
     *
     * @return the <code>max-request-length</code> from <code>options</code>
     */
    @XmlElement(name = "max-request-length")
    private int maxRequestLength;

    /**
     * Max shutdown wait.
     *
     * @return the <code>max-shutdown-wait</code> from <code>options</code>
     */
    @XmlElement(name = "max-shutdown-wait")
    private int maxShutdownWait;

    /**
     * Max slot errors.
     *
     * @return the <code>max-slot-errors</code> from <code>options</code>
     */
    @XmlElement(name = "max-slot-errors")
    private int maxSlotErrors;

    /**
     * Max unit errors.
     *
     * @return the <code>max-unit-errors</code> from <code>options</code>
     */
    @XmlElement(name = "max-unit-errors")
    private int maxUnitErrors;

    /**
     * Max units.
     *
     * @return the <code>max-units</code> from <code>options</code>
     */
    @XmlElement(name = "max-units")
    private int maxUnits;

    /**
     * Memory.
     *
     * @return the <code>memory</code> from <code>options</code>
     */
    @XmlElement
    private String memory;

    /**
     * Min delay.
     *
     * @deprecated no longer returned by options
     * @return the <code>min-delay</code> from <code>options</code>
     */
    @Deprecated
    @XmlElement(name = "min-delay")
    private int minDelay;

    /**
     * Min connect time.
     *
     * @return the <code>min-connect-time</code> from <code>options</code>
     */
    @XmlElement(name = "min-connect-time")
    private int minConnectTime;

    /**
     * Next unit percentage.
     *
     * @return the <code>next-unit-percentage</code> from <code>options</code>
     */
    @XmlElement(name = "next-unit-percentage")
    private int nextUnitPercentage;

    /**
     * Priority.
     *
     * @return the <code>priority</code> from <code>options</code>
     */
    @XmlElement
    private String priority;

    /**
     * No assembly.
     *
     * @return the <code>no-assembly</code> from <code>options</code>
     */
    @XmlElement(name = "no-assembly")
    private Boolean noAssembly;

    /**
     * Open web control.
     *
     * @return the <code>open-web-control</code> from <code>options</code>
     */
    @XmlElement(name = "open-web-control")
    private Boolean openWebControl;

    /**
     * OpenCL Index.
     *
     * @return the <code>opencl-index</code> from <code>options</code>
     */
    @XmlElement(name = "opencl-index")
    private int openclIndex;

    /**
     * OS Species.
     *
     * @return the <code>os-species</code> from <code>options</code>
     */
    @XmlElement(name = "os-species")
    private String osSpecies;

    /**
     * OS type.
     *
     * @return the <code>os-type</code> from <code>options</code>
     */
    @XmlElement(name = "os-type")
    private String osType;

    /**
     * Passkey.
     *
     * @return the <code>passkey</code> from <code>options</code>
     */
    @XmlElement
    private String passkey;

    /**
     * Password.
     *
     * @return the <code>password</code> from <code>options</code>
     */
    @XmlElement
    private String password;

    /**
     * Pause on battery.
     *
     * @return the <code>pause-on-battery</code> from <code>options</code>
     */
    @XmlElement(name = "pause-on-battery")
    private Boolean pauseOnBattery;

    /**
     * Pause on start.
     *
     * @return the <code>pause-on-start</code> from <code>options</code>
     */
    @XmlElement(name = "pause-on-start")
    private Boolean pauseOnStart;

    /**
     * Paused.
     *
     * @return the <code>paused</code> from <code>options</code>
     */
    @XmlElement
    private Boolean paused;

    /**
     * PCI Bus.
     *
     * @return the <code>pci-bus</code> from <code>options</code>
     * @since 7.6.21
     */
    @XmlElement(name = "pci-bus")
    private String pciBus;

    /**
     * PCI Slot.
     *
     * @return the <code>pci-slot</code> from <code>options</code>
     * @since 7.6.21
     */
    @XmlElement(name = "pci-slot")
    private String pciSlot;

    /**
     * PID.
     *
     * @return the <code>pid</code> from <code>options</code>
     */
    @XmlElement
    private Boolean pid;

    /**
     * PID file.
     *
     * @return the <code>pid-file</code> from <code>options</code>
     */
    @XmlElement(name = "pid-file")
    private String pidFile;

    /**
     * Power.
     *
     * @return the <code>power</code> from <code>options</code>
     */
    @XmlElement
    private String power;

    /**
     * Private key file.
     *
     * @return the <code>private-key-file</code> from <code>options</code>
     */
    @XmlElement(name = "private-key-file")
    private String privateKeyFile;

    /**
     * Project key.
     *
     * @return the <code>project-key</code> from <code>options</code>
     */
    @XmlElement(name = "project-key")
    private int projectKey;

    /**
     * Proxy server address.
     *
     * @return the <code>proxy</code> from <code>options</code>
     */
    @XmlElement
    private String proxy;

    /**
     * Proxy enable.
     *
     * @return the <code>proxy-enable</code> from <code>options</code>
     */
    @XmlElement(name = "proxy-enable")
    private Boolean proxyEnable;

    /**
     * Proxy pass.
     *
     * @return the <code>proxy-pass</code> from <code>options</code>
     */
    @XmlElement(name = "proxy-pass")
    private String proxyPass;

    /**
     * Proxy user.
     *
     * @return the <code>proxy-user</code> from <code>options</code>
     */
    @XmlElement(name = "proxy-user")
    private String proxyUser;

    /**
     * Respawn.
     *
     * @return the <code>respawn</code> from <code>options</code>
     */
    @XmlElement
    private Boolean respawn;

    /**
     * Run as.
     *
     * @return the <code>run-as</code> from <code>options</code>
     */
    @XmlElement(name = "run-as")
    private String runAs;

    /**
     * Script.
     *
     * @deprecated no longer returned by options
     * @return the <code>script</code> from <code>options</code>
     */
    @Deprecated
    @XmlElement
    private String script;

    /**
     * Service.
     *
     * @return the <code>service</code> from <code>options</code>
     */
    @XmlElement
    private Boolean service;

    /**
     * Service description.
     *
     * @deprecated no longer returned by options
     * @return the <code>service-description</code> from <code>options</code>
     */
    @Deprecated
    @XmlElement(name = "service-description")
    private String serviceDescription;

    /**
     * Service restart.
     *
     * @deprecated no longer returned by options
     * @return the <code>service-restart</code> from <code>options</code>
     */
    @Deprecated
    @XmlElement(name = "service-restart")
    private Boolean serviceRestart;

    /**
     * Service restart delay.
     *
     * @deprecated no longer returned by options
     * @return the <code>service-restart-delay</code> from <code>options</code>
     */
    @Deprecated
    @XmlElement(name = "service-restart-delay")
    private int serviceRestartDelay;

    /**
     * Session cookie.
     *
     * @return the <code>session-cookie</code> from <code>options</code>
     */
    @XmlElement(name = "session-cookie")
    private String sessionCookie;

    /**
     * Session lifetime.
     *
     * @return the <code>session-lifetime</code> from <code>options</code>
     */
    @XmlElement(name = "session-lifetime")
    private int sessionLifetime;

    /**
     * Session timeout.
     *
     * @return the <code>session-timeout</code> from <code>options</code>
     */
    @XmlElement(name = "session-timeout")
    private int sessionTimeout;

    /**
     * Set Group.
     *
     * @return the <code>set-group</code> from <code>options</code>
     * @since 7.6.21
     */
    @XmlElement(name = "set-group")
    private String setGroup;

    /**
     * SMP.
     *
     * @return the <code>smp</code> from <code>options</code>
     */
    @XmlElement
    private Boolean smp;

    /**
     * Stack traces.
     *
     * @return the <code>stack-traces</code> from <code>options</code>
     */
    @XmlElement(name = "stack-traces")
    private Boolean stackTraces;

    /**
     * Stall detection enabled.
     *
     * @return the <code>stall-detection-enabled</code> from <code>options</code>
     */
    @XmlElement(name = "stall-detection-enabled")
    private Boolean stallDetectionEnabled;

    /**
     * Stall percent.
     *
     * @return the <code>stall-percent</code> from <code>options</code>
     */
    @XmlElement(name = "stall-percent")
    private int stallPercent;

    /**
     * Stall timeout.
     *
     * @return the <code>stall-timeout</code> from <code>options</code>
     */
    @XmlElement(name = "stall-timeout")
    private int stallTimeout;

    /**
     * Team.
     *
     * @return the <code>team</code> from <code>options</code>
     */
    @XmlElement
    private int team;

    /**
     * Threads.
     *
     * @deprecated no longer returned by options
     * @return the <code>threads</code> from <code>options</code>
     */
    @Deprecated
    @XmlElement
    private int threads;

    /**
     * User.
     *
     * @return the <code>user</code> from <code>options</code>
     */
    @XmlElement
    private String user;

    /**
     * Verbosity.
     *
     * @return the <code>verbosity</code> from <code>options</code>
     */
    @XmlElement
    private int verbosity;

    /**
     * Web allow.
     *
     * @return the <code>web-allow</code> from <code>options</code>
     */
    @XmlElement(name = "web-allow")
    private String webAllow;

    /**
     * Web deny.
     *
     * @return the <code>web-deny</code> from <code>options</code>
     */
    @XmlElement(name = "web-deny")
    private String webDeny;

    /**
     * Web enable.
     *
     * @return the <code>web-enable</code> from <code>options</code>
     */
    @XmlElement(name = "web-enable")
    private Boolean webEnable;
}
