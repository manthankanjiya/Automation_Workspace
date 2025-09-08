package com.a307;

//Method Overloading:
//When two or more methods having a same name but number of parameters are diffrent.


public class OverloadingEx 
{

	int cal (int a, int b)
	{
		return a+b;
	}
	
	int cal (int a, int b, int c)
	{
		return a*b*c;
	}
	
	public static void main(String[] args) 
	{
	
		OverloadingEx o1 = new OverloadingEx();
		
		System.out.println(o1.cal(5,7));
		System.out.println(o1.cal(3, 4, 5));
		
	}
	
	
	
	
	
}
