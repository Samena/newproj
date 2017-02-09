package com.sam.zoopackage;


public class Snake extends Reptile{
	
	//Variables//
	
	private boolean venomous;
	private boolean endangered;
	private boolean nocturnal;
	private boolean dangerous;
	
	
	
	
//Constructor//
	
//Builder Pattern would be used here.
	public Snake(int age, String name, String species, String gender, String size, int weight, int height, double waste, int breathsPerMin, EnclosureType enclosure, int lifeExpectancy, int idealWeight){
		super(age, name, species, gender, size, weight, height, waste, breathsPerMin, enclosure, lifeExpectancy, idealWeight);
	}

	
	//Methods//
	
	public boolean isVenomous() {
		return venomous;
	}


	public void setVenomous(boolean venomous) {
		this.venomous = venomous;
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


	public void move() {	
	}
	public void nutrition(){	
	}
}
