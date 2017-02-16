package com.unit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sam.zoopackage.Penguin;

public class PenguinTest {
	
	Penguin testPeng = new Penguin(1, "Pingu", "Penguin", "Male", null, 5, 3, 2, 20, 10, 90, 6, 10, 7, 0, true, 10);

	@Test
	public void testPenguin(){
		assertNotNull(testPeng);
	}

	
	@Test
	public void testGetSwimSpeed(){
		assertEquals(testPeng.getSwimSpeed(), 10);
	}
	
	@Test
	public void testSetSwimSpeed(){
		testPeng.setSwimSpeed(6);
		assertEquals(testPeng.getSwimSpeed(), 6);
		}
	
	@Test
	public void testCanSwim(){
		testPeng.canSwim();
		assertEquals(8, testPeng.getSwimSpeed());
	}

	@Test
	public void testNutrition(){
		testPeng.nutrition();
		assertEquals(8, testPeng.getFoodQuantity());
	}

}
	

