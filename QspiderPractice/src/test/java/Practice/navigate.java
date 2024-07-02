package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.errorprone.annotations.ThreadSafe;

public class navigate {

	public static void main(String[] args) throws Throwable  {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("http://amazon.com");
driver.navigate().back();
Thread.sleep(1000);
driver.navigate().forward();
Thread.sleep(1000);
driver.navigate().refresh();
	}

}
