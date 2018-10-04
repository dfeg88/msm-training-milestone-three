package com.moneysupermarket.milestonethree.model;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalTime;

@AllArgsConstructor
@Getter
public class CurrentTime {
    private LocalTime localTime;
    private LocalTime canadaTime;
}
