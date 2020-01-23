package com.coterie.rest_services.model;

public class Address{

    private String type;
    private AddressAttributes attributes;

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AddressAttributes getAttributes() {
        return this.attributes;
    }

    public void setAttributes(AddressAttributes attributes) {
        this.attributes = attributes;
    }

}

class AddressAttributes {
    private String street;
    private String houseNumber;
    private String city;

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return this.houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}