package com.example.indigoms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mealbooking {
    @GetMapping("/mymealbooking")
    public String getData(){
        return "Please book your meal at lesser price";
    }
}
