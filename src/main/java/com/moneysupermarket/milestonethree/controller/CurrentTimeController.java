package com.moneysupermarket.milestonethree.controller;

import com.moneysupermarket.milestonethree.model.CurrentTime;
import com.moneysupermarket.milestonethree.service.CurrentTimeService;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@CrossOrigin(origins = {"http://localhost:8081", "http://localhost:5000"})
public class CurrentTimeController {

    private final CurrentTimeService currentTimeService;

    @GetMapping("/current-times")
    public CurrentTime getLocalAndCanadianDateTimes() {
        return currentTimeService.getCurrentTimes();
    }

    @Scheduled(cron = "0 */3 * ? * *")
    public void printTimesToConsole() {
        System.out.println("Local Time: " + currentTimeService.getCurrentTimes().getLocalTime());
    }
}
