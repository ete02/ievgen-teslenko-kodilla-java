package com.kodilla.stream.array;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class ArrayOperationsTestSuite {

    private static int testCounter = 0;


    @BeforeAll
    public static void beforeAll() {
        System.out.println("Start Test.");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("End od test.");
    }

    @BeforeEach
    public void beforeEach() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    void testGetAverage() {
        System.out.println("Test get average");
        //Given
        final int[] numbersTab = {18, 24, 2, 3, 7, 6, 5, 4, 3, 2};
        //When
        final double calculatedAverage = ArrayOperations.getAverage(numbersTab);
        //Then
        final double expectedAverage = 5.1;
        assertEquals(expectedAverage, calculatedAverage);
    }
}