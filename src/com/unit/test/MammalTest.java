package com.unit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sam.zoopackage.Bat;
import com.sam.zoopackage.Mammal;

public class MammalTest {

	Mammal testMammal = new Bat(1, "Batty", "Bat", "Male", "Small", 2, 3, 1, 20, null, 2, 10, true, true, 10, 2, 3);
	@Test
	public void testMammal(){
		assertNotNull(testMammal);
	}
	

}
