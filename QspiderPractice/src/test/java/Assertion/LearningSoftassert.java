package Assertion;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningSoftassert {
	@Test
public void script() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	SoftAssert sa=new SoftAssert();
	driver.get("https://demowebshop.tricentis.com/");
	sa.assertEquals(driver.getTitle(), "Demo Web Shop", "demowebshop not selected");
	driver.findElement(By.linkText("Register")).click();
	sa.assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/register", "registor not displayed");
	WebElement male = driver.findElement(By.id("gender-male"));
	male.click();
	sa.assertTrue(male.isSelected(),"notselected");
	  WebElement fname = driver.findElement(By.id("FirstName"));
	  fname.sendKeys("Ankit");
	sa.assertEquals(fname.getAttribute("value"), "Ankit", "not requieed");
	WebElement lname = driver.findElement(By.id("LastName"));lname.sendKeys("Kumar");
	sa.assertEquals(lname.getAttribute("value"), "Kumar", "not selcetd");
	sa.assertAll();
}
}
