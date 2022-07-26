package com.kodilla.stream.lambda;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.book.Book;
import java.util.Map;

import java.util.stream.Collectors;
import java.util.List;
import java.time.LocalDate;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.time.Period;


import com.kodilla.stream.person.People;


import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.reference.FunctionalCalculator;


public class StreamMain {                                                     // [3]

    public static void main(String[] args) {                                   // [4]
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();       // [5]

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);           // [6]
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);           // [7]
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);           // [8]
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);           // [9]

        System.out.println("________________________________________");

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("________________________________________");

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

        System.out.println("________________________________________");


        System.out.println("normal tekst people: ");
        People.getList().stream()
                .forEach(System.out::println);                 // [2]

        System.out.println("________________________________________");


        System.out.println("mapper tekst people: ");
        People.getList().stream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);

        System.out.println("________________________________________");

        System.out.println("names longer than 11 characters: ");

        People.getList().stream()
                .filter(s -> s.length() > 11)
                .forEach(System.out::println);

        System.out.println("________________________________________");

        System.out.println("names shorter  than 11 characters: ");

        People.getList().stream()
                .filter(s -> s.length() < 11)
                .forEach(System.out::println);

        System.out.println("________________________________________");

        System.out.println("names equal to 11 characters: ");

        People.getList().stream()
                .filter(s -> s.length() == 11)
                .forEach(System.out::println);


        System.out.println("________________________________________");

        System.out.println("names longer than 11 characters: ");

        People.getList().stream()
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")   // [3]
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);

        System.out.println("________________________________________");

        System.out.println("names longer than 11 characters: ");

        People.getList().stream()
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .forEach(System.out::println);

        System.out.println("________________________________________");

        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()  // [1]
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));                    // [2]

        System.out.println(theResultStringOfBooks);

        System.out.println("____________________________________________________________________");
        System.out.println("ZADANIE 7.3 'FORUMUSER'");

        Forum forum = new Forum();
        Map<Integer, ForumUser> mapOfForumUsers = forum.getForumUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> Period.between(forumUser.getBirthdayDate(), LocalDate.now()).getYears() >= 20)
                .filter(forumUser -> forumUser.getPostsQty() >= 1)
                .collect(Collectors.toMap(ForumUser::getIDNumber, ForumUser -> ForumUser));

        mapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}



