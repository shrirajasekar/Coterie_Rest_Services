package com.coterie.rest_services.repository;

import java.util.ArrayList;
import java.util.List;

import com.coterie.rest_services.model.Test_User_Data;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * UserDataRepository
 */
public interface Test_User_DataRepository extends MongoRepository<Test_User_Data, String> {

    // UserData findBy_id(ObjectId _id);
    // List<UserData> findByFirstName(String firstName);
    // List<UserData> findByLastName(String lastName);
    // List<UserData> findByAge(String age);
}