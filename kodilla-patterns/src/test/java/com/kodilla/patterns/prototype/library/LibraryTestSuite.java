package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){
        //GIVEN
        Book book1 = new Book("Dzień", "Don", LocalDate.of(2018, 1, 21));
        Book book2 = new Book("Myśl", "Ben", LocalDate.of(2019, 4, 01));
        Book book3 = new Book("Alt", "Anb", LocalDate.of(2001, 6, 24));
        Library library = new Library("My Library");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library clonedLibrary = null;
        try{
            clonedLibrary=library.shallowCopy();
            clonedLibrary.setName("My second library");
        }
        catch(CloneNotSupportedException e){
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try{
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("My third library");
        }
        catch(CloneNotSupportedException e){
            System.out.println(e);
        }
        //WHEN
        library.getBooks().remove(book3);

        //THEN
        System.out.println(library.getBooks());
        Assertions.assertEquals(2, library.getBooks().size());
        System.out.println(clonedLibrary.getBooks());
        Assertions.assertEquals(2, clonedLibrary.getBooks().size());
        System.out.println(deepClonedLibrary.getBooks());
        Assertions.assertEquals(3, deepClonedLibrary.getBooks().size());
    }
}
