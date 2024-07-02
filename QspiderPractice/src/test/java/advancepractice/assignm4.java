package advancepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignm4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.in");
		 driver.findElement(By.cssSelector("[id=\"nav-link-accountList\"]")).click();
		 driver.findElement(By.cssSelector("[type=\"email\"]")).sendKeys("kumarankitnayak@gmail.com",Keys.ENTER);
		 driver.findElement(By.cssSelector("[type=\"password\"]")).sendKeys("Ankit@777",Keys.ENTER);
		 
		
		
	}

}
