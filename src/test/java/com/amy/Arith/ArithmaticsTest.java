package com.amy.Arith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArithmaticsTest {
	
	Arithmatics ari = new Arithmatics();

	@Test
	void testAddition() {
		int expacted = 5;
		int actual =ari.addition(2, 3);
		assertEquals(expacted, actual);
		
	}

	@Test
	void testSubtraction() {
		assertEquals(4, ari.subtraction(6, 2));
	}

	@Test
	void testMultiplecation() {
		assertEquals(9, ari.multiplecation(3, 3));
	}

	@Test
	void testDivition() {
		assertEquals(15, ari.divition(45, 3));
	}

}
