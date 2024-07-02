package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativexpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@data-test=\"username\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	}

}
