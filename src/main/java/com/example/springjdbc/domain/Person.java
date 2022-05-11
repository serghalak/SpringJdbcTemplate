package com.example.springjdbc.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class Person {
    private final long id;
    private final String name;
}
