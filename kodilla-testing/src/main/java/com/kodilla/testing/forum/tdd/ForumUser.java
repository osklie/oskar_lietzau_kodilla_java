package com.kodilla.testing.forum.tdd;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ForumUser {

    private String usersNames;
    private String realName;
    private String author;
    private List<ForumPost> posts = new ArrayList<>();
    private List<ForumComment> comments = new LinkedList<>();

    public ForumUser(String name, String realName) {
        //name visible on forum
        this.usersNames = name;
        //real name of the user
        this.realName = realName;
    }
    //public void author(String name) {
    //    this.author = author;
    //}

    public void addPost(String author, String postBody) {
        //this.author = author;
    }

    public void addComment(ForumPost thePost, String author, String commentBody) {
        // do nothing
    }

    public int getPostsQuantity() {
        // return 100 temporarily
        return 100;
    }

    public int getCommentsQuantity() {
        // return 100 temporarily
        return 100;
    }

    public ForumPost getPost(int postNumber) {
        // returning null means that the operation was unsuccessful
        return null;
    }

    public ForumComment getComment(int commentNumber) {
        // returning null means that the operation was unsuccessful
        return null;
    }

    public boolean removePost(ForumPost thePost) {
        // return true temporarily
        return true;
    }

    public boolean removeComment(ForumComment theComment) {
        // return true temporarily
        return true;
    }

    public String getName() {
        return usersNames;
    }

    public String getRealName() {
        return realName;
    }
}

