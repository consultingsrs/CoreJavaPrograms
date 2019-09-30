package com.patterns.programs;

public class PatternsPrograms {
	
public static void main(String args[])
{
	
	int space=4;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=space;j++)
			System.out.print(" ");
		
		for(int j=1;j<=i;j++)
			System.out.print("*");
		
		System.out.println();
		space--;
			}
	pattern1();
	pattern2();
	pattern3();
	pattern4();
}

 private static void pattern1(){
	{
		int space=0;
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=space;j++)
				System.out.print(" ");
			
			for(int j=1;j<=i;j++)
				System.out.print("*");
			
			System.out.println();
			space++;
				}
	}
}
 private static void pattern2(){
		{
			int space=8;
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=i;j++)
					System.out.print("*");
				
				for(int j=1;j<=space;j++)
					System.out.print(" ");
				
				for(int j=1;j<=i;j++)
					System.out.print("*");
				
				System.out.println();
				space=space-2;
					}
		}
	}
 private static void pattern3(){
		{
			int space=0;
			for(int i=5;i>=1;i--)
			{
				for(int j=i;j>=1;j--)
					System.out.print("*");
				
				for(int j=1;j<=space;j++)
					System.out.print(" ");
				
				for(int j=i;j>=1;j--)
					System.out.print("*");
				
				System.out.println();
				space=space+2;
					}
		}
 }
 
 private static void pattern4(){
		{
			int space=0;
			for(int i=5;i>=1;i--)
			{
				for(int j=i;j>=1;j--)
					System.out.print("*");
				
				for(int j=1;j<=space;j++)
					System.out.print(" ");
				
				for(int j=i;j>=1;j--)
					System.out.print("*");
				
				System.out.println();
				space=space+2;
					}
		
		 space = 8;
		 for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=i;j++)
					System.out.print("*");
				
				for(int j=1;j<=space;j++)
					System.out.print(" ");
				
				for(int j=1;j<=i;j++)
					System.out.print("*");
				
				System.out.println();
				space=space-2;
					}
		}
 }
 }





