package com.example.demo.controllers;

import com.example.demo.domain.CreateUserRequest;
import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

  private final UserRepository userRepository;

  public User findUserById(Long id) {
    return userRepository.getUserById(id);
  }

  public List<User> findAll() {
    return userRepository.findAll();
  }

  public void deleteUser(Long id) {
    userRepository.deleteById(id);
  }

  public User createUser(CreateUserRequest request) {

    Long userId = userRepository.createUser(request);

    return new User(124532L, "safd", "safh", "fs");
  }
}
