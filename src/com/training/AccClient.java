package com.training;

import java.util.Scanner;

public class AccClient {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SavingAccount[] savingAccounts =
                new SavingAccount[3];

        CurrentAccount[] currentAccounts =
                new CurrentAccount[3];

        // Saving Accounts
        for (int i = 0; i < 3; i++) {

            System.out.println("\nEnter Saving Account "
                    + (i + 1));

            String accNo =
                    readAccountNumber(sc,
                            "Account Number: ");

            String name =
                    readCustomerName(sc,
                            "Customer Name: ");

            double balance =
                    readDouble(sc,
                            "Balance: ");

            double interestRate =
                    readDouble(sc,
                            "Interest Rate: ");

            savingAccounts[i] =
                    new SavingAccount(accNo,
                            name,
                            balance,
                            interestRate);
        }

        // Current Accounts
        for (int i = 0; i < 3; i++) {

            System.out.println("\nEnter Current Account "
                    + (i + 1));

            String accNo =
                    readAccountNumber(sc,
                            "Account Number: ");

            String name =
                    readCustomerName(sc,
                            "Customer Name: ");

            double balance =
                    readDouble(sc,
                            "Balance: ");

            double overdraftLimit =
                    readDouble(sc,
                            "Overdraft Limit: ");

            currentAccounts[i] =
                    new CurrentAccount(accNo,
                            name,
                            balance,
                            overdraftLimit);
        }

        // Display Saving Accounts
        System.out.println("\n===== Saving Accounts =====");

        for (SavingAccount s : savingAccounts) {

            System.out.println(s);

            s.addInterest();

            System.out.println("Updated Balance: "
                    + s.displayBalance());

            System.out.println();
        }

        // Display Current Accounts
        System.out.println("\n===== Current Accounts =====");

        for (CurrentAccount c : currentAccounts) {

            System.out.println(c);

            System.out.println("Balance: "
                    + c.displayBalance());

            System.out.println();
        }

        sc.close();
    }

    // Account Number Validation
    public static String readAccountNumber(Scanner sc,
                                           String message) {

        while (true) {

            System.out.print(message);

            String value = sc.nextLine();

            if (value.matches("[0-9]+")) {

                return value;
            }

            System.out.println(
                    "Invalid input. Please enter numbers only.");
        }
    }

    // Customer Name Validation
    public static String readCustomerName(Scanner sc,
                                          String message) {

        while (true) {

            System.out.print(message);

            String value = sc.nextLine();

            if (value.matches("[a-zA-Z ]+")) {

                return value;
            }

            System.out.println(
                    "Invalid input. Please enter letters only.");
        }
    }

    // Number Validation
    public static double readDouble(Scanner sc,
                                    String message) {

        while (true) {

            try {

                System.out.print(message);

                return Double.parseDouble(sc.nextLine());

            } catch (NumberFormatException e) {

                System.out.println(
                        "Invalid input. Please enter a number.");
            }
        }
    }
}