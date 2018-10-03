package com.moneysupermarket.milestonethree.util;

import java.time.LocalTime;
import java.time.ZoneId;

public class TimeUtil {

    public static LocalTime getCurrentLocalTime() {
        return LocalTime.now();
    }

    public static LocalTime getPacificDaylightTime() {
        return LocalTime.now(ZoneId.of("UTC-7"));
    }
}
