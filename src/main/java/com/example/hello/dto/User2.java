package com.example.hello.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User2 {
    private String name;
    private int age;
    @JsonProperty("phone_number")
    private String phoneNumeber;

    public User2(){
        this.name = null;
        this.age = 0;
        this.phoneNumeber = null;
    }
    public User2(String name,int age,String phoneNumeber){
        this.name = name;
        this.age = age;
        this.phoneNumeber = phoneNumeber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    // getter 이외의 get을 붙이면 ObjectMapper 오류발생
    public User2 defaultUser(){
        return new User2("dafault",0,"010-0000-1111");
    }

    public String getPhoneNumeber() {
        return phoneNumeber;
    }

    @Override
    public String toString() {
        return "User2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumeber='" + phoneNumeber + '\'' +
                '}';
    }
}
