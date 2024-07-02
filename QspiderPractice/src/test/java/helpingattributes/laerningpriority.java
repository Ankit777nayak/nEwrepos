package helpingattributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class laerningpriority {
	@Test(priority = 1)
	public void Login(){
		Reporter.log("user is logging in",true);
	}
	@Test(priority = 2,invocationCount = 3)
	public void Addcart() {
		Reporter.log("user add product to cart", true);
	}
	@Test(priority = 3)
	public void Logout() {
		Reporter.log("user has logout", true);
	}

}
