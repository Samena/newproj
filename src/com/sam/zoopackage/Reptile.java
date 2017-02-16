package com.sam.zoopackage;

public class Reptile extends Animal {

	// Constructor//
	
	/**
	 * 
	 * reproduce differently
	 * cold blooded
	 * scales
	 */
	public Reptile(){
		
		
		super(0,"","");   //if create an empty reptile doesn't have species, name, and age of 0
		
	};


	public Reptile(int age, String name, String species, String gender, int weight, int height,
			int wastePerDay, int breathsPerMin, int foodQuantity, int populationNumber, int averageLifeSpan) {

		super(age, name, species, gender, weight, height, wastePerDay, breathsPerMin, foodQuantity, populationNumber, averageLifeSpan);
	}


	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void respire() {
		// TODO Auto-generated method stub
		
	}

}
