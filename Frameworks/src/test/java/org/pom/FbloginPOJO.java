package org.pom;

import org.Baseclass.BaseClass1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbloginPOJO extends BaseClass1 {
	
      public  FbloginPOJO()
      {
    	  PageFactory.initElements(driver, this);
      }
      @FindBy(id="email")
      private  WebElement email;
      
      @FindBy(id="pass")
      private  WebElement password;
      
      @FindBy(name="login")
      private  WebElement loginBtn;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}


	public WebElement getLoginBtn() {
		return loginBtn;
	}
      
}
