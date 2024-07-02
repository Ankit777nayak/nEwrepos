package beauty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchinloreal_Test {
@Test
public void loreal() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.lorealparis.co.in/");
//String url = System.getProperty("url");
	//driver.get(url);
	driver.quit();
	Thread.sleep(2000);
}

}
