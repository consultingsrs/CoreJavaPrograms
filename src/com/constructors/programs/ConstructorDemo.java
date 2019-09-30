package com.constructors.programs;

public class ConstructorDemo {
//Default Constructor
	
	int id;
	String name;
	
//method to display the id an name
	
	void display(){
		System.out.println(id+" "+name);
	}
		ConstructorDemo(){
			System.out.println("Program is created");
		}
		public static void main(String args[])
		{
			ConstructorDemo c1 = new ConstructorDemo();
			c1.display();
		}
}
		

