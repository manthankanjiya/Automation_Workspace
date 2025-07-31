package com.a307;

//Method Overriding:
//When two or more methods having a same name and number of parameters are also same



class Bank
{
	int rate()
	{
		return 0;
	}
}
class sbi extends Bank
{
	int rate()
	{
		return 6;
	}
}
class icici extends Bank
{
	int rate ()
	{
		return 7;
	}
}
class axis extends Bank 
{
	int rate ()
	{
		return 8;
	}
}



public class OverridingEx 
{
 public static void main(String[] args) 
 {
	
//		sbi s = new sbi();
//		icici i = new icici();
//		axis a = new axis();
//		
//		System.out.println(s.rate());//6
//		System.out.println(i.rate());//7
//		System.out.println(a.rate());//8
	 
	 
	 Bank b;
	 
	 b = new sbi();
	 System.out.println(b.rate());
	 
	 b = new icici();
	 System.out.println(b.rate());
	 
	 b = new axis();
	 System.out.println(b.rate());
	 
	 
	 
}
		
}
