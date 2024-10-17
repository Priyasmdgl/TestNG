package TestNG;

import org.testng.annotations.Test;

public class SettingPriority {
    @Test(priority=0)
	public void install() {
		System.out.println("Install TestNG");
	}
    @Test(priority=1)
	public void create() {
		System.out.println("Create Package");
	}
    @Test(priority=2)
	public void create_() {
		System.out.println("Create Class");
	}
    @Test(priority=3)
	public void test() {
		System.out.println("Create testcases and run the test");
	}
}
