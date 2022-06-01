package com.example.hello.controller;

import com.example.hello.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @RequestMapping("/main")
    public String main(){
        return "main.html";
    }

    // ResponseEntity
    // 왠만하면 권장하지 않음
    // JSON은 RestController를 통해서 생성을 권장함.
    @GetMapping("/user")
    @ResponseBody
    public User user(){
        // var 타입추론 java 11에서부터 추가
        var user = new User();
        user.setName("mjh");
        user.setAddress("패스트캠퍼스");
        
        return user;
    }
}
