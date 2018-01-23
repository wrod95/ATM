package com.kovekasper;

public class Person {

    private String name;
    private double accountBalance;

    public Person(String name, double accountBalance) {
        this.name = name;
        this.accountBalance = accountBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public double setAccountBlance(double accountBlance) {
        return this.accountBalance = accountBlance;
    }

}