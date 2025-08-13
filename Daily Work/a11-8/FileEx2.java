package com.a118;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileEx2 
{
public static void main(String[] args) throws IOException 
{

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your ID :");
	String id = sc.next();
	
	System.out.println("Enter your Name :");
	String name = sc.next();
	
	System.out.println("Enter your Password");
	String pass = sc.next();
	
	
	String s1 = "\n Your ID is: ";
	String s2 = "\n Your Name is: ";
	String s3 = "\n Your Password is: ";
	
	
	if (pass.equals("0911"))
	{
		FileOutputStream fout = new FileOutputStream("E://tops.txt");
		
		fout.write(s1.getBytes());
		fout.write(id.getBytes());
	
	    fout.write(s2.getBytes()); 
	    fout.write(name.getBytes());
	
	    fout.write(s3.getBytes());
	    fout.write(pass.getBytes());
	}   
	 else
	 {
	    	System.out.println("Invalid Credentials");
     }
	
	
	
}
}
