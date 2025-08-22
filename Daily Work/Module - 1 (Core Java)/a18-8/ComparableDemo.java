package com.a188;

import java.util.ArrayList;
import java.util.Collections;


class Student11 implements Comparable<Student11>
{  
	int rollno;  
	String name;  
	int age;  

	Student11(int rollno,String name,int age)
	{  
		this.rollno=rollno;  
		this.name=name;  
		this.age=age;  
	}  
  
	public int compareTo(Student11 st)
	{  
		if(age==st.age)  
		return 0;  
		else if(age>st.age)  
		return 1;  
		else  
		return -1;  
		 
	}  
}	
public class ComparableDemo 
{
public static void main(String[] args) 
{

	ArrayList<Student11> al = new ArrayList<Student11>();
	al.add(new Student11(01, "Vijay", 18));
	al.add(new Student11(02, "Ajay", 20));
	al.add(new Student11(03, "Sanjay", 22));
	
	Collections.sort(al);
	
	for (Student11 st:al)
	{
		System.out.println(st.rollno+" "+st.name+" "+st.age);
	}
	
}
}
