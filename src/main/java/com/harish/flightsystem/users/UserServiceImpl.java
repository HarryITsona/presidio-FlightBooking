package com.harish.flightsystem.users;

import com.harish.flightsystem.users.UserRepository;
import com.harish.flightsystem.users.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    public List<Users> getAllUsers(){
        return userRepository.findAll();
    }
    public void addUser(Users users){
        userRepository.save(users);
    }

}
