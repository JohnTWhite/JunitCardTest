package com.john.white.not.real.junitcardexample;

import java.util.ArrayList;

public class wallet implements simpleInterest {

	ArrayList<creditCard> wallet = new ArrayList<creditCard>();
	
	/*
	 * Caller initializes class, as opposed
	 * to it initializing itself.
	 */
	public wallet(creditCard card){
		wallet.add(card);
	}
	
	/*
	 * Allows to add more cards.
	 */
	public void addCard(creditCard card){
		wallet.add(card);
	}

	/*
	 * Uses the same interface from creditCard class
	 * to generate our simple interest.
	 */
	public float simpleInterest() {
		float interestValue = 0;
		for(int i = 0; i < wallet.size(); i++){
			creditCard currentCard = wallet.get(i); 
			interestValue += currentCard.simpleInterest() ;
		}
		return interestValue;
	}
	
}
