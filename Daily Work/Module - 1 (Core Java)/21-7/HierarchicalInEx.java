package com.a217;

class Bank
{
	void bank()
	{
		System.out.println("Banking");
	}
}

class Current extends Bank
{
	void current()
	{
		System.out.println("Current");
	}
}

class Save extends Bank
{
	void save()
	{
		System.out.println("Saving");
	}
}

public class HierarchicalInEx 
{
public static void main(String[] args) 
{

	Current c = new Current();
	Save s = new Save();
	
	c.bank();
	c.current();
	s.save();
}
}
