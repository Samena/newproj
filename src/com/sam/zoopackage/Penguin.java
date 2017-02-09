package com.sam.zoopackage;

public class Penguin extends Bird implements Swim {
	
   //Attributes//
	private boolean endangered;
	
   //Constructor//
	
	public Penguin(int age, String name, String species, String gender, String size, int weight, int height, int wastePerDay, int breathsPerMin, EnclosureType enclosure, int foodQuantity, int populationNumber) {
		
		super(age, name, species, gender, size, weight, height, wastePerDay, breathsPerMin, enclosure, foodQuantity, populationNumber);}
	
	//Methods//

	
	public boolean isEndangered() {
		return endangered;
	}

	public void setEndangered(boolean endangered) {
		this.endangered = endangered;
	}

public void nutrition(){
		
	}

@Override
public void canSwim() {
	// TODO Auto-generated method stub
	
}

@Override
public void breatheUnderwater() {
	// TODO Auto-generated method stub
	
}
	
}
