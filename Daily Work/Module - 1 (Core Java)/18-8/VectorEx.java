package com.a188;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx 
{
public static void main(String[] args) 
{

	Vector v = new Vector(5);
	
	v.add("ABCD");
	v.add("786");
	v.add("XYZ");
	v.add("1234");
	v.add("ABCD");
	v.add("786");
	v.add("XYZ");
	v.add("1234");
	
// System.out.println(v);
	
	System.out.println(v.size());
	System.out.println(v.capacity());
	
	Iterator i = v.iterator();
	
	while (i.hasNext())
	{
		System.out.println(i.next());
	}
	
}
}
