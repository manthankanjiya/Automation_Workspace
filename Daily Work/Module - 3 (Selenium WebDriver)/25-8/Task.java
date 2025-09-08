package a258;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task 
{
public static void main(String[] args) throws InterruptedException 
{

	System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=2DBF39E09B32BF3726092B5354FE85CB");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("customer.firstName")).sendKeys("ABCD");
	
	Thread.sleep(1000);
	
	driver.findElement(By.id("customer.lastName")).sendKeys("XYZ");
	
	Thread.sleep(1000);
	
	driver.findElement(By.id("customer.address.street")).sendKeys("Ravaper Road.");
	
	Thread.sleep(1000);
	
	driver.findElement(By.id("customer.address.city")).sendKeys("Morbi");
	
	Thread.sleep(1000);
	
	driver.findElement(By.id("customer.address.state")).sendKeys("Gujarat");
	
	Thread.sleep(1000);
	
	driver.findElement(By.id("customer.address.zipCode")).sendKeys("363641");
	
	Thread.sleep(1000);
	
	driver.findElement(By.id("customer.phoneNumber")).sendKeys("7862012699");
	
	Thread.sleep(1000);
	
	driver.findElement(By.id("customer.ssn")).sendKeys("123-45-6789");
	
	Thread.sleep(1000);
	
	driver.findElement(By.id("customer.username")).sendKeys("abcd@123");
	
	Thread.sleep(1000);
	
	driver.findElement(By.id("customer.password")).sendKeys("xyz@0987");
	
	Thread.sleep(1000);
	
	driver.findElement(By.id("repeatedPassword")).sendKeys("xyz@0987");
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
	
	Thread.sleep(1000);
	
	driver.quit();
	
}
}
