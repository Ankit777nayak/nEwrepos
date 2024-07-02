	package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://flipkart.com");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//span[text()=\"Grocery\"]")).click()	;
		//driver.findElement(By.xpath("//img[@alt=\"Grocery\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]")).sendKeys("iphone",Keys.ENTER);
	
		}

}
