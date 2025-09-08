package com.a287;

//this keyword is used to print variable's value 
	//when it's having a same name

public class ThisEx 
{
 
	String name;
	String surname;
	
	public ThisEx(String name,String surname)
	{
	this.name = name;
	this.surname = surname;
	}	
	
	void display()
	{
		System.out.println(name+" "+surname);
	}

	public static void main(String[] args) 
	{
	
		ThisEx t1 = new ThisEx ("Manthan","Kanjiya");
		
		t1.display();
		
	}
	
	
}

