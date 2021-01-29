package com.kodilla.patterns.factory.tasks;

import org.junit.*;

import static com.kodilla.patterns.factory.tasks.TaskType.*;

public class TaskFactoryTestSuite {
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
    public void testFactoryShoppingWithExecution() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.makeTask(SHOPPING);
        //Then
        Assert.assertEquals("SHOPPING TASK", shopping.getTaskName());
    }

    @Test
    public void testFactoryPaintingWithExecution() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.makeTask(PAINTING);
        //Then
        Assert.assertEquals("PAINTING TASK", painting.getTaskName());
    }

    @Test
    public void testFactoryDrivingWithExecution() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.makeTask(DRIVING);
        //Then
        Assert.assertEquals("DRIVING TASK", driving.getTaskName());

    }

    @Test
    public void testFactoryShoppingWithOutExecution() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.makeTask(SHOPPING);
        //Then
        Assert.assertEquals("SHOPPING TASK", shopping.getTaskName());

    }

    @Test
    public void testFactoryPaintingWithOutExecution() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.makeTask(PAINTING);
        //Then
        Assert.assertEquals("PAINTING TASK", painting.getTaskName());
    }

    @Test
    public void testFactoryDrivingWithOutExecution() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.makeTask(DRIVING);
        //Then
        Assert.assertEquals("DRIVING TASK", driving.getTaskName());
    }
}
