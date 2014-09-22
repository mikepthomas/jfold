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
package com.googlecode.jfold.util;

/**
 * <p>Command class.</p>
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version 7.3.6
 */
public enum Command {

    /** Authenticate. */
    AUTH("auth", ResponseType.VOID),

    /** Error message. */
    ERROR("error", ResponseType.PYON),

    /** Exit the command processor. */
    EXIT("exit", ResponseType.VOID),

    /** Prints an increasing heartbeat count. */
    HEARTBEAT("heartbeat", ResponseType.PYON),

    /** Enable/disable log updates. */
    LOG_UPDATES("log-updates", ResponseType.PYON), // start | restart | stop

    /** Exit the command processor. */
    QUIT("quit", ResponseType.VOID),

    /**
     * Unpause all slots which are paused waiting for a screensaver and pause
     * them again on disconnect.
     */
    SCREENSAVER("screensaver", ResponseType.VOID),

    /** Enable/disable updates. */
    UPDATES("updates", ResponseType.VOID), // add <id> <rate> <expression> | del <id> | list | clear | reset

    // Folding@home Client:
    /** Bond a packet file to a outgoing debug socket connection. */
    BOND("bond", ResponseType.VOID), // <ip>:<port> <input> [output] [ip:port]

    /**
     * Return a PyON message indicating if the client has set a user, team or
     * passkey.
     */
    CONFIGURED("configured", ResponseType.PYON),

    /** Run one client cycle. */
    DO_CYCLE("do-cycle", ResponseType.VOID),

    /** Download a core. */
    DOWNLOAD_CORE("download-core", ResponseType.VOID), // <type> <url>

    /** Finish all or one slot(s). */
    FINISH("finish", ResponseType.VOID), // [slot]

    /** Print application information. */
    GET_INFO("get-info", ResponseType.STRING), // <category> <key>

    /** Print application information in PyON format. */
    INFO("info", ResponseType.PYON),

    /**
     * Inject a packet file to a listening debug socket. Will wait until packet
     * is processed.
     */
    INJECT("inject", ResponseType.VOID), // <ip>:<port> <input> [output] [ip:port]

    /** Disable specified unit states. */
    MASK_UNIT_STATE("mask-unit-state", ResponseType.VOID),

    /** Get number of slots in PyON format. */
    NUM_SLOTS("num-slots", ResponseType.PYON),

    /** Get or set a configuration option. */
    OPTION("option", ResponseType.STRING), // <name> [value]

    /**
     * List or set options with their values.
     *
     * If no name arguments are given then all options with non-default values
     * will be listed. If the '-d' argument is given then even defaulted options
     * will be listed. If the '-a' option is given then unset options will also
     * be listed. Otherwise, if option names are provided only those options
     * will be listed.
     * The special name '*' lists all options which have not yet been listed and
     * is affected by the '-d' and '-a' options.
     * If a name argument is followed directly by an equal sign then the rest of
     * the argument will be used to set the option's value. If instead a name
     * argument is followed immediately by a '!' then the option will be reset
     * to its default value.
     * Options which are set or reset will also be listed.
     * Options are listed as a PyON format dictionary.
     */
    OPTIONS("options", ResponseType.PYON),

    /** Pause all or one slot(s). */
    PAUSE("pause", ResponseType.VOID), // [slot]

    /** Get current total estimated Points Per Day. */
    PPD("ppd", ResponseType.PYON),

    /** Get work unit queue information in PyON format. */
    QUEUE_INFO("queue-info", ResponseType.PYON),

    /** Request an ID from the assignment server. */
    REQUEST_ID("request-id", ResponseType.VOID),

    /** Request work server assignment from the assignment server. */
    REQUEST_WS("request-ws", ResponseType.VOID),

    /**
     * Save the configuration either to the specified file or to the file the
     * configuration was last loaded from.
     */
    SAVE("save", ResponseType.VOID), // [file]

    /** Shutdown the application. */
    SHUTDOWN("shutdown", ResponseType.VOID),

    /** Get current simulation information. */
    SIMULATION_INFO("simulation-info", ResponseType.PYON), // <slot id>

    /**
     * Add a new slot. Configuration options for the new slot can be provided.
     */
    SLOT_ADD("slot-add", ResponseType.VOID), // <type> [<name>=<value>]...

    /** Delete a slot. If it is running a unit it will be stopped. */
    SLOT_DELETE("slot-delete", ResponseType.VOID), // <slot>

    /** Get slot information in PyON format. */
    SLOT_INFO("slot-info", ResponseType.PYON),

    /**
     * Modify an existing slot.
     *
     * Configuration options can be either set or reset using the same syntax
     * used by the 'options' command.
     */
    SLOT_MODIFY("slot-modify", ResponseType.VOID), // <id> <type> [<name><! | =<value>>]...

    /**
     * The first argument is the slot ID.
     *
     * See 'options' help for a description of the remaining arguments.
     */
    SLOT_OPTIONS("slot-options", ResponseType.PYON), // <slot> [-d | -a] | [name]...

    /** Get current protein trajectory. */
    TRAJECTORY("trajectory", ResponseType.VOID), // <slot id>

    /** Trigger config save after a delay. */
    TRIGGER_SAVE("trigger-save", ResponseType.VOID),

    /** Unpause all or one slot(s). */
    UNPAUSE("unpause", ResponseType.VOID), // [slot]

    /** Print application uptime. */
    UPTIME("uptime", ResponseType.STRING),

    /** Wait for all running units to finish. */
    WAIT_FOR_UNITS("wait-for-units", ResponseType.VOID),

    // Standard Commands:
    /** Add two values. */
    ADD("add", ResponseType.VOID), // <number> <number>

    /** Clear the screen. */
    CLEAR("clear", ResponseType.VOID),

    /**
     * Print the date and time.
     *
     * Optionally, with 'format'. See: man strftime
     */
    DATE("date", ResponseType.VOID), // [format]

    /** Divide two values. */
    DIV("div", ResponseType.VOID), // <number> <number>

    /** Evaluate all arguments. */
    EVAL("eval", ResponseType.VOID), // [expr]...

    /**
     * If 'cond' evaluates to a non-empty string then evalute 'expr1' otherwise,
     * if provided, evaluate 'expr2'.
     */
    IF("if", ResponseType.VOID), // <cond> <expr1> [expr2]

    /** Multiply two values. */
    MUL("mul", ResponseType.VOID), // <number> <number>

    /** Invert the truth value of the argument. */
    NOT("not", ResponseType.VOID), // <expr>

    /** Sleep for a number of seconds. */
    SLEEP("sleep", ResponseType.VOID), // <seconds>

    /** Subtract two values. */
    SUB("sub", ResponseType.VOID); // <number> <number>

    /**
     * Command.
     */
    private final String command;
    /**
     * Response Type.
     */
    private final ResponseType responseType;

    /**
     * Constructs an instance of <code>Command</code> with the specified
     * command name and response type.
     *
     * @param fahCommand the Folding@home client command.
     * @param commandResponseType the response type of the command.
     */
    Command(final String fahCommand, final ResponseType commandResponseType) {
        this.command = fahCommand;
        this.responseType = commandResponseType;
    }

    /**
     * Retrieve the response type of this command.
     *
     * @return ResponseType type of response.
     */
    public ResponseType getResponseType() {
        return responseType;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return command;
    }
}
