package com.kovekasper;

import java.util.Scanner;

public class Main {

    private static ATM atm = new ATM();

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("What is your name?");

        // declaring String name - the value will be user input
        String name = scanner.nextLine();
        // throwing exception for blank entry
        if (name.equals("")) {
            throw new Exception("Please enter a name...");
        }

        atm.setUser(new Person(name, 75.00));

        System.out.printf("Hello, %s!%n", name);

        switch (atm.makeSelection()){
            case 1:
                atm.checkBalance();
                break;
            case 2:
                System.out.printf("Withdraw amount:%n");
                atm.withdraw(scanner.nextInt());
                break;
            case 3:
                atm.endSession();
                break;
        }

    }
}
