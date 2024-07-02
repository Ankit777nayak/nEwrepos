package genericlib;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class mainscript extends baseclass {
	@Test
	public void script() throws InterruptedException {
		Reporter.log("main script");
		
		driver.findElement(By.partialLinkText("Books")).click();
		Reporter.log("books checked",true);
		Thread.sleep(2000);
		
	}

}
