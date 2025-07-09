package Tasks;

import java.util.Scanner;

public class task13 
{
public static void main(String[] args) 
{
// Area of Triangle = 0.5*a*b
	
	float value = 0.5f;
	Scanner sc = new Scanner (System.in);
	int a,b;
	
	System.out.println("Value is : 0.5");
	
	System.out.println("Enter Value of A : ");
	a = sc.nextInt();
	
	System.out.println("Enter Value of B : ");
	b = sc.nextInt();
	
	float ans;
	
	ans = 0.5f*a*b;
	
	System.out.println("Your Answer is: "+ans);
}
}
