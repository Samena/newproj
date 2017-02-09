package com.sam.zoopackage;

public class Amphibian extends Animal implements Swim{
	
	private int swimSpeed;
	
	public Amphibian(int age, String name, String species, String gender, String size, int weight, int height, int wastePerDay, int breathsPerMin, EnclosureType enclosure, int foodQuantity, int populationNumber, int swimSpeed) {
	
	super(age, name, species, gender, size, weight, height, wastePerDay, breathsPerMin, enclosure, foodQuantity, populationNumber);
}


	@Override
	public void canSwim() {

		if (getWeight() > 5 && getBreathsPerMin() <= 30){
			this.setSwimSpeed(getSwimSpeed() + 1);
		}else{ 
		this.setSwimSpeed(getSwimSpeed() - 1);
		}

		
	}


	public int getSwimSpeed() {
		return swimSpeed;
	}


	public void setSwimSpeed(int swimSpeed) {
		this.swimSpeed = swimSpeed;
	}




	
}
