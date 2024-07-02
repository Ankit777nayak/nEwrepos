package framework;



import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class hardassert {
	@Test
public void m1() {
	System.out.println("step1");
	System.out.println("step2");
	SoftAssert soft= new SoftAssert();
	soft.assertEquals("a", "a");
	//Assert.assertEquals(false, false);
	System.out.println("test3");
	soft.assertAll();
}
	@Test
	public void m2() {
		String ab = "tiger";
		String cb = "Tiger";
		//Assert.assertEquals(ab, cb);
		SoftAssert soft= new SoftAssert();
		
		soft.assertEquals(ab, cb);
		soft.assertAll();
	}
}
