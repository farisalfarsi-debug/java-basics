package com.training;

public class Account {

    protected String accountNumber;
    protected String customerName;
    protected double balance;

    // Constructor
    public Account(String accountNumber,
                   String customerName,
                   double balance) {

        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {

        balance = balance + amount;

        System.out.println(amount + " deposited successfully");
    }

    // Withdraw method
    public void withdraw(double amount) {

        if (amount <= balance) {

            balance = balance - amount;

            System.out.println(amount + " withdrawn successfully");

        } else {

            System.out.println("No balance");
        }
    }

    // Display balance
    public double displayBalance() {

        return balance;
    }

    @Override
    public String toString() {

        return "Account Number: " + accountNumber
                + ", Customer Name: " + customerName
                + ", Balance: " + balance;
    }
}