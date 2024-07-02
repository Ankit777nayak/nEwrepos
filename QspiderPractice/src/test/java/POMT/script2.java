package POMT;

import org.testng.annotations.Test;

public class script2 extends basclass{
	@Test
	public void mainscrip() throws InterruptedException {
		Homepagepom hp=new Homepagepom(driver);
		Registerpagepom rp=new Registerpagepom(driver);
		hp.getRegisterlink().click();
		rp.getMale().click();
		rp.getFname().sendKeys("Ankit");
		rp.getLname().sendKeys("Nayak");
		Thread.sleep(2000);
	}

}
