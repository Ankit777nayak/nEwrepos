package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fetchdatafromproperty {
	public static void main (String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./externalfile/prop.properties");
		Properties p=new Properties();
		p.load(fis);
		System.out.println("url");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getProperty("url"));
		
		
	}
	

}
