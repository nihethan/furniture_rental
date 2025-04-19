package com.example.demo.controller;

import com.example.demo.dto.Return;
import com.example.demo.dto.ReturnMsg;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://127.0.0.1:5500")
@RequestMapping("/api")
public class ReturnController {
    @RequestMapping("/return")
    public ResponseEntity<?> addtocart(@RequestBody Return ret) {
        System.out.println("Return Data");
        System.out.println("RentedMonth:" + ret.getRentedmonths());

        System.out.println("UsedMonth:" + ret.getUsedmonths());
        System.out.println("Rentalplan:" + ret.getRentalplan());
        return ResponseEntity.ok(new ReturnMsg("Return Verified Successfully"));
    }
}