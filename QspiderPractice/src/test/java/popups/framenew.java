package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framenew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://demo.automationtesting.in/Frames.html");
//driver.switchTo().frame(0);
//driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("welcome");
//driver.switchTo().frame("singleframe");
//driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("tiger");
WebElement ton = driver.findElement(By.xpath("//iframe[@id=\"singleframe\"]"));
driver.switchTo().frame(ton);
driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("tiggy");

	}

}
