package com.unit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sam.zoopackage.Cat;

public class CatTest {

	Cat testCat = new Cat(5, 8, 3, false);
	
	
	
	@Test
	public void testCatCons(){
		assertNotNull(testCat);
		}
	
	@Test
	public void testNutrition(){
		testCat.nutrition();
		assertEquals(17, testCat.getFoodQuantity());
	}
	@Test
	public void testSprint(){
		testCat.sprint();
		assertEquals(2, testCat.getAvgSpeed());
	}
	
	@Test
	public void testIsEndangered(){
		assertEquals(testCat.isEndangered(), false);

	}
	
	@Test
	public void testSetEndangered(){
		testCat.setEndangered(true);
		assertEquals(testCat.isEndangered(), true);
	}
	
	@Test
	public void testIsNocturnal(){
		assertEquals(testCat.isNocturnal(), false);

	}
	
	@Test
	public void testSetNocturnal(){
		testCat.setNocturnal(true);
		assertEquals(testCat.isNocturnal(), true);
	}
	

	@Test
	public void testGetAvgSpeed(){
		assertEquals(testCat.getAvgSpeed(), 5);
	}
	
	@Test 
	public void testSetAvgSpeed(){
		testCat.setAvgSpeed(3);
		assertEquals(testCat.getAvgSpeed(), 3);
		
	}
	@Test
	public void testGetStartSpeed(){
		assertEquals(testCat.getStartSpeed(), 1);
	}
	
	@Test 
	public void testSetStartSpeed(){
		testCat.setStartSpeed(0);
		assertEquals(testCat.getStartSpeed(), 0);
		
	}
	
	@Test
	public void testGetTopSpeed(){
		assertEquals(testCat.getTopSpeed(), 10);
	}
	
	@Test 
	public void testSetTopSpeed(){
		testCat.setTopSpeed(24);
		assertEquals(testCat.getTopSpeed(), 24);
		
	}
	
	
	
	}


