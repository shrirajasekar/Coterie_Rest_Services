package com.coterie.rest_services.model;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Greetings
 */

public class Greetings {

    public final long id;
    public final String message;

    @Autowired
    public Greetings(long id, String message) {
        this.id = id;
        this.message = message;
    }

    public Greetings() {
        this.id=000;
        this.message="Default Constructor says Hello";
	}

	public long getId() {
        return this.id;
    }


    public String getMessage() {
        return this.message;
    }



    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", message='" + getMessage() + "'" +
            "}";
    }


}