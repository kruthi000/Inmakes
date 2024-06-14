package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PomBaseClass
{
	public static WebDriver driver;
        
	public  static void browser() {
		driver= new ChromeDriver();
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	}
   
	
	
	public void closeApp() {
		driver.close();
	}
	
	
	
}
