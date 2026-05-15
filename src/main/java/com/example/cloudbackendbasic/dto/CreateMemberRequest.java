package com.example.cloudbackendbasic.dto;

import lombok.Getter;

@Getter
public class CreateMemberRequest {

    private final String name;
    private final Integer age;
    private final String mbti;

    public CreateMemberRequest(String name, Integer age, String mbti) {
        this.name = name;
        this.age = age;
        this.mbti = mbti;
    }
}
