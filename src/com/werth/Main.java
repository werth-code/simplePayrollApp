package com.werth;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //Create a container for employees
        Employees werthPhotoEmployees = new Employees();

        //Create the business and it's employees
        Employer werthPhotography = new Employer("Werth Photography", 25000.00);
        Employee mattWerth = new Employee("Matt", "Werth", 75000.00);
        Employee laurieWerth = new Employee("Laurie", "Werth", 50000.00);
        Employee michelleMcCool = new Employee("Michelle", "McCool", 25000.00);

        //Add the employees to our container werthPhotoEmployees
        werthPhotoEmployees.addEmployee(mattWerth);
        werthPhotoEmployees.addEmployee(laurieWerth);
        werthPhotoEmployees.addEmployee(michelleMcCool);

        //Get the container and start a stream
        List<Double> employeeSalaries =  werthPhotoEmployees.getEmployeesList().stream()
                .map(Employee::getYearlySalary) // This should transform our Object to an Integer..
                .collect(Collectors.toList());

        System.out.println(werthPhotography.getTotalBusinessFunds());

        employeeSalaries.forEach(ele -> System.out.println("Yearly Salary$ " + ele));


        //// TODO: 12/20/20 I need the employer to be passed in automatically. So You could call from the employer, but not pass it in.
        werthPhotoEmployees.getEmployeesList().stream()
                .forEach(employee -> werthPhotography.payEmployeeWeekly(employee));


        List<Double> employeeFunds = werthPhotoEmployees.getEmployeesList().stream()
                .map(Employee::getTotalFunds)
                .collect(Collectors.toList());

        employeeFunds.forEach(ele -> System.out.println("Funds Available$ " + ele));

        System.out.println(werthPhotography.getTotalBusinessFunds());
    }
}
