package com.oopsconcepts.programs;


class GrandParent{
	void property(){
		System.out.println("moved to parents");
	}
}

class Parent extends GrandParent{
	void property2(){
		System.out.println("moved to childrens");
	}
}

class Child extends Parent{
	void property3(){
	System.out.println("keep it safe");
	}
}

public class MultiLevelInheritence {
public static void main(String args[]){
	Child c1 = new Child();
	c1.property();
	c1.property2();
	c1.property3();
}
}
