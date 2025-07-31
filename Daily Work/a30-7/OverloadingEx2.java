package com.a307;

public class OverloadingEx2 
{

	int cal (int a, int b)
	{
		return a+b;
	}
	
	double cal (double c, double d)
	{
		return c*d;
	}
	
	public static void main(String[] args) 
	{
	
		OverloadingEx2 o1 = new OverloadingEx2();
		
		System.out.println(o1.cal(4, 6));
		System.out.println(o1.cal(5.0, 3.0));
		
	}
}
