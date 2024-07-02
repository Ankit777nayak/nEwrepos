package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("http://flipkart.com");
String title = driver.getTitle();
System.out.println(title);

String URL = driver.getCurrentUrl();
System.out.println(URL);
String source = driver.getPageSource();
//System.out.println(source);
driver.manage().window().maximize();
//driver.manage().window().fullscreen();
driver.close();
	}

}
