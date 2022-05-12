package com.example.springjdbc.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Person {
    private long id;
    private String name;

    public Person(String name) {
        this.name = name;
    }
}
