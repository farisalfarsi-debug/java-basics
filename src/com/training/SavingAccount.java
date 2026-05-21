package com.training;

public class SavingAccount extends Account {

	private double interestRate;

    // Constructor
    public SavingAccount(String accountNumber,
                         String customerName,
                         double balance,
                         double interestRate) {

        super(accountNumber, customerName, balance);

        this.interestRate = interestRate;
    }
    
    

    public double getInterestRate() {
		return interestRate;
	}



	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	 // Method to add interest
    public void addInterest() {

        double interest = balance * interestRate / 100;

        balance = balance + interest;

        System.out.println("Interest Added: " + interest);
    }


	@Override
    public String toString() {

        return "SavingAccount [interestRate=" + interestRate
                + ", accountNumber=" + accountNumber
                + ", customerName=" + customerName
                + ", balance=" + balance + "]";
    }
}
