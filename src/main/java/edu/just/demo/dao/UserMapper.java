package edu.just.demo.dao;

import edu.just.demo.model.User;
import edu.just.demo.utils.MyMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends MyMapper<User> {
    public String getPassword(String username);
    public String getRole(String username);
}