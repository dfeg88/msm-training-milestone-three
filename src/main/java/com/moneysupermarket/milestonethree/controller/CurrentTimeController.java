package com.moneysupermarket.milestonethree.controller;

import com.moneysupermarket.milestonethree.model.CurrentTime;
import com.moneysupermarket.milestonethree.service.CurrentTimeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class CurrentTimeController {

    private final CurrentTimeService currentTimeService;

    @GetMapping("/date-times")
    public CurrentTime getLocalAndCanadianDateTimes() {
        return new CurrentTime(
                currentTimeService.getLocalTime(),
                currentTimeService.getTimeInCanada()
        );
    }
}
