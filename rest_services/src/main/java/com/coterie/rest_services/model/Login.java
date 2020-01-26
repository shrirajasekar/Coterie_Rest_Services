package com.coterie.rest_services.model;

import org.springframework.data.annotation.Id;

/**
 * Login
 */
public class Login {

    @Id
  public String _id;

  public String firstName;
  public String lastName;

  public Login() {}

  public Login(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return String.format(
        "Login[id=%s, firstName='%s', lastName='%s']",
        _id, firstName, lastName);
  }
}