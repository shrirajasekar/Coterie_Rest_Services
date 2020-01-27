package com.coterie.rest_services.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

import com.coterie.rest_services.model.Groups;

import org.springframework.data.mongodb.repository.MongoRepository;
/**
 * GroupsRepository
 */
@RepositoryRestResource(collectionResourceRel = "groups", path = "groups")
public interface GroupsRepository extends MongoRepository<Groups, String> {
    public List<Groups> findAll();
}