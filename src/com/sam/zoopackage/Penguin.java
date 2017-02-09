package com.sam.zoopackage;

public class Penguin extends Bird implements Swim {
	
   //Attributes//
	private boolean endangered;
	private int swimSpeed;
	
   //Constructor//
	
	public Penguin(int age, String name, String species, String gender, String size, int weight, int height, int wastePerDay, int breathsPerMin, EnclosureType enclosure, int foodQuantity, int populationNumber, int flightSpeed, int landingSpeed, int wingPower, boolean endangered, int swimSpeed) {
		
		super(age, name, species, gender, size, weight, height, wastePerDay, breathsPerMin, enclosure, foodQuantity, populationNumber, flightSpeed, landingSpeed, wingPower);
		
		
		this.endangered = endangered;
		this.swimSpeed = swimSpeed;
		
	}


	//Methods//


@Override
public void nutrition(){

		if (weight < 30 && age > 8){
			this.foodQuantity += 2;
			
		}else{
			this.foodQuantity -=2;
	}
	}
		


@Override
public void canSwim() {

	if (getWeight() > 10 && getBreathsPerMin() <= 20){
		this.setSwimSpeed(getSwimSpeed() + 2);
	}else{ 
	this.setSwimSpeed(getSwimSpeed() - 2);
	}

}


public boolean isEndangered() {
	return endangered;
}

public void setEndangered(boolean endangered) {
	this.endangered = endangered;
}


public int getSwimSpeed() {
	return swimSpeed;
}


public void setSwimSpeed(int swimSpeed) {
	this.swimSpeed = swimSpeed;
}

}
