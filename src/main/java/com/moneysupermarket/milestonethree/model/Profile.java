package com.moneysupermarket.milestonethree.model;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Profile {
    private Customer customer;
    private Address address;
    private Car car;
}


