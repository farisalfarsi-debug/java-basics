package com.training;
import java.util.Scanner;
public class demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int i = 0;
		while(true) {
			System.out.println("Enter x to exit or any other key to continue");
			String choice = sc.nextLine();
			if(choice.equalsIgnoreCase("X")) {
				break;
			}
			i++;
			  System.out.println("Enter first name for customer: " + i);
	          sc.nextLine();
	          System.out.println("Enter last name for customer: " + i);
	          sc.nextLine();
	          System.out.println("Enter age for customer: " + i);
	          sc.nextLine().charAt(0);
		}
		System.out.println("ِTotal number of customer saved: "+i);
		
		for(int j = 0; j<3;j++) {
			System.out.println("ِNumber of iteration:"+ j+1);
		}
		
		int k = 0;
		do {
			System.out.println("Inside do while loo");
			k++;
		}while(k<3);
		
		//System.out.println("ِEnter customer name:");
		//String customerName = sc.nextLine();
		//next() -> will take single string without space
		//nextInt() -> to input integer values
		byte b = 112;
		short s = 115;
		//s = b;
		//b=s;
		//b=(byte)s;
		System.out.println("ِFrist name:");
		String fname = sc.nextLine();
		System.out.println("ِLast name:");
		String lname = sc.nextLine();
		System.out.println("ِAge:");
		int age = sc.nextInt();
		System.out.println("Customer class");
		//System.out.println("Customer Name: " +customerName);
		System.out.println("Customer Name: " + fname + " " + lname + ", Age: " + age);
		 if (age >= 18) {
	            System.out.println("Established to open an account");
	        } else {
	            System.out.println("Not yet established to open an account");
	        }

	       
	}

}
// import scanner shortcut : ctrl+shift+o
//Java is a strongly typed language
// variable is a placeholder pointing to a memory location

// create variables that will store customer first name,
// customer last name, customer age.
// and display all the customer details in a single line

// take the customer details from the scanner class
// check if the customer is more than 18 then display 
// establish to open an account
// else display: not yet establish to open an account



