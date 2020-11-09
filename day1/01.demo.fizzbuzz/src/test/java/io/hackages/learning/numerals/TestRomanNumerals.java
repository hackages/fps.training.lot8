package io.hackages.learning.numerals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRomanNumerals {

    @ParameterizedTest
    @EnumSource(TestValue.class)
    public void test_conversion_with_values(TestValue testValue) {
       assertEquals(RomanNumeralConverter.romanFor(testValue.numeric), testValue.roman);
    }
}
