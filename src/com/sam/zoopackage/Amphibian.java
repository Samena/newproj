package com.sam.zoopackage;

public class Amphibian extends Animal implements Swim {

	private int swimSpeed;
	private boolean hasGills;

	public Amphibian(int age, String name, String species, String gender, int weight, int height, int wastePerDay,
			int breathsPerMin, int foodQuantity, int populationNumber, int averageLifeSpan, int swimSpeed,
			boolean hasGills) {

		super(age, name, species, gender, weight, height, wastePerDay, breathsPerMin, foodQuantity, populationNumber,
				averageLifeSpan);

	}

	public int getSwimSpeed() {
		return swimSpeed;
	}

	public void setSwimSpeed(int swimSpeed) {
		this.swimSpeed = swimSpeed;
	}

	@Override
	public boolean canSwim() {
		if (this.getSpecies() == "Amphibian" && this.hasGills == true) {
			System.out.println("Can swim");
		}
		return hasGills;

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
