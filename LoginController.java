package com.example.demo.controller;

import com.example.demo.dto.Login;
import com.example.demo.dto.LoginMsg;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
@RequestMapping("/api")
public class LoginController {
    @RequestMapping("/log")
    public ResponseEntity<?> register(@RequestBody Login login) {
        System.out.println("Login");
        System.out.println("username:" +login.getUsername());
        System.out.println("password:" +login.getPassword());
        return ResponseEntity.ok(new LoginMsg("Login Successfully"));
    }
    }
