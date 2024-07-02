package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.in");
		//driver.findElement(By.linkText("Amazon miniTV")).click();
		//driver.findElement(By.partialLinkText("Amazon m")).click();
		//driver.findElement(By.partialLinkText("Today's Deals")).click();
		driver.findElement(By.cssSelector("[href=\"/gp/bestsellers/?ref_=nav_cs_bestsellers\"]")).click();
	}

}
