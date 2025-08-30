package a228;

public class BrowserDemo 
{
	public static void main(String[] args)
	{
		
		DriverConnection connect = new DriverConnection();
		connect.getconnection("https://www.tops-int.com/");
		
	}
}