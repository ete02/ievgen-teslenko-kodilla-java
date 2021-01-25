package com.kodilla.patterns.strategy.social;

import org.junit.*;

public class UserTestSuite {
    private static int testCounter;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User beata = new Millenials("Beata Nowicka");
        User jo = new YGeneration("Jo Nom");
        User dan = new ZGeneration("Dan Ba");

        //When
        String beataSharePostFrom = beata.sharePost();
        System.out.println("Beate posts from: " + beataSharePostFrom);
        String joSharePostFrom = jo.sharePost();
        System.out.println("Jo posts from: " + joSharePostFrom);
        String danSharePostFrom = dan.sharePost();
        System.out.println("Dan posts from: " + danSharePostFrom);

        //Then
        Assert.assertEquals("Facebook", beataSharePostFrom);
        Assert.assertEquals("Twitter", joSharePostFrom);
        Assert.assertEquals("Snapchat", danSharePostFrom);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User beata = new Millenials("Beata Nowicka");

        //When
        String beataSharePostFrom = beata.sharePost();
        System.out.println("Beata posts from: " + beataSharePostFrom);
        beata.setSocialPublisher(new TwitterPublisher());
        beataSharePostFrom = beata.sharePost();
        System.out.println("Beata posts from: " + beataSharePostFrom);

        //Then
        Assert.assertEquals("Twitter", beataSharePostFrom);
    }
}