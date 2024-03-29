package com.kodilla.stream.book;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class testGetListUsingIntStream {


    @Test
    void testGetListUsingIntStream() {
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When
        List<Book> books = bookDirectory.getList();

        //Then
        int numberOfBooksPublicatedAfter2007 = IntStream.range(0, books.size()) // [1]
                .filter(n -> books.get(n).getYearOfPublication() > 2007)             // [2]
                .map(n -> 1)                                                         // [3]
                .sum();                                                              // [4]
        assertEquals(3, numberOfBooksPublicatedAfter2007);                      // [5]
    }
}