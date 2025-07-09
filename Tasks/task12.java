package Tasks;

import java.util.Scanner;

public class task12 
{
public static void main(String[] args) 
{
// Area of Circle : PI*r*r
	
	float PI = 3.14f;
	Scanner sc = new Scanner (System.in);
	int r;
	
System.out.println("PI value is : 3.14");	

System.out.println("Enter R value: ");
r = sc.nextInt();

float ans;

ans = 3.14f*r*r;

System.out.println("Your Answer is: "+ans);
}
}
