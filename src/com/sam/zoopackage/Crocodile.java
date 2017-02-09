package com.sam.zoopackage;

public class Crocodile extends Reptile implements Swim {

	
	//Variables//
	private boolean endangered;
	private boolean dangerous;
	private int swimSpeed;
	
	//Constructor//
	
	//Would use a builder pattern here to make more accurate but do not know how at the moment.
	
	public Crocodile(int age, String name, String species, String gender, String size, int weight, int height, int wastePerDay, int breathsPerMin, EnclosureType enclosure, int foodQuantity, int populationNumber, boolean endangered, boolean dangerous, int swimSpeed) {
		
		super(age, name, species, gender, size, weight, height, wastePerDay, breathsPerMin, enclosure, foodQuantity, populationNumber);
	
	
	this.endangered = endangered;
	this.dangerous = dangerous;
	this.swimSpeed = swimSpeed;
	
	
	
	}
	
	@Override
public void nutrition(){
			if (weight < 20 && age < 22){
				this.foodQuantity += 5;
				
			}else{
				this.foodQuantity -= 2;
		}
	}
	
	@Override
	public void canSwim() {
		if (getWeight() > 30 && getBreathsPerMin() >= 20){
			this.setSwimSpeed(getSwimSpeed() + 5);
		}else{ 
		this.setSwimSpeed(getSwimSpeed() - 3);
		}

	}
		
	public int getSwimSpeed() {
		return swimSpeed;
	}

	public void setSwimSpeed(int swimSpeed) {
		this.swimSpeed = swimSpeed;
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
