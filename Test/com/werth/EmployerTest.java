package com.werth;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class EmployerTest {
    Employer employer = new Employer("Johnnny's Hot Dogs", 10000.00);
    Employees employees = new Employees();
    Employee employee = new Employee("Mike", "McCloud", 10000.00);

    @Test
    void getTotalBusinessFunds() {
        Double actual = employer.getTotalBusinessFunds();
        Double expected = 10000.00;

        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    void setTotalBusinessFunds() {
        employer.setTotalBusinessFunds(20000.00);
        Double actual = employer.getTotalBusinessFunds();
        Double expected = 20000.00;

        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    void getEmployerName() {
        System.out.println(employer.getEmployerName());
    }

    @Test
    void payEmployeeWeekly() {
        employees.addEmployee(employee);
        employer.payEmployeeWeekly();

        Double actual = employer.getTotalBusinessFunds();
        Double expected = 9807.692307692309;

        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }
}