package com.unit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sam.zoopackage.Bat;

public class BatTest {
	
	Bat testBat = new Bat(1, null, null, null, null, 0, 0, 0, 0, null, 0, 0, false, false, 0, 0);
	


	@Test
	public void testBatConstructor(){
		assertNotNull(testBat);
	}
	@Test
	public void testIsEndangered(){
		equals(testBat.isEndangered());

	}
	}

