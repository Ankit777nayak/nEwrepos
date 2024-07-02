package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class insertexcel {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileInputStream tab = new FileInputStream("C:\\Users\\LEGION\\Desktop\\Book1.xlsx");
		Workbook book = WorkbookFactory.create(tab);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.createRow(3);
		Cell cell = row.createCell(3);
		cell.setCellValue("test yantra");
		FileOutputStream sap = new FileOutputStream("C:\\\\Users\\\\LEGION\\\\Desktop\\\\Book1.xlsx");
		book.write(sap);
		book.close();
		
	}

}
