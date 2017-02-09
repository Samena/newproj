package com.unit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sam.zoopackage.Animal;
import com.sam.zoopackage.Enclosure.EnclosureType;
import com.sam.zoopackage.Invertebrate;

public class AnimalTest1 {
	
	Animal testAnimal = new Invertebrate(1, "Binky", "Invertebrate", "Female", "Small", 2, 3, 3, 20, EnclosureType.CATCAVE , 2, 10);
		
		//Test constructor//
		
		@Test
		public void testAnimalConstructor(){
			assertNotNull(testAnimal);
		}
		
		//Test getters and setters//
		
	@Test
	public void testGetAnimalAge(){
		assertEquals(testAnimal.getAge(), 1);
	}
	
	@Test
	public void testSetAnimalAge(){
		testAnimal.setAge(3);
		assertEquals(testAnimal.getAge(), 3);
		}
	@Test
	public void testGetAnimalName(){
		assertEquals(testAnimal.getName(), "Binky");
	}
	@Test
	public void testSetAnimalName(){

		testAnimal.setName("Mufasa");
		assertEquals(testAnimal.getName(), "Mufasa");
		}
	
	@Test
	public void testGetAnimalSpecies(){
		assertEquals(testAnimal.getSpecies(),"Invertebrate");
		}
	@Test
	public void testSetAnimalSpecies(){
		testAnimal.setSpecies("Lion");
		assertEquals(testAnimal.getSpecies(), "Lion");
		}
	
	@Test
	public void testGetAnimalSize(){
		assertEquals(testAnimal.getSize(),"Small");
		}
	@Test
	public void testSetAnimalSize(){
		testAnimal.setSize("Large");
		assertEquals(testAnimal.getSize(), "Large");
		}
	@Test
	public void testGetAnimalWeight(){
		assertEquals(testAnimal.getWeight(),2);
		}
	
	@Test
	public void testSetAnimalWeight(){
		testAnimal.setWeight(100);
		assertEquals(testAnimal.getWeight(), 100);
		}
	
	@Test
	public void testGetAnimalHeight(){
		assertEquals(testAnimal.getHeight(),3);
		}
	@Test
	public void testSetAnimalHeight(){
		testAnimal.setHeight(1);
		assertEquals(testAnimal.getHeight(), 1);
		}
@Test
public void testGetAnimalGender(){
	assertEquals(testAnimal.getGender(), "Female");
	
}
@Test
public void testSetAnimalGender(){
	testAnimal.setGender("Male");
	assertEquals(testAnimal.getGender(), "Male");
}

@Test
public void testGetWastePerDay(){
	assertEquals(testAnimal.getWastePerDay(), 3);
}
@Test
public void testSetWastePerDay(){
	testAnimal.setGender("Male");
	assertEquals(testAnimal.getGender(), "Male");
}

@Test
public void testGetBreathsPerMin(){
	assertEquals(testAnimal.getBreathsPerMin(), 20);
}

@Test
public void testSetBreathsPerMin(){
	testAnimal.setBreathsPerMin(4);
	assertEquals(testAnimal.getBreathsPerMin(), 4);
}

@Test
public void testGetPopulationNumber(){
	assertEquals(testAnimal.getPopulationNumber(), 10);
}


@Test
public void testSetPopulationNumber(){
	testAnimal.setPopulationNumber(0);
	assertEquals(testAnimal.getPopulationNumber(), 0);
}


@Test
public void testGetFoodQuantity(){
	assertEquals(testAnimal.getFoodQuantity(), 2);
}


@Test
public void testSetFoodQuantity(){
	testAnimal.setFoodQuantity(1);
	assertEquals(testAnimal.getFoodQuantity(), 1);
}

@Test
public void excretion(){
	testAnimal.excrete();
	assertEquals(0, testAnimal.getFoodQuantity());
}


@Test
public void reproduce(){
	testAnimal.reproduce();
	assertEquals(10, testAnimal.getPopulationNumber());
}

@Test 
public void grow(){
	testAnimal.grow();
	assertEquals(3, testAnimal.getHeight());
	assertEquals(2, testAnimal.getWeight());
}





}
