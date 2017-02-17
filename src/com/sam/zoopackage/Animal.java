package com.sam.zoopackage;

/**
 * 
 * go through and add enclosures go through and make sure methods make sense
 * remove size and just have weight and height sort out enclosure class
 *
 */
public abstract class Animal implements LivingThing {

	protected int age;
	protected String name;
	protected String species;
	protected String gender;
	protected int weight;
	protected int height;
	protected int wastePerDay;
	protected int breathsPerMin;
	protected int foodQuantity;
	protected int populationNumber;
	protected int averageLifeSpan;

	// Constructor//

	public Animal(int height, int populationNumber, int averageLifeSpan, boolean nocturnal) {

	}

	public Animal(int age, String name, String species) { // Put in default
															// values for name
															// and species to
															// condense the
															// constructers
		this.age = age;
		this.name = name;
		this.species = species;
		this.gender = "No Gender";
		this.weight = 0;
		this.height = 0;
		this.wastePerDay = 1;
		this.breathsPerMin = 4;
		this.foodQuantity = 1;
		this.populationNumber = 1; // Thinking about maybe putting in own class
									// of pack/herd/animal group to increase pop
									// no.
		this.averageLifeSpan = 5;

	}

	public Animal(int age, String name, String species, String gender, int weight, int height, int wastePerDay,
			int breathsPerMin, int foodQuantity, int populationNumber, int averageLifeSpan) {

		this.age = age;
		this.name = name;
		this.species = species;
		this.gender = gender;
		this.weight = weight;
		this.height = height;
		this.wastePerDay = wastePerDay;
		this.breathsPerMin = breathsPerMin;
		this.foodQuantity = foodQuantity;
		this.populationNumber = populationNumber;
		this.averageLifeSpan = averageLifeSpan;
	}

	// Methods//

	public void grow() {
		if (age <= 3) {
			this.height = height + 1;
			this.weight = weight + 1;
		}
	}

	/**
	 * Would make more sense to have a manager that takes in an Animal and then
	 * returns information about the diet Would be better to return a String
	 * here of diet If eaten too much would maybe excrete
	 */
	@Override
	public void nutrition() {
		if (weight < 10 && age > 2) {
			this.foodQuantity += 2;

		} else {
			this.foodQuantity -= 2;
		}
	}

	@Override
	public void excrete() {
		if (wastePerDay >= ((weight / 100)) * 10) {
			this.foodQuantity -= 2;
		} else {
			this.foodQuantity += 1;
		}
	}

	/*
	 * Make it so that Animals only have offspring when they are 20% of the
	 * average life span.
	 */

	@Override
	public void reproduce() {
		if (this.gender == "Female" && this.age >= ((averageLifeSpan / 100)) * 20) { // 0%
																						// of
																						// average
																						// life
																						// span
			this.populationNumber += 1; // if animal passed is same gender then
										// pop doesn't increase then does
										// increase
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge(){
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getWastePerDay() {
		return wastePerDay;
	}

	public void setWastePerDay(int wastePerDay) {
		this.wastePerDay = wastePerDay;
	}

	public int getFoodQuantity() {
		return foodQuantity;
	}

	public void setFoodQuantity(int foodQuantity) {
		this.foodQuantity = foodQuantity;

	}

	public int getPopulationNumber() {
		return populationNumber;
	}

	public void setPopulationNumber(int populationNumber) {
		this.populationNumber = populationNumber;
	}

	public int getBreathsPerMin() {
		return breathsPerMin;
	}

	public void setBreathsPerMin(int breathsPerMin) {
		this.breathsPerMin = breathsPerMin;
	}

	public int getAverageLifeSpan() {
		return averageLifeSpan;
	}

	public void setAverageLifeSpan(int averageLifeSpan) {

		this.averageLifeSpan = averageLifeSpan;
	}

}
