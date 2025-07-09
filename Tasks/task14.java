package Tasks;

import java.util.Scanner;

public class task14 
{
public static void main(String[] args) 
{

	Scanner sc = new Scanner (System.in);
	double a,b;	
	
	System.out.println("Enter value of A : ");
	a = sc.nextInt();
	
	System.out.println("Enter value of B : ");
	b = sc.nextInt();
	
	double ans;
	ans = a+b;         // +,-,*,/,%
	
	
	System.out.println("Your Answer is: "+ans);
}
}
