package com.dao.example.daoexample.presentation.controller;

import com.dao.example.daoexample.Types.GenericHttp;
import com.dao.example.daoexample.presentation.dto.PostDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController implements GenericHttp<PostDTO> {
    @Override
    public ResponseEntity<List<PostDTO>> createUser() {
        return null;
    }

    @Override
    public ResponseEntity<List<PostDTO>> updateUser() {
        return null;
    }

    @Override
    public ResponseEntity<List<PostDTO>> deleteUser() {
        return null;
    }

    @Override
    public ResponseEntity<List<PostDTO>> getUser() {
        return null;
    }
}
