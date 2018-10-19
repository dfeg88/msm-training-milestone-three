package com.moneysupermarket.milestonethree.util;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeUtil {

    public static String getCurrentLocalTime() {
        return LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    public static String getPacificDaylightTime() {
        return LocalTime.now(ZoneId.of("UTC-7")).format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }
}
