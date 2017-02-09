package com.sam.zoopackage;

public class Pigeon extends Bird implements Flying{
	
	//Variables//
	
	private boolean endangered;

//Constructor//

	public Pigeon(int age, String name, String species, String gender, String size, int weight, int height, int wastePerDay, int breathsPerMin, EnclosureType enclosure, int foodQuantity, int populationNumber, boolean endangered) {
		
		super(age, name, species, gender, size, weight, height, wastePerDay, breathsPerMin, enclosure, foodQuantity, populationNumber);}

	public boolean isEndangered() {
		return endangered;
	}

	public void setEndangered(boolean endangered) {
		this.endangered = endangered;
	}
	
	@Override
	public void fly() {
	
	}

	@Override
	public void land() {
	}

	@Override
	public void takeOff() {
	}
public void nutrition(){
	}
	
public void reproduce() {
	
}
}
