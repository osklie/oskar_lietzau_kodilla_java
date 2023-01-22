package observer.homework;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class KodillaHomeworksTestSuite {

    @Test
    public void testUpdateHomeworks(){
        //Given
        Student janKowalski = new Student("Jan Kowalski", KodillaCourses.Java_Developer);
        Student monikaNowak  =new Student("Monika Nowak", KodillaCourses.Java_Developer);
        Student adamKnapik = new Student("Adam Knapik", KodillaCourses.Web_Developer);

        Mentor michaelBrown = new Mentor("Michael Brown");
        Mentor lukasWatson = new Mentor("Lukas Watson");

        janKowalski.registerObserver(michaelBrown);
        monikaNowak.registerObserver(michaelBrown);
        adamKnapik.registerObserver(lukasWatson);

        //When
        janKowalski.addHomework("6.4", "ShapeCollector");
        monikaNowak.addHomework("6.5","BookLibrary Mock");
        adamKnapik.addHomework("1.1","index.html");
        janKowalski.addHomework("6.5", "Book library with mock");

        //Then
        Assert.assertEquals(3,michaelBrown.getUpdateCount());
        Assert.assertEquals(1,lukasWatson.getUpdateCount());
    }
}

