package com.training.example;

public class Bank {
	double balance;

	public Bank(double balance) {
		super();
		this.balance = balance;
	}
	
	public double withdraw(double amount) throws ExceedingException{
		if(amount>=4000 || amount==balance) {
			throw new ExceedingException("amount beyond limit");
		}
		else if(amount<=0) {
			throw new NegativevalueException("amount cannot be negative or zero");
		}
		balance= balance-amount;
		return balance;
	}
	public double deposit(double amount) throws ExceedingException {
		if(amount>=4000 ) {
			throw new ExceedingException("amount beyond limit");
		}
		else if(amount<=0) {
			throw new NegativevalueException("amount cannot be negative or zero");
		}
		balance= balance+amount;
		return balance;
	}


}
