package com.werth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeesTest {
    Employees employees = new Employees();
    Employee employee = new Employee("Tonia", "Harding", 5000.00);

    @Test
    void getEmployeesList() {
        employees.addEmployee(employee);
        employees.getEmployeesList().forEach(System.out::println);
    }

}