package com.kodilla.testing.forum;

import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.user.SimpleUser;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ForumTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("when create SimpleUser with realName, " +
            "then getRealName should return real user name"
    )
    @Test
    void testCaseRealName() {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //When
        String result = simpleUser.getRealName();
        System.out.println("Testing " + result);
        String resultFU = simpleUser.getUsername();
        System.out.println("user: " + resultFU);
        //Then
        Assertions.assertEquals("John Smith", result);
        Assertions.assertEquals("theForumUser", resultFU);
    }

    @DisplayName("when create SimpleUser with name, " +
            "then getUsername should return correct name"
    )
    @Test
    void testCaseUsername() {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");

        String expectedResult = "theForumUser";

        //When
        String result = simpleUser.getUsername();
        //Then
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testCalculateUser() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        List<String> resultUsers = new ArrayList<>();
        resultUsers.add("User1");
        when(statisticsMock.usersNames()).thenReturn(resultUsers);
        when(statisticsMock.postsCount()).thenReturn(6);
        when(statisticsMock.commentsCount()).thenReturn(1);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        List<Statistics> resultUsers = new ArrayList<>();
        Statistics user1 = new Statistics("User1", 5, 2);
        Statistics user2 = new Statistics("User2", 0,32);
        Statistics user3 = new Statistics("User3", 11, 0);
        Statistics user4 = new Statistics("User4", 36, 1);
        resultUsers.add(user1);
        resultUsers.add(user2);
        resultUsers.add(user3);
        resultUsers.add(user4);

        resultUsers.add("User2");
        when(statisticsMock.usersNames()).thenReturn(resultUsers);
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(10);



        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(4, forumStatistics.getUseResult());

        System.out.println(resultUsers);
        System.out.println(statisticsMock.postsCount());
    }

    public class ForumStatistics {

        private Statistics statistics;
        int commentsResult;
        int usersResult;
        int postsResult;
        double advPostsForUser;
        double advCommentsForUser;
        double advCommentsForPost;


        public ForumStatistics(Statistics statistics) {
            this.statistics = statistics;
        }


        public void calculateAdvStatistics(Statistics statistics) {
            postsResult = statistics.commentsCount();
            commentsResult = statistics.commentsCount();
            usersResult = Integer.parseInt(statistics.usersNames());
            double advPostsForUser = postsResult / usersResult;
            double advCommentsForUser = commentsResult / usersResult;
            double advCommentsForPost = commentsResult / postsResult;


            System.out.println(advPostsForUser);
            System.out.println(advCommentsForUser);
            System.out.println(advCommentsForPost);
        }


        public int getPosResult() {
            return postsResult;
        }

        public int getComResult() {
            return commentsResult;
        }

        public int getUseResult() {
            return usersResult;
        }

        public double getAdvPostsForUser() {
            return advPostsForUser;
        }

        public double getAdvCommentsForUser() {
            return advCommentsForUser;
        }

        public double getAdvCommentsForPost() {
            return advCommentsForPost;
        }
    }
}