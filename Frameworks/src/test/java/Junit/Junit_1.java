package Junit;

import java.util.Date;

import org.Baseclass.BaseClass1;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit_1 extends BaseClass1 {
	
	
    @BeforeClass
	public  static void launchThebrowser()
	{
		launchBrowser();
		windowMaximize();
	}
    
    @Before
    public void startDate()
    {
    	Date d=new Date();
    	System.out.println(d);
    }
    
    @After
    public void endDate()
    {
    	Date d=new Date();
    	System.out.println(d);
    }
     @Test
     public void brw1()
     {
    	 System.out.println("Browser1");
    	 launchUrl("https://www.google.com/gmail/about/");
     }
     @Test
     public void brw2()
     { 
    	 System.out.println("Browser2");
    	 launchUrl("https://www.flipkart.com/");
     }
     @Test
     public void brw3()
     {
    	 System.out.println("Browser3");
    	 launchUrl("https://inmakes.com/");
     }
     @Test
     public void brw4()
     {
    	 System.out.println("Browser4");
    	 launchUrl("https://www.youtube.com/");
     }
     @AfterClass
     public static void closeThebrowser()
     {
    	 driver.quit();
     }
    
}
