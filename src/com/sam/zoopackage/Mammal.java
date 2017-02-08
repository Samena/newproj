package com.sam.zoopackage;

public abstract class Mammal extends Animal implements Run{

	public Mammal(int age, String name, String species, String gender, String size, int weight, int height, double waste, int breathsPerMin, EnclosureType enclosure){
		super(age, name, species, gender, size, weight, height, waste, breathsPerMin, enclosure);
	}

	@Override
	public void sprint() {	
	}
	
	@Override
	public void excrete() {
	
	}

	@Override
	public void grow() {

	}

	@Override
	public void move() {	
	}

	@Override
	public void nutrition(){
		
	}

	@Override
	public void reproduce() {
		
	}

	@Override
	public void respire() {
		
	}

	@Override
	public void sensitivity() {
		
	}

}


