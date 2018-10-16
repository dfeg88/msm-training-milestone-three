package com.moneysupermarket.milestonethree.service;

import com.moneysupermarket.milestonethree.model.Profile;
import com.moneysupermarket.milestonethree.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    public Optional<Profile> getProfile(String id) {
        return profileRepository.findById(id);
    }

}
