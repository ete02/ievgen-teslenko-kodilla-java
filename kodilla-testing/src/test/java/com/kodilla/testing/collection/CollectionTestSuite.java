package com.kodilla.testing.collection;

import org.junit.Assert;
import org.junit.jupiter.api.*;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test case: end");
    }

    @DisplayName("Test when we have Empty List")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        // Give
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> listEmpty = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> newListEmpty = new ArrayList<>(Arrays.asList(1));
        // When
        oddNumbersExterminator.exterminate(newListEmpty);
        // Then
        Assertions.assertEquals(listEmpty.get(0), newListEmpty.get(0));
    }

    @DisplayName("Test when we have even and odd")
    @Test
    void testOddNumbersExterminatorNormalList() {
        // Give
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> newList = new ArrayList<>(Arrays.asList(2, 4));
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        // When
        List<Integer> exterminate = oddNumbersExterminator.exterminate(list);
        // Then
        Assertions.assertEquals(newList, exterminate);

    }
}