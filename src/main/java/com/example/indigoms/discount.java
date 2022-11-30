package com.example.indigoms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class discount {
    @GetMapping("/discount")
    public String getData(){
        return "Please use code flyhigh200 to get discount";
    }
}