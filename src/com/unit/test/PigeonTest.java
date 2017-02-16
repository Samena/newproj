package com.unit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sam.zoopackage.Pigeon;

public class PigeonTest {
	
	Pigeon testPige = new Pigeon(4, "Pidgy", "Pigeon", "Female", 6, 2, 3, 5, 5, 20, 0, true, 6, 10, 10);

	@Test
	public void testPigeon(){
		assertNotNull(testPige);
	}

	
	@Test
	public void testIsEndangered(){
		assertEquals(testPige.isEndangered(), true);

	}
	
	@Test
	public void testSetEndangered(){
		testPige.setEndangered(false);
		assertEquals(testPige.isEndangered(), false);
	}
	
	@Test
	public void testLand(){
		testPige.land();
		assertEquals(15, testPige.getLandingSpeed());
	}
	
	@Test
	public void testNutrition(){
		testPige.nutrition();
		assertEquals(4, testPige.getFoodQuantity());
	}
	
}
