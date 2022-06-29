package com.example.bikeClearman.controllers;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.sql.SQLIntegrityConstraintViolationException;

@ControllerAdvice
@ResponseBody
public class ExeptionHandlers {
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> exceptionHandler(IllegalArgumentException ex) {
        return new ResponseEntity<String>("exception: " + ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public ResponseEntity<String>
    userHandler(SQLIntegrityConstraintViolationException exception) {
        return new ResponseEntity<String>("Error username al in gebruik " , HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> exceptionHandler(Exception ex) {
        return new ResponseEntity<String>("exception: " + ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

}
