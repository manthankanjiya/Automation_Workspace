package com.a147;

import java.util.Scanner;

public class Pattern3 
{
public static void main(String[] args) 
{

	int i,j,num;
	
	System.out.println("Enter your Number");
	Scanner sc = new Scanner (System.in);
	num = sc.nextInt();
	
	for (i=1;i<=num;i++)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
	
	
	
}
}
