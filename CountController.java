package com.example.demo.controller;

import com.example.demo.dto.AddToCart;
import com.example.demo.dto.AddToCartMsg;
import com.example.demo.dto.Count;
import com.example.demo.dto.CountMsg;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://127.0.0.1:5500")
@RequestMapping("/api")
public class CountController {
    @RequestMapping("/cnt")
    public ResponseEntity<?> addtocart(@RequestBody Count count) {
        System.out.println("Count");
        System.out.println("Count1:" +count.getCount());
        return ResponseEntity.ok(new CountMsg("Counted Successfully"));
    }
}
