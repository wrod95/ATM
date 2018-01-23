package com.kovekasper;

public class Person {

    private String name;
    private double accountBlance;

    public Person(String name, double accountBlance) {
        this.name = name;
        this.accountBlance = accountBlance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAccountBlance() {
        return accountBlance;
    }

    public double setAccountBlance(double accountBlance) {
        return this.accountBlance = accountBlance;
    }

}