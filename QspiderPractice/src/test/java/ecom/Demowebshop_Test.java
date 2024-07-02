package ecom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demowebshop_Test {
	@Test
	public void launchdemo() {
		
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Reporter.log("window is max", true);
	driver.get("https://demowebshop.tricentis.com/");
	Reporter.log("demoshop launched",true);
	driver.quit();
	}
}
