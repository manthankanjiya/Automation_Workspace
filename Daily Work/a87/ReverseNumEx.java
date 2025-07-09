package com.a87;

import java.util.Scanner;

public class ReverseNumEx 
{
public static void main(String[] args) 
{
int revnum = 0;

System.out.println("Enter any Number : "); 	
	Scanner sc = new Scanner (System.in);
	int num = sc.nextInt();
	
    
	while (num>0)
	{
		int rem = num % 10;
		revnum = (revnum*10)+rem;
		num = num/10;
	}
	
	System.out.println("Reverse Number is : "+revnum);
	
}
}
