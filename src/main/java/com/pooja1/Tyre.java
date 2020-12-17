package com.pooja1;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
	
	private String brand;
	
	//getter and setter of brand 
	public String getBrand() {
		return brand;
	}

	/*assign value to brand using constructor
	public Tyre(String brand) {
		super();
		this.brand = brand;
	}*/

	public void setBrand(String brand) {//setter is used to set value to brand object 
		this.brand = brand;
	}

	//used to print brand 
	@Override
	public String toString() {
		//return "Tyre [brand=" +brand + "]";
		return "---its okay";
	}
	
	
}
