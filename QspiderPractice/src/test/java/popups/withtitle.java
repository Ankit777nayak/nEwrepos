package popups;

import java.time.Duration;
import java.util.Set;

import javax.swing.border.TitledBorder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class withtitle {

	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		driver.findElement(By.cssSelector("[class=\"btn btn-primary\"]")).click();
		Set<String> win = driver.getWindowHandles();
		for (String allid : win) {
			driver.switchTo().window(allid);
			String ton = driver.getTitle();
			System.out.println(ton);
			if ( ton.contains("Selenium")) {
				
			 
				break;
				
			}
			
		}
		
		driver.findElement(By.xpath("//span[text()='Projects']")).click();
	}

}
