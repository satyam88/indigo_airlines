package com.example.indigoms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class webcheckin {
    @GetMapping("/mywebcheckin")
    public String getData(){
        return "Please do web checkin before 48 hours of flight";
    }
}
