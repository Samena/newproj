package com.sam.zoopackage;


public class Bird extends Animal implements Flying{

	private int flightSpeed;
	private int landingSpeed;
	private int wingPower;
	

	public Bird(int age, String name, String species, String gender, String size, int weight, int height, int wastePerDay, int breathsPerMin, EnclosureType enclosure, int foodQuantity, int populationNumber, int flightSpeed, int landingSpeed, int wingPower) {
		
		super(age, name, species, gender, size, weight, height, wastePerDay, breathsPerMin, enclosure, foodQuantity, populationNumber);
		
	
	this.flightSpeed = flightSpeed;
	this.landingSpeed = landingSpeed;
	this.wingPower = wingPower;
	
	
	
	}



/////// Methods /////

	@Override
		public void fly() {                                        
			 if (getWeight() < 3 && species != "Penguin"){
				 this.setFlightSpeed(getFlightSpeed() + 2);
			 }else{ 
				 this.setFlightSpeed(getFlightSpeed() - 2); 
				 
			 }		 
	}
	
	
	@Override
	public void land(){
		
		if (getWeight() > 5 && flightSpeed <= 10){
			this.setLandingSpeed(getLandingSpeed() + 5);
		}else{ 
		this.setLandingSpeed(getLandingSpeed() + 5);
		}
	
}
		
	@Override
		public void nutrition(){
			if (weight < 6 && age < 4){
				this.foodQuantity += 1;
				
			}else{
				this.foodQuantity -=1;
		}
	}

	@Override
	public void takeOff() {
			if (getWeight() > 6 && getWingPower() > 10){
				this.setFlightSpeed(getFlightSpeed() + 1);
			}else{ 
			this.setFlightSpeed(getFlightSpeed() - 1);
			}	
	}
	
		

	////// Getters and Setters ////
	
	public int getFlightSpeed() {
		return flightSpeed;
	}



	public void setFlightSpeed(int flightSpeed) {
		this.flightSpeed = flightSpeed;
	}
	
	
	public int getLandingSpeed() {
		return landingSpeed;
	}



	public void setLandingSpeed(int landingSpeed) {
		this.landingSpeed = landingSpeed;
	}
	
	public int getWingPower() {
		return wingPower;
	}



	public void setWingPower(int wingPower) {
		this.wingPower = wingPower;
	}

	
}
