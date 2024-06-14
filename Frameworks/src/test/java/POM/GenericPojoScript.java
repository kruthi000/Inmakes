package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GenericPojoScript extends PomBaseClass{
    
	
	    @FindBy(xpath="//img[@alt='Login']")
	    private WebElement login;
		@FindBy(xpath="//input[@type='text']")
		private WebElement email;
		
	 
		
		public GenericPojoScript(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

	
		public void getLogin() {
			 login.click();;
		}

		public void getEmail(String mail) 
		{
			 email.sendKeys(mail);;
			 
		}
	}
	
	
	
	

