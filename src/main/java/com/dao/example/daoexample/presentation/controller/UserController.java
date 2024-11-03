package com.dao.example.daoexample.presentation.controller;


import com.dao.example.daoexample.Types.GenericHttp;
import com.dao.example.daoexample.presentation.dto.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController implements GenericHttp<UserDTO> {
    @Override
    public ResponseEntity<List<UserDTO>> createUser() {
        return null;
    }

    @Override
    public ResponseEntity<List<UserDTO>> updateUser() {
        return null;
    }

    @Override
    public ResponseEntity<List<UserDTO>> deleteUser() {
        return null;
    }

    @Override
    public ResponseEntity<List<UserDTO>> getUser() {
        return null;
    }
}
