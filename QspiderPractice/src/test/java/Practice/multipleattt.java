package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleattt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text'and@class='nav-input nav-progressive-attribute']")).sendKeys("cycles");
		driver.findElement(By.xpath("//span[@id='nav-search-submit-text'and @class='nav-search-submit-text nav-sprite nav-progressive-attribute']")).click();
	}

}
