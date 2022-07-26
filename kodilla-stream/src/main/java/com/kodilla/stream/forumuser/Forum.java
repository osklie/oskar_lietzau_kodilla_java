package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(1, "Oskar", 'M', LocalDate.of(1997, Month.APRIL, 3),10));
        forumUserList.add(new ForumUser(2, "Janusz", 'M', LocalDate.of(2002, Month.OCTOBER, 1),100));
        forumUserList.add(new ForumUser(3, "Jakub", 'M', LocalDate.of(1996, Month.NOVEMBER, 15),5));
        forumUserList.add(new ForumUser(4, "Ala", 'F', LocalDate.of(2000, Month.DECEMBER, 25),2));
        forumUserList.add(new ForumUser(5, "Marrcelina", 'F', LocalDate.of(2002, Month.NOVEMBER, 23),7));
        forumUserList.add(new ForumUser(6, "Dominik", 'M', LocalDate.of(1992, Month.SEPTEMBER, 17),0));
        forumUserList.add(new ForumUser(7, "Ksenia", 'F', LocalDate.of(1995, Month.MAY, 25),0));
        forumUserList.add(new ForumUser(8, "Filip", 'M', LocalDate.of(1991, Month.JULY, 3),3));
        forumUserList.add(new ForumUser(9, "Klaudia", 'F', LocalDate.of(1992, Month.SEPTEMBER, 30),4));
        forumUserList.add(new ForumUser(10, "Jacek", 'F', LocalDate.of(1996, Month.OCTOBER, 9),8));
    }

    public List<ForumUser> getForumUserList() {
        return new ArrayList<>(forumUserList);
    }
}