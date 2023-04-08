package com.eazybytes.springsecuritysection2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {

    @GetMapping("/myCards")
    public String getAccountDetails() {
        return "Here are the card details from the db";
    }
}
