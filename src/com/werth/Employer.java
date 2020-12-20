package com.werth;

public class Employer {
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

}
