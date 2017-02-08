package com.sam.zoopackage;

public abstract class Animal {
	
	//Attributes//
	
	private int age;
	private String name;
	private String breed;
	private int size;
	private int weight;
	private int height;
	
	
	//Constructor//
	
	public Animal(int age, String name, String breed, int size, int weight, int height){
		
		this.age = age;
		this.name = name;
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
	
	public String getBreed(String breed){
		return breed;
		
	}
	
	public String setBreed(String breed){
		return this.breed = breed;
	}
	
	public int getSize(int size){
		return size;
	}
	
	public int setSize(int size){
		return this.size = size;
	}
	
	public int getWeight(int weight){
		return weight;
	}
	
	public int setWeight(int weight){
		return this.weight = weight;
		
	}
	
	public int getHeight(int height){
		return height;
	}
	
	public int setHeight(int height){
		return this.height = height;
	}

}
