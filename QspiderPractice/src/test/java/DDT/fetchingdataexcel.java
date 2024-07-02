package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fetchingdataexcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
FileInputStream fis=new FileInputStream("C:\\Users\\LEGION\\eclipse-workspace\\QspiderPractice\\externalfile\\excel.XLSX");
Workbook wb=WorkbookFactory.create(fis);
System.out.println(wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue());
System.out.println(wb.getSheet("Sheet1").getRow(4).getCell(2).getNumericCellValue());
System.out.println(wb.getSheet("Sheet1").getRow(7).getCell(3).getBooleanCellValue());
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get(wb.getSheet("Sheet1").getRow(10).getCell(1).toString());
}

}
