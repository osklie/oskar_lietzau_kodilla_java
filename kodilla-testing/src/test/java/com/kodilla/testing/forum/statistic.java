package com.kodilla.testing.forum;
import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class statistic {

    public static void main(String[] args) {

        String usersNames;
        int postsCount = 0;
        int commentsCount = 0;




        if (postsCount == 0) {
            System.out.println("no posts");
        }
        if (postsCount == 1000) {
            System.out.println("1000 posts!");
        }
        if(commentsCount == 0) {
            System.out.println("no comment");
        }

    }

}
