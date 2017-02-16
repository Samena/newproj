package com.unit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sam.zoopackage.Crocodile;

public class CrocodileTest {

	Crocodile testCroc = new Crocodile(15, "Stan", "Crocodile", "Male", 60, 100, 10, 20, 35, 80,
			0, true, false, 40);

	@Test
	public void testCroc() {
		assertNotNull(testCroc);
	}

	@Test
	public void testIsEndangered() {
		assertEquals(testCroc.isEndangered(), true);

	}

	@Test
	public void testSetEndangered() {
		testCroc.setEndangered(false);
		assertEquals(testCroc.isEndangered(), false);
	}

	@Test
	public void testNutrition() {
		testCroc.nutrition();
		assertEquals(33, testCroc.getFoodQuantity());
	}

	@Test
	public void testGetSwimSpeed() {
		assertEquals(testCroc.getSwimSpeed(), 40);
	}

	@Test
	public void testSetSwimSpeed() {
		testCroc.setSwimSpeed(60);
		assertEquals(testCroc.getSwimSpeed(), 60);
	}


	@Test
	public void testCanSwim() {
		testCroc.canSwim();
		assertEquals(45, testCroc.getSwimSpeed());
	}

}
