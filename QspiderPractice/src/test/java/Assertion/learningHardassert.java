package Assertion;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class learningHardassert {
	@Test
	public void scripting() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		assertEquals(driver.getTitle(), "Demo Web Shop", "demowebshop not selected");
		driver.findElement(By.linkText("Register")).click();
		assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/register", "registor not displayed");
		WebElement male = driver.findElement(By.id("gender-male"));
		male.click();
		assertTrue(male.isSelected(),"notselected");
		  WebElement fname = driver.findElement(By.id("FirstName"));
		  fname.sendKeys("Ankit");
		assertEquals(fname.getAttribute("value"), "Ankit", "not requieed");
		WebElement lname = driver.findElement(By.id("LastName"));lname.sendKeys("Kumar");
		assertEquals(lname.getAttribute("value"), "Kumar", "not selcetd");
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("nk@gamil.com");
		
		
		
		
	}

	
}
