package com.moneysupermarket.milestonethree.controller;

import com.moneysupermarket.milestonethree.model.CurrentTime;
import com.moneysupermarket.milestonethree.service.CurrentTimeService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@Getter
@Setter
@RestController
public class CurrentTimeController {

    private CurrentTimeService currentTimeService;

    @GetMapping("/current-times")
    public CurrentTime getLocalAndCanadianDateTimes() {
        return currentTimeService.getCurrentTimes();
    }
}
