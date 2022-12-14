package com.supermarket.pricer.output;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * OutputHandler is responsible for wrapping up the logging methods
 * that are used to display the content of this console application.
 * <p>
 * Besides the default way, it provides an optional selection
 * of the output color.
 */

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class OutputHandler {

    private static final Logger LOGGER = Logger.getLogger("InfoDisplay");

    static {
        LOGGER.setUseParentHandlers(false);
        LogFormatter formatter = new LogFormatter();
        ConsoleHandler handler = new ConsoleHandler();
        handler.setFormatter(formatter);
        LOGGER.addHandler(handler);
    }

    public static void print(String text, OutputColor color) {
        LOGGER.log(Level.INFO, "{0}{1}{2}", new String[]{color.getColor(), text, OutputColor.DEFAULT.getColor()});
    }

    public static void print(String text) {
        LOGGER.log(Level.INFO, "{0}{1}{2}", new String[]{OutputColor.DEFAULT.getColor(), text, OutputColor.DEFAULT.getColor()});
    }
}
