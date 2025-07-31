package Tasks;

import java.util.Scanner;

public class task19 
{
public static void main(String[] args) 
{

	System.out.println("Enter any Number");
	Scanner sc = new Scanner (System.in);
	int num = sc.nextInt();
	
	int first=0, second=1, i;
	System.out.println("Fibonacci Series");
	
    for (i=1;i<=num;num++)
	{
    	System.out.println(first+ " ");
		int next = first + second;
		first = second;
		second = next;
	}
	
}
}
