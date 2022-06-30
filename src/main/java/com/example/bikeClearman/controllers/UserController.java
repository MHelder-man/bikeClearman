package com.example.bikeClearman.controllers;


import com.example.bikeClearman.model.User;
import com.example.bikeClearman.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user")
    User save(@Validated @RequestBody User user) throws Exception {
        if (!user.getUserName().equals("") && !user.getPassword().equals("") &&
                !user.getFirstname().equals("") && !user.getMail().equals("")){
            return userService.save(user);
        } else throw new IllegalArgumentException("Vul alle velden in");
    }

    @PostMapping("/login")
    User login(@RequestBody User user) throws Exception {
        return userService.findFirstByUserNameAndPassword(user.getUserName(), user.getPassword()).orElseThrow(() -> new Exception("Geen gebruiker gevonden"));

    }
    @GetMapping("/user")
    Iterable<User> findAll(){
        return userService.findAll();
    }

    @DeleteMapping("/user/{id}")
    void delete(@PathVariable int id) {
        userService.deleteById(id);
    }

}
