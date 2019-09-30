package com.constructors.programs;

public class ConstructorOverloadingDemo {

	int id;
	String name;
	int age;
	
	ConstructorOverloadingDemo(int i,String n){
		id = i;
		name = n;
	}
	ConstructorOverloadingDemo(int i,String n,int a){
		id = i;
		name = n;
		age = a;
	}
	void display(){
		System.out.println(id+" "+name+" "+age);
	}
	
	public static void main(String args[]){
		ConstructorOverloadingDemo c1 = new ConstructorOverloadingDemo(1,"srs");
	    c1.display();
	    ConstructorOverloadingDemo c2 = new ConstructorOverloadingDemo(2,"srs business solutions",20);
	    c2.display();
	}
	

}
