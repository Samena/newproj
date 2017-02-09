package com.sam.zoopackage;

public abstract class Animal extends Enclosure implements LivingThing{
	
	int age;
	String name;
    String species;
	String gender;
	String size;
	int weight;
	int height;
	int wastePerDay;
	int breathsPerMin;
	int foodQuantity;
	int populationNumber;

	//Constructor//
	
	public Animal(int age, String name, String species, String gender, String size, int weight, int height, int wastePerDay, int breathsPerMin, EnclosureType enclosure, int foodQuantity, int populationNumber){
		super(enclosure);
		
		this.age = age;
		this.name = name;
		this.species = species;
		this.size = size;
		this.gender = gender;
		this.weight = weight;
		this.height = height; 
		this.enclosure = enclosure;
		this.wastePerDay = wastePerDay;
		this.breathsPerMin = breathsPerMin;
		this.foodQuantity = foodQuantity;
        this.populationNumber = populationNumber;
	}

	
	//Methods//


public void grow(){
	if(age <= 3){
		this.height += height + 1;
		this.weight += weight + 1;
	}
}

	@Override
	public void nutrition(){
		if (weight < 10 && age > 2){
			this.foodQuantity += 2;
			
		}else{
			this.foodQuantity -=2;
	}
	}

	@Override
	public void excrete() {
		
	if (wastePerDay >= ((weight/100))*10){
		this.foodQuantity -= 2;
	}else{ 
		this.foodQuantity +=1;
	}	
	}

	@Override
	public void move() {	
		
		if(this.enclosure == EnclosureType.AMPHIBIANMUSEUM){
			
			this.enclosure = EnclosureType.AMPHIBIANMUSEUM;
			
		}
	}
	
	@Override
	public void respire(){
		
		if(this.species == "Fish" && this.breathsPerMin >= 18){
			this.breathsPerMin += 1;
		}else{
			this.breathsPerMin +=2;
		}
        }
	
	@Override 
	public void reproduce(){
		if (this.gender == "Female" && this.age > 2){
			this.populationNumber += 1;
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

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getAge() {
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

	}



