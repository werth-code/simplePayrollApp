package com.werth;

import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //Create the business and it's employees
        Employer werthPhotography = new Employer("Werth Photography", 25000.00);
        Employee mattWerth = new Employee("Matt", "Werth", 75000.00);
        Employee laurieWerth = new Employee("Laurie", "Werth", 50000.00);
        Employee michelleMcCool = new Employee("Michelle", "McCool", 25000.00);

        //Add the employees to our container werthPhotoEmployees
        werthPhotography.getEmployees().addEmployee(mattWerth);
        werthPhotography.getEmployees().addEmployee(laurieWerth);
        werthPhotography.getEmployees().addEmployee(michelleMcCool);

        werthPhotography.payEmployeeWeekly();

        Map<String, Double> salaryMap = werthPhotography.getEmployees().employeesList.stream()
                .collect(Collectors.toMap(
                        Employee::getFirstName,
                        Employee::getYearlySalary
                ));

        Map<String, Double> moneyInAccount = werthPhotography.getEmployees().employeesList.stream()
                .collect(Collectors.toMap(
                        Employee::getFirstName,
                        Employee::getTotalFunds
                ));

        System.out.println(salaryMap);
        System.out.println(moneyInAccount);
    }
}
