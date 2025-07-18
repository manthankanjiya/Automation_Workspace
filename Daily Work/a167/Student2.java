package com.a167;

import java.util.Scanner;

public class Student2 
{
	int id;
	String name,email;
	
	void display()
	{
		System.out.println(id+" "+name+" "+email);
	}
	
public static void main(String[] args) 
{

    Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter ID");
	int i1 = sc.nextInt();
	
	System.out.println("Enter Name");
	String n1 = sc.next();
	
    System.out.println("Enter Email");
	String e1 = sc.next();
	
	
	
	Student2 s1 = new Student2 ();
	s1.id = i1;
	s1.name = n1;
	s1.email = e1;
	
	Student2 s2 = new Student2 ();
	s2.id = 102;
	s2.name = "Manthan";
	s2.email = "m@gmail.com";
	
	
	s1.display();
	s2.display();
}
}
