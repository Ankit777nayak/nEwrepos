package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windowhandlingex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://naukri.com");
		WebElement tag = driver.findElement(By.xpath("//div[text()='Jobs']"));
		Actions act = new Actions(driver);
		act.moveToElement(tag).perform();
		driver.findElement(By.xpath("//div[text()='Jobs by skill']")).click();
		driver.findElement(By.xpath("//div[text()='Services']")).click();
		String sap = driver.getWindowHandle();
		System.out.println(sap);
		Set<String> nat = driver.getWindowHandles();
		for (String str : nat) {
			if(!sap.equals(str)) {
				driver.switchTo().window(str);
				driver.findElement(By.xpath("//span[text()='RESUME WRITING']")).click();
			}
			
		}
	}

}
