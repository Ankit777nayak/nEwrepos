package genericlib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.Reporter;

public class baseclass {
	
WebDriver driver;

@BeforeSuite
public void dbcon() {
	Reporter.log("connected to db",true);
	
}
@BeforeTest
public void dbcond() {
	Reporter.log("condn done",true);
}
@BeforeClass
public void launch() {
	Reporter.log("its launching",true);
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	Reporter.log("window is max", true);
	driver.get("https://demowebshop.tricentis.com/");
	Reporter.log("demoshop launched",true);
	
	
}
@BeforeMethod
public void login() {
	Reporter.log("its login",true);
	driver.findElement(By.xpath("//a[text()='Log in']")).click();
	driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("nayakankit043@gmail.com");
	Reporter.log("login email",true);
	driver.findElement(By.id("Password")).sendKeys("Ankit@77");
	Reporter.log("password given",true);
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	
	
}
@AfterMethod
public void logout() {
	Reporter.log("logout action",true);
	driver.findElement(By.linkText("Log out")).click();
}
@AfterClass
public void close() {
	Reporter.log("close action",true);
	driver.quit();
	
}
@AfterTest
public void postcond() {
	Reporter.log("post cond",true);
	
}
@AfterSuite
public void closedb() {
	Reporter.log("database disconnect",true);
}
}
