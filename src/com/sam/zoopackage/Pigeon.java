package com.sam.zoopackage;

public class Pigeon extends Bird implements Flying{
	
	//Variables//
	
	private boolean endangered;

	public boolean isEndangered() {
		return endangered;
	}

	public void setEndangered(boolean endangered) {
		this.endangered = endangered;
	}

	public Pigeon(int age, String name, String species, String gender, String size, int weight, int height, double waste, int breathsPerMin, EnclosureType enclosure, int lifeExpectancy, int idealWeight){
		super(age, name, species, gender, size, weight, height, waste, breathsPerMin, enclosure, lifeExpectancy, idealWeight);
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
