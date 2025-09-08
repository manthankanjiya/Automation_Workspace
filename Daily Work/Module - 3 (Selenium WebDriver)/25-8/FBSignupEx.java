package a258;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FBSignupEx 
{
public static void main(String[] args) throws InterruptedException 
{
	
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("Create new account")).click();
	
	Thread.sleep(1000);
	
	driver.findElement(By.name("firstname")).sendKeys("abcd");
	
	Thread.sleep(1000);
	
	driver.findElement(By.name("lastname")).sendKeys("xyz");
	
	Thread.sleep(1000);
	
	Select Days = new Select(driver.findElement(By.id("day")));
	Days.selectByVisibleText("19");
	
	Thread.sleep(1000);
	
	Select months = new Select(driver.findElement(By.id("month")));
	months.selectByVisibleText("Jun");
	
	Thread.sleep(1000);
	
	Select year = new Select(driver.findElement(By.id("year")));
	year.selectByVisibleText("2002");
	
	Thread.sleep(1000);
	
	List<WebElement> gender = driver.findElements(By.name("sex"));
	 gender.get(1).click();
	
	Thread.sleep(1000);
	
	driver.findElement(By.name("reg_email__")).sendKeys("abcd@gmail.com");
	
	Thread.sleep(1000);
	
	driver.findElement(By.name("reg_passwd__")).sendKeys("abc@123");
	
	Thread.sleep(1000);
	
	driver.findElement(By.name("websubmit")).click();
	
	Thread.sleep(1000);
	
	driver.quit();
	
	
}
}
