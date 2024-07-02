package food;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchkfc_Test {
	@Test
	public void launchingkfc() {
	WebDriverManager.chromedriver().setup();
WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	Reporter.log("window is max", true);
	driver.get("https://online.kfc.co.in/");
	driver.quit();
	}

}
