package io.hackages.learning.fizzbuzz;

import io.hackages.learning.fizzbuzz.util.MultipleReplacer;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

public class FizzBuzzService {

    private final Collection<MultipleReplacer> replacers = Arrays.asList(
            new MultipleReplacer(3, "Fizz"),
            new MultipleReplacer(5, "Buzz"));

    public String transform(int n) {
        return replacers.stream()
                .map(replacer -> replacer.getTextFor(n))
                .filter(Optional::isPresent)
                .map(optional -> optional.get())
                .reduce((a, b) -> a + b)
                .orElse(Integer.toString(n));
    }
}
