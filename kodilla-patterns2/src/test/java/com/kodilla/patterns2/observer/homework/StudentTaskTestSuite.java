package com.kodilla.patterns2.observer.homework;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTaskTestSuite {

    @Test
    public void testKodillaTask() {
        //Given
        Student rben = new Student("Ray Ben");
        Student mpo = new Student("Michal Po");
        Student zte = new Student("Zuza Te");
        Student ldi = new Student("Luke Diamond");
        Mentor pzak = new Mentor("Patryk Zak");
        Mentor dwen = new Mentor("Daniel Wenti");

        rben.getQueue().registerObserver(pzak);
        mpo.getQueue().registerObserver(pzak);
        zte.getQueue().registerObserver(dwen);
        ldi.getQueue().registerObserver(dwen);

        //When
        rben.getQueue().addTask("Task 1.1 ");
        mpo.getQueue().addTask("Task 3.2");
        zte.getQueue().addTask("Task 2.1");
        ldi.getQueue().addTask("Task 12");
        zte.getQueue().addTask("Task 2.4");
        mpo.getQueue().addTask("Task 4.5");

        String taskCheck1 = rben.getQueue().getTaskQueue().getLast();
        String taskCheck2 = zte.getQueue().getTaskQueue().getLast();

        //Then
        Assertions.assertEquals(2, zte.getQueue().getTaskQueue().size());
        Assertions.assertEquals(1, rben.getQueue().getTaskQueue().size());
        Assertions.assertEquals("Task 2.1", taskCheck1);
        Assertions.assertEquals("Task 1.1", taskCheck2);
    }
}
