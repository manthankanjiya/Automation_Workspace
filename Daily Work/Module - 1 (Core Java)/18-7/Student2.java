package com.a187;

import java.util.Scanner;

public class Student2 
{
	
	int i;
	String n;
	
	Student2(int id, String name)
	{
		i = id;
		n = name;
	}
	
	void display()
	{
		System.out.println("Your ID is "+i+" Your name is "+n);
	}
	
	
public static void main(String[] args) 
{

	Scanner sc = new Scanner (System.in);
	
    System.out.println("Enter your ID"); 
	int i1 = sc.nextInt();
	
	System.out.println("Enter your name");
	String n1 = sc.next();
	
	
	 System.out.println("Enter your ID"); 
		int i2 = sc.nextInt();
		
		System.out.println("Enter your name");
		String n2 = sc.next();
	
	
		Student2 S1 = new Student2(i1,n1);
		
		
		Student2 S2 = new Student2(i2,n2);
		
		S1.display();
		S2.display();
		
}
}
