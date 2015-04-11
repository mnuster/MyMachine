package com.mnuster.mymachine.utility;

import com.mnuster.mymachine.REF.MOD;
import cpw.mods.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

public class LogHelper {
    private static void log(Level logLevel, Object obj) {
        FMLLog.log(logLevel, "[" + MOD.ID + "] %s", String.valueOf(obj));
    }

    public static void info(Object obj) {
        log(Level.INFO, obj);
    }

    public static void debug(Object obj) {
        log(Level.DEBUG, obj);
    }

    public static void error(Object obj) {
        log(Level.ERROR, obj);
    }

    public static void fatal(Object obj) {
        log(Level.FATAL, obj);
    }

    public static void trace(Object obj) {
        log(Level.TRACE, obj);
    }

    public static void warn(Object obj) {
        log(Level.WARN, obj);
    }
}
