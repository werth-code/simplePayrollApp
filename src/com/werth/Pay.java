package com.werth;

public interface Pay {

    static void payEmployeeWeekly(Employee employee, Employer employer) {
        Double businessFunds = employer.getTotalBusinessFunds();
        Double employeePay = employee.getYearlySalary() / 52;
        Double employeeAccount = employee.getTotalFunds();

        employer.setTotalBusinessFunds(businessFunds - employeePay);
        employee.setTotalFunds(employeeAccount + employeePay);

    }

}
