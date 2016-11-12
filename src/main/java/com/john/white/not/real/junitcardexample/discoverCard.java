package com.john.white.not.real.junitcardexample;

public class discoverCard extends creditCard {

	//Dependencies created by caller.
	public discoverCard(float balance) {
		super(balance);
	}

	public float calculateInterest() {
		return (float) 0.01;
	}

}
