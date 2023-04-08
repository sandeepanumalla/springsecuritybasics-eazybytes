package com.eazybytes.springsecuritybasics.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String sayWelcome() {
        return "Welcome to web page with Security";
    }
}
