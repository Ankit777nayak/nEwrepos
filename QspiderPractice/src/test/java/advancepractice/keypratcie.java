package advancepractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.peer.RobotPeer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keypratcie {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.in");
		//driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("puma",Keys.ENTER);
		//driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("nike");
		//Robot rob=new Robot();
		//rob.keyPress(KeyEvent.VK_ENTER);
		//rob.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
