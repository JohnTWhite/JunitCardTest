package com.john.white.not.real.junitcardexample;

/*
 * The creditCard class will be what all child cards
 * inherit from. Each card needs to hold a balance
 * , and store their respective interest rate.
 * 
 * creditCard implements interestRate interface 
 * so that each new credit card can has it's own
 * interest rate.
 * 
 * 
 */

public abstract class creditCard implements interestRate, simpleInterest {
	
	//Each card will have these values.
	
	protected float balance;
	protected float interestRate;
	
	/*
	 * Dependency Inversion used by having the 
	 * caller create the dependencies instead
	 * of letting the class create the 
	 * dependencies. 
	 */
	public creditCard(float balance){
		this.balance = balance; 
		this.interestRate = calculateInterest();
	}
	
	/*
	 * Simple interest calculator for all cards.
	 * Builds on the simpleInterest interface.
	 */
	public float simpleInterest(){
		return this.balance * this.interestRate;
		
	}
}

