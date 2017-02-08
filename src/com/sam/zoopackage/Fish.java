package com.sam.zoopackage;

public class Fish extends Animal implements Swim{
	//Attributes//
	
	private String colour;
	
	
	//Constructor//

	public Fish(int age, String name, String species, String breed, String size, int weight, int height, String colour) {
		super(age, name, species, breed, size, weight, height);
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
	public void submerge() {	
	}

	@Override
	public void canFloat() {	
	}

	@Override
	public void emerge() {
		
	}

}
