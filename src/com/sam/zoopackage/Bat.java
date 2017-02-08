package com.sam.zoopackage;

public class Bat extends Animal implements Flying{
	
	//Variables//
	
	private boolean endangered;
	private boolean nocturnal;
	
//Constructor//
	
//using 9 parameters may be too much. Would like to use builder pattern later on to condense it down later on. Don't know how to use this.
	
	public Bat(int age, String name, String species, String breed, String size, int weight, int height, boolean endangered, boolean nocturnal){
		super(age, breed, breed, breed, breed, age, age); 
		
		this.endangered = endangered;
		this.nocturnal = nocturnal;	
}
	
	//Methods//
	
	public boolean isEndangered() {
		return endangered;
	}

	public void setEndangered(boolean endangered) {
		this.endangered = endangered;
	}

	public boolean isNocturnal() {
		return nocturnal;
	}

	public void setNocturnal(boolean nocturnal) {
		this.nocturnal = nocturnal;
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void flying() {
		// TODO Auto-generated method stub
		
	}
	
	public void nutrition(){}
}
