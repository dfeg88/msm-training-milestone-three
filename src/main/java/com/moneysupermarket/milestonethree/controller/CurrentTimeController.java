package com.moneysupermarket.milestonethree.controller;

import com.moneysupermarket.milestonethree.model.CurrentTime;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class CurrentTimeController {

    @RequestMapping(value = "/date-times", method = GET)
    public CurrentTime getCurrentTime() {
        return new CurrentTime(
                LocalDateTime.now(),
                LocalDateTime.now(ZoneId.of("UTC-07:00"))
        );
    }
}
