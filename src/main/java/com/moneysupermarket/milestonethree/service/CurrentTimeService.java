package com.moneysupermarket.milestonethree.service;

import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.time.ZoneId;

@Component
public class CurrentTimeService {

    public LocalTime getLocalTime() {
        return LocalTime.now();
    }

    public LocalTime getTimeInCanada() {
        return LocalTime.now(ZoneId.of("UTC-7"));
    }

}
