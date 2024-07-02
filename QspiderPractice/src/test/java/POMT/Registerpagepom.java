package POMT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerpagepom {
public Registerpagepom(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(id = "gender-male")
private  WebElement male;
@FindBy(id="FirstName")
private WebElement fname;
@FindBy(id = "LastName")
private WebElement lname;
public WebElement getMale() {
	return male;
}
public WebElement getFname() {
	return fname;
}
public WebElement getLname() {
	return lname;
}
}
