package com.example.demo.service;

import com.example.demo.domain.Contact;
import com.example.demo.domain.ContactType;
import com.example.demo.domain.CreateContactRequest;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

  public List<Contact> findUserContacts(Long userId) {
    return List.of(new Contact(userId, 2433L, ContactType.ADDRESS, "sfjh"));
  }

  public Contact createContact(CreateContactRequest request) {
    return null;
  }
}
