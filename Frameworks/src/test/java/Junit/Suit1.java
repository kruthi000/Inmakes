package Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Suit1 {
	@BeforeClass
	public static void launchBrowser()
	{
		System.out.println("Start Browser");
	}
	@Test
	public void test1()
	{
		System.out.println("Test_case1");
	}
	@Before
	public void startDate()
	{
		System.out.println("Date and Time");
	}
	@After
	public void endDate()
	{
		System.out.println("Date and Time1");
	}
	@AfterClass
	public static void closeBrowser()
	{
		System.out.println("close Browser");
	}
}
