package com.john.white.not.real.junitcardexample;

public class masterCard extends creditCard {

	public masterCard(float balance) {
		super(balance);
	}


	public float calculateInterest() {
		return (float) 0.05;
	}

}
