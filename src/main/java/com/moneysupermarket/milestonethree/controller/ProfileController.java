package com.moneysupermarket.milestonethree.controller;

import com.moneysupermarket.milestonethree.model.Profile;
import com.moneysupermarket.milestonethree.model.ProfileResponse;
import com.moneysupermarket.milestonethree.repository.ProfileRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@AllArgsConstructor
@RestController
public class ProfileController {

    private final ProfileRepository profileRepository;

    @PostMapping(value = "profile")
    public ResponseEntity<ProfileResponse> save(@RequestBody Profile profile) {
        profileRepository.save(profile);
        return new ResponseEntity<>(ProfileResponse.builder().profileId(UUID.randomUUID().toString()).build(), HttpStatus.OK);
    }

    @PutMapping (value = "profile")
    public ResponseEntity<ProfileResponse> update(@RequestBody Profile profile) {
        profileRepository.save(profile);
        return new ResponseEntity<>(ProfileResponse.builder().profileId(UUID.randomUUID().toString()).build(), HttpStatus.OK);
    }
}
