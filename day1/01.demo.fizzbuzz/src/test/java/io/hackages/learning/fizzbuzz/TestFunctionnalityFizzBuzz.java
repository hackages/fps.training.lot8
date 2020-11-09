package io.hackages.learning.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFunctionnalityFizzBuzz {

    public Main main = new Main();
    public FizzBuzzService fizzBuzzService = new FizzBuzzService();

    @Test
    public void test_fizzbuzz() {
        // Goal : print a number
        for (int i = 1 ; i< 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                assertEquals("FizzBuzz", main.transform(i), "FizzBuzz");
            } else if (i % 3 == 0) {
                assertEquals("Fizz", main.transform(i), "Fizz");
            } else if (i % 5 == 0) {
                assertEquals("Buzz", main.transform(i), "Buzz");
            } else {
                assertEquals(String.valueOf(i), main.transform(i), String.valueOf(i));
            }
        }
    }

    @Test
    public void test_fizzbuzz_using_replacer() {
        // Goal : print a number
        for (int i = 1 ; i< 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                assertEquals("FizzBuzz", fizzBuzzService.transform(i), "FizzBuzz");
            } else if (i % 3 == 0) {
                assertEquals("Fizz", fizzBuzzService.transform(i), "Fizz");
            } else if (i % 5 == 0) {
                assertEquals("Buzz", fizzBuzzService.transform(i), "Buzz");
            } else {
                assertEquals(String.valueOf(i), fizzBuzzService.transform(i), String.valueOf(i));
            }
        }
    }

}