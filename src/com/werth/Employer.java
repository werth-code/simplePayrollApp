package com.werth;

public class Employer implements Pay {
    private String employerName;
    private Double totalBusinessFunds;

    public Employer(String employerName, Double totalBusinessFunds) {
        this.employerName = employerName;
        this.totalBusinessFunds = totalBusinessFunds;
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

    @Override
    public void payEmployeeWeekly(Employee employee) {
        Double businessFunds = this.getTotalBusinessFunds();
        Double employeePay = employee.getYearlySalary() / 52;
        Double employeeAccount = employee.getTotalFunds();

        this.setTotalBusinessFunds(businessFunds - employeePay);
        employee.setTotalFunds(employeeAccount + employeePay);

    }
}
