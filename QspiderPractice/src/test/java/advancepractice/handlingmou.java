package advancepractice;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingmou {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com ");
		WebElement ele = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		ele.click();
		Thread.sleep(2000);
	//
		//WebElement tag = driver.findElement(By.cssSelector("[title=\"Day\"]"));
		//tag.sendKeys(Keys.ARROW_UP);
		//tag.sendKeys(Keys.ARROW_DOWN);
		//tag.sendKeys(Keys.ARROW_DOWN);
		//tag.sendKeys(Keys.ARROW_DOWN);
		//tag.sendKeys(Keys.ARROW_DOWN);
	//	WebElement lop = driver.findElement(By.cssSelector("[name=\"birthday_month\"]"));
		//lop.sendKeys(Keys.ARROW_DOWN);
		//lop.sendKeys(Keys.ARROW_DOWN);
		//lop.sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.cssSelector("[name=\"birthday_year\"]")).click();

	Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_UP);
		robot.keyRelease(KeyEvent.VK_UP);
		
	}

}
