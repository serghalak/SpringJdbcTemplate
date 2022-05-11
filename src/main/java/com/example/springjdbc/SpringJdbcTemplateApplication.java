package com.example.springjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.h2.tools.Console;

import java.sql.SQLException;

@SpringBootApplication
public class SpringJdbcTemplateApplication {

    public static void main(String[] args) throws SQLException {
        //SpringApplication.run(SpringJdbcTemplateApplication.class, args);
        ApplicationContext context = SpringApplication.run(SpringJdbcTemplateApplication.class);
        System.out.println("context: " + context);
        Console.main(args);
    }

}
