package com.example.demo.controller;

import com.example.demo.dto.AddToCart;
import com.example.demo.dto.AddToCartMsg;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins= "http://127.0.0.1:5500")
@RestController
@RequestMapping("/api")
public class AddtoCartController {
    @RequestMapping("/cartload")
    public ResponseEntity<?> addtocart(@RequestBody AddToCart addtocart) {
        System.out.println("AddtoCart");
        System.out.println("Items:" +addtocart.getItem());
        return ResponseEntity.ok(new AddToCartMsg("Item Add toCart Successfully"));
    }
}
