package com.moneysupermarket.milestonethree.controller;

import com.moneysupermarket.milestonethree.model.Profile;
import com.moneysupermarket.milestonethree.model.ProfileResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class ProfileController {

    @PostMapping(value = "profile")
    public ResponseEntity<ProfileResponse> save(@RequestBody Profile profile) {
        System.out.println(profile.toString());
        return new ResponseEntity<>(ProfileResponse.builder().profileId(UUID.randomUUID().toString()).build(), HttpStatus.OK);
    }
}
