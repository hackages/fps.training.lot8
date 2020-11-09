package io.hackages.learning.fizzbuzz.util;

import java.util.Optional;

public class MultipleReplacer {

    private final int value;
    private final String text;

    public MultipleReplacer(int value, String text) {
        this.value = value;
        this.text = text;
    }

    public Optional<String> getTextFor(int n) {
        return Optional.of(text).filter(ignored -> n % value == 0);
    }
}
