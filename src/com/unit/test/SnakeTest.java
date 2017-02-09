package com.unit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sam.zoopackage.Snake;

public class SnakeTest {
	
	Snake testSnake = new Snake(2, "scales", "Snake", "Male", "Large", 90, 40,2 , 10, null, 5, 55, true, false, false, true);

	@Test
	public void testSnakeCons(){
		assertNotNull(testSnake);	
	}
	@Test 
	public void testIsDangerous(){
		assertEquals(testSnake.isDangerous(), false);	
	}
	@Test
	public void testSetDangerous(){
		testSnake.setDangerous(true);
		assertEquals(testSnake.isDangerous(), true);
	}
	@Test
	public void testIsEndangered(){
		assertEquals(testSnake.isEndangered(), false);

	}
	
	@Test
	public void testSetEndangered(){
		testSnake.setEndangered(true);
		assertEquals(testSnake.isEndangered(), true);
	}
	
	@Test
	public void testIsVenomous(){
		assertEquals(testSnake.isVenomous(), true);
	}
	
	@Test
	public void testSetVenomous(){
		testSnake.setVenomous(false);
		assertEquals(testSnake.isVenomous(), false);
	}
	
	@Test
	public void testIsNocturnal(){
		assertEquals(testSnake.isNocturnal(), true);

	}
	
	@Test
	public void testSetNocturnal(){
		testSnake.setNocturnal(false);
		assertEquals(testSnake.isNocturnal(), false);
	}
	@Test
	public void testNutrition(){
		testSnake.nutrition();
		assertEquals(3, testSnake.getFoodQuantity());
	}
	
}
