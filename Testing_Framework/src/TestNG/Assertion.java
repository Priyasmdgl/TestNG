package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {

	String task="Assertion";
	@Test
	public void check() {
		Assert.assertEquals(task, "Assertion");
		Assert.assertNotEquals(task, "assertion");
	}
}