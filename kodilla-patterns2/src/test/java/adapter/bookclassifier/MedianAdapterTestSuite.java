package adapter.bookclassifier;

import adapter.company.bookclasifier.MedianAdapter;
import adapter.company.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookA = new HashSet<>();
        bookA.add(new Book("Adam Mickiewicz",
                "Pan Tadeusz",
                1998,
                "AMPT123456"));
        bookA.add(new Book("Henryk Sienkiewicz",
                "Potop",
                1980,
                "HSP765432"));
        bookA.add(new Book("Jan Brzechwa",
                "Akademia Pana Kleksa",
                2000,
                "JBAPK987564"));
        bookA.add(new Book("Aleksander Fredro",
                "Zemsta",
                1977,
                "AFZ857463"));

        //When
        int median = medianAdapter.publicationYearMedian(bookA);

        //Then
        Assert.assertEquals(1998, median);
    }
}