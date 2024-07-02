package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fetchingmultipltestdata {
	@DataProvider
	public String[][] testdata() throws EncryptedDocumentException, IOException{
		FileInputStream fis=new FileInputStream("C:\\Users\\LEGION\\eclipse-workspace\\QspiderPractice\\externalfile\\excel.XLSX");
		Workbook wb = WorkbookFactory.create(fis);
		int noofrow = wb.getSheet("Sheet3").getPhysicalNumberOfRows();
		int noofcell = wb.getSheet("Sheet3").getRow(0).getPhysicalNumberOfCells();
		String[][] data=new String[noofrow][noofcell];
		for (int i=0;i<noofrow;i++) {
			for(int j=0;j<noofcell;j++) {
				data[i][j]=wb.getSheet("Sheet3").getRow(i).getCell(j).toString();
			}
		}
			
		
		return data;
		
	}



	

@Test(dataProvider = "testdata")
public void registeruseer(String[] testdata) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Reporter.log("window is max", true);
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//a[text()='Register']")).click();
	if(testdata[0].equalsIgnoreCase("female")) {
		driver.findElement(By.id("gender-female")).click();
	}
	else {
		driver.findElement(By.id("gender-male")).click();
		
	}
	driver.findElement(By.id("FirstName")).sendKeys(testdata[1]);
	driver.findElement(By.id("LastName")).sendKeys(testdata[2]);
	driver.findElement(By.id("Email")).sendKeys(testdata[3]);
	driver.findElement(By.id("Password")).sendKeys(testdata[4]);
	driver.findElement(By.id("ConfirmPassword")).sendKeys(testdata[5]);
	driver.findElement(By.xpath("//input[@id=\"register-button\"]")).click();
}
}