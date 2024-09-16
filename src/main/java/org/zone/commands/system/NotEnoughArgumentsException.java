package org.zone.commands.system;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class NotEnoughArgumentsException extends IOException {
    public NotEnoughArgumentsException(@NotNull Iterable<String> missingArguments) {
        super("Not enough arguments. Missing: " + String.join(",", missingArguments));
    }
}
