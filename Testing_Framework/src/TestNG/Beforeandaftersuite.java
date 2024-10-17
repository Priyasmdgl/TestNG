package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Beforeandaftersuite {
	//declaring the driver at class level so that it can be accessed by each test cases
	WebDriver driver;
	Long startTime;
	Long endTime;
	@BeforeSuite
	public void openBrowser() {
		startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void openGoogle() {
		driver.get("https://www.google.com");
	}
	@Test
	public void openBing() {
		driver.get("https://www.bing.com/");
	}
	@Test
	public void openYahoo() {
		driver.get("https://www.yahoo.com");
	}
	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		endTime = System.currentTimeMillis();
		Long totalTime = endTime-startTime;
		System.out.println(totalTime);
	}
}
