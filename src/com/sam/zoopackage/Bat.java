package com.sam.zoopackage;

public class Bat extends Mammal implements Flying{
	
	//Variables//
	
	private boolean endangered;
	private boolean nocturnal;
	private int flightSpeed;
	private int power;
	
//Constructor//
	
//using 9 parameters may be too much. Would like to use builder pattern later on to condense it down later on. Don't know how to use this.
	
	public Bat(int age, String name, String species, String gender, String size, int weight, int height, double waste, int breathsPerMin, EnclosureType enclosure, 
	boolean endangered, boolean nocturnal, int flightSpeed, int power){
		super(age, name, species, gender, size, weight, height, waste, breathsPerMin, enclosure);
		
	
		this.endangered = endangered;
		this.nocturnal = nocturnal;	
		this.flightSpeed = flightSpeed;
		this.power = power;
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

	public int getFlightSpeed() {
		return flightSpeed;
	}

	public void setFlightSpeed(int flightSpeed) {
		this.flightSpeed = flightSpeed;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public void land() {
		
		if (flightSpeed <= 20) {
			System.out.println("Bat will land gracefully");	
		}else{ 
			System.out.println ("Going too fast, will not land gracefully");
		}
		
	}

	@Override
	public void takeOff() {
		
		if (power <= 10){
			System.out.println("bat will take two goes to take off");
		}else{
			System.out.println("bat will take off in one go");
		}
		
		

		
	}
	@Override
	public void flying() {
		
		
		
	}
	@Override
	public void nutrition(){
		if (weight >= 30){
			System.out.println(name + "this bat is healthy weight, feed twice daily");
		}else{ 
			if (weight <=40){
				System.out.println(name + "this bat is overweight, feed once daily");
			}

		}
	}

	
	public void sensitivity(){
			if (this.isNocturnal() == true) {
				System.out.print("bat is sensitive to daylight");
		
	}
	}
	
	public void grow(){
		
	if (size == "small" && age <3){
		this.height = height + 1;
		this.weight = weight + 1;
		System.out.println("bat is growing");
		
	}else{ 
		if(size == "small" && age >3){
			System.out.println("bat is not growing");
		}
	}
	}
	}
