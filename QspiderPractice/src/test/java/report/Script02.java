package report;

import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script02 {
	@Test
	public void script2() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		LocalDateTime datetime= LocalDateTime.now();
		String date = datetime.toString().replace(":", "-");
		Takingscreenshot ss=new Takingscreenshot();
		ExtentReports  report= new ExtentReports();
		ExtentSparkReporter reporter=new ExtentSparkReporter("./reports/"+date+".html");
		report.attachReporter(reporter);
		ExtentTest test=report.createTest("Book");
		driver.manage().window().maximize();
		test.log(Status.INFO, "window is max");
		driver.get("https://demowebshop.tricentis.com/");
		test.log(Status.INFO, "demowebshop is launch");
		driver.findElement(By.partialLinkText("Books")).click();
		test.log(Status.INFO, "Books is clicked");
		driver.findElement(By.linkText("Computing and Internet")).click();
		test.log(Status.INFO, "book is selected");
		driver.findElement(By.id("add-to-cart-button-13")).click();
		test.log(Status.INFO, "added to cart");
		try {
			if(driver.getTitle().contains("Demo Web Shop. Computing and Internet")) {
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(ss.screenshot(driver)).build());
			}
		} catch (Exception e) {
			// TODO: handle exception
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(ss.screenshot(driver)).build());
		}
		report.flush();
	}

}
