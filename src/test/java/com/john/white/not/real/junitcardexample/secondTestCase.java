package com.john.white.not.real.junitcardexample;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class secondTestCase {
	
	person john;
	wallet wallet1;
	wallet wallet2;
	masterCard mc;
	visaCard vc;
	discoverCard dc;

	@Before
	public void setUp() throws Exception {
		final float startingBalance = (float) 100;
		mc = new masterCard(startingBalance);
		vc = new visaCard(startingBalance);
		dc = new discoverCard(startingBalance);
		
		wallet1 = new wallet(vc);
		wallet1.addCard(dc);
		
		wallet2 = new wallet(mc);
		
		john = new person(wallet1);
		john.addWallet(wallet2);
		
	}

	/*
	 * Simple interest for a person with
	 * multiple wallets.
	 */
	@Test
	public void testPerson() {
		assert(john.simpleInterest()==16.0);
		
	}
	/*
	 * Simple interest for multiple 
	 * wallets.
	 */
	@Test
	public void testWallet() {
		assert(wallet1.simpleInterest()==11.0);
		assert(wallet2.simpleInterest()==5.0);
		
	}

}
