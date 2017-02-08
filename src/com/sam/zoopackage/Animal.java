package com.sam.zoopackage;

public class Animal {
	
	//Attributes//
	
	private int age;
	private String name;
	private String species;
	private String breed;
	private String size;
	private int weight;
	private int height;
	
	
	//Constructor//
	
	public Animal(int age, String name, String species, String breed, String size, int weight, int height){
		
		this.age = age;
		this.name = name;
		this.species = species;
		this.breed = breed;
		this.size = size;
		this.weight = weight;
		this.height = height;
		
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

}
