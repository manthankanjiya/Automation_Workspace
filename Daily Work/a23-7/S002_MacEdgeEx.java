package a237;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class S002_MacEdgeEx 
{
public static void main(String[] args) 
{

	System.setProperty("webdriver.edge.driver","D:\\edgedriver_win64\\msedgedriver.exe");
    WebDriver driver = new EdgeDriver();
	driver.get("https://careercenter.tops-int.com/");
}
}
