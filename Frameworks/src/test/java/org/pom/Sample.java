package org.pom;

import org.Baseclass.BaseClass1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample  extends BaseClass1{
  
	public static void main(String[] args) {
		launchBrowser();
		launchUrl("https://www.facebook.com/");
		windowMaximize();
		
		FbloginPOJO f=new FbloginPOJO();
		passText("ammuvarsha", f.getEmail());
		passText("varshi", f.getPassword());
		clickBtn(f.getLoginBtn());

		
		
		//WebElement email = driver.findElement(By.id("email"));
		//passText("ammuvarsha", email);
		
		//WebElement password = driver.findElement(By.name("pass"));
		//passText("varshi", password);
		
		
		
	}
}
