package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runnerscript extends GenericPojoScript  {

	public Runnerscript(WebDriver driver)
	{
		super(driver);
		
	}

	public static void main(String[] args)
       {
    	   System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
    		  WebDriver driver=new ChromeDriver();
    		  driver.get("https://www.flipkart.com/");
    		  driver.manage().window().maximize();
    		  
    	   GenericPojoScript pom=new GenericPojoScript(driver);
    	   pom.getLogin();
      		pom.getEmail("9171802819");
	}
	
}
