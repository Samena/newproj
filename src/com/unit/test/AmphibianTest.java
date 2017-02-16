package com.unit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sam.zoopackage.Amphibian;

public class AmphibianTest {

	Amphibian testAmp = new Amphibian(1, "Bob", "Amphibian", "Female", 6, 1, 29 , 1, 2, 3, 0, 0, true);
	
	@Test
	public void testAmphibian(){
		assertNotNull(testAmp);
	}

	
	@Test
	public void testGetSwimSpeed(){
		assertEquals(testAmp.getSwimSpeed(), 0);
	}
	
	@Test
	public void testSetSwimSpeed(){
		testAmp.setSwimSpeed(6);
		assertEquals(testAmp.getSwimSpeed(), 6);
		}
	
	@Test
	public void testCanSwim(){
		testAmp.canSwim();
		assertEquals(1, testAmp.getSwimSpeed());
	}


}
