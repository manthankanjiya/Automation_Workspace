package Tasks;

import java.util.Scanner;

public class task10 
{
public static void main(String[] args) 
{
	int maxnum = 0;

	System.out.println("Enter Any Number : ");	
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		
		while (num>0)
		{
			int rem = num % 10;
			
			    if (rem>maxnum)
			    {
			    	maxnum = rem;
			    }
			num = num % 10;
		System.out.println("Maximum Number is : "+maxnum);
			
			
		}
}
}
