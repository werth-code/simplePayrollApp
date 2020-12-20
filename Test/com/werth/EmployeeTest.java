package com.werth;

import org.junit.jupiter.api.Test;

class EmployeeTest {
    Employee employee;

    @Test
    void testToString() {
        employee = new Employee("Amanda", "Bines", 50000.00);
        System.out.println(employee.toString());
    }
}