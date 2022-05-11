package com.example.springjdbc.dao;

import com.example.springjdbc.domain.Person;
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
    private static final long MISHA_ID = 2L;
    private static final String MISHA_NAME = "misha";

    @Autowired
    private PersonDaoJdbc personDaoJdbc;

    @Test
    void count() {
        int count = personDaoJdbc.count();
        assertThat(count).isEqualTo(EXPECTED_PERSONS_COUNT);
    }

    @Test
    void insert() {
        Person vasya = new Person(3, "Vasya");
        personDaoJdbc.insert(vasya);

        int count = personDaoJdbc.count();
        assertThat(count).isEqualTo(EXPECTED_PERSONS_COUNT+1);

        Person byId = personDaoJdbc.getById(3);
        assertThat(vasya).isEqualTo(byId);

    }

    @Test
    void getById() {
        Person byId = personDaoJdbc.getById(MISHA_ID);
        Person misha = new Person(2, "misha");
        assertThat(misha).isEqualTo(byId);

        assertThat(misha)
                .hasFieldOrPropertyWithValue("id", MISHA_ID)
                .hasFieldOrPropertyWithValue("name", MISHA_NAME);

    }
}