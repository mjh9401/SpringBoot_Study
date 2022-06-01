package com.example.hello.controller;

import com.example.hello.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // 해당Class REST API 처리하는 Controller
@RequestMapping("/api") // RequestMapping URI를 지정해주는 Annotation
public class ApiController {

    @GetMapping("/hello") // http://localhost:8082/api/hello
    public String hello(){
        return "hello spring boot";
    }

    // TEXT
    @GetMapping("/text")
    public String text(@RequestParam String account){
        return account;
    }

    // JSON
    // req => object mapper => object => method => object => object maapper => response
    @PostMapping("/json")
    public User json(@RequestBody User user){
        return user; // 200 okay
    }

    // ResponseEntity
    @PutMapping("/put")
    public ResponseEntity<User> put(@RequestBody User user){
       return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
