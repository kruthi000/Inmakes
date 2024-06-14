package Data_Driver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_3 {
	public static void main(String[] args) throws IOException {

		 File f=new File("C:\\Users\\Manja\\eclipse-workspace\\Frameworks\\Excel\\Sample.xlsx");
		 FileInputStream fis=new FileInputStream(f);
		 Workbook wb=new XSSFWorkbook(fis);
		 Sheet s = wb.getSheet("Data3");
		 for (int i = 0; i < 4; i++) {
			 Row row = s.getRow(i);
			 for (int j = 0; j < 2; j++) {
				 Cell cell = row.getCell(j);
				 System.out.println(cell);
			}	 
		}	 
	}
}

