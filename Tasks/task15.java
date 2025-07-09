package Tasks;

import java.util.Scanner;

public class task15 
{                 // I = PRN/100
	
public static void main(String[] args) 
{
	
Scanner sc = new Scanner (System.in);
double prin,rate,year;
	
System.out.println("Enter Prin Amount: ");
	prin = sc.nextInt();
	
	System.out.println("Enter rate of Intrest: ");
	rate = sc.nextInt();
	
	System.out.println("Enter years: ");
	year = sc.nextInt();
	
	
	double intrest,ans;
	
	intrest = prin*rate*year/100;
	
	System.out.println("You have to pay total intrest: "+intrest);
	
	ans = prin+intrest;
	
	System.out.println("You have to pat total Ammount : "+ans);
}
}
