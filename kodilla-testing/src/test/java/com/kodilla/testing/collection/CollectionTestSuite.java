package com.kodilla.testing.collection;

import org.junit.Assert;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionTestSuite {
    @BeforeEach
    public void before(){
        System.out.println("Test case: begin");
    }
    @AfterEach
    public void after() {
        System.out.println("Test case: end");
    }

    @DisplayName("When create empty list")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        //When
        ArrayList<Integer> numberList = OddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing " + numberList);
        //Then
        Assert.assertEquals(emptyList,numberList);

    }

    @DisplayName("When create normal list")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> even = new ArrayList<>(Arrays.asList(3,7,17,27,19,335,433,903));
        ArrayList<Integer> odd = new ArrayList<>(Arrays.asList(2,6,8,16,28,312,888));

        //When
        ArrayList<Integer> numberList = OddNumbersExterminator.exterminate(odd);
        System.out.println("Testing " + numberList);
        //Then
        Assert.assertEquals(odd,numberList);

    }

}