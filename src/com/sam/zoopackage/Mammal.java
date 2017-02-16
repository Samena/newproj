package com.sam.zoopackage;

public abstract class Mammal extends Animal {

	public Mammal(int age, String name, String species, String gender, int weight, int height, int wastePerDay,
			int breathsPerMin, int foodQuantity, int populationNumber, int averageLifeSpan) {

		super(age, name, species, gender, weight, height, wastePerDay, breathsPerMin, foodQuantity, populationNumber,
				averageLifeSpan);
	}
	
	public Mammal(int height, int populationNumber, int averageLifeSpan, boolean nocturnal) {
		super(height, populationNumber, averageLifeSpan, nocturnal);
	
}
}