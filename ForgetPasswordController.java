package com.example.demo.controller;

import com.example.demo.dto.ForgetPassword;
import com.example.demo.dto.ForgetPasswordMsg;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins= "http://127.0.0.1:5500")
@RestController
@RequestMapping("/api")
public class ForgetPasswordController {
    @RequestMapping("/forget")
    public ResponseEntity<?> register(@RequestBody ForgetPassword forgetpwd) {
        System.out.println("ForgetPassword");
        System.out.println("Email:" +forgetpwd.getEmail());
        System.out.println("NewPassword:" +forgetpwd.getForgetpassword());
        System.out.println("ConformPassword:"+forgetpwd.getConformpassword());
        return ResponseEntity.ok(new ForgetPasswordMsg("Password Updated Successfully"));
    }
}
