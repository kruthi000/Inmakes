package Data_Driver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Dta_2 {
 public static void main(String[] args) throws IOException {
    	 
    	 
    	 File f=new File("C:\\Users\\Manja\\eclipse-workspace\\Frameworks\\Excel\\Sample.xlsx");
    	 FileInputStream fis=new FileInputStream(f);
    	 Workbook wb=new XSSFWorkbook(fis);
    	 Sheet s = wb.getSheet("Data1");
    	 Row row = s.getRow(1);
    	 Cell cell = row.getCell(0);
    	 System.out.println(cell);
    	 
    	 Row row1 = s.getRow(1);
    	 Cell cell1= row1.getCell(1);
    	 System.out.println(cell1);
    	 
    	 
}
}
