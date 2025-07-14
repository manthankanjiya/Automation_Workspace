package Practice;

import java.util.Scanner;

public class comH 
{
public static void main(String[] args) 
{
	System.out.println("Enter Number for Language Selection : ");
	Scanner sc = new Scanner (System.in);
    int num = sc.nextInt();
	
    switch (num)
    {
    case 1: System.out.println("Your Selected Language is English");
    break;
    
    case 2: System.out.println("Your Selected Language is Hindi");
    break;
    
    case 3: System.out.println("Your Selected Language is Gujarati");
    break;
    
    default: System.out.println("Your Number is not Valid");
    break;
    }
    
    
}
}
