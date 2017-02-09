package com.sam.zoopackage;

public class Pigeon extends Bird implements Flying{
	
	//Variables///
	
	private boolean endangered;

//Constructor//

	public Pigeon(int age, String name, String species, String gender, String size, int weight, int height, int wastePerDay, int breathsPerMin, EnclosureType enclosure, int foodQuantity, int populationNumber, boolean endangered, int flightSpeed, int landingSpeed, int wingPower) {
		
	super(age, name, species, gender, size, weight, height, wastePerDay, breathsPerMin, enclosure, foodQuantity, populationNumber, flightSpeed, landingSpeed, wingPower);

	this.endangered = endangered;

	}
	
	@Override
	public void land() {
		
		
		if (getWeight() > 5 && getFlightSpeed() <= 10){
			this.setLandingSpeed(getLandingSpeed() + 5);
		}else{ 
		this.setLandingSpeed(getLandingSpeed() - 5);
		}
	}
		

	
	@Override
	public void nutrition(){
		if (weight < 5 && age > 1){
			this.foodQuantity += 1;
			
		}else{
			this.foodQuantity -=1;
	}
	}
	
	public boolean isEndangered() {
		return endangered;
	}

	public void setEndangered(boolean endangered) {
		this.endangered = endangered;
	}
	
	
	
	
}
