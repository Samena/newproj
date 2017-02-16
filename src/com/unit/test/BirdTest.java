package com.unit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sam.zoopackage.Bird;

public class BirdTest {
	
	Bird testBird = new Bird(4, "Tweedy Pie", "Bird", "Male", 1, 1, 1, 10, 3, 100, 10, 2, 5, 0);

	@Test
	public void testBirdConstructor(){
		assertNotNull(testBird);
	}
	
	@Test
	public void testGetWingPower(){
		assertEquals(testBird.getWingPower(), 5);
	}
	
	@Test
	public void testSetPower(){
		testBird.setWingPower(3);
		assertEquals(testBird.getWingPower(), 3);
		}
	@Test
	public void testGetFlightSpeed(){
		assertEquals(testBird.getFlightSpeed(), 10);
	}
	
	@Test
	public void testSetFlightSpeed(){
		testBird.setFlightSpeed(3);
		assertEquals(testBird.getFlightSpeed(), 3);
		}
	@Test
	public void testGetLandingSpeed(){
		assertEquals(testBird.getLandingSpeed(), 2);
	}
	
	@Test
	public void testSetLandingSpeed(){
		testBird.setLandingSpeed(3);
		assertEquals(testBird.getLandingSpeed(), 3);
		}
	@Test
	public void testFly(){
		testBird.fly();
		assertEquals(12, testBird.getFlightSpeed());
	}

	@Test
	public void testTakeOff(){
		testBird.takeOff();
		assertEquals(9, testBird.getFlightSpeed());
	}

	@Test
	public void testLand(){
		testBird.land();
		assertEquals(7, testBird.getLandingSpeed());
	}
	

	@Test
	public void testNutrition(){
		testBird.nutrition();
		assertEquals(2, testBird.getFoodQuantity());
	}
	
}
