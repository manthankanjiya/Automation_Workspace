package Tasks;

import java.util.Scanner;

public class task20 
{
public static void main(String[] args) 
{

    System.out.println("Enter any Number : ");
	Scanner sc = new Scanner (System.in);
	int num = sc.nextInt();
	
	long factorial = 1;
	
	for (int i=1; i<=num; i++)	
	{
		factorial *= i;
	}
	System.out.println("Factorial of " +num+ " is : "+factorial);
}
}
