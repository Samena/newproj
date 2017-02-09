package com.sam.zoopackage;

public class Bird extends Animal implements Flying{

	public Bird(int age, String name, String species, String gender, String size, int weight, int height, double waste, int breathsPerMin, EnclosureType enclosure, int lifeExpectancy, int idealWeight) {
		super(age, name, species, gender, size, weight, height, waste, height, enclosure, lifeExpectancy, idealWeight);}

	
	
	@Override
	public void fly(){
		if (species != "Penguin" || weight > 10){
			System.out.println("This bird cannot fly");
		}
		
	}
	@Override
	public void grow() {

	}

	@Override
	public void nutrition() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reproduce() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void land() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		
	}
	
}
