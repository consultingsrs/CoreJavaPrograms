package com.oopsconcepts.programs;

class Example{
	static int add(int a, int b){return a+b;}  
	static double add(double a, double b){return a+b;}  
	} 


public class MethodOverloadingDemo {
		public static void main(String[] args){  
		System.out.println(Example.add(11,11));  
		System.out.println(Example.add(12.3,12.6));  
		}
}
		

