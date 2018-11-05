package com.danu.pattern.strategy;

public class Vehicle {

	Break break1;
	public Vehicle(Break break1)
	{
		this.break1= break1;
	}	
	void applyBreak(int distance)
	{
		break1.applyBreak(distance);
	}
}
