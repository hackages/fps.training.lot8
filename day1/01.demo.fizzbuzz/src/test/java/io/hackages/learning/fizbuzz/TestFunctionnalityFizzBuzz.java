package io.hackages.learning.fizbuzz; 

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestFunctionnalityFizzBuzz {
    public io.hackages.learning.fizbuzz.Main main = new io.hackages.learning.fizbuzz.Main();

    @Test
    public void test_fizzbuzz() {
        // Goal: print a 1
        assertEquals("1", main.transform(1), "1");
        assertEquals("2", main.transform(2), "2");
        assertEquals("fizz", main.transform(3), "fizz");
    }
}