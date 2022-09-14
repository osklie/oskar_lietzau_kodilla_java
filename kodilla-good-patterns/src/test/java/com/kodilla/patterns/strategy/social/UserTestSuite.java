package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {

        //Given
        User millennials = new Millennials("Nancy");
        User yGeneration = new YGeneration("George");
        User zGeneration = new ZGeneration("Zack");

        //When
        String snapchat = millennials.sharePost();
        String twitter = yGeneration.sharePost();
        String facebook = zGeneration.sharePost();

        //Then
        Assert.assertEquals("Snapchat", snapchat);
        Assert.assertEquals("Twitter", twitter);
        Assert.assertEquals("Facebook", facebook);
    }

    @Test
    public void testIndividualSharingStrategy() {

        //Given
        User millennials = new Millennials("Nancy");
        millennials.setSocialPublisher(new FacebookPublisher());

        //When
        String facebook = millennials.sharePost();

        //Then
        Assert.assertEquals("Facebook", facebook);
    }
}