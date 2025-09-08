package com.a87;

import java.util.Scanner;

public class PrimeEx 
{
public static void main(String[] args) 
{
    System.out.println("Enter any Number : ");
    Scanner sc = new Scanner (System.in);
    int num = sc.nextInt();
    int count = 0;
   
    
	for (int i=1;i<=num;i++)
	{
		if (num % i == 0)
		{
			count++;
		}
	}
	if (count>2)
	{
		System.out.println("Number is not Prime");
	}
	else
	{
		System.out.println("Number is Prime");
	}
		
}
}
