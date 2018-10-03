package com.moneysupermarket.milestonethree.model;

import lombok.*;

@EqualsAndHashCode
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Customer {
    private String firstName;
    private String lastName;
}