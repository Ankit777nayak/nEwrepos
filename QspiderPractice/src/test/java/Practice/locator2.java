package Practice;

import org.checkerframework.checker.index.qual.SearchIndexBottom;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator2 {

	public static void main(String[] args) throws Throwable  {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
//driver.get("http://amazon.in");
//driver.findElement(By.name("field-keywords")).sendKeys("pump");
//driver.findElement(By.id("nav-search-submit-button")).click();
//driver.findElement(By.cssSelector("[placeholder=\"Search Amazon.in\"]")).sendKeys("puma");
//driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
//String te = driver.findElement(By.linkText("Men's Lesfly Slipper")).getText();
//System.out.println(te);
//driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("nike");
//driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();
//driver.findElement(By.cssSelector(".nav-input nav-progressive-attribute")).sendKeys("box");
//WebElement names = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
//names.sendKeys("puma");
//names.submit();

	//Thread.sleep(2000);

//names.clear();
//names.sendKeys("bluetooth",Keys.ENTER);
//WebElement nap = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
//System.out.println(nap.getSize().getHeight());
//System.out.println(nap.getSize().getWidth());
//System.out.println(nap.getLocation().getY());
//System.out.println(nap.getLocation().getX());
//System.out.println(nap.getRect().getX());
//System.out.println(nap.getRect().getWidth());
driver.get("http://facebook.com");
WebElement sup = driver.findElement(By.xpath("//img[contains(@class,'fb_logo _8ilh img')]"));
if(sup.isDisplayed()) {
	System.out.println("it is displayed");
}
else {
	System.out.println("not displayed");
}
Thread.sleep(2000);
WebElement num = driver.findElement(By.xpath("//a[text()='Create new account']"));
if(num.isEnabled()) {
	num.click();
	
}
else {
	System.out.println("element is not enabled");
}
Thread.sleep(2000);
WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
radio.click();

if(radio.isSelected()) {
	System.out.println("is displayed");
	
}
else {
	System.out.println("not displayed");
}
	}

}
