package com.john.white.not.real.junitcardexample;

import java.util.ArrayList;

public class person implements simpleInterest {

	ArrayList<wallet> user = new ArrayList<wallet>();
	
	public person(wallet wallet){
		user.add(wallet);
	}
	
	public void addWallet(wallet wallet){
		user.add(wallet);
	}
	
	/*
	 * Uses the same interface from creditCard,
	 * and wallet class to generate our simple 
	 * interest.
	 */
	public float simpleInterest() {
		float interestRate = 0;
		for(int i = 0; i < user.size(); i++){
			interestRate += user.get(i).simpleInterest();
		}
		return interestRate;
	}
}
