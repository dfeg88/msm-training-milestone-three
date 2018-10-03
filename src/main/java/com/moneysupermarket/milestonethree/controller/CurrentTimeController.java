package com.moneysupermarket.milestonethree.controller;

import com.moneysupermarket.milestonethree.model.CurrentTime;
import com.moneysupermarket.milestonethree.service.CurrentTimeService;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class CurrentTimeController {

    private final CurrentTimeService currentTimeService;

    @GetMapping("/current-times")
    public CurrentTime getLocalAndCanadianDateTimes() {
        System.out.println(currentTimeService.getCurrentTimes());
        return currentTimeService.getCurrentTimes();
    }

    @Scheduled(fixedRate = 10000)
    public void printTimesToConsole() {
        System.out.println("Local Time: " + currentTimeService.getCurrentTimes().getLocalDateTime());
    }
}
