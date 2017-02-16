package com.sam.zoopackage;

public class Fish extends Animal implements Swim {
	// Attributes//

	private String colour;
	private int swimSpeed;

	// Constructor//

	public Fish(int age, String name, String species, String gender, int weight, int height, int wastePerDay,
			int breathsPerMin, int foodQuantity, int populationNumber, int averageLifeSpan, String colour,
			int swimSpeed) {

		super(age, name, species, gender, weight, height, wastePerDay, breathsPerMin, foodQuantity, populationNumber,
				averageLifeSpan);

		this.colour = colour;
		this.swimSpeed = swimSpeed;

	}

	// Methods//
	@Override
	public void nutrition() {
		if (weight > 3 && age > 2) {
			this.foodQuantity += 1;

		} else {
			this.foodQuantity -= 1;
		}
	}

	@Override
	public boolean canSwim() {
		if (getWeight() > 5 && getBreathsPerMin() <= 10) {
			this.setSwimSpeed(getSwimSpeed() + 1);
		} else {
			this.setSwimSpeed(getSwimSpeed() - 1);
		}
		return false;
	}

	public int getSwimSpeed() {
		return swimSpeed;
	}

	public void setSwimSpeed(int swimSpeed) {
		this.swimSpeed = swimSpeed;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void respire() {
		// TODO Auto-generated method stub
		
	}

}
