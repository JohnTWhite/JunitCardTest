package com.john.white.not.real.junitcardexample;

public class visaCard extends creditCard {

	//Dependencies created by caller.
	public visaCard(float balance) {
		super(balance);
	}

	public float calculateInterest() {
		return (float) 0.1;
	}

}
