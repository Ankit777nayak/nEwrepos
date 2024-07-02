package ecom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Functional_Test {
	@Test
	public void integration() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("window is max", true);
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("integration",true);
		driver.findElement(By.xpath("//a[text()='YouTube']")).click();
		Reporter.log("youtube opened",true);
		Thread.sleep(2000);
		driver.quit();
	}

}
