package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    void publicationYearMedianTest(){
        //Given
        Book book1 = new Book("A1", "Title1",1989,"123");
        Book book2 = new Book("A2", "Title2",2020, "456");
        Book book3 = new Book("A3", "Title3", 2021, "789");

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);

        MedianAdapter medianAdapter = new MedianAdapter();

        int result = medianAdapter.publicationYearMedian(bookSet);
        //Then
        assertEquals(result, 2020);
    }
}
