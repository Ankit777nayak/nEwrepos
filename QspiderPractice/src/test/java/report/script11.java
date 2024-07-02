package report;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.ReportStats;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class script11 {
@Test
public void script() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	Takingscreenshot ss=new Takingscreenshot();
	ExtentReports  report= new ExtentReports();
	ExtentSparkReporter reporter=new ExtentSparkReporter("./reports/reports.html");
	report.attachReporter(reporter);
	ExtentTest test=report.createTest("login");
	driver.manage().window().maximize();
	test.log(Status.INFO, "window is max");
	driver.get("https://demowebshop.tricentis.com/");
	test.log(Status.INFO, "demowebshop is launch");
	driver.findElement(By.linkText("Log in")).click();
	test.log(Status.INFO, "login is clicked");
	driver.findElement(By.id("Email")).sendKeys("nayakankit043@gmail.com");
	test.log(Status.INFO, "email is typed");
	driver.findElement(By.id("Password")).sendKeys("Ankit@77");
	test.log(Status.INFO, "password given");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	test.log(Status.INFO, "login is clicked");
	try {
		if(driver.findElement(By.linkText("Log out")).isDisplayed()) {
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(ss.screenshot(driver)).build());
		}
	} catch (Exception e) {
		// TODO: handle exception
	
	
	test.fail(MediaEntityBuilder.createScreenCaptureFromPath(ss.screenshot(driver)).build());
	}
	report.flush();	
}

}
