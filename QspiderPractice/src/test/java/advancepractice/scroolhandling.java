package advancepractice;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroolhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://amazon.in");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		for(int i=0;i<5;i++) {
			js.executeScript("window.scrollBy(0,300)");
		}
	}

}
