package com.danu.example1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	
	private static void iteratorDemo(List<Integer> list1){
		
		Iterator<Integer> iterator = list1.iterator();
		while (iterator.hasNext()) {
			int element = iterator.next();
			System.out.println("element: " + element);
			
			if(element==9){
				iterator.remove();
			}
		}
		
		System.out.println(list1);
	}
	
	private static List<Integer> arrayListDemo(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(9);
		list.add(8);
		
		System.out.println(list);
		return list;
	}
	
	public static void main(String[] args) {
		
		List<Integer> list1 = arrayListDemo();
		iteratorDemo(list1);
		
		
	}

}
