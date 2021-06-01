package com.example.demo.domain;

import lombok.Data;

@Data
public class CreateUserRequest {

  private String firstName;
  private String lastName;
  private String userName;

}
