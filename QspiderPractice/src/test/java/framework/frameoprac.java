package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameoprac {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		FileInputStream fis = new FileInputStream("C:\\Users\\LEGION\\Desktop\\PropertyData.properties.txt");
		Properties tab = new Properties();
		tab.load(fis);
		String sam = tab.getProperty("url");
		String sar = tab.getProperty("username");
		String nap = tab.getProperty("password");
		driver.get(sam);
		driver.findElement(By.name("user-name")).sendKeys(sar);
		driver.findElement(By.name("password")).sendKeys(nap);
		driver.findElement(By.className("btn_action")).click();
		
	}

}
