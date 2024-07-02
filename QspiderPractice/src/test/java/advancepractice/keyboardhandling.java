package advancepractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyboardhandling {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://saucedemo.com/v1/");
		driver.manage().window().maximize();
		//driver.findElement(By.name("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);
		//driver.findElement(By.name("password")).sendKeys("secret_sauce",Keys.ENTER);
		//driver.findElement(By.name("user-name")).sendKeys("standard_user");
		//Robot rob = new Robot();
		//rob.keyPress(KeyEvent.VK_CONTROL);
		//rob.keyPress(KeyEvent.VK_A);
		//rob.keyRelease(KeyEvent.VK_A);
		//rob.keyRelease(KeyEvent.VK_CONTROL);
		//rob.keyPress(KeyEvent.VK_CONTROL);
		//rob.keyPress(KeyEvent.VK_C);
		//rob.keyRelease(KeyEvent.VK_C);
		//rob.keyRelease(KeyEvent.VK_CONTROL);
		//rob.keyPress(KeyEvent.VK_COPY);
		//rob.keyPress(KeyEvent.VK_COPY);
		//rob.keyPress(KeyEvent.VK_TAB);
		//rob.keyRelease(KeyEvent.VK_TAB);
	//rob.keyPress(KeyEvent.VK_PASTE);
		//rob.keyRelease(KeyEvent.VK_PASTE);
	//	driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("secret_sauce");
		//rob.keyPress(KeyEvent.VK_ENTER);
		//rob.keyRelease(KeyEvent.VK_ENTER);
		//rob.keyPress(KeyEvent.VK_CONTROL);
		//rob.keyPress(KeyEvent.VK_V);
		//rob.keyRelease(KeyEvent.VK_V);
		//rob.keyRelease(KeyEvent.VK_CONTROL);
		 WebElement tad = driver.findElement(By.name("user-name"));
		 tad.sendKeys("standard_user");
		 tad.sendKeys(Keys.CONTROL, "a");
		 tad.sendKeys(Keys.CONTROL,"c");
		 WebElement mag = driver.findElement(By.name("password"));
		 mag.sendKeys(Keys.CONTROL,"v");
		
	}

}
