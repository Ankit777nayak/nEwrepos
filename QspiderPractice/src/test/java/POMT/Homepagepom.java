package POMT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepagepom {
	public Homepagepom(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="small-searchterms")
	private WebElement searchbox;
	@FindBy(partialLinkText = "Books")
	private WebElement booklink;
	@FindBy(linkText = "Jewelry")
	private WebElement jwellerylink;
	@FindBy(partialLinkText = "Register")
	private WebElement registerlink;
	public WebElement getRegisterlink() {
		return registerlink;
	}
	public WebElement getSearchbox() {
		return searchbox;
	}
	public WebElement getBooklink() {
		return booklink;
	}
	public WebElement getJwellerylink() {
		return jwellerylink;
	}

}
