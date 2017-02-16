package com.sam.zoopackage;

public class Cat extends Mammal implements Run {

	// Variables//
	protected boolean endangered;
	protected boolean nocturnal;
	private int startSpeed;
	private int topSpeed;
	private int avgSpeed;
	protected int populationNumber;
	protected int averageLifeSpan;
	protected int height;

	public Cat(int height, int populationNumber, int averageLifeSpan, boolean nocturnal) {
		super(height, populationNumber, averageLifeSpan, nocturnal);

		this.startSpeed = 0;
		this.topSpeed = 10;
		this.avgSpeed = 5;
		this.endangered = true;
		this.height = 2;
		this.populationNumber = 150;
		this.averageLifeSpan = 15;
		this.nocturnal = true;

	}

	public Cat(int age, String name, String species, String gender, int weight, int height, int wastePerDay,
			int breathsPerMin, int foodQuantity, int populationNumber, int averageLifeSpan, boolean endangered,
			boolean nocturnal, int startSpeed, int topSpeed, int avgSpeed) {

		super(age, name, species, gender, weight, height, wastePerDay, breathsPerMin, foodQuantity, populationNumber,
				averageLifeSpan);

		this.endangered = endangered;
		this.nocturnal = nocturnal;
		this.startSpeed = startSpeed;
		this.topSpeed = topSpeed;
		this.avgSpeed = avgSpeed;

	}

	////// Methods /////

	public void nutrition() {

		if (weight < 10 && age < 6) {
			this.foodQuantity -= 3;

		} else {
			this.foodQuantity += 2;
		}

	}

	public void sprint() {
		if (getTopSpeed() - getStartSpeed() == 10) {
			this.setAvgSpeed(getAvgSpeed() + 3);
		} else {
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

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	@Override
	public void respire() {
		// TODO Auto-generated method stub

	}

}
