package com.sam.zoopackage;

public class Cat extends Mammal implements Run {
	
	//Variables//
	private boolean endangered;
	private boolean nocturnal;
	private boolean dangerous;
	private int startSpeed; 
	private int topSpeed;
	private int avgSpeed;

	public Cat(int age, String name, String species, String gender, String size, int weight, int height, int wastePerDay, int breathsPerMin, EnclosureType enclosure, int foodQuantity, int populationNumber, boolean endangered, boolean nocturnal, boolean dangerous, int startSpeed, int topSpeed, int avgSpeed) {
		
		super(age, name, species, gender, size, weight, height, wastePerDay, breathsPerMin, enclosure, foodQuantity, populationNumber);

	this.endangered = endangered;
	this.nocturnal = nocturnal;
	this.dangerous = dangerous;
	this.startSpeed = startSpeed;
	this.topSpeed = topSpeed;
	this.avgSpeed = avgSpeed;
	
	}
	
	
	////// Methods /////
	
	public void nutrition() {
		
		if (weight < 10 && age < 6){
			this.foodQuantity -= 3;
			
		}else{
			this.foodQuantity += 2;
	}
		
	}
	
	public void sprint() {
		if (getTopSpeed() - getStartSpeed() == 10){
			this.setAvgSpeed(getAvgSpeed() + 3);
		}else{
			this.setAvgSpeed(getAvgSpeed() - 3);
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

	public boolean isDangerous() {
		return dangerous;
	}

	public void setDangerous(boolean dangerous) {
		this.dangerous = dangerous;
	}

	public int getAvgSpeed() {
		return avgSpeed;
	}

	public void setAvgSpeed(int avgSpeed) {
		this.avgSpeed = avgSpeed;
	}

	public int getStartSpeed() {
		return startSpeed;
	}

	public void setStartSpeed(int startSpeed) {
		this.startSpeed = startSpeed;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	

}
