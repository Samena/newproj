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

	public Pigeon(int age, String name, String species, String breed, String size, int weight, int height, EnclosureType enclosure) {
		super(age, name, species, breed, size, weight, height, enclosure );
	}

	@Override
	public void flying() {
	
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
