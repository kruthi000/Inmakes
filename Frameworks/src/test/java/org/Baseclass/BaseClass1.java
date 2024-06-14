package org.Baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class BaseClass1 {
  
   public static WebDriver driver;
   
   public static void launchBrowser()
   {
	   System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 driver=new ChromeDriver();
   }
   public static void windowMaximize()
   {
	   driver.manage().window().maximize();
   }
   public static void launchUrl(String url)
   {
	   driver.get(url);
   }
   public static void pageTitle()
   {
	   String title = driver.getTitle();
	   System.out.println(title);
   }
   public static void pageUrl()
   {
	   String url = driver.getCurrentUrl();
	   System.out.println(url);;
   }
   public static void passText(String text,WebElement ele)
   {
	   ele.sendKeys(text);
   }
   public static void closeEntireBrowser()
   {
	   driver.quit();
   }
   public static void clickBtn(WebElement ele)
   {
	   ele.click();
   }
   public static void screenShot(String imgName) throws IOException
   {
	   TakesScreenshot ts=(TakesScreenshot)driver;
	   File img = ts.getScreenshotAs(OutputType.FILE);
	   File f = new File("Location+imgName.jpg");
	   FileUtils.copyFile(img, f);
   }
   public static Actions a;
    public static void moveTheCursor(WebElement targetWebElement)
    {
    	a=new Actions(driver);
    	a.moveToElement(targetWebElement).perform();
    }
     
    public static void dragDrop(WebElement dragWebElement,WebElement dropElement)
    {
    	a=new Actions(driver);
    	a.dragAndDrop(dragWebElement, dropElement).perform();
    }
    public static JavascriptExecutor js;
     
    public static void scrollThePage(WebElement tarWebEle)
    {
    	js=(JavascriptExecutor)driver;
    	js.executeScript("argument[0].scrollIntoView(true)", tarWebEle);
    }
    public static void scroll(WebElement element)
    {
    	js=(JavascriptExecutor)driver;
    	js.executeScript("argument[0].scrollIntoView(false)", element);
    }
    public static void readExcel(String sheetName,int rowNum, int cellNum) throws IOException
    {
    	File f = new File("ExcelSheetLocation.xlxs");
    	FileInputStream fis = new FileInputStream(f);
    	Workbook wb= new XSSFWorkbook(fis);
        Sheet mySheet = wb.getSheet("SheetName");
        Row r = mySheet.getRow(rowNum);
        Cell c = r.getCell(cellNum);
        int cellType = c.getCellType();
        
        String value=" ";
        if(cellType==1)
        {
		String value2 = c.getStringCellValue();
		System.out.println(value2);
        }
        else if (DateUtil.isCellDateFormatted(c)) {
			Date d = c.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat(value);
			String value1 = s.format(d);
			System.out.println(value1);
		}
        else {
        	double d = c.getNumericCellValue();
        	long l=(long)d;
        	String value3=String.valueOf(l);
        	System.out.println(value3);
            }	
    }
        	
        public static void newExcelFile(String writeData ,int rowNum1 , int cellNum1) throws IOException
        {
        	File f = new File("ExcelSheet Location.xlxs");
        	Workbook wb= new XSSFWorkbook();
            Sheet newSheet = wb.createSheet();
            Row r = newSheet.createRow(rowNum1);
            Cell c = r.createCell(cellNum1);
            c.setCellFormula(writeData);
            FileOutputStream fos=new FileOutputStream(f);
            wb.write(fos);
        }
        public static void createCell(String newData,int getRow, int creCell) throws IOException
        {
        	File f = new File("ExcelSheetLocation.xlxs");
        	FileInputStream fis = new FileInputStream(f);
        	Workbook wb= new XSSFWorkbook(fis);
            Sheet mySheet = wb.getSheet("SheetName");
            Row r = mySheet.getRow(getRow);
            Cell c = r.createCell(creCell);
            c.setCellValue(newData);
            FileOutputStream fos=new FileOutputStream(f);
            wb.write(fos);
    }
        public static void createRow(String newData,int creRow, int creCell) throws IOException
        {
        	File f = new File("ExcelSheetLocation.xlxs");
        	FileInputStream fis = new FileInputStream(f);
        	Workbook wb= new XSSFWorkbook(fis);
            Sheet mySheet = wb.getSheet("SheetName");
            Row r = mySheet.createRow(creRow);
            Cell c = r.createCell(creCell);
            c.setCellValue(newData);
            FileOutputStream fos=new FileOutputStream(f);
            wb.write(fos);
    }
        
        public static void updateDataToParticularCell(String newData,int getRow, int creCell) throws IOException
        {
        	File f = new File("ExcelSheetLocation.xlxs");
        	FileInputStream fis = new FileInputStream(f);
        	Workbook wb= new XSSFWorkbook(fis);
            Sheet mySheet = wb.getSheet("SheetName");
            Row r = mySheet.getRow(getRow);
            Cell c = r.getCell(creCell);
           String str = c.getStringCellValue();
           if(str.equals(c))
           {
        	   c.setCellValue(newData);
           }
            FileOutputStream fos=new FileOutputStream(f);
            wb.write(fos);
    }
        
        
    
   
}
