package com.coterie.rest_services.model;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Greetings
 */

public class Greetings {

    public long id;
    public String message;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

	    


    @Autowired
    public Greetings(long id, String message) {
        this.id = id;
        this.message = message;
    }

    public Greetings() {
        this.id=000;
        this.message="Default Constructor says Hello";
	}

	

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", message='" + getMessage() + "'" +
            "}";
    }


}