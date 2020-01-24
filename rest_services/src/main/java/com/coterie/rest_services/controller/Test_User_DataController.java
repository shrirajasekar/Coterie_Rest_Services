package com.coterie.rest_services.controller;

import java.util.ArrayList;
import java.util.List;

import com.coterie.rest_services.model.Test_User_Data;
import com.coterie.rest_services.repository.Test_User_DataRepository;

import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserDataController
 */
@RestController
@RequestMapping("/test_User_Datas")
public class Test_User_DataController {

private Test_User_DataRepository repository;

@RequestMapping(value = "/", method = RequestMethod.GET)
public List<Test_User_Data> getAllUserDatas() {
  return repository.findAll();
}

// @RequestMapping(value = "/{id}", method = RequestMethod.GET)
// public UserData getUserById(@PathVariable("id") ObjectId id) {
//   return repository.findBy_id(id);
// }
    
}