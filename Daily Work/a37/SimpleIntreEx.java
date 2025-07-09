package com.a37;

import java.util.Scanner;

public class SimpleIntreEx 
{
public static void main(String[] args) 
{
// I=PRN/100;
	
	Scanner sc = new Scanner (System.in);
	int prin,rate,year;
	
	System.out.println("Enter Prin Amount: ");
	prin = sc.nextInt();
	
	System.out.println("Enter Rate of Intrest: ");
	rate = sc.nextInt();
	
	System.out.println("Enter Year: ");
	year = sc.nextInt();
	
	
	int intrest;
	
	intrest = prin*rate*year/100;
	
	System.out.println("You have to pay total Intrest: "+intrest);
	
	int ans = intrest+prin;
	
	System.out.println("You have to pay total Amount: "+ans);
	
}
}
