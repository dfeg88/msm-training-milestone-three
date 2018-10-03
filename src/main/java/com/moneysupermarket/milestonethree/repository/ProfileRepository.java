package com.moneysupermarket.milestonethree.repository;

import com.moneysupermarket.milestonethree.model.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProfileRepository extends MongoRepository<Profile, String> {

}
