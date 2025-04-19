package com.example.demo.controller;

import com.example.demo.dto.DepositPay;
import com.example.demo.dto.DepositePayMsg;
import com.example.demo.dto.TotalAmount;
import com.example.demo.dto.TotalAmountMsg;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://127.0.0.1:5500")
@RequestMapping("/api")
public class TotalAmountController {
    @RequestMapping("/totality")
    public ResponseEntity<?> addtocart(@RequestBody TotalAmount totalAmount) {
        System.out.println("Total Amount");
        System.out.println("DepositAmount Payment Method:" +totalAmount.getTotalamtdata());
        return ResponseEntity.ok(new TotalAmountMsg("Amount Paid Successfully"));
    }
}
