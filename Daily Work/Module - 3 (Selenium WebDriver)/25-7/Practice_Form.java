package a257;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Practice_Form 
{
public static void main(String[] args) 
{

	System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	driver.get("https://demoqa.com/automation-practice-form");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("firstName")).sendKeys("Manthan");
	driver.findElement(By.id("lastName")).sendKeys("Kanjiya");
	
	WebElement element = driver.findElement(By.id("userEmail"));
	js.executeScript("arguments[0].scrollIntoView;",element);
	
}
}
