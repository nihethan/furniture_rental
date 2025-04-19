package com.example.demo.controller;

import com.example.demo.dto.AddToCartApplianceMsg;
import com.example.demo.dto.AddtoCartAppliance;
import com.example.demo.dto.RentalPlan;
import com.example.demo.dto.RentalPlanMsg;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins="http://127.0.0.1:5500")
@RequestMapping("/api")
public class RentalPlanController {
    @RequestMapping("/plan")
    public ResponseEntity<?> addtocart(@RequestBody RentalPlan rentalPlan) {
        System.out.println("RentalPlan:" +rentalPlan.getRentalplan());
        return ResponseEntity.ok(new RentalPlanMsg("Rental Plan setted Successfully"));
    }
}
