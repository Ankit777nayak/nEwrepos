package genericlib;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class functional extends baseclass {
	@Test
	public void computer() {
		Reporter.log("computer checking",true);
		driver.findElement(By.partialLinkText("Computers")).click();
		Reporter.log("computer clicked",true);
		
	}

}
