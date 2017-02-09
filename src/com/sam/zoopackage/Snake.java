package com.sam.zoopackage;

public class Snake extends Reptile{
	
	//Variables//
	
	private boolean venomous;
	private boolean endangered;
	private boolean nocturnal;
	private boolean dangerous;
	
	
	
	
//Constructor//
	
//Builder Pattern would be used here.
	public Snake(int age, String name, String species, String gender, String size, int weight, int height, int wastePerDay, int breathsPerMin, EnclosureType enclosure, int foodQuantity, int populationNumber, boolean venomous, boolean endangered, boolean dangerous, boolean nocturnal) {
		
		super(age, name, species, gender, size, weight, height, wastePerDay, breathsPerMin, enclosure, foodQuantity, populationNumber);

		
		this.venomous = venomous;
		this.endangered = endangered;
		this.nocturnal = nocturnal;
		this.dangerous = dangerous;
	}
	

	//Methods//
	
	public boolean isVenomous() {
		return venomous;
	}


	public void setVenomous(boolean venomous) {
		this.venomous = venomous;
	}


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


	public boolean isDangerous() {
		return dangerous;
	}


	public void setDangerous(boolean dangerous) {
		this.dangerous = dangerous;
	}

		public void nutrition() {
			
			if (weight < 30 && age < 2){
				this.foodQuantity += 10;
				
			}else{
				this.foodQuantity -= 2;
		}
			
		
	}
}
