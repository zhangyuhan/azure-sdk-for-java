/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2018_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The start container exec request.
 */
public class ContainerExecRequest {
    /**
     * The command to be executed.
     */
    @JsonProperty(value = "command")
    private String command;

    /**
     * The size of the terminal.
     */
    @JsonProperty(value = "terminalSize")
    private ContainerExecRequestTerminalSize terminalSize;

    /**
     * Get the command to be executed.
     *
     * @return the command value
     */
    public String command() {
        return this.command;
    }

    /**
     * Set the command to be executed.
     *
     * @param command the command value to set
     * @return the ContainerExecRequest object itself.
     */
    public ContainerExecRequest withCommand(String command) {
        this.command = command;
        return this;
    }

    /**
     * Get the size of the terminal.
     *
     * @return the terminalSize value
     */
    public ContainerExecRequestTerminalSize terminalSize() {
        return this.terminalSize;
    }

    /**
     * Set the size of the terminal.
     *
     * @param terminalSize the terminalSize value to set
     * @return the ContainerExecRequest object itself.
     */
    public ContainerExecRequest withTerminalSize(ContainerExecRequestTerminalSize terminalSize) {
        this.terminalSize = terminalSize;
        return this;
    }

}