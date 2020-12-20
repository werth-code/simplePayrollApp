package com.werth;

public class Employer implements Pay {
    private String employerName;
    private Double totalBusinessFunds;
    private Employees employees;

    public Employer(String employerName, Double totalBusinessFunds) {
        this.employerName = employerName;
        this.totalBusinessFunds = totalBusinessFunds;
        this.employees = new Employees();
    }

    public Double getTotalBusinessFunds() {
        return totalBusinessFunds;
    }

    public void setTotalBusinessFunds(Double totalBusinessFunds) {
        this.totalBusinessFunds = totalBusinessFunds;
    }

    public String getEmployerName() {
        return employerName;
    }

    public Employees getEmployees() {
        return employees;
    }

    @Override
    public void payEmployeeWeekly() {
        Employees employees = this.getEmployees();
        Double businessFunds = this.getTotalBusinessFunds();

        for(int i = 0; i < employees.size(); i++) {
            Employee employee = (Employee) employees.get(i);
            Double employeePay = employee.getYearlySalary() / 52;
            Double employeeAccount = employee.getTotalFunds();
            this.setTotalBusinessFunds(businessFunds - employeePay);
            employee.setTotalFunds(employeeAccount + employeePay);
        }

    }
}
