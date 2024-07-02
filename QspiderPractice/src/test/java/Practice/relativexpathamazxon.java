package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativexpathamazxon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@aria-label=\"Search Amazon.in\"]")).sendKeys("nike");
		//driver.findElement(By.xpath("//input[@value=\"Go\"]")).click();
		//String ola = driver.findElement(By.xpath("//span[text()=\"Mens Revolution 7 EasyonRunning Shoe\"]")).getText();
		//System.out.println(ola);
		driver.findElement(By.xpath("//input[contains(@id,\"twotabsearchtextbox\")]")).sendKeys("bluetooth");
		driver.findElement(By.xpath("//input[contains(@id,\"nav-search-submit-button\")]")).click();
		//driver.findElement(By.xpath("//span[contains(text(),\"Mens Revolution 7Running Shoe\")]")).click();
		List<WebElement> sup = driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
		for (WebElement num : sup) {
			System.out.println(num.getText());
			
		}
			
		List<WebElement> ola = driver.findElements(By.xpath("//span[@class=\"a-price-whole\"]"));
		for (WebElement turn : ola) {
			System.out.println(turn.getText());
			
		}
	}

}
