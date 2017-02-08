package com.sam.zoopackage;



public class Penguin extends Bird implements Swim {
	
   //Attributes//
	private boolean endangered;
	
   //Constructor//
	
	public Penguin(int age, String name, String species, String breed, String size, int weight, int height,EnclosureType enclosure) {
		super(age, name, species, breed, size, weight, height, enclosure);
		
	}
	
	//Methods//

	@Override
	public void submerge() {	
	}

	@Override
	public void canFloat() {	
	}

	@Override
	public void emerge() {	
	}
	
	public boolean isEndangered() {
		return endangered;
	}

	public void setEndangered(boolean endangered) {
		this.endangered = endangered;
	}

public void nutrition(){
		
	}
	
}
