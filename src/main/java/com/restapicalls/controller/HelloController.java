package com.restapicalls.controller;

import org.springframework.web.bind.annotation.*;

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

     // This method handles GET requests with a query parameter "name"
     @GetMapping("/query")
     public String sayHelloWithQueryParam(@RequestParam String name) {
          // Returning a personalized hello message with the provided name
          return "Hello " + name + " from BridgeLabz";
     }

     // This method handles GET requests with a path variable
     @GetMapping("/param/{name}")
     public String sayHelloWithPathVariable(@PathVariable String name) {
          // Returning a personalized hello message using the path variable
          return "Hello " + name + " from BridgeLabz";
     }
}
