package com.oopsconcepts.programs;

abstract class Shape{  
	abstract void draw();  
} 

class Rectangle extends Shape{  
	void draw(){System.out.println("drawing rectangle");}  
}  
class Circle1 extends Shape{  
	void draw(){System.out.println("drawing circle");}  
}  

public class AbstractionDemo {  
	public static void main(String args[]){  
		Shape s=new Circle1(); 
		s.draw();  
	}  
}  

//abstract class:it must be declared with keyword abstract and cannot be instantiated.
//abstract method:it must be declared with keyword abstract and there is no implementation provided.
//if v provide method name as abstract we haave to declare class name as abstract too.