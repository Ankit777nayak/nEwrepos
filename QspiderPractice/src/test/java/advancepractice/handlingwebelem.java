package advancepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingwebelem {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com ");
		WebElement ele = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		ele.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='Oct']")).click();
		driver.findElement(By.xpath("//option[@value=\"2023\"]")).click();
		driver.findElement(By.xpath("//option[@value=\"20\"]")).click();
	}

}
