package adapter.company.bookclasifier;

import adapter.company.bookclasifier.libraryb.Book;
import adapter.company.bookclasifier.libraryb.BookSignature;
import adapter.company.bookclasifier.libraryb.BookStatistics;
import adapter.company.bookclasifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {

    Statistics statistics = new Statistics();

    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        return statistics.averagePublicationYear(books);
    }

    @Override
    public int medianaPublicationYear(Map<BookSignature, Book> books) {
        return statistics.medianaPublicationYear(books);
    }
}