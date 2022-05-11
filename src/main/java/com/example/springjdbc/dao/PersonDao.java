package com.example.springjdbc.dao;

import com.example.springjdbc.domain.Person;

import java.util.List;

public interface PersonDao {

    int count();

    void insert(Person person);

    Person getById(long id);

    List<Person> getAll();

    void deleteById(long id);
}
