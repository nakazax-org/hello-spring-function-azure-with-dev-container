package com.example;

import java.util.function.Function;

import com.example.model.Greeting;
import com.example.model.User;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GoodbyeFunction {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(GoodbyeFunction.class, args);
    }

    @Bean
    public Function<User, Greeting> goodbye() {
        return user -> new Greeting("Goodbye, " + user.getName());
    }
}
