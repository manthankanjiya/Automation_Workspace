package a257;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserEx2 
{
public static void main(String[] args) 
{

	System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://careercenter.tops-int.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.name("user_name")).click();
	driver.findElement(By.name("user_name")).sendKeys("7862012699");
	
	
		try 
		{
			Thread.sleep(1000);
		} catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	
	driver.findElement(By.name("user_password")).click();
	driver.findElement(By.name("user_password")).sendKeys("7862012699");
	
	try
	{
		Thread.sleep(1000);
	}
	catch (InterruptedException e)
	{
		e.printStackTrace();
	}
	
	
	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input")).click();
	
}
}
