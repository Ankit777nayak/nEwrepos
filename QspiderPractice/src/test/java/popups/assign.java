package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assign {
@Test
	public void asst() throws Throwable {
	
	WebDriverManager.chromedriver().setup();	
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://youtube.com");
Thread.sleep(2000);
driver.findElement(By.cssSelector("[placeholder='Search']")).sendKeys("bewafa");
driver.findElement(By.cssSelector("[id=\"search-icon-legacy\"]")).click();
driver.findElement(By.xpath("(//div[@class=\"style-scope ytd-video-renderer\"])[1]")).click();
	}

}
