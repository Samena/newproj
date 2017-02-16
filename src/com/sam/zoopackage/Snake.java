package com.sam.zoopackage;

public class Snake extends Reptile {

	// Variables//

	private boolean venomous;
	private boolean endangered;
	private boolean nocturnal;

	// Constructor//

	// Builder Pattern would be used here.
	public Snake(int age, String name, String species, String gender, String size, int weight, int height,
			int wastePerDay, int breathsPerMin, int foodQuantity, int populationNumber, boolean venomous,
			boolean endangered, boolean nocturnal) {
		super();

		this.venomous = venomous;
		this.endangered = endangered;
		this.nocturnal = nocturnal;
	}

	public Snake() {

		this.gender = "male";
		this.nocturnal = true;
		this.endangered = true;

	}

	// Methods//

	/**
	 * 
	 * Snake may be able to reproduce with itself put it as override method
	 */

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

	public void nutrition() {

		if (weight < 30 && getAge() < 2) {
			this.foodQuantity += 10;

		} else {
			this.foodQuantity -= 2;
		}

	}
}
