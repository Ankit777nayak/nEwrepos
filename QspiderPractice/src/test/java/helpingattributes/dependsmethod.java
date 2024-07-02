package helpingattributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsmethod {
	@Test
	public void Login(){
		Reporter.log("user is logging in",true);
	}
	@Test(dependsOnMethods = "Login")
	public void Addcart() {
		Reporter.log("user add product to cart", true);
	}
	@Test(dependsOnMethods = "Login")
	public void Logout() {
		Reporter.log("user has logout", true);
	}
}
