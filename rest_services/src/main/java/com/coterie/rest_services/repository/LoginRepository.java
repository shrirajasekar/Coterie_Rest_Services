package com.coterie.rest_services.repository;

import java.util.List;

import com.coterie.rest_services.model.Login;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
/**
 * LoginRepository
 */
@RepositoryRestResource(collectionResourceRel = "login", path = "login")
public interface LoginRepository extends MongoRepository<Login, String> {
    public Login findByFirstName(String firstName);
    public List<Login> findByLastName(String lastName);  
    
}