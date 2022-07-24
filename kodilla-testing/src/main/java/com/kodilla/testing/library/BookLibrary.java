package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    private LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public static List<BookLibrary> listBooksWithCondition(String zeroBooks) {


        return null;
    }
    //...

    public class bookLibrary {
        LibraryDatabase libraryDatabase;

        public bookLibrary(LibraryDatabase libraryDatabase) {
            this.libraryDatabase = libraryDatabase;
        }
        public List<book> listBooksWithCondition(String titleFragment) {
            List<book> bookList = new ArrayList<book>();
            if (titleFragment.length() < 3) return bookList;
            List<book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
            if (resultList.size() > 20) return bookList;
            bookList = resultList;
            return bookList;
        }
    }
    public static List<book> ListBooksInHandsOf(LibraryUser libraryUser){
        List<book>libraryUserBooksInHandsOf = LibraryDatabase.listBooksInHandsOf(libraryUser);

        return libraryUserBooksInHandsOf;
    }
}