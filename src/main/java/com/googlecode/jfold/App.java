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
import java.util.ArrayList;
import java.util.List;

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
    public static void main(String[] args) {
        String json = "[\n"
                + "  [\n"
                + "    \"Folding@home Client\",\n"
                + "    [\n"
                + "      \"Website\",\n"
                + "      \"http://folding.stanford.edu/\"\n"
                + "    ],\n"
                + "    [\n"
                + "      \"Copyright\",\n"
                + "      \"(c) 2009-2013 Stanford University\"\n"
                + "    ],\n"
                + "    [\n"
                + "      \"Author\",\n"
                + "      \"Joseph Coffland <joseph@cauldrondevelopment.com>\"\n"
                + "    ],\n"
                + "    [\n"
                + "      \"Args\",\n"
                + "      \"\"\n"
                + "    ],\n"
                + "    [\n"
                + "      \"Config\",\n"
                + "      \"/Library/Application Support/FAHClient/config.xml\"\n"
                + "    ]\n"
                + "  ],\n"
                + "  [\n"
                + "    \"Build\",\n"
                + "    [\n"
                + "      \"Version\",\n"
                + "      \"7.3.6\"\n"
                + "    ],\n"
                + "    [\n"
                + "      \"Date\",\n"
                + "      \"Feb 18 2013\"\n"
                + "    ],\n"
                + "    [\n"
                + "      \"Time\",\n"
                + "      \"15:24:11\"\n"
                + "    ],\n"
                + "    [\n"
                + "      \"SVN Rev\",\n"
                + "      \"3923\"\n"
                + "    ],\n"
                + "    [\n"
                + "      \"Branch\",\n"
                + "      \"fah/trunk/client\"\n"
                + "    ],\n"
                + "    [\n"
                + "      \"Compiler\",\n"
                + "      \"GNU 4.2.1 (Apple Inc. build 5666) (dot 3)\"\n"
                + "    ],\n"
                + "    [\n"
                + "      \"Options\",\n"
                + "      \"-std=gnu++98 -O3 -funroll-loops -mfpmath=sse -ffast-math -fno-unsafe-math-optimizations -msse3 -arch x86_64 -mmacosx-version-min=10.5 -isysroot /Developer/SDKs/MacOSX10.5.sdk\"\n"
                + "    ],\n"
                + "    [\n"
                + "      \"Platform\",\n"
                + "      \"darwin 10.8.0\"\n"
                + "    ],\n"
                + "    [\n"
                + "      \"Bits\",\n"
                + "      \"64\"\n"
                + "    ],\n"
                + "    [\n"
                + "      \"Mode\",\n"
                + "      \"Release\"\n"
                + "    ]\n"
                + "  ],\n"
                + "  [\n"
                + "    \"System\",\n"
                + "    [\n"
                + "      \"CPU\",\n"
                + "      \"       Intel(R) Core(TM) i5-2435M CPU @ 2.40GHz\"\n"
                + "    ],\n"
                + "    [\n"
                + "      \"CPU ID\",\n"
                + "      \"GenuineIntel Family 6 Model 42 Stepping 7\"\n"
                + "    ],\n"
                + "    [\n"
                + "      \"CPUs\",\n"
                + "      \"4\"\n"
                + "    ],\n"
                + "    [\n"
                + "      \"Memory\",\n"
                + "      \"4.00GiB\"\n"
                + "    ],\n"
                + "    [\n"
                + "      \"Free Memory\",\n"
                + "      \"3.04GiB\"\n"
                + "    ],\n"
                + "    [\n"
                + "      \"Threads\",\n"
                + "      \"POSIX_THREADS\"\n"
                + "    ],\n"
                + "    [\n"
                + "      \"Has Battery\",\n"
                + "      \"true\"\n"
                + "    ],\n"
                + "    [\n"
                + "      \"On Battery\",\n"
                + "      \"true\"\n"
                + "    ],\n"
                + "    [\n"
                + "      \"UTC offset\",\n"
                + "      \"1\"\n"
                + "    ],\n"
                + "    [\n"
                + "      \"PID\",\n"
                + "      \"66\"\n"
                + "    ],\n"
                + "    [\n"
                + "      \"CWD\",\n"
                + "      \"/Library/Application Support/FAHClient\"\n"
                + "    ],\n"
                + "    [\n"
                + "      \"OS\",\n"
                + "      \"Darwin 12.4.0 x86_64\"\n"
                + "    ],\n"
                + "    [\n"
                + "      \"OS Arch\",\n"
                + "      \"AMD64\"\n"
                + "    ],\n"
                + "    [\n"
                + "      \"GPUs\",\n"
                + "      \"0\"\n"
                + "    ],\n"
                + "    [\n"
                + "      \"CUDA\",\n"
                + "      \"Not detected\"\n"
                + "    ]\n"
                + "  ]\n"
                + "]";

        Gson gson = new Gson();
        List list = gson.fromJson(json, ArrayList.class);

        System.out.println(list);
    }
}
