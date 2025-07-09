package Tasks;

import java.util.Scanner;

public class task17 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner (System.in);
	double y,z;
	
	System.out.println("Enter value of Y : ");
	y = sc.nextInt();
	
	System.out.println("Enter value of Z : ");
	z = sc.nextInt();
	
    y-=z;    // +,-
    
    System.out.println("Your Answer is : "+y);
	
}
}
