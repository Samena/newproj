package com.sam.zoopackage;

import com.sam.zoopackage.Enclosure.EnclosureType;

public class Bat extends Mammal implements Flying{
	
	//Variables//
	
	private boolean endangered;
	private boolean nocturnal;
	
//Constructor//
	
//using 9 parameters may be too much. Would like to use builder pattern later on to condense it down later on. Don't know how to use this.
	
	public Bat(int age, String name, String species, String gender, String size, int weight, int height, double waste, int breathsPerMin, EnclosureType enclosure, 
	boolean endangered, boolean nocturnal){
		super(age, name, species, gender, size, weight, height, waste, breathsPerMin, enclosure);
		
	
		this.endangered = endangered;
		this.nocturnal = nocturnal;	
}
	
	//Methods//
	
	public boolean isEndangered() {
		return endangered;
	}

	public void setEndangered(boolean endangered) {
		this.endangered = endangered;
	}

	public boolean isNocturnal() {
		return nocturnal;
	}

	public void setNocturnal(boolean nocturnal) {
		this.nocturnal = nocturnal;
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void flying() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void nutrition(){
		if (this.weight >= 30){
			System.out.println(name + "this bat is healthy weight, feed twice daily");
		}else{ 
			if (this.weight <=40){
				System.out.println(name + "this bat is overweight, feed once daily");
			}

		}
	}

	
	public void sensitivity(){
			if (this.isNocturnal() == true) {
				System.out.print("bat is sensitive to daylight");
		
	}
	}
	}
