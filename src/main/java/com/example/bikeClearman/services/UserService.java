package com.example.bikeClearman.services;

import com.example.bikeClearman.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserService extends
        CrudRepository<User, Integer> {


    Optional<User> findFirstByUserNameAndPassword(String userName, String password);
}
