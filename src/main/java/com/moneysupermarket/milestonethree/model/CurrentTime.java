package com.moneysupermarket.milestonethree.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@AllArgsConstructor
@Getter
@Setter
public class CurrentTime {
    private LocalTime localDateTime;
    private LocalTime canadaDateTime;
}
