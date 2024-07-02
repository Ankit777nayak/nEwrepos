package framework;

import org.testng.annotations.Test;

public class Testngex {
	@Test
	public void createContact() {
		System.out.println("contact is created");
	}
	@Test(dependsOnMethods = "createContact")
	public void modifyContact() {
		System.out.println("aiger");
	}
	@Test(dependsOnMethods = "createContact")
	public void deleteContact() {
		System.out.println("diger");
	}

}
