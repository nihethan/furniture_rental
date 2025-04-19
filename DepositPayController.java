package com.example.demo.controller;


import com.example.demo.dto.DepositPay;
import com.example.demo.dto.DepositePayMsg;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://127.0.0.1:5500")
@RequestMapping("/api")
public class DepositPayController {
    @RequestMapping("/prepay")
    public ResponseEntity<?> addtocart(@RequestBody DepositPay depositPay) {
            System.out.println("Deposit");
            System.out.println("DepositAmount Payment Method:" +depositPay.getDepositamt());
            return ResponseEntity.ok(new DepositePayMsg("Deposit Paid Successfully"));
        }
}
