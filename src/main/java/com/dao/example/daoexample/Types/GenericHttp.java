package com.dao.example.daoexample.Types;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public interface GenericHttp <T>{

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    ResponseEntity<List<T>> createUser();

    @RequestMapping(value = "/update", method = RequestMethod.PATCH)
    ResponseEntity<List<T>> updateUser();

    @RequestMapping(value = "/delete/:id", method = RequestMethod.DELETE)
    ResponseEntity<List<T>> deleteUser();

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    ResponseEntity<List<T>> getUser();
}
