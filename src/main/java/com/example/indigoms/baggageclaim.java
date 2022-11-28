package com.example.indigoms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class baggageclaim {
    @GetMapping("/baggageclaim")
    public String getData(){
        return "Please book your flight ticket";
    }
}
