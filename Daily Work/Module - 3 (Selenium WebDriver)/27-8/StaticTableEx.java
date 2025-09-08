package a278;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import a228.DriverConnection;

public class StaticTableEx 
{
public static void main(String[] args) 
{

	WebDriver driver = DriverConnection.getconnection("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
	
	List<WebElement> rows = (List<WebElement>) driver.findElement(By.xpath("//table[@id='customers']/tbody/tr"));
	
	List<WebElement> header = (List<WebElement>) driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
	
	
	for (int i=1; i<header.size(); i++)
	{
		String data = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[1]/th["+i+"]")).getText();
		System.out.print(data+" ");
	}
	
	System.out.println();
	for (int i=2; i<rows.size(); i++)
	{
		List<WebElement> cols = (List<WebElement>) driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[\"+i+\"]/td"));
			
		for (int j=1; j<=cols.size(); j++)
		{
			String data = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[\"+i+\"]/td[\"+j+\"]")).getText();
			System.out.println(data+" ");
		}
	}
	
	
	
	
}
}
