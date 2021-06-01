package com.example.demo.repository;
import org.springframework.jdbc.core.RowMapper;
import com.example.demo.domain.User;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {

  @Override
  public User mapRow(ResultSet rs, int rowNum) throws SQLException {

    User user = new User();
    user.setId(rs.getLong("id"));
    user.setFirstName(rs.getString("first_name"));
    user.setLastName(rs.getString("last_name"));
    user.setUserName(rs.getString("username"));

    return user;
  }
}
