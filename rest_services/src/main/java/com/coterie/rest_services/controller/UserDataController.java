package com.coterie.rest_services.controller;

import java.util.ArrayList;
import java.util.List;

import com.coterie.rest_services.model.UserData;
import com.coterie.rest_services.repository.TestUserDataRepository;

import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserDataController
 */
@RestController
@RequestMapping("/user")
public class UserDataController {

private TestUserDataRepository repository;

@RequestMapping(value = "/", method = RequestMethod.GET)
public List<UserData> getAllUserDatas() {
  return repository.findAll();
}

// @RequestMapping(value = "/{id}", method = RequestMethod.GET)
// public UserData getUserById(@PathVariable("id") ObjectId id) {
//   return repository.findBy_id(id);
// }
    
}