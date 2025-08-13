package com.a138;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx 
{
public static void main(String[] args) 
{

	HashSet set = new HashSet<>();
	
	set.add(3);
	set.add(4);
	set.add(1);
	set.add(2);
	set.add(1);
	set.add(2);
	
	System.out.println(set);
	
	Iterator i = set.iterator();
	
	while (i.hasNext());
	{
		System.out.println(i.next());
	}

	
}
}