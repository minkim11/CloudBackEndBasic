package com.example.cloudbackendbasic.dto;

import lombok.Getter;

@Getter
public class ReadMemberResponse {

    private final String name;
    private final Integer age;
    private final String mbti;

    public ReadMemberResponse(String name, Integer age, String mbti) {
        this.name = name;
        this.age = age;
        this.mbti = mbti;
    }
}
