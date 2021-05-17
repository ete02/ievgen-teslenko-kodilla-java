package com.kodilla.patterns2.adapter.company;

import com.kodilla.patterns2.adapter.company.oldhrsystem.Workers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SalaryAdapterTestSuite {

    @Test
    public void testTotalSalary() {
        // Given
        Workers workers = new Workers();                      // data from old system
        SalaryAdapter salaryAdapter = new SalaryAdapter();    // object from adapter
        // When
        double totalSalary = salaryAdapter.TotalSalary(workers.getWorkers(), workers.getSalaries());   // method t.s from Adapter
        // Then
        System.out.println(totalSalary);
        assertEquals(totalSalary, 27750, 0);
    }

}