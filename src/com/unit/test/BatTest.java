package com.unit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sam.zoopackage.Bat;

public class BatTest {

	@Test
	public void testBatConstructor(){
		Bat testBat = new Bat(1, "name", "gender", "species", "size", 190, 2, false, false, null );
		assertNotNull(testBat);
	}
	@Test
	public void testIsEndangered(){
		Bat testBat = new Bat(1, "name", "gender", "species", "size", 190, 2, false, false, null );
		equals(testBat.isEndangered());
	}
	
	@Test
	public void testSetEndangered(){
		Bat testBat = new Bat(1, "name", "gender", "species", "size", 190, 2, false, false, null );
		testBat.setEndangered(true);
		equals(testBat.isEndangered());
	}

	@Test
	public void testIsNoctural(){
		Bat testBat = new Bat(1, "name", "gender", "species", "size", 190, 2, false, false, null );
		equals(testBat.isNocturnal());
	}
	
	@Test
	public void testSetNocturnal(){
		Bat testBat = new Bat(1, "name", "gender", "species", "size", 190, 2, false, false, null );
		testBat.setNocturnal(true);
		equals(testBat.isNocturnal());
	}

	
	}

