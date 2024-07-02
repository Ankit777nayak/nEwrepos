package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://the-internet.herokuapp.com/frames");
		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		WebElement top = driver.findElement(By.xpath("//frame[@name='frame-top']"));
		driver.switchTo().frame(top);
		WebElement left = driver.findElement(By.xpath("//frame[@name=\"frame-left\"]"));
		driver.switchTo().frame(left);
		String lap = driver.findElement(By.xpath("//body[contains(text(),'LEFT')] ")).getText();
		System.out.println(lap);
		driver.switchTo().parentFrame();
		WebElement log = driver.findElement(By.xpath("//frame[@name=\"frame-middle\"]"));
		driver.switchTo().frame(log);
		String pag = driver.findElement(By.xpath("//div[contains(text(),'MIDDLE')]")).getText();
		System.out.println(pag);
	}

}
