package com.example.demo.controller;

import com.example.demo.dto.CountAppliance;
import com.example.demo.dto.CountApplianceMsg;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://127.0.0.1:5500")
@RequestMapping("/api")
public class CountApplianceController {
    @RequestMapping("/cntapp")
    public ResponseEntity<?> addtocart(@RequestBody CountAppliance countapp) {
        System.out.println("Count");
        System.out.println("ApplianceCount:" +countapp.getCountappliance());
        return ResponseEntity.ok(new CountApplianceMsg("Counted Successfully"));
    }
}
