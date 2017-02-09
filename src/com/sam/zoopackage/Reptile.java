package com.sam.zoopackage;


public class Reptile extends Animal {

	
	//Constructor//
	
	public Reptile(int age, String name, String species, String gender, String size, int weight, int height, double waste, int breathsPerMin, EnclosureType enclosure, int lifeExpectancy, int idealWeight){
		super(age, name, species, gender, size, weight, height, waste, breathsPerMin, enclosure, lifeExpectancy, idealWeight);
	}
	
	//methods//
	public void grow() {
	}
	
	public void bask(){}

	@Override
	public void reproduce() {
		// TODO Auto-generated method stub
		
	}
	
	

}
