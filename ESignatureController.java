package com.example.demo.controller;


import com.example.demo.dto.ESignature;
import com.example.demo.dto.ESignatureMsg;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://127.0.0.1:5500")
@RequestMapping("/api")
public class ESignatureController {
    @RequestMapping("/esignature")
    public ResponseEntity<?> addtocart(@RequestBody ESignature eSignature) {
        System.out.println("ESignature");
        System.out.println(eSignature.getEsign());
        return ResponseEntity.ok(new ESignatureMsg("ESignature Setted Successfully"));
    }}