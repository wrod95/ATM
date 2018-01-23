package com.kovekasper;

public class ATM {

    private Person user;

    public Person getUser() {
        return user;
    }

    public void setUser(Person user) {
        this.user = user;
    }

    public void checkBalance() {
        System.out.printf("Balance: $%s%n", user.getAccountBlance());
    }

    public void withdraw(double amount) {
        user.setAccountBlance(user.getAccountBlance()-amount);
        System.out.printf("New Balance: %s%n", user.getAccountBlance());
    }
}
