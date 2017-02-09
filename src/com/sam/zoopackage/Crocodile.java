package com.sam.zoopackage;

public class Crocodile extends Reptile implements Swim {

	
	//Variables//
	private boolean endangered;
	private boolean dangerous;
	
	//Constructor//
	
	//Would use a builder pattern here to make more accurate but do not know how at the moment.
	
	public Crocodile(int age, String name, String species, String gender, String size, int weight, int height, double waste, int breathsPerMin, EnclosureType enclosure, int lifeExpectancy, int idealWeight){
		super(age, name, species, gender, size, weight, height, waste, breathsPerMin, enclosure, lifeExpectancy, idealWeight);
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
	
public void nutrition(){
	}

@Override
public void reproduce() {
	// TODO Auto-generated method stub
	
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
