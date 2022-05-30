package com.example.hello.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello") //http://localhost:8082/api/get/hello
    public String Hello(){
        return "get Hello";
    }

    @RequestMapping(path = "/hi",method = RequestMethod.GET) // get http://localhost:8082/api/get/hi
    public String hi(){
        return "hi";
    }

    //http://localhost:8082/api/get/path-variable/{name}
    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable(name = "name") String pathName){
        System.out.println("PathVariable : "+pathName);
        return pathName;
    }

    // http://localhost:8082/api/get/query-param?user=mjh&email=mjh9401@naver.com&age=29

}
