package com.example.demo.controllers;

import com.example.demo.domain.Contact;
import com.example.demo.domain.CreateContactRequest;
import com.example.demo.service.ContactService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contacts")
@RequiredArgsConstructor
public class ContactController {

  private final ContactService contactService;

  @GetMapping(value = "/{userId}")
  @ResponseBody
  public List<Contact> getContacts(@PathVariable Long userId) {
    return contactService.findUserContacts(userId);
  }

  @PutMapping("")
  public Contact createContact(@RequestBody CreateContactRequest request) {
    return contactService.createContact(request);
  }
}
