package com.example.demo.controller;

import com.example.demo.dto.Register;
import com.example.demo.dto.ResponseMsg;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins="http://127.0.0.1:5500")
@RestController
@RequestMapping("/api")
public class RegisterController {
    @RequestMapping("/reg")
    public ResponseEntity<?> register(@RequestBody Register register){
        System.out.println("Registration");
        System.out.println("username:"+register.getUsername());
        System.out.println("Location:"+register.getLocation());
        System.out.println("MobileNumber:"+register.getMobilenumber());
        System.out.println("Email:"+register.getEmail());
        System.out.println("Proof:"+register.getProof());
        System.out.println("Password"+register.getPassword());
        return ResponseEntity.ok(new ResponseMsg("Registration Successfully"));
    }
}
