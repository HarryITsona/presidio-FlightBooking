package com.harish.flightsystem.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    public List<Users> getAllUsers();
    public void addUser(Users users);
}
