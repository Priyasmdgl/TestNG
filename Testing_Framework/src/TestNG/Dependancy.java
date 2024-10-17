package TestNG;

import org.testng.annotations.Test;

public class Dependancy {
	@Test(enabled=true)
	public void install() {
		System.out.println("Install TestNG");
	}
    @Test(dependsOnMethods = "install")
	public void create() {
		System.out.println("Create Package");
	}
    @Test(dependsOnMethods = "create")
	public void create_() {
		System.out.println("Create Class");
	}
    @Test(dependsOnMethods = "create_")
	public void test() {
		System.out.println("Create testcases and run the test");
    }
}

