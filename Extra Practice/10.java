package Practice;

import java.util.Scanner;

public class comJ 
{
public static void main(String[] args) 
{
      int digit = 0;
	System.out.println("Enter any Number");
	Scanner sc = new Scanner (System.in);
	int num = sc.nextInt();
	int originalnum = num;
	
	while (num>0)
	{
		int rem = num % 10;
		digit = (digit*10)+rem;
		num = num/10;
	}

	
	if (originalnum==digit)
	{
		System.out.println("Palindrome Number");
	}
	else 
	{
		System.out.println("Not Palindrome Number");
	}
}
}
