package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertpopup {
@Test
	public  void alert(){
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts ");
		//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	//Alert tag = driver.switchTo().alert()	;
	//tag.accept();
		/*driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Alert lab = driver.switchTo().alert();	
		//lab.dismiss();
		String max = lab.getText();
		System.out.println(max);*/
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert cal = driver.switchTo().alert();
		cal.sendKeys("thanks you");
		cal.accept();
		
	}

}
