package io.hackages.learning.fizbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercice01Test {
    @Test
    public void test_countInLatin() {
        // Goal: print a 1
        for (int i=1; i<=3000; i++) {
            String result = Exercice01.countInLatin(i);
            // assertEquals("MMMDLVX", result, "");
            System.out.println(i+"=" + result);
        }
    }

}