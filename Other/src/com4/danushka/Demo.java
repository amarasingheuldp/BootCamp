package com4.danushka;

import java.util.List;
import java.util.ArrayList;

public class Demo {
	
	public static void print(){
		
		List<Integer> a = new ArrayList<>();
		//ArrayList<Integer> a = new ArrayList<>();
		for (int i = 1; i < 50; i += 2)
		    a.add(i);
		for (int i:a){
			
			if(a.get(i)%2==0){
			System.out.println(i);
			}
		}
	}
	
	public static void main(String args[]){
		
		//Demo d = new Demo();
		Demo.print();
	}

}
