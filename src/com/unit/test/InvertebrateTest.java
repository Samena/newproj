package com.unit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sam.zoopackage.Invertebrate;

public class InvertebrateTest {

	Invertebrate testInv = new Invertebrate(0, null, null, null, null, 0, 0, 0, 0, null, 0, 0);
	@Test
	public void testInvertebrateConstructor(){
		assertNotNull(testInv);
	}

}
