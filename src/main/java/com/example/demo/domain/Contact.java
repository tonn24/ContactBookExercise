package com.example.demo.domain;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Contact {

  private Long id;
  private Long userId;
  private ContactType contactType;
  private String value;

}
