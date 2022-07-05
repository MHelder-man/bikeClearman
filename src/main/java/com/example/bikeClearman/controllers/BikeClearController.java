package com.example.bikeClearman.controllers;

import com.example.bikeClearman.model.BikeClear;
import com.example.bikeClearman.model.User;
import com.example.bikeClearman.services.BikeClearService;
import com.example.bikeClearman.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin (origins = "*")
public class BikeClearController {

    @Autowired
    BikeClearService bikeClearService;

    @PostMapping("/bikeClear")
    BikeClear save (@RequestBody BikeClear bikeClear) {
        return bikeClearService.save(bikeClear);
    }

    @GetMapping("/bikeClear")
        Iterable<BikeClear> findAll() {
        return bikeClearService.findAll();
    }

    @DeleteMapping("/bikeClear/{id}")
    void delete(@PathVariable int id) {
        bikeClearService.deleteById(id);
    }
}
