package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class oroperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='q' or @class='Pke_EE']")).sendKeys("teddy");
		driver.findElement(By.xpath("//button[contains(title,'Search for Products, Brands and More') or contains(@class,'_2iLD__')]")).click();	}

}
