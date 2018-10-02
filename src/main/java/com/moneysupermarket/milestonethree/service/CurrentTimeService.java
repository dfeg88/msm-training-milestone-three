package com.moneysupermarket.milestonethree.service;

import com.moneysupermarket.milestonethree.model.CurrentTime;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.time.ZoneId;

@Component
public class CurrentTimeService {

    public CurrentTime getCurrentTimes() {
        return new CurrentTime(
                getLocalTime(),
                getPacificDaylightTime());
    }

    private LocalTime getLocalTime() {
        return LocalTime.now();
    }

    private LocalTime getPacificDaylightTime() {
        return LocalTime.now(ZoneId.of("UTC-7"));
    }

}
