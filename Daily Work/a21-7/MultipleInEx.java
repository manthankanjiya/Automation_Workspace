package com.a217;
class P
{
	void p()
	{
		System.out.println("P called");
	}
}
interface Q 
{
	void q();
}
class R extends P implements Q
{
void r()
{
	System.out.println("R called");
}

@Override
public void q() 
{
System.out.println("Q called");	
}
}
public class MultipleInEx 
{
public static void main(String[] args) 
{

	R r = new R();
	r.p();
	r.q();
	r.r();
	
}
}

