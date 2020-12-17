package com.pooja1;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle
{
	
	public void drive()
	{
		System.out.println("Bike is working fine....");
	}

}
