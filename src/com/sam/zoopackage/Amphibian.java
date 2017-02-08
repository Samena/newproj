package com.sam.zoopackage;

public class Amphibian extends Animal implements Swim{
	
	public Amphibian(int age, String name, String species, String breed, String size, int weight, int height,EnclosureType enclosure) {
		super(age, name, species, breed, size, weight, height, enclosure);

}

	@Override
	public void submerge() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void canFloat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emerge() {
		// TODO Auto-generated method stub
	}

	@Override
	public void grow() {

	}
	@Override
	public void nutrition(){	
	}

	@Override
	public void reproduce() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sensitivity() {
		// TODO Auto-generated method stub
		
	}	
	
}
