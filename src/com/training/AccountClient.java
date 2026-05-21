package com.training;

public class AccountClient {

	   public static void main(String[] args) {

	        // Saving Account object
	        SavingAccount saving =
	                new SavingAccount("SA101",
	                        "Ahmed", 500,4);

	        // Current Account object
	        CurrentAccount current =
	                new CurrentAccount("CA101",
	                        "Ali",2000,5000);

	        // Display details
	        System.out.println(saving);
	        saving.deposit(500);
	        saving.withdraw(300);
	        System.out.println(saving.displayBalance());

	        System.out.println();

	        System.out.println(current);
	        current.deposit(1000);
	        current.withdraw(2500);
	        System.out.println(saving.displayBalance());
	    }
	}
