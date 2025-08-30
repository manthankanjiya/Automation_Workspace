package a228;

import java.security.Identity;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class AlertDemoEx 
{

	static WebDriver driver;
	private static Alert alter;
	
	public static <Alter> void main(String[] args) throws InterruptedException 
	{
	
		driver = DriverConnection.getconnection("https://demoqa.com/alerts");
		
		Thread.sleep(2000);
		
	// 1st button	
		
//		WebElement ele1= driver.findElement(By.id("alertButton"));
//		ele1.click();
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		
		
	// 2nd button
		
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		WebElement ele2 = driver.findElement(By.id("timerAlertButton"));
//		ele2.click();
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		
		
	// 3rd Button
		
//		WebElement btn = driver.findElement(By.id("confirmButton"));
//		btn.click();
//		Alert alert = driver.switchTo().alert();
//		//alert.accept();
//		alert.dismiss();
		
		
	// 4th Button
		
		WebElement btn = driver.findElement(By.id("promtButton"));
		btn.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Hello");
		alert.accept();
		//alert.dismiss();
		
		
		
	}
}
