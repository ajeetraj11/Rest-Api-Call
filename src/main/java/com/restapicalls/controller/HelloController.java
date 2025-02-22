package com.restapicalls.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Controller class to handle HTTP requests for hello messages
@RestController
@RequestMapping("/hello")
public class HelloController {

     // This method handles GET requests to return a simple greeting
     @GetMapping
     public String sayHello() {
          // Returning a hello message from BridgeLabz
          return "Hello from BridgeLabz";
     }
}
