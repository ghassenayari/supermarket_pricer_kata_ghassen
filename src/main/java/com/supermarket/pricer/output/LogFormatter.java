package com.supermarket.pricer.output;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class LogFormatter extends Formatter {

    public String format(LogRecord record) {
        StringBuilder builder = new StringBuilder();
        builder.append(formatMessage(record));
        builder.append("\n");
        return builder.toString();
    }
}
