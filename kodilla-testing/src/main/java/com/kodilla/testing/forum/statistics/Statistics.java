package com.kodilla.testing.forum.statistics;
import java.util.Objects;
import java.util.List;

/*public interface Statistics {
    List<String> usersNames(); // list of users names
    int postsCount();

    int commentsCount();       // total quantity of forum comments
}
*/


public class Statistics {

    private String usersNames;
    private int postsCount;
    private int commentsCount;

    public Statistics(String usersNames, int postsCount, int commentsCount) {
        this.usersNames = usersNames;
        this.postsCount = postsCount;
        this.commentsCount = commentsCount;
    }

    public String usersNames() {
        return usersNames;
    }

    public void setUsersNames(String usersNames) {
        this.usersNames = usersNames;
    }

    public int postsCount() {
        return postsCount;
    }

    public void setPostsCount(int postsCount) {
        this.postsCount = postsCount;
    }

    public int commentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(int commentsCount) {
        this.commentsCount = commentsCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Statistics statistics = (Statistics) o;
        return commentsCount == statistics.commentsCount &&
                Objects.equals(postsCount, statistics.postsCount) &&
                Objects.equals(usersNames, statistics.usersNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usersNames, postsCount, commentsCount);
    }
}