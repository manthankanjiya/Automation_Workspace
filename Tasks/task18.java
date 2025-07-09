package Tasks;

import java.util.Scanner;

public class task18 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner (System.in);
int age;
	
	System.out.println("Enter your Age : ");
	age = sc.nextInt();
	
	if (age>=18)
    {
   	 System.out.println("Eligible to vote");
   	
   	    if (age>=60)
   	    {
   	     	 System.out.println("You are under senior citizen category");
   	    }
   	    else    	 
   	    {
   		      System.out.println("You are under younge age category");
    	 }
    }
    else
    {
   	 System.out.println("Not Eligible to vote");
    } 
	
}
}
