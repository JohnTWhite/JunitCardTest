package com.john.white.not.real.junitcardexample;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class firstTestCase {

	person john;
	wallet wallet;
	masterCard mc;
	visaCard vc;
	discoverCard dc;
	
	@Before
	public void setUp() throws Exception {
		
		final float startingBalance = (float) 100;
		mc = new masterCard(startingBalance);
		vc = new visaCard(startingBalance);
		dc = new discoverCard(startingBalance);
		
		wallet = new wallet(mc);
		wallet.addCard(vc);
		wallet.addCard(dc);
		
		john = new person(wallet);
		
	}

	//This test checks simple interest for the person.
	@Test
	public void testPerson() {
		assert(john.simpleInterest() == 16.0);
	}
	//This test checks the individual cards.
	@Test
	public void testCards() {
		assert(vc.simpleInterest() == 10.0);
		assert(mc.simpleInterest() == 5.0);
		assert(dc.simpleInterest() == 1.0);
	}

}
