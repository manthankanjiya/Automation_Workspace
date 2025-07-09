package Tasks;

import java.util.Scanner;

public class task16 
{
public static void main(String[] args) 
{

	Scanner sc = new Scanner (System.in);
	float g,e,h,m,s;
	
	System.out.println("Enter Gujarati marks: ");
	g = sc.nextInt();
	
	System.out.println("Enter English marks : ");
	e = sc.nextInt();
	
	System.out.println("Enter Hindi marks : ");
	h = sc.nextInt();
	
	System.out.println("Enter Maths marsk : ");
	m = sc.nextInt();
	
	System.out.println("Enter Science marks : ");
	s = sc.nextInt();
	
	float total,per;
	
total = g+e+h+m+s;
per = total/5;
	
	System.out.println("Your Percentage is : "+per);
	
	
}
}
