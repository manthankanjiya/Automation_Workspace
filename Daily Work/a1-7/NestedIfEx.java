package com.a17;

public class NestedIfEx 
{
public static void main(String[] args) 
{
int age = 38;

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
