package com.sam.zoopackage;

public class Amphibian extends Animal implements Swim{
	
	public Amphibian(int age, String name, String species, String gender, String size, int weight, int height, int wastePerDay, int breathsPerMin, EnclosureType enclosure, int foodQuantity, int populationNumber) {
	
	super(age, name, species, gender, size, weight, height, wastePerDay, breathsPerMin, enclosure, foodQuantity, populationNumber);
}


		

	@Override
	public void nutrition(){	
	}

	@Override
	public void reproduce() {
		if(this.gender.trim().toLowerCase() == "male"){
			System.out.println("Cannot give birth to eggs");
		}else{
			System.out.println("Can give birth to eggs");
			
		}

	}


	@Override
	public void canSwim() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void breatheUnderwater() {
		// TODO Auto-generated method stub
		
	}


	
}
