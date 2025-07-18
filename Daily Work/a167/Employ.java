package com.a167;

import java.util.Scanner;

public class Employ 
{
	
	int id,salary;
	String name,surname,email;
	
	void display()
	{
		System.out.println(id+" "+name+" "+surname+" "+email+" "+salary);
	}
	
	
public static void main(String[] args) 
{
    Scanner sc = new Scanner (System.in); 
	
    System.out.println("Enter ID");
	int i1 = sc.nextInt();
	
	System.out.println("Enter Name");
	String n1 = sc.next();
	
	System.out.println("Enter Surname");
	String s1 = sc.next();
	
	System.out.println("Enter Email");
	String e1 = sc.next();
	
	System.out.println("Enter Salary");
	int sal1 = sc.nextInt();
	
	
	
	System.out.println("Enter ID");
	int i2 = sc.nextInt();
	
	System.out.println("Enter Name");
	String n2 = sc.next();
	
	System.out.println("Enter Surname");
	String s2 = sc.next();
	
	System.out.println("Enter Email");
	 String e2 = sc.next();
	
	System.out.println("Enter Salary");
	int sal2 = sc.nextInt();
	
	
	Employ E1 = new Employ();
	E1.id = i1;
	E1.name = n1;
	E1.surname = s1;
	E1.email = e1;
	E1.salary = sal1;
	
	Employ E2 = new Employ();
	E2.id = i2;
	E2.name = n2;
	E2.surname = s2;
	E2.email = e2;
	E2.salary = sal2;
	
	E1.display();
	E2.display();
	
}
}
