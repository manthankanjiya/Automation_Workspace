package com.a287;

class T1
{
	String colour = "Black";
}
class T2 extends T1
{
	String colour = "White";
	
	void display()
	{
		System.out.println(colour);
		System.out.println(super.colour);
	}
}



public class SuperEx 
{

	
	public static void main(String[] args) 
	{
	
		T2 t2 = new T2();
		
		t2.display();
		
	}
	
}
