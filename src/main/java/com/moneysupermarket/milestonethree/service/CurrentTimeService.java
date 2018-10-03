package com.moneysupermarket.milestonethree.service;

import com.moneysupermarket.milestonethree.model.CurrentTime;
import com.moneysupermarket.milestonethree.util.TimeUtil;
import org.springframework.stereotype.Component;

@Component
public class CurrentTimeService {

    public CurrentTime getCurrentTimes() {
        return new CurrentTime(
                TimeUtil.getCurrentLocalTime(),
                TimeUtil.getPacificDaylightTime());
    }

}
