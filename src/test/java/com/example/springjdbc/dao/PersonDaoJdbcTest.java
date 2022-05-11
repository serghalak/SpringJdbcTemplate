package com.example.springjdbc.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.context.annotation.Import;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@JdbcTest
@Import(PersonDaoJdbc.class)
class PersonDaoJdbcTest {

    private static final int EXPECTED_PERSONS_COUNT = 2;

    @Autowired
    private PersonDaoJdbc personDaoJdbc;

    @BeforeEach
    void setUp() {
    }

    @Test
    void count() {
        int count = personDaoJdbc.count();
        assertThat(count).isEqualTo(EXPECTED_PERSONS_COUNT);
    }

    @Test
    void insert() {
    }

    @Test
    void getById() {
    }
}