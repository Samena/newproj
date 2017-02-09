package com.unit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sam.zoopackage.Bat;

public class BatTest {
	
	Bat testBat = new Bat(2, "Batty", "Bat", "Male", "Small", 2, 2, 1, 50, null, 2, 10, true, true, 10, 2, 3);
	
	
	@Test
	public void testBatConstructor(){
		assertNotNull(testBat);
	}
	@Test
	public void testIsEndangered(){
		assertEquals(testBat.isEndangered(), true);

	}
	
	@Test
	public void testSetEndangered(){
		testBat.setEndangered(false);
		assertEquals(testBat.isEndangered(), false);
	}
	
	@Test
	public void testIsNocturnal(){
		assertEquals(testBat.isNocturnal(), true);

	}
	
	@Test
	public void testSetNocturnal(){
		testBat.setNocturnal(false);
		assertEquals(testBat.isNocturnal(), false);
	}
	
	@Test
	public void testGetPower(){
		assertEquals(testBat.getPower(), 2);
	}
	
	@Test
	public void testSetPower(){
		testBat.setPower(3);
		assertEquals(testBat.getPower(), 3);
		}
	
	@Test
	public void testGetFlightSpeed(){
		assertEquals(testBat.getFlightSpeed(), 10);
	}
	
	@Test
	public void testSetFlightSpeed(){
		testBat.setFlightSpeed(3);
		assertEquals(testBat.getFlightSpeed(), 3);
		}
	
	@Test
	public void testFly(){
		testBat.fly();
		assertEquals(12, testBat.getFlightSpeed());
	}

	@Test
	public void testTakeOff(){
		testBat.takeOff();
		assertEquals(9, testBat.getFlightSpeed());
	}

	@Test
	public void testLand(){
		testBat.land();
		assertEquals(1, testBat.getLandingSpeed());
	}
	

	@Test
	public void testNutrition(){
		testBat.nutrition();
		assertEquals(5, testBat.getFoodQuantity());
	}
	
	}

