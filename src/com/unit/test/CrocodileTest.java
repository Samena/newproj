package com.unit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sam.zoopackage.Crocodile;

public class CrocodileTest {
	
	Crocodile testCroc = new Crocodile(15, "Stan", "Crocodile", "Male", "Large", 60, 100, 10, 20, null, 35, 80, true, true, 40);

	@Test
	public void testCroc(){
		assertNotNull(testCroc);
	}
	
	@Test
	public void testIsEndangered(){
		assertEquals(testCroc.isEndangered(), true);

	}
	
	@Test
	public void testSetEndangered(){
		testCroc.setEndangered(false);
		assertEquals(testCroc.isEndangered(), false);
	}

	@Test
	public void testNutrition(){
		testCroc.nutrition();
		assertEquals(33, testCroc.getFoodQuantity());
	}
	
	@Test
	public void testGetSwimSpeed(){
		assertEquals(testCroc.getSwimSpeed(), 40);
	}
	
	@Test
	public void testSetSwimSpeed(){
		testCroc.setSwimSpeed(60);
		assertEquals(testCroc.getSwimSpeed(), 60);
		}
	
	@Test 
	public void testIsDangerous(){
		assertEquals(testCroc.isDangerous(), true);	
	}
	@Test
	public void testSetDangerous(){
		testCroc.setDangerous(false);
		assertEquals(testCroc.isDangerous(), false);
	}
	
	@Test
	public void testCanSwim(){
		testCroc.canSwim();
		assertEquals(45, testCroc.getSwimSpeed());
	}
	
	
	
}
