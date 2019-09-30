package com.oopsconcepts.programs;


class A{
	void msg()
	{
		System.out.println("multiple inheritence not supported by java");
	}
}
class B{
	void msg()
	{
		System.out.println("beacause of ambiguity,so y interface was introduced.");
	}
}
//public class MultipleInheritence extends A,B,it throws CTE.
public class MultipleInheritence extends A
{
public static void main(String args[])
{
	MultipleInheritence b1 = new MultipleInheritence();
	b1.msg();
}
}
