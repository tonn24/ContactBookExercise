package com.example.demo.domain;

import lombok.Data;

@Data
public class CreateContactRequest {

  private Long userId;
  private ContactType contactType;
  private String value;

}
