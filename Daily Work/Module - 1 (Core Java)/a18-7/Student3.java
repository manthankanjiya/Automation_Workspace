package com.a187;

public class Student3 
{
	
	int i;
	String n;
	
	public Student3(int id, String name)
	{
		i = id;
		n = name;
	}
	
	void display ()
	{
		System.out.println("Your ID is "+i+" Your Name is "+n);
	}
	
public static void main(String[] args) 
{

Student3 s1 = new Student3 (101,"qwer");
Student3 s2 = new Student3 (102,"asdf");
	
	s1.display();
	s2.display();
	
}
}
