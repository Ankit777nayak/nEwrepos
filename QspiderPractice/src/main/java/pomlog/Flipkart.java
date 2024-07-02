package pomlog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class Flipkart {
	public Flipkart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	
	
	@FindBys({@FindBy(name="q"),@FindBy(xpath="//input[@title='Search for Products, Brands and More']")})
	private WebElement searchTextField;

	

	public WebElement getSearchTextField() {
		return searchTextField;
	}
	
	public void methodText(String name)
	{
		searchTextField.sendKeys(name);
	}
	
	
}

