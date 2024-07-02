package genericlib;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class integration extends baseclass{
	@Test
	public void integrate() throws InterruptedException {
		Reporter.log("integration",true);
		driver.findElement(By.xpath("//a[text()='YouTube']")).click();
		Reporter.log("youtube opened",true);
		Thread.sleep(2000);
	}

}
