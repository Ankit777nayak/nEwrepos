package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("http://saucedemo.com/v1/");
driver.manage().window().maximize();
//driver.findElement(By.name("user-name")).sendKeys("standard_user");
//driver.findElement(By.name("password")).sendKeys("secret_sauce");
//driver.findElement(By.className("btn_action")).click();
//driver.findElement(By.cssSelector(.click();	}
//driver.findElement(By.cssSelector("[data-test=\"username\"]")).sendKeys("sauce-user");
//driver.findElement(By.cssSelector("input[placeholder=\"Username\"]")).sendKeys("sauce-user");
//driver.findElement(By.cssSelector("input.form_input")).sendKeys("sauce_user");
//driver.findElement(By.xpath("html/body/div[2]/div[1]/div[1]/div/form/input[2]")).sendKeys("secret");

	}
}
