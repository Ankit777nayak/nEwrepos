package advancepractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class handlingsugg {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://Amazon.in");
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("samsung");
		//Thread.sleep(2000);
		List<WebElement> element = driver.findElements(By.xpath("//div[@class='s-suggestion-container']//div"));
	for (WebElement name : element) {
		
		String tag = name.getText();
		if(tag.contains("samsung s23")) {
			name.click();
			break;
		}
		System.out.println(name.getText());
	}
	
	}

}
