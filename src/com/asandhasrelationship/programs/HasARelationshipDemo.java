package com.asandhasrelationship.programs;
//if a class have an entity reference  called as aggregation.
//Inheritance: Is-A Relation
//Composition :Has-A Relation

class Operation{
	int square(int n){
		return n*n;
	}
}
public class HasARelationshipDemo {
Operation op;//aggregation,which contains its own info.
double pi=3.14;

double area (int radius){
	op=new Operation();
	int rsquare = op.square(radius);
	return pi*rsquare;
}
public static void mian(String args[]){
	HasARelationshipDemo h1 = new HasARelationshipDemo();
	double result = h1.area(5);
	System.out.println(result);
}
}
