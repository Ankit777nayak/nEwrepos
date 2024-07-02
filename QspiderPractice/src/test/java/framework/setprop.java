package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setprop {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://saucedemo.com/v1/");
		driver.manage().window().maximize();
		FileInputStream ram = new FileInputStream("C:\\Users\\LEGION\\Desktop\\PropertyData.properties.txt");
	Properties sup = new Properties();
      sup.load(ram);
      sup.getProperty("url", "http://saucedemo.com/v1/");
      sup.setProperty("username", "standard_user");
      sup.setProperty("password", "secret_sauce");
     FileOutputStream tap = new FileOutputStream("C:\\\\Users\\\\LEGION\\\\Desktop\\\\PropertyData.properties.txt");
     sup.store(tap, "coomondata");
	}
}
