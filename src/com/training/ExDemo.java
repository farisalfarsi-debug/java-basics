package com.training;

public class ExDemo {

	public static void main(String[] args) {
		int x = 0;
		int y = 1;
		try {
			y = 8/x;
		}
		catch(Exception e) {
			System.out.println("ArithmeticException");
		}
		//catch(ArithmeticException e) {
			//System.out.println("ArithmeticException");
		//} 
		finally {
			System.out.println("Finally block");
		}
		System.out.println("Value of y is:"+y);

	}

}
