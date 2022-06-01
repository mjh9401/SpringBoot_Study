package com.example.hello.controller;

import com.example.hello.dto.PostRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PostApiController {

    //@RequsetBody를 붙이는 이유는 POST API를 사용하면 DataBODY로 데이터를 받기때문에
    //@RequestBody를 붙이지 않을 경우 해당DTO에 값들이 매치되지 않아 들어가지 않는다.
    @PostMapping("/post")
    public void post(@RequestBody PostRequestDto requestData){
        System.out.println(requestData);
    }


}
