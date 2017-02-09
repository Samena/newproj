package com.sam.zoopackage;

public class Crocodile extends Reptile implements Swim {

	
	//Variables//
	private boolean endangered;
	private boolean dangerous;
	
	//Constructor//
	
	//Would use a builder pattern here to make more accurate but do not know how at the moment.
	
	public Crocodile(int age, String name, String species, String gender, String size, int weight, int height, int wastePerDay, int breathsPerMin, EnclosureType enclosure, int foodQuantity, int populationNumber, boolean endangered, boolean dangerous) {
		
		super(age, name, species, gender, size, weight, height, wastePerDay, breathsPerMin, enclosure, foodQuantity, populationNumber);
	}
	
public void nutrition(){
	}

@Override
public void reproduce() {

}

@Override
public void canSwim() {

}

@Override
public void breatheUnderwater() {
}
	
public boolean isEndangered() {
	return endangered;
}

public void setEndangered(boolean endangered) {
	this.endangered = endangered;
}

public boolean isDangerous() {
	return dangerous;
}

public void setDangerous(boolean dangerous) {
	this.dangerous = dangerous;
}
}
