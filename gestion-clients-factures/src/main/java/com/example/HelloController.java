package com.example;  // Make sure this matches your package name

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // This method maps HTTP GET requests to the root URL ("/")
    @GetMapping("/")
    public String home() {
        return "Welcome to Gestion Clients Factures!";
    }
}
