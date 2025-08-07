package com.a68;

import java.util.Scanner;

public class WrapEx2 
{
public static void main(String[] args) 
{

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter any number");
	String num1 = sc.next();
	
	System.out.println("Enter any number");
	String num2 = sc.next();
	
	System.out.println(Integer.parseInt(num1)+Integer.parseInt(num2));
	
}
}
