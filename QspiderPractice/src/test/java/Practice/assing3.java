package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assing3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("http://Bigbasket.com");
driver.manage().window().maximize();
driver.findElement(By.xpath("(//input[@placeholder=\"Search for Products...\"])[2]")).sendKeys("apples",Keys.ENTER);
	}

}
