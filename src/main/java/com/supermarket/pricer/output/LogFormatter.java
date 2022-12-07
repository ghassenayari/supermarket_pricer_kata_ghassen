package com.supermarket.pricer.output;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

/**
 * LogFormatter is a customised formatter used to prettify
 * log outputs for this application.
 */

public class LogFormatter extends Formatter {

    public String format(LogRecord record) {
        StringBuilder builder = new StringBuilder();
        builder.append(formatMessage(record));
        builder.append("\n");
        return builder.toString();
    }
}
