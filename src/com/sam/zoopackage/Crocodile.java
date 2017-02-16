package com.sam.zoopackage;

public class Crocodile extends Reptile implements Swim {

	// Variables//
	private boolean endangered;
	private int swimSpeed;

	// Constructor//

	// Would use a builder pattern here to make more accurate but do not know
	// how at the moment.

	public Crocodile(int age, String name, String species, String gender, int weight, int height,
			int wastePerDay, int breathsPerMin, int foodQuantity, int populationNumber, int averageLifeSpan,
			boolean endangered, boolean dangerous, int swimSpeed) {

		super(age, name, species, gender, weight, height, wastePerDay, breathsPerMin, foodQuantity,
				populationNumber, averageLifeSpan);

		this.endangered = endangered;
		this.swimSpeed = swimSpeed;

	}

	@Override
	public void nutrition() {
		if (weight < 20 && age < 22) {
			this.foodQuantity += 5;

		} else {
			this.foodQuantity -= 2;
		}
	}

	@Override
	public boolean canSwim() {
		if (getWeight() > 30 && getBreathsPerMin() >= 20) {
			this.setSwimSpeed(getSwimSpeed() + 5);
		} else {
			this.setSwimSpeed(getSwimSpeed() - 3);
		}
		return false;

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


}
