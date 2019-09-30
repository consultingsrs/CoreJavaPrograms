package com.oopsconcepts.programs;

class ParentClass{
	void session()
	{
		System.out.println("an example for inheritence");
	}
}

class ChildClass extends ParentClass{
	void display1()
	{
		System.out.println("an example for inheritence");
	}
}

public class InheritenceDemo {
public static void main(String args[]){
	ChildClass d1 = new  ChildClass();
	d1.session();
	d1.display1();
}
}



