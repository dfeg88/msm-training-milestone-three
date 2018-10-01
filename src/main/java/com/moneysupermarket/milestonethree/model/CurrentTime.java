package com.moneysupermarket.milestonethree.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
public class CurrentTime {
    private LocalDateTime localDateTime;
    private LocalDateTime canadaDateTime;
}
