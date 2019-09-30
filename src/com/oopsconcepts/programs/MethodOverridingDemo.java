package com.oopsconcepts.programs;

class Vehicle{  
	  void run()
	  {
		  System.out.println("Vehicle is running");
		  }  
	}  
public class MethodOverridingDemo extends Vehicle{
		  public static void main(String args[]){  
		  //creating an instance of child class  
			  MethodOverridingDemo obj = new MethodOverridingDemo();  
		  //calling the method with child class instance  
		  obj.run();  
		  }  
		}  

//subclass method name must be same as parent class name,arguments same and there should be an inheritence.