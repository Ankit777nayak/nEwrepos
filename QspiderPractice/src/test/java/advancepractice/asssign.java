package advancepractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class asssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
			WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/ ");
	}

}
