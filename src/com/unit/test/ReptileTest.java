package com.unit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sam.zoopackage.Reptile;

public class ReptileTest {
	
	Reptile testReptile = new Reptile(0, null, null, null, null, 0, 0, 0, 0, null, 0, 0);

	@Test
	public void testReptile() {
		assertNotNull(testReptile);
	}

}
