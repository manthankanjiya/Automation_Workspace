package Practice;

import java.util.Scanner;

public class comG 
{
	
	// A = wl (area of rectangle)
	
public static void main(String[] args) 
{
Scanner sc = new Scanner (System.in);
float w,l;

System.out.println("Enter value of W : ");
	w = sc.nextInt();
	
	System.out.println("Enter value of L : ");
	l = sc.nextInt();
	
	float ans;
	ans = w*l;
	
	System.out.println("Your Answer is : "+ans);
	
}
}
