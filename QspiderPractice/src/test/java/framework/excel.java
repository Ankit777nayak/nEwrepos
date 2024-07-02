package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
FileInputStream tab = new FileInputStream("C:\\Users\\LEGION\\Desktop\\Book1.xlsx");
Workbook book = WorkbookFactory.create(tab);
Sheet sheet = book.getSheet("Sheet1");
Row row = sheet.getRow(1);
Cell cell = row.getCell(1);
 DataFormatter data = new DataFormatter();
	
String exceldata = data.formatCellValue(cell);
System.out.println(exceldata);

	}

}
