package com.sam.zoopackage;


public abstract class Mammal extends Animal implements Run{

	public Mammal(int age, String name, String species, String gender, String size, int weight, int height, int wastePerDay, int breathsPerMin, EnclosureType enclosure, int foodQuantity, int populationNumber) {
		
		super(age, name, species, gender, size, weight, height, wastePerDay, breathsPerMin, enclosure, foodQuantity, populationNumber);}

	@Override
	public void sprint() {	
	}
	
	@Override
	public void excrete() {
	
	}

	@Override
	public void grow() {

	}

	@Override
	public void move() {	
	}

	@Override
	public void nutrition(){
		
	}

	@Override
	public void reproduce() {
		
	}

	@Override
	public void respire() {
		
	}

}


