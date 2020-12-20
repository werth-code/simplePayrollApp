package com.werth;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    List<Employee> employeesList;

    Employees() {
        this.employeesList = new ArrayList<>();
    }

    public List<Employee> getEmployeesList() {
        return employeesList;
    }

    public void setEmployeesList(List<Employee> employeesList) {
        this.employeesList = employeesList;
    }

    public void addEmployee(Employee employee) {
        this.getEmployeesList().add(employee);
    }
}
