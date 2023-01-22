package adapter.company.bookclasifier.libraryb;

import java.util.Map;

public interface BookStatistics {
    int averagePublicationYear(Map<BookSignature, Book> books);

    int medianaPublicationYear(Map<BookSignature, Book> books);

    int medianPublicationYear(Map<BookSignature, Book> books);
}