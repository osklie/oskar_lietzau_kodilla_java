package com.kodilla.testing.library;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {}

 /*   private LibraryDatabase libraryDatabaseMock;
    private BookLibrary bookLibrary;

    @Before
    public void beforeEachTest() {
        libraryDatabaseMock = mock(LibraryDatabase.class);
        bookLibrary = new BookLibrary(libraryDatabaseMock);
    }

    @Test
    public void testListBooksWithConditionsReturnList() {

        // Given
        List<book> resultListOfBooks = new ArrayList<book>();
        book book1 = new book("Secrets of Alamo", "John Smith", 2008);
        book book2 = new book("Secretaries and Directors", "Dilbert Michigan", 2012);
        book book3 = new book("Secret life of programmers", "Steve Wolkowitz", 2016);
        book book4 = new book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);

        // When
        List<BookLibrary> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        // Given
        List<book> resultListOf0Books = new ArrayList<book>();
        List<book> resultListOf15Books = generateListOfNBooks(15);
        List<book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FourtyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<BookLibrary> theListOfBooks0 = BookLibrary.listBooksWithCondition("ZeroBooks");
        List<BookLibrary> theListOfBooks15 = BookLibrary.listBooksWithCondition("Any title");
        List<BookLibrary> theListOfBooks40 = BookLibrary.listBooksWithCondition("FourtyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        List<book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<BookLibrary> theListOfBooks10 = BookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testListBooksInHandsOfZeroBooks() {
        //Given
    List<book>listOfZeroBooks = new ArrayList<>();
        when(LibraryDatabase.listBooksInHandsOf(any(LibraryUser.class))).thenReturn(listOfZeroBooks);
        //When
        List<book> resultListBooksInHandsOf = BookLibrary.ListBooksInHandsOf(isA(LibraryUser.class));
        //Then
        assertEquals(0, resultListBooksInHandsOf.size());
        LibraryDatabase.listBooksInHandsOf(any(LibraryUser.class));
    }

    @Test
    public void testListBooksInHandsOfOneBook(){
        //Given
        List<book>listOfOneBook = generateListOfNBooks(1);
        when(LibraryDatabase.listBooksInHandsOf(any(LibraryUser.class))).thenReturn(listOfOneBook);
        //When
        List<book> resultListBooksInHandsOf = BookLibrary.ListBooksInHandsOf(isA(LibraryUser.class));
        //Then
        assertEquals(1, resultListBooksInHandsOf.size());
        LibraryDatabase.listBooksInHandsOf(any(LibraryUser.class));
    }

    @Test
    public void testListBooksInHandsOfFiveBooks(){
        //Given
        List<book>listOfFiveBooks = generateListOfNBooks(5);
        when(LibraryDatabase.listBooksInHandsOf(any(LibraryUser.class))).thenReturn(listOfFiveBooks);
        //When
        List<book> resultListBooksInHandsOf = BookLibrary.ListBooksInHandsOf(isA(LibraryUser.class));
        //Then
        assertEquals(5, resultListBooksInHandsOf.size());
        LibraryDatabase.listBooksInHandsOf(any(LibraryUser.class));
    }


    private List<book> generateListOfNBooks(int booksQuantity) {
        List<book> resultList = new ArrayList<book>();
        for(int n = 1; n <= booksQuantity; n++){
            book theBook = new book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }
    }
}*/