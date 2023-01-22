package adapter.company.bookclasifier;

import adapter.company.bookclasifier.librarya.Book;
import adapter.company.bookclasifier.librarya.Classifier;
import adapter.company.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    Map<BookSignature, adapter.company.bookclasifier.libraryb.Book> bookMap = new HashMap<>();

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Iterator<Book> iterator = bookSet.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            bookMap.put(new BookSignature(book.getSignature()), new adapter.company.bookclasifier.libraryb.Book(book.getAuthor(), book.getTitle(), book.getPublicationYear()));
        }
        return medianaPublicationYear(bookMap);
    }
}