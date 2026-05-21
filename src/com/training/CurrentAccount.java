package com.training;

public class CurrentAccount extends Account {

	 private double overdraftLimit;

	    // Constructor
	    public CurrentAccount(String accountNumber,
	                          String customerName,
	                          double balance,
	                          double overdraftLimit) {

	        super(accountNumber, customerName, balance);

	        this.overdraftLimit = overdraftLimit;
	    }
	    
	    

	    public double getOverdraftLimit() {
			return overdraftLimit;
		}



		public void setOverdraftLimit(double overdraftLimit) {
			this.overdraftLimit = overdraftLimit;
		}



		@Override
	    public String toString() {

	        return "CurrentAccount [overdraftLimit=" + overdraftLimit
	                + ", accountNumber=" + accountNumber
	                + ", customerName=" + customerName
	                + ", balance=" + balance + "]";
	    }
	}
