package advancepractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlingmultiplelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://amazon.in");
List<WebElement> alltag = driver.findElements(By.xpath("//a"));
int count=0;
for (WebElement tag : alltag) {
	//System.out.println(tag.getText());
	System.out.println(tag.getAttribute("href"));
	count++;
}
System.out.println("total counts="+count);
	}

}
