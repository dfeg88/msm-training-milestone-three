package com.moneysupermarket.milestonethree.controller;

import com.moneysupermarket.milestonethree.model.CurrentTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
public class CurrentTimeController {

    @GetMapping("/date-times")
    public CurrentTime getLocalAndCanadianDateTimes() {
        return new CurrentTime(
                LocalDateTime.now(),
                LocalDateTime.now(ZoneId.of("UTC-07:00"))
        );
    }
}
