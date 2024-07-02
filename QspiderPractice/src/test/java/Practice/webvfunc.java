package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webvfunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.in");
//WebElement bar = driver.findElement(By.name("field-keywords"));
//System.out.println(bar.getTagName());
WebElement link = driver.findElement(By.xpath("//a[text()=\"Amazon miniTV\"]"));
System.out.println(link.getTagName());
//System.out.println(link.getAttribute("class"));
//System.out.println(link.getAttribute("href"));
//System.out.println(bar.getAriaRole());
//WebElement text = driver.findElement(By.xpath("//a[text()='New Releases']"));
//System.out.println(text.getDomAttribute("tabindex"));
//System.out.println(text.getDomProperty("localName"));
		//WebElement searchbar = driver.findElement(By.xpath("//img[@alt='Budget store']"));
	//System.out.println(searchbar.getCssValue("color"));
	//System.out.println(searchbar.getCssValue("font-size"));
	//WebElement link = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_bestsellers']"));
	//System.out.println(link.getAccessibleName());
	//System.out.println(link.getText());
	}

}
