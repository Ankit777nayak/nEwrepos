package advancepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hasndlingmouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.in");
		WebElement nap = driver.findElement(By.xpath("//a[text()='Mobiles']"));
	Actions act = new Actions(driver);
	act.moveToElement(nap).perform();	
	act.contextClick(nap).perform()
;	}

}
