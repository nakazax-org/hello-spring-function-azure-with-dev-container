package com.example;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.model.Greeting;
import com.example.model.User;

import org.junit.Test;

public class HelloFunctionTest {

    @Test
    public void test() {
        Greeting result = new HelloFunction().hello().apply(new User("foo"));
        assertThat(result.getMessage()).isEqualTo("Welcome, foo");
    }
}
