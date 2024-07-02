package listeners;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Script1 extends Baseclass{
	@Test
	public void script() throws InterruptedException {
		driver.findElement(By.linkText("read")).click();
		Thread.sleep(2000);
		
	}

}
