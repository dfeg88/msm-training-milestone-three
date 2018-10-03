package com.moneysupermarket.milestonethree.service;

import com.moneysupermarket.milestonethree.model.CurrentTime;
import com.moneysupermarket.milestonethree.util.TimeUtil;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.time.ZoneId;

@Component
public class CurrentTimeService {

    public CurrentTime getCurrentTimes() {
        return new CurrentTime(
                TimeUtil.getCurrentLocalTime(),
                TimeUtil.getPacificDaylightTime());
    }

}
