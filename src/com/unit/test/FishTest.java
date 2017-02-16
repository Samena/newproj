package com.unit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sam.zoopackage.Fish;

public class FishTest {

	Fish testFish = new Fish(1, "Nemo", "Fish", "Male", 2, 3, 5, 6, 1, 3, 0, "Orange", 6);
	
	@Test
	public void testFishConstructor(){
		assertNotNull(testFish);
	}
	
	@Test
	public void testSetSwimSpeed(){
		testFish.setSwimSpeed(3);
		assertEquals(testFish.getSwimSpeed(), 3);
	}
	
	@Test
	public void testGetSwimSpeed(){
		assertEquals(testFish.getSwimSpeed(), 6);
	}
	
	@Test
	public void testGetColour(){
			equals(testFish.getColour());
		}

	
	@Test
	public void testSetColour(){
	testFish.setColour("Blue");
		assertEquals(testFish.getColour(), "Blue" );
	}
	@Test
	public void testCanSwim(){
		testFish.canSwim();
		assertEquals(5, testFish.getSwimSpeed());
	}
	
	@Test
	public void testNutrition(){
		testFish.nutrition();
		assertEquals(0, testFish.getFoodQuantity());
	}

	
	
}

	