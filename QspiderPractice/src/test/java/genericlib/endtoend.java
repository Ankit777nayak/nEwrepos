package genericlib;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class endtoend extends baseclass {
	
	@Test
	public void end() throws InterruptedException {
		Reporter.log("testing end to end",true);
		driver.findElement(By.partialLinkText("Jewelry")).click();
		Reporter.log("jwellery clicked",true);
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		Reporter.log("added to cart",true);
		Thread.sleep(2000);
	}

}
