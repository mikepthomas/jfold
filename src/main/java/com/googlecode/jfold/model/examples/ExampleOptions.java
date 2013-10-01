package com.googlecode.jfold.model.examples;

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

import com.googlecode.jfold.model.options.Options;
import com.googlecode.jfold.model.options.OptionsImpl;

/**
 *
 * @author Michael Thomas <mikepthomas@outlook.com>
 */
public class ExampleOptions extends OptionsImpl implements Options {

    private static final String JSON = "{"
            + "  \"assignment-servers\": \"assign3.stanford.edu:8080 assign4.stanford.edu:80\","
            + "  \"capture-directory\": \"capture\","
            + "  \"capture-sockets\": \"false\","
            + "  \"checkpoint\": \"15\","
            + "  \"child\": \"false\","
            + "  \"client-subtype\": \"STDCLI\","
            + "  \"client-type\": \"normal\","
            + "  \"command-address\": \"0.0.0.0\","
            + "  \"command-allow\": \"127.0.0.1\","
            + "  \"command-allow-no-pass\": \"127.0.0.1\","
            + "  \"command-deny\": \"0.0.0.0/0\","
            + "  \"command-deny-no-pass\": \"0.0.0.0/0\","
            + "  \"command-port\": \"36330\","
            + "  \"config-rotate\": \"true\","
            + "  \"config-rotate-dir\": \"configs\","
            + "  \"config-rotate-max\": \"16\","
            + "  \"core-dir\": \"cores\","
            + "  \"core-key\": None,"
            + "  \"core-prep\": None,"
            + "  \"core-priority\": \"idle\","
            + "  \"core-server\": None,"
            + "  \"cpu-affinity\": \"false\","
            + "  \"cpu-species\": \"X86_PENTIUM_II\","
            + "  \"cpu-type\": \"X86\","
            + "  \"cpu-usage\": \"100\","
            + "  \"cpus\": \"4\","
            + "  \"cycle-rate\": \"4\","
            + "  \"cycles\": \"-1\","
            + "  \"daemon\": \"false\","
            + "  \"data-directory\": \".\","
            + "  \"debug-sockets\": \"false\","
            + "  \"dump-after-deadline\": \"true\","
            + "  \"eval\": None,"
            + "  \"exception-locations\": \"true\","
            + "  \"exec-directory\": \"C:\\\\folding\\\\FAH-V7\\\\FAHClient\","
            + "  \"exit-when-done\": \"false\","
            + "  \"extra-core-args\": None,"
            + "  \"force-ws\": None,"
            + "  \"gpu\": \"false\","
            + "  \"gpu-assignment-servers\": \"assign-GPU.stanford.edu:80 assign-GPU.stanford.edu:8080\","
            + "  \"gpu-device-id\": None,"
            + "  \"gpu-id\": \"0\","
            + "  \"gpu-index\": None,"
            + "  \"gpu-vendor-id\": None,"
            + "  \"log\": \"log.txt\","
            + "  \"log-color\": \"false\","
            + "  \"log-crlf\": \"true\","
            + "  \"log-date\": \"false\","
            + "  \"log-debug\": \"true\","
            + "  \"log-domain\": \"false\","
            + "  \"log-domain-levels\": None,"
            + "  \"log-header\": \"true\","
            + "  \"log-level\": \"true\","
            + "  \"log-no-info-header\": \"true\","
            + "  \"log-redirect\": \"false\","
            + "  \"log-rotate\": \"true\","
            + "  \"log-rotate-dir\": \"logs\","
            + "  \"log-rotate-max\": \"16\","
            + "  \"log-short-level\": \"false\","
            + "  \"log-simple-domains\": \"true\","
            + "  \"log-thread-id\": \"false\","
            + "  \"log-time\": \"true\","
            + "  \"log-to-screen\": \"true\","
            + "  \"log-truncate\": \"false\","
            + "  \"machine-id\": \"0\","
            + "  \"max-delay\": \"21600\","
            + "  \"max-packet-size\": \"normal\","
            + "  \"max-queue\": \"16\","
            + "  \"max-shutdown-wait\": \"60\","
            + "  \"max-slot-errors\": \"5\","
            + "  \"max-unit-errors\": \"5\","
            + "  \"max-units\": \"0\","
            + "  \"memory\": None,"
            + "  \"min-delay\": \"60\","
            + "  \"next-unit-percentage\": \"99\","
            + "  \"priority\": None,"
            + "  \"no-assembly\": \"false\","
            + "  \"os-species\": \"WIN_XP\","
            + "  \"os-type\": \"WIN32\","
            + "  \"passkey\": \"passkey\","
            + "  \"password\": \"password\","
            + "  \"pause-on-battery\": \"false\","
            + "  \"pause-on-start\": \"false\","
            + "  \"pid\": \"false\","
            + "  \"pid-file\": \"Folding@home Client.pid\","
            + "  \"project-key\": \"0\","
            + "  \"proxy\": \":8080\","
            + "  \"proxy-enable\": \"false\","
            + "  \"proxy-pass\": \"\","
            + "  \"proxy-user\": \"\","
            + "  \"respawn\": \"false\","
            + "  \"script\": None,"
            + "  \"service\": \"false\","
            + "  \"service-description\": \"Folding@home Client\","
            + "  \"service-restart\": \"true\","
            + "  \"service-restart-delay\": \"5000\","
            + "  \"smp\": \"true\","
            + "  \"stack-traces\": \"false\","
            + "  \"team\": \"0\","
            + "  \"threads\": \"4\","
            + "  \"user\": \"Anonymous\","
            + "  \"verbosity\": \"3\""
            + "}";

    public ExampleOptions() {
        super(JSON);
    }
}
