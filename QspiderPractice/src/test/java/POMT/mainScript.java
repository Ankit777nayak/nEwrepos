package POMT;

import org.testng.annotations.Test;

public class mainScript extends basclass {
	@Test
	public  void launch() throws InterruptedException {
		Homepagepom hp= new Homepagepom(driver);
		hp.getBooklink().click();
		Thread.sleep(2000);
		
	}

}
