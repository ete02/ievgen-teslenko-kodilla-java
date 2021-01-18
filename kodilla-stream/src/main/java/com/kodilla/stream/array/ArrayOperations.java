package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int... numbers) {
        final double result;
        result = IntStream.range(0, numbers.length)
                .map(n -> n = numbers[n])
                .average()
                .getAsDouble();
        return result;
    }
}