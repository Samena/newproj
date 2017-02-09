package com.sam.zoopackage;

public class Bat extends Mammal implements Flying{
	
	//Variables//
	
	private boolean endangered;
	private boolean nocturnal;
	private int flightSpeed;
	private int power;
	private int landingSpeed;
//Constructor//
	
//using 9 parameters may be too much. Would like to use builder pattern later on to condense it down later on. Don't know how to use this.
	
	public Bat(int age, String name, String species, String gender, String size, int weight, int height, int wastePerDay, int breathsPerMin, EnclosureType enclosure, int foodQuantity, int populationNumber,
	boolean endangered, boolean nocturnal, int flightSpeed, int power, int landingSpeed){
		super(age, name, species, gender, size, weight, height, wastePerDay, breathsPerMin, enclosure, foodQuantity, populationNumber);
		
	
		this.endangered = endangered;
		this.nocturnal = nocturnal;	
		this.flightSpeed = flightSpeed;
		this.power = power;
		this.landingSpeed = landingSpeed;
}
	
	//Methods//
	
	@Override
	public void fly() {                                        //lighter the bat can increase its flight speed
		 if (getWeight() < 3){
			 this.setFlightSpeed(getFlightSpeed() + 2);
		 }else{ 
			 this.setFlightSpeed(getFlightSpeed() - 2);    //heavier bat the flight speed goes down
			 
		 }
	
	}
		@Override
		public void nutrition(){
			if (weight < 8 && age > 5){
				this.foodQuantity -= 3;
				
			}else{
				this.foodQuantity +=3;
		}

		}
	
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

	public int getFlightSpeed() {
		return flightSpeed;
	}

	public void setFlightSpeed(int flightSpeed) {
		this.flightSpeed = flightSpeed;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
	

	public int getLandingSpeed() {
		return landingSpeed;
	}

	public void setLandingSpeed(int landingSpeed) {
		this.landingSpeed = landingSpeed;
	}

	@Override
	public void land() {
			
			if (getWeight() > 2 && flightSpeed <= 15){
				this.setLandingSpeed(getLandingSpeed() + 2);
			}else{ 
			this.setLandingSpeed(getLandingSpeed() - 2);
			}
		}
	
	@Override
	public void takeOff() {
			if (getWeight() > 5 && getPower() > 5){
				this.setFlightSpeed(getFlightSpeed() + 1);
			}else{ 
			this.setFlightSpeed(getFlightSpeed() - 1);
			}	
	}
	
	
	}
