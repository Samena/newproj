package com.sam.zoopackage;

public abstract class Animal extends Enclosure implements LivingThing{
	
	int age;
	String name;
    String species;
	String gender;
	String size;
	int weight;
	int height;
	double waste;
	int breathsPerMin;
	int lifeExpectancy;
	int idealWeight;


	//Constructor//
	
	public Animal(int age, String name, String species, String gender, String size, int weight, int height, double waste, int breathsPerMin, EnclosureType enclosure, int lifeExpectancy, int idealWeight){
		super(enclosure);
		
		this.age = age;
		this.name = name;
		this.species = species;
		this.size = size;
		this.gender = gender;
		this.weight = weight;
		this.height = height; 
		this.enclosure = enclosure;
		this.waste = waste;
		this.breathsPerMin = breathsPerMin;
		this.lifeExpectancy = lifeExpectancy;
		this.idealWeight = idealWeight;
	}
	

	//Methods//

@Override 
public void grow(){
	if(age >= 0 && ((lifeExpectancy/100))*10 >= age){
		System.out.print("Animal is young and growing");
		
	}else if(((lifeExpectancy/100))*40 >= age && ((lifeExpectancy/100))*10 <= age ){
		System.out.println("Animal is starting off slowly growing");
			
	}else{
		System.out.println("Animal is older and is no longer growing");
	
	}
	}
	
	
	@Override
	public void nutrition(){
		
		if(weight > idealWeight){
			System.out.println("This animal is overweight");
		}else if(weight <idealWeight){
			System.out.println("This animal is underweight");
		}else{ System.out.println("This animal is a healthy weight");
		}
		
		
	}

	@Override
	public void excrete() {
		
		if(waste < 3.5){
			System.out.println("Normal amount of excretion");
		}else{ System.out.println("Too much excretion, check for sickness");
		}
	}

	@Override
	public void move() {	
		
		if (size == "large"){
			System.out.println("Needs a large enclosure");
			
		}else{ System.out.println("Needs a small enclosure");
		}
	}
	
	@Override
	public void respire(){
		
        switch (breathsPerMin) {
            case 1:  breathsPerMin = 10;
                     break;
            case 2:  breathsPerMin = 12;
                     break;
            case 3:  breathsPerMin = 15;
                     break;
            case 4:  breathsPerMin = 20;
                     break;
            case 5:  breathsPerMin = 50;
                     break;
            default: breathsPerMin = 0;
                     break;
        }
System.out.println(breathsPerMin);

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
	public double getWaste() {
		return waste;
	}

	public void setWaste(double waste) {
		this.waste = waste;
	}

	public int getBreathsPerMin() {
		return breathsPerMin;
	}

	public void setBreathsPerMin(int breathsPerMin) {
		this.breathsPerMin = breathsPerMin;
	}

	public int getLifeExpectancy() {
		return lifeExpectancy;
	}

	public void setLifeExpectancy(int lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}
}



