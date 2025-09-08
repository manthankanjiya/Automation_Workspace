package com.a188;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import com.a118.Student;

class student12
{

	int rollno;
	String name;
	int age;
	
	 student12(int rollno , String name, int age) 
	{
	this.rollno=rollno;
	this.name=name;
	this.age=age;
	}
	
}

class AgeComparator implements Comparator
{


	public int compare(Object o1, Object o2) 
	{
        student12 s1 = (student12)o1;
        student12 s2 = (student12)o2;
        
        if(s1.age==s2.age)  
    		return 0;  
        
    	else if(s1.age>s2.age)  
    		return 1;  
        
    	else  
    		return -1; 
        
	}
	
}

class NameComparator implements Comparator
{

	
	public int compare(Object o1, Object o2) 
	{
		student12 s1 = (student12)o1;
		student12 s2 = (student12)o2;
		return s1.name.compareTo(s2.name);
	}
	
}

public class ComparatorDemo 
{
public static void main(String[] args) 
{

	ArrayList al = new ArrayList();
	al.add(new student12(01, "Vijay", 18));
	al.add(new student12(02, "Ajay", 20));
	al.add(new student12(03, "Sanjay", 22));
	
	System.out.println("Shorting by name");
	
	Collections.sort(al,new NameComparator());
	Iterator itr = al.iterator();
	while (itr.hasNext())
	{
		student12 st = (student12) itr.next();
		System.out.println(st.rollno+" "+st.name+" "+st.age);
	}
	
	
	
	
	
}
}
