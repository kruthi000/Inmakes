package Data_Driver;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Create_excel {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\Manja\\eclipse-workspace\\Frameworks\\Excel\\assignmet.xlsx");
	Workbook wb= new XSSFWorkbook();
    Sheet newSheet = wb.createSheet();
    Row r = newSheet.createRow(0);
    Cell c = r.createCell(0);
    c.setCellValue("Selenium");
    
    Cell c1 = r.createCell(1);
    c1.setCellValue("Java");
    
    Cell c2 = r.createCell(2);
    c2.setCellValue("Data Driven");
    
    Cell c3 = r.createCell(3);
    c3.setCellValue("POM");
    
    Row r1 = newSheet.createRow(1);
    
    Cell c4 = r1.createCell(0);
    c4.setCellValue("Appium");
    
    Cell c5 = r1.createCell(1);
    c5.setCellValue("Cucumber");
    
    Cell c6 = r1.createCell(2);
    c6.setCellValue("Junit");
    
    Cell c7 = r1.createCell(3);
    c7.setCellValue("TestNG");
    
    FileOutputStream fos=new FileOutputStream(f);
    wb.write(fos);
}
}
