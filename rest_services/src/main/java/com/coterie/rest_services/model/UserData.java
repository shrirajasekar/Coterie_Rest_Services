package com.coterie.rest_services.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;


/**
 * UserData
 */
public class UserData {

    @Id
    private ObjectId _id;
    private String firstName;
    private String lastName;
    private String DOB;
    private String age;
    private Address address;

    public ObjectId get_id() {
        return this._id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDOB() {
        return this.DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getAge() {
        return this.age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    

    public UserData(ObjectId _id, String firstName, String lastName, String DOB, String age, Address address) {
        this._id = _id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
        this.age = age;
        this.address = address;
    }

    public UserData() {
    }


    @Override
    public String toString() {
        return "{" +
            " _id='" + get_id() + "'" +
            ", firstName='" + getFirstName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", DOB='" + getDOB() + "'" +
            ", age='" + getAge() + "'" +
            ", address='" + getAddress() + "'" +
            "}";
    }




    
}

