/*
 * Copyright (C) 2012 Michael Thomas <michael4.thomas@live.uwe.ac.uk>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.googlecode.jfold.interfaces;

import java.net.InetAddress;

/**
 *
 * @author Michael Thomas <michael4.thomas@live.uwe.ac.uk>
 */
public interface IOptions {
    
    /**
     * Get the value of <code>assignment-servers</code>
     *
     * @return the value of <code>assignment-servers</code> from <code>options</code>
     */
    String getAssignmentServers();
    
    /**
     * Get the value of <code>capture-directory</code>
     *
     * @return the value of <code>capture-directory</code> from <code>options</code>
     */
    String getCaptureDirectory();
    
    /**
     * Get the value of <code>capture-sockets</code>
     *
     * @return the value of <code>capture-sockets</code> from <code>options</code>
     */
    boolean getCaptureSockets();
    
    /**
     * Get the value of <code>checkpoint</code>
     *
     * @return the value of <code>checkpoint</code> from <code>options</code>
     */
    int getCheckpoint();
    
    /**
     * Get the value of <code>child</code>
     *
     * @return the value of <code>child</code> from <code>options</code>
     */
    boolean getChild();
    
    /**
     * Get the value of <code>client-subtype</code>
     *
     * @return the value of <code>client-subtype</code> from <code>options</code>
     */
    String getClientSubtype();
    
    /**
     * Get the value of <code>client-type</code>
     *
     * @return the value of <code>client-type</code> from <code>options</code>
     */
    String getClientType();
    
    /**
     * Get the value of <code>command-address</code>
     *
     * @return the value of <code>command-address</code> from <code>options</code>
     */
    InetAddress getCommandAddress();
    
    /**
     * Get the value of <code>command-allow</code>
     *
     * @return the value of <code>command-allow</code> from <code>options</code>
     */
    InetAddress getCommandAllow();
    
    /**
     * Get the value of <code>command-allow-no-pass</code>
     *
     * @return the value of <code>command-allow-no-pass</code> from <code>options</code>
     */
    InetAddress getCommandAllowNoPass();
    
    /**
     * Get the value of <code>command-deny</code>
     *
     * @return the value of <code>command-deny</code> from <code>options</code>
     */
    InetAddress getCommandDeny();
    
    /**
     * Get the value of <code>command-deny-no-pass</code>
     *
     * @return the value of <code>command-deny-no-pass</code> from <code>options</code>
     */
    InetAddress getCommandDenyNoPass();
    
    /**
     * Get the value of <code>command-port</code>
     *
     * @return the value of <code>command-port</code> from <code>options</code>
     */
    int getCommandPort();
    
    /**
     * Get the value of <code>config-rotate</code>
     *
     * @return the value of <code>config-rotate</code> from <code>options</code>
     */
    boolean getConfigRotate();
    
    /**
     * Get the value of <code>config-rotate-dir</code>
     *
     * @return the value of <code>config-rotate-dir</code> from <code>options</code>
     */
    String getConfigRotateDir();
    
    /**
     * Get the value of <code>config-rotate-max</code>
     *
     * @return the value of <code>config-rotate-max</code> from <code>options</code>
     */
    int getConfigRotateMax();
    
    /**
     * Get the value of <code>core-dir</code>
     *
     * @return the value of <code>core-dir</code> from <code>options</code>
     */
    String getCoreDir();
    
    /**
     * Get the value of <code>core-key</code>
     *
     * @return the value of <code>core-key</code> from <code>options</code>
     */
    String getCoreKey();
    
    /**
     * Get the value of <code>core-prep</code>
     *
     * @return the value of <code>core-prep</code> from <code>options</code>
     */
    String getCorePrep();
    
    /**
     * Get the value of <code>core-priority</code>
     *
     * @return the value of <code>core-priority</code> from <code>options</code>
     */
    String getCorePriority();
    
    /**
     * Get the value of <code>core-server</code>
     *
     * @return the value of <code>core-server</code> from <code>options</code>
     */
    InetAddress getCoreServer();
    
    /**
     * Get the value of <code>cpu-affinity</code>
     *
     * @return the value of <code>cpu-affinity</code> from <code>options</code>
     */
    boolean getCpuAffinity();
    
    /**
     * Get the value of <code>cpu-species</code>
     *
     * @return the value of <code>cpu-species</code> from <code>options</code>
     */
    String getCpuSpecies();
    
    /**
     * Get the value of <code>cpu-type</code>
     *
     * @return the value of <code>cpu-type</code> from <code>options</code>
     */
    String getCpuType();
    
    /**
     * Get the value of <code>cpu-usage</code>
     *
     * @return the value of <code>cpu-usage</code> from <code>options</code>
     */
    int getCpuUsage();
    
    /**
     * Get the value of <code>cpus</code>
     *
     * @return the value of <code>cpus</code> from <code>options</code>
     */
    int getCpus();
    
    /**
     * Get the value of <code>cuda-index</code>
     *
     * @return the value of <code>cuda-index</code> from <code>options</code>
     */
    int getCudaIndex();
    
    /**
     * Get the value of <code>cycle-rate</code>
     *
     * @return the value of <code>cycle-rate</code> from <code>options</code>
     */
    int getCycleRate();
    
    /**
     * Get the value of <code>cycles</code>
     *
     * @return the value of <code>cycles</code> from <code>options</code>
     */
    int getCycles();
    
    /**
     * Get the value of <code>daemon</code>
     *
     * @return the value of <code>daemon</code> from <code>options</code>
     */
    boolean getDaemon();
    
    /**
     * Get the value of <code>data-directory</code>
     *
     * @return the value of <code>data-directory</code> from <code>options</code>
     */
    String getDataDirectory();
    
    /**
     * Get the value of <code>debug-sockets</code>
     *
     * @return the value of <code>debug-sockets</code> from <code>options</code>
     */
    boolean getDebugSockets();
    
    /**
     * Get the value of <code>dump-after-deadline</code>
     *
     * @return the value of <code>dump-after-deadline</code> from <code>options</code>
     */
    boolean getDumpAfterDeadline();
    
    /**
     * Get the value of <code>eval</code>
     *
     * @return the value of <code>eval</code> from <code>options</code>
     */
    String getEval();
    
    /**
     * Get the value of <code>exception-locations</code>
     *
     * @return the value of <code>exception-locations</code> from <code>options</code>
     */
    boolean getExceptionLocations();
    
    /**
     * Get the value of <code>exec-directory</code>
     *
     * @return the value of <code>exec-directory</code> from <code>options</code>
     */
    String getExecDirectory();
    
    /**
     * Get the value of <code>exit-when-done</code>
     *
     * @return the value of <code>exit-when-done</code> from <code>options</code>
     */
    boolean getExitWhenDone();
    
    /**
     * Get the value of <code>extra-core-args</code>
     *
     * @return the value of <code>extra-core-args</code> from <code>options</code>
     */
    String getExtraCoreArgs();
    
    /**
     * Get the value of <code>force-ws</code>
     *
     * @return the value of <code>force-ws</code> from <code>options</code>
     */
    boolean getForceWs();
    
    /**
     * Get the value of <code>gpu</code>
     *
     * @return the value of <code>gpu</code> from <code>options</code>
     */
    boolean getGpu();
    
    /**
     * Get the value of <code>gpu-assignment-servers</code>
     *
     * @return the value of <code>gpu-assignment-servers</code> from <code>options</code>
     */
    String getGpuAssignmentServers();
    
    /**
     * Get the value of <code>gpu-index</code>
     *
     * @return the value of <code>gpu-index</code> from <code>options</code>
     */
    int getGpuIndex();
    
    /**
     * Get the value of <code>gpu-usage</code>
     *
     * @return the value of <code>gpu-usage</code> from <code>options</code>
     */
    int getGpuUsage();
    
    /**
     * Get the value of <code>log</code>
     *
     * @return the value of <code>log</code> from <code>options</code>
     */
    String getLog();
    
    /**
     * Get the value of <code>log-color</code>
     *
     * @return the value of <code>log-color</code> from <code>options</code>
     */
    boolean getLogColor();
    
    /**
     * Get the value of <code>log-crlf</code>
     *
     * @return the value of <code>log-crlf</code> from <code>options</code>
     */
    boolean getLogCrlf();
    
    /**
     * Get the value of <code>log-date</code>
     *
     * @return the value of <code>log-date</code> from <code>options</code>
     */
    boolean getLogDate();
    
    /**
     * Get the value of <code>log-debug</code>
     *
     * @return the value of <code>log-debug</code> from <code>options</code>
     */
    boolean getLogDebug();
    
    /**
     * Get the value of <code>log-domain</code>
     *
     * @return the value of <code>log-domain</code> from <code>options</code>
     */
    boolean getLogDomain();
    
    /**
     * Get the value of <code>log-domain-levels</code>
     *
     * @return the value of <code>log-domain-levels</code> from <code>options</code>
     */
    boolean getLogDomainLevels();
    
    /**
     * Get the value of <code>log-header</code>
     *
     * @return the value of <code>log-header</code> from <code>options</code>
     */
    boolean getLogHeader();
    
    /**
     * Get the value of <code>log-level</code>
     *
     * @return the value of <code>log-level</code> from <code>options</code>
     */
    boolean getLogLevel();
    
    /**
     * Get the value of <code>log-no-info-header</code>
     *
     * @return the value of <code>log-no-info-header</code> from <code>options</code>
     */
    boolean getLogNoInfoHeader();
    
    /**
     * Get the value of <code>log-redirect</code>
     *
     * @return the value of <code>log-redirect</code> from <code>options</code>
     */
    boolean getLogRedirect();
    
    /**
     * Get the value of <code>log-rotate</code>
     *
     * @return the value of <code>log-rotate</code> from <code>options</code>
     */
    boolean getLogRotate();
    
    /**
     * Get the value of <code>log-rotate-dir</code>
     *
     * @return the value of <code>log-rotate-dir</code> from <code>options</code>
     */
    String getLogRotateDir();
    
    /**
     * Get the value of <code>log-rotate-max</code>
     *
     * @return the value of <code>log-rotate-max</code> from <code>options</code>
     */
    int getLogRotateMax();
    
    /**
     * Get the value of <code>log-short-level</code>
     *
     * @return the value of <code>log-short-level</code> from <code>options</code>
     */
    boolean getLogShortLevel();
    
    /**
     * Get the value of <code>log-simple-domains</code>
     *
     * @return the value of <code>log-simple-domains</code> from <code>options</code>
     */
    boolean getLogSimpleDomains();
    
    /**
     * Get the value of <code>log-thread-id</code>
     *
     * @return the value of <code>log-thread-id</code> from <code>options</code>
     */
    boolean getLogThreadId();
    
    /**
     * Get the value of <code>log-time</code>
     *
     * @return the value of <code>log-time</code> from <code>options</code>
     */
    boolean getLogTime();
    
    /**
     * Get the value of <code>log-to-screen</code>
     *
     * @return the value of <code>log-to-screen</code> from <code>options</code>
     */
    boolean getLogToScreen();
    
    /**
     * Get the value of <code>log-truncate</code>
     *
     * @return the value of <code>log-truncate</code> from <code>options</code>
     */
    boolean getLogTruncate();
    
    /**
     * Get the value of <code>machine-id</code>
     *
     * @return the value of <code>machine-id</code> from <code>options</code>
     */
    int getMachineId();
    
    /**
     * Get the value of <code>max-delay</code>
     *
     * @return the value of <code>max-delay</code> from <code>options</code>
     */
    int getMaxDelay();
    
    /**
     * Get the value of <code>max-packet-size</code>
     *
     * @return the value of <code>max-packet-size</code> from <code>options</code>
     */
    String getMaxPacketSize();
    
    /**
     * Get the value of <code>max-queue</code>
     *
     * @return the value of <code>max-queue</code> from <code>options</code>
     */
    int getMaxQueue();
    
    /**
     * Get the value of <code>max-shutdown-wait</code>
     *
     * @return the value of <code>max-shutdown-wait</code> from <code>options</code>
     */
    int getMaxShutdownWait();
    
    /**
     * Get the value of <code>max-slot-errors</code>
     *
     * @return the value of <code>max-slot-errors</code> from <code>options</code>
     */
    int getMaxSlotErrors();
    
    /**
     * Get the value of <code>max-unit-errors</code>
     *
     * @return the value of <code>max-unit-errors</code> from <code>options</code>
     */
    int getMaxUnitErrors();
    
    /**
     * Get the value of <code>max-units</code>
     *
     * @return the value of <code>max-units</code> from <code>options</code>
     */
    int getMaxUnits();
    
    /**
     * Get the value of <code>memory</code>
     *
     * @return the value of <code>memory</code> from <code>options</code>
     */
    int getMemory();
    
    /**
     * Get the value of <code>min-delay</code>
     *
     * @return the value of <code>min-delay</code> from <code>options</code>
     */
    int getMinDelay();
    
    /**
     * Get the value of <code>next-unit-percentage</code>
     *
     * @return the value of <code>next-unit-percentage</code> from <code>options</code>
     */
    int getNextUnitPercentage();
    
    /**
     * Get the value of <code>priority</code>
     *
     * @return the value of <code>priority</code> from <code>options</code>
     */
    String getPriority();
    
    /**
     * Get the value of <code>no-assembly</code>
     *
     * @return the value of <code>no-assembly</code> from <code>options</code>
     */
    boolean getNoAssembly();
    
    /**
     * Get the value of <code>opencl-index</code>
     *
     * @return the value of <code>opencl-index</code> from <code>options</code>
     */
    int getOpenclIndex();
    
    /**
     * Get the value of <code>os-species</code>
     *
     * @return the value of <code>os-species</code> from <code>options</code>
     */
    String getOsSpecies();
    
    /**
     * Get the value of <code>os-type</code>
     *
     * @return the value of <code>os-type</code> from <code>options</code>
     */
    String getOsType();
    
    /**
     * Get the value of <code>passkey</code>
     *
     * @return the value of <code>passkey</code> from <code>options</code>
     */
    String getPasskey();
    
    /**
     * Get the value of <code>password</code>
     *
     * @return the value of <code>password</code> from <code>options</code>
     */
    String getPassword();
    
    /**
     * Get the value of <code>pause-on-battery</code>
     *
     * @return the value of <code>pause-on-battery</code> from <code>options</code>
     */
    boolean getPauseOnBattery();
    
    /**
     * Get the value of <code>pause-on-start</code>
     *
     * @return the value of <code>pause-on-start</code> from <code>options</code>
     */
    boolean getPauseOnStart();
    
    /**
     * Get the value of <code>pid</code>
     *
     * @return the value of <code>pid</code> from <code>options</code>
     */
    boolean getPid();
    
    /**
     * Get the value of <code>pid-file</code>
     *
     * @return the value of <code>pid-file</code> from <code>options</code>
     */
    String getPidFile();
    
    /**
     * Get the value of <code>project-key</code>
     *
     * @return the value of <code>project-key</code> from <code>options</code>
     */
    int getProjectKey();
    
    /**
     * Get the value of <code>proxy</code>
     *
     * @return the value of <code>proxy</code> from <code>options</code>
     */
    InetAddress getProxy();
    
    /**
     * Get the value of <code>proxy-enable</code>
     *
     * @return the value of <code>proxy-enable</code> from <code>options</code>
     */
    boolean getProxyEnable();
    
    /**
     * Get the value of <code>proxy-pass</code>
     *
     * @return the value of <code>proxy-pass</code> from <code>options</code>
     */
    String getProxyPass();
    
    /**
     * Get the value of <code>proxy-user</code>
     *
     * @return the value of <code>proxy-user</code> from <code>options</code>
     */
    String getProxyUser();
    
    /**
     * Get the value of <code>respawn</code>
     *
     * @return the value of <code>respawn</code> from <code>options</code>
     */
    boolean getRespawn();
    
    /**
     * Get the value of <code>script</code>
     *
     * @return the value of <code>script</code> from <code>options</code>
     */
    String getScript();
    
    /**
     * Get the value of <code>service</code>
     *
     * @return the value of <code>service</code> from <code>options</code>
     */
    boolean getService();
    
    /**
     * Get the value of <code>service-description</code>
     *
     * @return the value of <code>service-description</code> from <code>options</code>
     */
    String getServiceDescription();
    
    /**
     * Get the value of <code>service-restart</code>
     *
     * @return the value of <code>service-restart</code> from <code>options</code>
     */
    boolean getServiceRestart();
    
    /**
     * Get the value of <code>service-restart-delay</code>
     *
     * @return the value of <code>service-restart-delay</code> from <code>options</code>
     */
    int getServiceRestartDelay();
    
    /**
     * Get the value of <code>smp</code>
     *
     * @return the value of <code>smp</code> from <code>options</code>
     */
    boolean getSmp();
    
    /**
     * Get the value of <code>stack-traces</code>
     *
     * @return the value of <code>stack-traces</code> from <code>options</code>
     */
    boolean getStackTraces();
    
    /**
     * Get the value of <code>team</code>
     *
     * @return the value of <code>team</code> from <code>options</code>
     */
    int getTeam();
    
    /**
     * Get the value of <code>threads</code>
     *
     * @return the value of <code>threads</code> from <code>options</code>
     */
    int getThreads();
    
    /**
     * Get the value of <code>user</code>
     *
     * @return the value of <code>user</code> from <code>options</code>
     */
    String getUser();
    
    /**
     * Get the value of <code>verbosity</code>
     *
     * @return the value of <code>verbosity</code> from <code>options</code>
     */
    int getVerbosity();
    
    /**
     *
     * @return String representation of this <code>IOptions</code>
     */
    @Override
    String toString();
}
