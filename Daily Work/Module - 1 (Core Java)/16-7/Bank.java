package com.a167;

import java.util.Scanner;

public class Bank 
{
	String name,location;
	double accnum;
	
	void display()
	{
		System.out.println(name+" "+accnum+" "+location);	}
	
public static void main(String[] args) 
{

	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter Name");
	String n1 = sc.next();
	
	System.out.println("Enter Account number");
	double ac1 = sc.nextInt();
	
	System.out.println("Enter Location");
	String l1 = sc.next();
	
	
	System.out.println("Enter Name");
	String n2 = sc.next();
	
	System.out.println("Enter Account number");
	double ac2 = sc.nextInt();
	
	System.out.println("Enter Location");
	String l2 = sc.next();
	
	
	Bank B1 = new Bank ();
	B1.name = n1;
	B1.accnum = ac1;
	B1.location = l1;
	
	Bank B2 = new Bank ();
	B2.name = n2;
	B2.accnum = ac2;
	B2.location = l2;
	
	B1.display();
	B2.display();
}
}
