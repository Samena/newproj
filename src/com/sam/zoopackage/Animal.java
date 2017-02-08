package com.sam.zoopackage;

public abstract class Animal extends Enclosure implements LivingThing{
	
	//Attributes//
	
	private int age;
	private String name;
	private String species;
	private String breed;
	private String size;
	private int weight;
	private int height;

	
	
	//Constructor/
	

	public Animal(int age, String name, String species, String breed, String size, int weight, int height, EnclosureType enclosure){
		super(enclosure);
		
		this.age = age;
		this.name = name;
		this.species = species;
		this.breed = breed;
		this.size = size;
		this.weight = weight;
		this.height = height;
		this.enclosure = enclosure;
		
	}
	
	//Methods/ Getters and Setters//
	

	public int getAge(){
		return age;
	}
	
	public int setAge(int age){
		return this.age = age;
	}
	
	public String getName(){
		return name;
	}
	
	public String setName(String name){
		return this.name = name;
	}
	
	public String getBreed(){
		return breed;	
	}
	
	public String setBreed(String breed){
		return this.breed = breed;
	}
	
	public String getSpecies(){
		return species;
	}
	
	public String setSpecies(String species){
		return this.species = species;
	}
	
	public String getSize(){
		return size;
	}
	
	public String setSize(String size){
		return this.size = size;
	}
	
	public int getWeight(){
		return weight;
	}
	
	public int setWeight(int weight){
		return this.weight = weight;
		
	}
	
	public int getHeight(){
		return height;
	}
	
	public int setHeight(int height){
		return this.height = height;
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
	public void sprint() {	
	}
	
}
