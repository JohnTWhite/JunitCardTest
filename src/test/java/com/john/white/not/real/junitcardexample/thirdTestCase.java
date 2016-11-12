package com.john.white.not.real.junitcardexample;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class thirdTestCase {

	person john, thomas;
	wallet wallet1, wallet2;
	masterCard mc, mc2;
	visaCard vc, vc2;

	@Before
	public void setUp() throws Exception {
		final float startingBalance = (float) 100;
		mc = new masterCard(startingBalance);
		vc = new visaCard(startingBalance);
		vc2 = new visaCard(startingBalance);
		mc2 = new masterCard(startingBalance);
		
		wallet1 = new wallet(mc);
		wallet1.addCard(vc);
		
		wallet2 = new wallet(mc2);
		wallet2.addCard(vc2);
		
		john = new person(wallet1);
		thomas = new person(wallet2);
		
	}

	/*
	 * Simple interest for multiple
	 * users.
	 */
	@Test
	public void testPerson() {
		assert(john.simpleInterest()==15.0);
		assert(thomas.simpleInterest()==15.0);
		
	}
	/*
	 * Simple interest for multiple 
	 * wallets across users.
	 */
	@Test
	public void testWallet() {
		assert(wallet1.simpleInterest()==15.0);
		assert(wallet2.simpleInterest()==15.0);
		
	}

}
