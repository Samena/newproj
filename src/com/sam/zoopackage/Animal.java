package com.sam.zoopackage;

public abstract class Animal extends Enclosure implements LivingThing{

	//Constructor//
	
	public Animal(int age, String name, String species, String breed, String size, int weight, int height, EnclosureType enclosure){
		super(enclosure);
		
		this.enclosure = enclosure;
	}
	
	//Methods//
	
	@Override
	public void excrete() {
	}

	@Override
	public void move() {	
	}
	
	@Override
	public void respire(){
	}
	
	}



