package advancepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectlll {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com ");
		WebElement ele = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		ele.click();
		Thread.sleep(2000);
	//
		WebElement tag = driver.findElement(By.cssSelector("[title=\"Day\"]"));
		Select sal=new Select(tag);
		sal.selectByIndex(14);
		WebElement tag1 =  driver.findElement(By.cssSelector("[name=\"birthday_month\"]"));
		Select sel = new Select(tag1);
		//sel.selectByValue("12");
		sel.selectByVisibleText("Dec");
		WebElement nap = driver.findElement(By.cssSelector("[name=\"birthday_year\"]"));
	Select som=new Select(nap);
	som.selectByVisibleText("2005");
	}

}
