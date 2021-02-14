package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.makeTask(TaskType.SHOPPING);
        shoppingTask.executeTask();
        //Then
        Assert.assertEquals("shopping", shoppingTask.getTaskName());
        Assert.assertEquals(true, shoppingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.makeTask(TaskType.PAINTING);
        paintingTask.executeTask();
        //Then
        Assert.assertEquals("painting", paintingTask.getTaskName());
        Assert.assertEquals(true, paintingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.makeTask(TaskType.DRIVING);
        drivingTask.executeTask();
        //Then
        Assert.assertEquals("driving", drivingTask.getTaskName());
        Assert.assertEquals(true, drivingTask.isTaskExecuted());
    }
}