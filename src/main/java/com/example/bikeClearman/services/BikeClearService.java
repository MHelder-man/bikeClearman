package com.example.bikeClearman.services;

import com.example.bikeClearman.model.BikeClear;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BikeClearService extends
        CrudRepository <BikeClear, Integer> {

}
