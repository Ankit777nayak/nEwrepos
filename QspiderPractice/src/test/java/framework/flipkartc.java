package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomlog.Flipkart;

public class flipkartc {
@Test
	public void flip() {
	
		WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
 driver.get("https://www.flipkart.com");
driver.manage().window().maximize();
	
Flipkart flp = new Flipkart(driver);
//flp.getSearchTextField().sendKeys("");

flp.methodText("Bluetooth");
	}


	}


