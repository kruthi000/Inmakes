package Junit;

import java.util.Date;

import org.Baseclass.BaseClass1;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Assert extends BaseClass1 {
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
	    	 driver.getCurrentUrl();
	    	 String title = driver.getTitle();
	    	System.out.println(title);
	    	 org.junit.Assert.assertTrue("page title", title.contains("Google Workspace"));
	    	 org.junit.Assert.assertEquals("check title", title, title.contains("Google Workspace"));
	    	 
	    	
	     }
	    
	    
			
	

	    
}
