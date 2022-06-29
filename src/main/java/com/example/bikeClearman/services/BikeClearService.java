package com.example.bikeClearman.services;

import com.example.bikeClearman.model.BikeClear;
import com.example.bikeClearman.model.User;
import org.springframework.data.repository.CrudRepository;

public interface BikeClearService extends
        CrudRepository <BikeClear, Integer> {

}
