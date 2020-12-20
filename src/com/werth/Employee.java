package com.werth;

public class Employee {
    private String firstName;
    private String lastName;
    private Double yearlySalary;
    private Double totalFunds;
    private Integer performance;
    private Double fundsPaid;

    public Employee(String firstName, String lastName, Double yearlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearlySalary = yearlySalary;
        this.performance = 100;
        this.totalFunds = 0.0;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(Double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    public Integer getPerformance() {
        return performance;
    }

    public void setPerformance(Integer performance) {
        this.performance = performance;
    }

    public Double getTotalFunds() {
        return totalFunds;
    }

    public void setTotalFunds(Double totalFunds) {
        this.totalFunds = totalFunds;
    }
}
