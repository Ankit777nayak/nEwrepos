package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launchingbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	String key="webdriver.chrome.driver";
		String value="./chromedriver.exe";
		System.setProperty(key,value);
WebDriver driver=new ChromeDriver();*/
//WebDriverManager.edgedriver().setup();
//WebDriver driver=new EdgeDriver();
	WebDriver driver=new FirefoxDriver();
	}

}
