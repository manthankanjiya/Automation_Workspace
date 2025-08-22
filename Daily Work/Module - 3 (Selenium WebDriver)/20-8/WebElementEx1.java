package a208;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementEx1 
{
public static void main(String[] args) throws InterruptedException 
{

	System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://careercenter.tops-int.com/");
	driver.manage().window().maximize();
	
	//data send - 1st way
	
	//WebElement mod = driver.findElement(By.id("mobile"));
	//mod.sendKeys("7862012699");
	
	//data send - 2nd way
	
	driver.findElement(By.id("mobile")).sendKeys("7862012699");
	//driver.findElement(By.id("mobile")).clear();
	
	Thread.sleep(1000);
	
	driver.findElement(By.id("password")).sendKeys("7862012699");
    
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input")).click();
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//*[@id=\"profileDropdown\"]/span[2]/i")).click();
	
	Thread.sleep(1000);
	
	driver.findElement(By.linkText("Logout")).click();
	
	driver.quit();     // close Browser
	//driver.close();  // close particular tab
}
}
