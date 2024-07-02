package advancepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class newpracxticemouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//driver.get("http://saucedemo.com/v1/");
		//driver.get("https://jqueryui.com/resources/demos/droppable/default.html ");
		//driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.get("http://goibibo.com");
		driver.manage().window().maximize();
		// WebElement ola = driver.findElement(By.name("user-name"));
		//WebElement tab = driver.findElement(By.name("password"));
		
		//act.sendKeys(ola,"standard_user").perform();
		//act.sendKeys(tab,"secret_sauce").perform();
//act.sendKeys(ola,"standard_user").sendKeys(tab,"secret_sauce").build().perform();	
	//WebElement up = driver.findElement(By.id("draggable"));
	//WebElement down = driver.findElement(By.id("droppable"));
	//Actions act =new Actions(driver);
	//act.clickAndHold(up);
	//act.dragAndDrop(up, down).perform();
		//WebElement ele = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		//Actions act =new Actions(driver);
		//act.doubleClick(ele).perform();
		Actions act =new Actions(driver);
		act.moveByOffset(20,40).click().perform();
		
	}

}
