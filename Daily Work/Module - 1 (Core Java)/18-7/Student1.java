package com.a187;

public class Student1 
{
	
   static int count = 0;
	
   // default constructor
   public Student1 ()
   {
	   count++;
	   System.out.println(count);
   }

public static void main(String[] args) 
{

	Student1 s1 = new Student1 ();
	Student1 s2 = new Student1 ();	
	Student1 s3 = new Student1 ();
}
}
