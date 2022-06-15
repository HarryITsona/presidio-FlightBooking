package com.harish.flightsystem.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/all")
    public List<Users> getAllUser(){

        return userService.getAllUsers();
    }

    @PostMapping("/add")
    public void addUser(@RequestBody Users users){
        userService.addUser(users);
    }
}
