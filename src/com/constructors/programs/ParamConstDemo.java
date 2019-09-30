package com.constructors.programs;

public class ParamConstDemo {

	int id;
	String name;
	
	ParamConstDemo(int i,String n){
		id = i;
		name = n;
	}
	
	void display(){
		System.out.println(id+" "+name);
	}
	public static void main(String args[])
	{
		ParamConstDemo p1 = new ParamConstDemo(1,"srs");
		p1.display();
		ParamConstDemo p2 = new ParamConstDemo(2,"srs business solutions");
		p2.display();
		
	}
}
