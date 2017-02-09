package com.sam.zoopackage;


public class Fish extends Animal implements Swim{
	//Attributes//
	
	private String colour;
	
	
	//Constructor//

	public Fish(int age, String name, String species, String gender, String size, int weight, int height, double waste, int breathsPerMin, EnclosureType enclosure, int lifeExpectancy, int idealWeight){
		super(age, name, species, gender, size, weight, height, waste, breathsPerMin, enclosure, lifeExpectancy, idealWeight);
	}
	
	//Methods//
	
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void move() {	
	}
	public void nutrition(){	
	}
	
	public void grow() {
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
