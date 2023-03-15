package com.patterns.creational.objectpool.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimestampHelper {

    public static String get() {
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss.SSS");
        return simpleDateFormat.format(new Date()) + " - ";
    }

}
