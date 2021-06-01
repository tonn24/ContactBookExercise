package com.example.demo.repository;

import com.example.demo.domain.CreateUserRequest;
import com.example.demo.domain.User;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserRepository {

  private final JdbcTemplate jdbcTemplate;

  public Long createUser(CreateUserRequest request) {

    String sql = "insert into users(first_name, last_name, username)"
        + " values(?, ?, ?) returning id";

    return jdbcTemplate.queryForObject(sql, Long.class, request.getFirstName(), request.getLastName(), request.getUserName());
  }


  public User getUserById(Long id) {
    String sql = "SELECT * FROM users WHERE ID = ?";

    return jdbcTemplate.query(sql, new UserRowMapper(), id).stream()
        .findFirst().orElse(null);
  }

  public List<User> findAll() {

    String sql = "SELECT * FROM users";

    List<User> users = jdbcTemplate.query(
        sql,
        new UserRowMapper());

    return users;

  }

  public void deleteById(Long id) {
    String sql = "DELETE FROM  users WHERE ID = ?";

    jdbcTemplate.update(sql, id);

    //jdbcTemplate.query(sql, new UserRowMapper(), id);
  }
}
