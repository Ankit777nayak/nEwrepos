package advancepractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class advancesuggestion {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://flipkart.in");
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("puma");
		Thread.sleep(2000);
		List<WebElement> mango = driver.findElements(By.xpath("//ul[@class=\"_1sFryS _2x2Mmc _3ofZy1\"]//li"));
		for (WebElement apple : mango) {
			String element = apple.getText();
			if(element.contains("puma slippers men")){
				apple.click();
			break;	
			}
			System.out.println(apple.getText());
		}
	}

}
