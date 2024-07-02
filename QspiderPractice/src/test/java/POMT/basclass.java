package POMT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basclass {
	WebDriver driver;
	@BeforeClass
	public void script() {
		WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	}
	@AfterClass
	public void close() throws InterruptedException {
		
		driver.quit();
		Thread.sleep(2000);
		
	}

}
