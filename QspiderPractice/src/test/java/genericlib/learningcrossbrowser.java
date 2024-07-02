package genericlib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class learningcrossbrowser {
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void launchbrowser(@Optional("firefox")String bname) throws InterruptedException {
		if (bname.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			Reporter.log("window is max", true);
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.partialLinkText("Books")).click();
			Thread.sleep(2000);
			driver.quit();
			
		}
		else if(bname.contains("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			Reporter.log("window is max", true);
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.partialLinkText("Books")).click();
			Thread.sleep(2000);
			driver.quit();
			
			
		}
		
	}

}
