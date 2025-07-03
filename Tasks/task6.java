package Tasks;

public class task6 
{
public static void main(String[] args) 
{
// I = PRN/100
	
	int price=35000,rate=5,year=3;
	int intrest;
	
	intrest = price*rate*year/100;
	
	System.out.println("Total Intrest = "+intrest);
	
	int ans=price+intrest;
	
	System.out.println("Total Payable Amount = "+ans);
	
}
}
