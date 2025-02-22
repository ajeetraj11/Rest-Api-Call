package com.restapicalls.controller;

import com.restapicalls.UserDTO;
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

     // This method handles POST requests with a JSON body containing first and last names
     @PostMapping("/post")
     public String sayHelloWithPost(@RequestBody UserDTO user) {
          // Returning a hello message using the provided first and last names
          return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
     }
}
