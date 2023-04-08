package com.eazybytes.springsecuritysection2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactsController {

    @GetMapping("/contact")
    public String getAccountDetails() {
        return "Here are the contacts details from the db";
    }
}
