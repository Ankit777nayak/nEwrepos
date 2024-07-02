package Practice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class assingment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://flipkart.com");
		driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]")).sendKeys("iphone");
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	List<WebElement> allnames = driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));
	
		for (WebElement name : allnames) {
		System.out.println(name.getText());	
			
		}
			
		
	
		
		
	}

}
