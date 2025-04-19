package com.example.demo.controller;

import com.example.demo.dto.AddToCartApplianceMsg;
import com.example.demo.dto.AddToCartMsg;
import com.example.demo.dto.AddtoCartAppliance;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://127.0.0.1:5500")
@RequestMapping("/api")
public class AddtoCartApplianceController {
    @RequestMapping("/NetApp")
    public ResponseEntity<?> addtocart(@RequestBody AddtoCartAppliance countapp) {
        System.out.println("Count");
        System.out.println("ApplianceCount:" +countapp.getApplianceitem());
        return ResponseEntity.ok(new AddToCartApplianceMsg("Appliance Added  Successfully"));
    }
}
