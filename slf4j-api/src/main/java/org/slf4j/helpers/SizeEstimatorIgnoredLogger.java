package org.slf4j.helpers;

import org.slf4j.Logger;
import org.slf4j.Marker;

/**
 * Logger wrapper that is not traversed by org.apache.spark.util.SizeEstimator due to it extending ClassLoader.
 * This fixes an issue where the SizeEstimator ends up traversing the entire jvm object space.
 */
public class SizeEstimatorIgnoredLogger extends ClassLoader implements Logger {
    public SizeEstimatorIgnoredLogger(Logger loggerDelegate) {
        this.loggerDelegate = loggerDelegate;
    }

    public String getName() {
        return loggerDelegate.getName();
    }

    public boolean isTraceEnabled() {
        return loggerDelegate.isTraceEnabled();
    }

    public void trace(String msg) {
        loggerDelegate.trace(msg);
    }

    public void trace(String format, Object arg) {
        loggerDelegate.trace(format, arg);
    }

    public void trace(String format, Object arg1, Object arg2) {
        loggerDelegate.trace(format, arg1, arg2);
    }

    public void trace(String format, Object... arguments) {
        loggerDelegate.trace(format, arguments);
    }

    public void trace(String msg, Throwable t) {
        loggerDelegate.trace(msg, t);
    }

    public boolean isTraceEnabled(Marker marker) {
        return loggerDelegate.isTraceEnabled(marker);
    }

    public void trace(Marker marker, String msg) {
        loggerDelegate.trace(marker, msg);
    }

    public void trace(Marker marker, String format, Object arg) {
        loggerDelegate.trace(marker, format, arg);
    }

    public void trace(Marker marker, String format, Object arg1, Object arg2) {
        loggerDelegate.trace(marker, format, arg1, arg2);
    }

    public void trace(Marker marker, String format, Object... argArray) {
        loggerDelegate.trace(marker, format, argArray);
    }

    public void trace(Marker marker, String msg, Throwable t) {
        loggerDelegate.trace(marker, msg, t);
    }

    public boolean isDebugEnabled() {
        return loggerDelegate.isDebugEnabled();
    }

    public void debug(String msg) {
        loggerDelegate.debug(msg);
    }

    public void debug(String format, Object arg) {
        loggerDelegate.debug(format, arg);
    }

    public void debug(String format, Object arg1, Object arg2) {
        loggerDelegate.debug(format, arg1, arg2);
    }

    public void debug(String format, Object... arguments) {
        loggerDelegate.debug(format, arguments);
    }

    public void debug(String msg, Throwable t) {
        loggerDelegate.debug(msg, t);
    }

    public boolean isDebugEnabled(Marker marker) {
        return loggerDelegate.isDebugEnabled(marker);
    }

    public void debug(Marker marker, String msg) {
        loggerDelegate.debug(marker, msg);
    }

    public void debug(Marker marker, String format, Object arg) {
        loggerDelegate.debug(marker, format, arg);
    }

    public void debug(Marker marker, String format, Object arg1, Object arg2) {
        loggerDelegate.debug(marker, format, arg1, arg2);
    }

    public void debug(Marker marker, String format, Object... arguments) {
        loggerDelegate.debug(marker, format, arguments);
    }

    public void debug(Marker marker, String msg, Throwable t) {
        loggerDelegate.debug(marker, msg, t);
    }

    public boolean isInfoEnabled() {
        return loggerDelegate.isInfoEnabled();
    }

    public void info(String msg) {
        loggerDelegate.info(msg);
    }

    public void info(String format, Object arg) {
        loggerDelegate.info(format, arg);
    }

    public void info(String format, Object arg1, Object arg2) {
        loggerDelegate.info(format, arg1, arg2);
    }

    public void info(String format, Object... arguments) {
        loggerDelegate.info(format, arguments);
    }

    public void info(String msg, Throwable t) {
        loggerDelegate.info(msg, t);
    }

    public boolean isInfoEnabled(Marker marker) {
        return loggerDelegate.isInfoEnabled(marker);
    }

    public void info(Marker marker, String msg) {
        loggerDelegate.info(marker, msg);
    }

    public void info(Marker marker, String format, Object arg) {
        loggerDelegate.info(marker, format, arg);
    }

    public void info(Marker marker, String format, Object arg1, Object arg2) {
        loggerDelegate.info(marker, format, arg1, arg2);
    }

    public void info(Marker marker, String format, Object... arguments) {
        loggerDelegate.info(marker, format, arguments);
    }

    public void info(Marker marker, String msg, Throwable t) {
        loggerDelegate.info(marker, msg, t);
    }

    public boolean isWarnEnabled() {
        return loggerDelegate.isWarnEnabled();
    }

    public void warn(String msg) {
        loggerDelegate.warn(msg);
    }

    public void warn(String format, Object arg) {
        loggerDelegate.warn(format, arg);
    }

    public void warn(String format, Object... arguments) {
        loggerDelegate.warn(format, arguments);
    }

    public void warn(String format, Object arg1, Object arg2) {
        loggerDelegate.warn(format, arg1, arg2);
    }

    public void warn(String msg, Throwable t) {
        loggerDelegate.warn(msg, t);
    }

    public boolean isWarnEnabled(Marker marker) {
        return loggerDelegate.isWarnEnabled(marker);
    }

    public void warn(Marker marker, String msg) {
        loggerDelegate.warn(marker, msg);
    }

    public void warn(Marker marker, String format, Object arg) {
        loggerDelegate.warn(marker, format, arg);
    }

    public void warn(Marker marker, String format, Object arg1, Object arg2) {
        loggerDelegate.warn(marker, format, arg1, arg2);
    }

    public void warn(Marker marker, String format, Object... arguments) {
        loggerDelegate.warn(marker, format, arguments);
    }

    public void warn(Marker marker, String msg, Throwable t) {
        loggerDelegate.warn(marker, msg, t);
    }

    public boolean isErrorEnabled() {
        return loggerDelegate.isErrorEnabled();
    }

    public void error(String msg) {
        loggerDelegate.error(msg);
    }

    public void error(String format, Object arg) {
        loggerDelegate.error(format, arg);
    }

    public void error(String format, Object arg1, Object arg2) {
        loggerDelegate.error(format, arg1, arg2);
    }

    public void error(String format, Object... arguments) {
        loggerDelegate.error(format, arguments);
    }

    public void error(String msg, Throwable t) {
        loggerDelegate.error(msg, t);
    }

    public boolean isErrorEnabled(Marker marker) {
        return loggerDelegate.isErrorEnabled(marker);
    }

    public void error(Marker marker, String msg) {
        loggerDelegate.error(marker, msg);
    }

    public void error(Marker marker, String format, Object arg) {
        loggerDelegate.error(marker, format, arg);
    }

    public void error(Marker marker, String format, Object arg1, Object arg2) {
        loggerDelegate.error(marker, format, arg1, arg2);
    }

    public void error(Marker marker, String format, Object... arguments) {
        loggerDelegate.error(marker, format, arguments);
    }

    public void error(Marker marker, String msg, Throwable t) {
        loggerDelegate.error(marker, msg, t);
    }

    private final Logger loggerDelegate;
}
