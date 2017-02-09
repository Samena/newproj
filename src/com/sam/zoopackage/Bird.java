package com.sam.zoopackage;


public class Bird extends Animal implements Flying{

	public Bird(int age, String name, String species, String gender, String size, int weight, int height, int wastePerDay, int breathsPerMin, EnclosureType enclosure, int foodQuantity, int populationNumber) {
		
		super(age, name, species, gender, size, weight, height, wastePerDay, breathsPerMin, enclosure, foodQuantity, populationNumber);}

	
	
	@Override
	public void fly(){
		if (species == "Penguin" || weight > 10){
			System.out.println("This cannot fly");
		}else{
			System.out.println("This can fly");
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
