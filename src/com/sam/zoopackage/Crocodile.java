package com.sam.zoopackage;

public class Crocodile extends Reptile implements Swim {

	
	//Variables//
	private boolean endangered;
	private boolean dangerous;
	
	//Constructor//
	
	//Would use a builder pattern here to make more accurate but do not know how at the moment.
	
	public Crocodile(int age, String name, String species, String breed, String size, int weight, int height,boolean endangered, boolean dangerous) {
		super(age, name, species, breed, size, weight, height);
	}

	public boolean isEndangered() {
		return endangered;
	}

	public void setEndangered(boolean endangered) {
		this.endangered = endangered;
	}

	public boolean isDangerous() {
		return dangerous;
	}

	public void setDangerous(boolean dangerous) {
		this.dangerous = dangerous;
	}

	@Override
	public void submerge() {
	}

	@Override
	public void canFloat() {
	}

	@Override
	public void emerge() {
	}
	
public void nutrition(){
	}
	

}
