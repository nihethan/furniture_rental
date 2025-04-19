package com.example.demo.controller;

import com.example.demo.dto.UserRating;
import com.example.demo.dto.UserRatingMsg;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    @CrossOrigin(origins="http://127.0.0.1:5500")
    @RequestMapping("/api")
    public class UserRatingController {
        @RequestMapping("/rating")
        public ResponseEntity<?> addtocart(@RequestBody UserRating rating) {
           // System.out.println("Count");
            System.out.println("UserRating:" +rating.getRating());
            return ResponseEntity.ok(new UserRatingMsg("Rating can be provided Successfully"));
        }
}
