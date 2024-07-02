package listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(TestngListners.class)
public class Baseclass {
	public static WebDriver driver;
	
		@BeforeClass
		public void base() {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			Reporter.log("window is max", true);
			driver.get("https://demowebshop.tricentis.com/");
			Reporter.log("demoshop launched",true);
			
	}
		@AfterClass
		public void base1() {
			driver.quit();
		}

}
