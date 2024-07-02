package advancepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class handlingspgelem {
@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://kayak.co.in");
		driver.findElement(By.xpath("//*[name()='svg' and @class=\"oLv- oLv--mod-saved\"]")).click();
	}

}
