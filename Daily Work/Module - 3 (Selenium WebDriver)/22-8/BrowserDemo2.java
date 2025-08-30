package a228;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowserDemo2 
{
	
	static WebDriver driver;
	
public static void main(String[] args) throws InterruptedException 
{

//	DriverConnection connect = new DriverConnection();
//	//connect.getconnection("https://demoblaze.com/");
//	DriverConnection.getconnection("https://demoblaze.com/").findElement(By.id("Log in")).click();
	
	driver = DriverConnection.getconnection("https://demoblaze.com/");
	
	Thread.sleep(1000);
	
	WebElement ele1 = driver.findElement(By.linkText("Log in"));
	ele1.click();
	
	Thread.sleep(1000);
	
	WebElement ele2 = driver.findElement(By.id("loginusername"));
	ele2.sendKeys("prakruti");
	
	WebElement ele3 = driver.findElement(By.id("loginpassword"));
	ele3.sendKeys("1234");
	
	WebElement ele4 = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
	ele4.click();
	
	Thread.sleep(4000);
	
	WebElement ele5 = driver.findElement(By.linkText("logOut()"));
	ele5.click();
	
}
}
