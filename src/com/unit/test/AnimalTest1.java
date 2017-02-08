package com.unit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sam.zoopackage.Animal;

public class AnimalTest1 {
		
		//Test constructor//
		
		@Test
		public void testAnimalConstructor(){
			Animal testAnimal = new Animal(1, "Simba", "Big Cats", "African Lion", "Large", 190, 2 );
			assertNotNull(testAnimal);
		}
		
		//Test getters and setters//
		
	@Test
	public void testGetAnimalAge(){
		Animal testAnimal = new Animal(1, "Simba", "Big Cats", "African Lion", "Large", 190, 2 );
		assertEquals(testAnimal.getAge(), 1);
	}
	
	@Test
	public void testSetAnimalAge(){
		Animal testAnimal = new Animal(1, "Simba", "Big Cats", "African Lion", "Large", 190, 2 );
		testAnimal.setAge(3);
		assertEquals(testAnimal.getAge(), 3);
		}
	@Test
	public void testGetAnimalName(){
		Animal testAnimal = new Animal(1, "Simba", "Big Cats", "African Lion", "Large", 190, 2 );
		assertEquals(testAnimal.getName(), "Simba");
	}
	@Test
	public void testSetAnimalName(){
		Animal testAnimal = new Animal(1, "Simba", "Big Cats", "African Lion", "Large", 190, 2 );
		testAnimal.setName("Mufasa");
		assertEquals(testAnimal.getName(), "Mufasa");
		}
	
	@Test
	public void testGetAnimalSpecies(){
		Animal testAnimal = new Animal(1, "Simba", "Big Cats", "African Lion", "Large", 190, 2 );
		assertEquals(testAnimal.getSpecies(),"Big Cats");
		}
	@Test
	public void testSetAnimalSpecies(){
		Animal testAnimal = new Animal(1, "Simba", "Big Cats", "African Lion", "Large", 190, 2 );
		testAnimal.setSpecies("Small Cats");
		assertEquals(testAnimal.getSpecies(), "Small Cats");
		}
	@Test
	public void testGetAnimalBreed(){
		Animal testAnimal = new Animal(1, "Simba", "Big Cats", "African Lion", "Large", 190, 2 );
		assertEquals(testAnimal.getBreed(),"African Lion");
		}
	@Test
	public void testSetAnimalBreed(){
		Animal testAnimal = new Animal(1, "Simba", "Big Cats", "African Lion", "Large", 190, 2 );
		testAnimal.setBreed("English Lion");
		assertEquals(testAnimal.getBreed(), "English Lion");
		}
	@Test
	public void testGetAnimalSize(){
		Animal testAnimal = new Animal(1, "Simba", "Big Cats", "African Lion", "Large", 190, 2 );
		assertEquals(testAnimal.getSize(),"Large");
		}
	@Test
	public void testSetAnimalSize(){
		Animal testAnimal = new Animal(1, "Simba", "Big Cats", "African Lion", "Large", 190, 2 );
		testAnimal.setSize("Small");
		assertEquals(testAnimal.getSize(), "Small");
		}
	@Test
	public void testGetAnimalWeight(){
		Animal testAnimal = new Animal(1, "Simba", "Big Cats", "African Lion", "Large", 190, 2 );
		assertEquals(testAnimal.getWeight(),190);
		}
	
	@Test
	public void testSetAnimalWeight(){
		Animal testAnimal = new Animal(1, "Simba", "Big Cats", "African Lion", "Large", 190, 2 );
		testAnimal.setWeight(100);
		assertEquals(testAnimal.getWeight(), 100);
		}
	
	@Test
	public void testGetAnimalHeight(){
		Animal testAnimal = new Animal(1, "Simba", "Big Cats", "African Lion", "Large", 190, 2 );
		assertEquals(testAnimal.getHeight(),2);
		}
	@Test
	public void testSetAnimalHeight(){
		Animal testAnimal = new Animal(1, "Simba", "Big Cats", "African Lion", "Large", 190, 2 );
		testAnimal.setHeight(1);
		assertEquals(testAnimal.getHeight(), 1);
		}

}
