package com.kovekasper;

import java.util.Scanner;

public class ATM {

    private Person user;

    public Person getUser() {
        return user;
    }

    public void setUser(Person user) {
        this.user = user;
    }

    public int makeSelection() {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Choose an action:%n");
        System.out.printf("1 - Check Balance%n");
        System.out.printf("2 - Deposit%n");
        System.out.printf("3 - Withdraw%n");
        System.out.printf("4 - Exit%n");
        return Integer.valueOf(scanner.nextLine());
    }

    public void checkBalance() {
        System.out.printf("Balance: $%s%n", user.getAccountBalance());
    }

    public void withdraw(double amount) {
        user.setAccountBlance(user.getAccountBalance() - amount);
        System.out.printf("New Balance: %s%n", user.getAccountBalance());
    }

    public void endSession() {
        System.out.printf("Thank You for banking with us!%n");
    }

    public void deposit(int amount) {
            user.setAccountBlance(user.getAccountBalance() + amount);
            System.out.printf("New Balance: %s%n", user.getAccountBalance());
    }
}
