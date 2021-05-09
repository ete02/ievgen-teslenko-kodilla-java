package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FacadeTestSuite {
    @Autowired
    private Facade facade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testGetCompanyByName() {
        //Given
        Company javaLearning = new Company("Java Learning");
        companyDao.save(javaLearning);

        //When
        int javaLearningId = javaLearning.getId();

        //Then
        try {
            facade.getCompanyByName("Jal");
        } catch (CompanyNotFoundException e) {
            //business exception- should be handled in real app
        }
        //CleanUp
        companyDao.deleteById(javaLearningId);
    }

    @Test
    void testGetEmployeeByName() {
        //Given
        Employee michelPa = new Employee("Michel", "Pa");
        employeeDao.save(michelPa);

        //When
        int nameId = michelPa.getId();

        //Then
        try {
            facade.getEmployeeByName("Mip");
        } catch (EmployeeNotFoundException e) {
            //business exception- should be handled in real app
        }

        //CleanUp
        employeeDao.deleteById(nameId);
    }
}
