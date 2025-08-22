package com.a167;

import java.net.MulticastSocket;
import java.util.Scanner;

public class Student1 
{
	int id;
	String name,email;
	
	
public static void main(String[] args) 
{

	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter ID");
	int i1 = sc.nextInt();
	
	System.out.println("Enter Name");
	String n1 = sc.next();
	
    System.out.println("Enter Email");
	String e1 = sc.next();
	
	
	
	Student1 s1 = new Student1 ();
	s1.id = i1;
	s1.name = n1;
	s1.email = e1;
	
	Student1 s2 = new Student1 ();
	s2.id = 102;
	s2.name = "Manthan";
	s2.email = "m@gmail.com";
	
	
	System.out.println(s1.id+" "+s1.name+" "+s1.email);
	System.out.println(s2.id+" "+s2.name+" "+s2.email);
	
}
}
