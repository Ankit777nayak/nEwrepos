package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class capatchhandlingscreenshot {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://www.prokabaddi.com/standings");
		WebElement lon = driver.findElement(By.xpath("//p[text()='Jaipur Pink Panthers']/ancestor::div[@class=\"table-data team\"]/following-sibling::div[@class=\"table-data matches-play\"]"));
	String nap = lon.getText();
	System.out.println(nap);
	Thread.sleep(2000);
	WebElement mag = driver.findElement(By.xpath("//p[text()='Jaipur Pink Panthers']/ancestor::div[@class=\"table-data team\"]/following-sibling::div[@class=\"table-data matches-won\""));
	String top = mag.getText();
	System.out.println(top);
	}

}
