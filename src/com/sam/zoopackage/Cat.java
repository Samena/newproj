package com.sam.zoopackage;

public class Cat extends Mammal {
	
	//Variables//
	private boolean endangered;
	private boolean nocturnal;
	private boolean dangerous;

	public Cat(int age, String name, String species, String gender, String size, int weight, int height, double waste, int breathsPerMin, EnclosureType enclosure, int lifeExpectancy, int idealWeight) {
		super(age, name, species, gender, size, weight, height, waste, height, enclosure, lifeExpectancy, idealWeight);
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
	
	public void nutrition() {
	}
	
	public void sprint() {	
	}
	

}
