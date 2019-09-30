package com.oopsconcepts.programs;


interface Drawable{  
	void draw();  
}

class Rectangles implements Drawable{  
	public void draw(){System.out.println("drawing rectangle");}  
}  

class Circle implements Drawable{  
	public void draw(){System.out.println("drawing circle");}  
}  

  
public class InterfaceDemo {
	public static void main(String args[]){  
		Drawable d=new Circle();  
		d.draw();  
	}}  

//it is used to achieve abstraction,multiple inheritence and loose coupling.