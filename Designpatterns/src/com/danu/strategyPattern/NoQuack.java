package com.danu.strategyPattern;

public class NoQuack implements IQuackBehavior {

	public void quack(String sound) {
		// TODO Auto-generated method stub
		System.out.println("No quack " + sound);
	}
	
	/* public String quack(){
		return "No quack";
	}
*/
	
	
}
