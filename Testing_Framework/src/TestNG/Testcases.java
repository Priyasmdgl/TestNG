package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcases {
//open google and then go to google,bing,yahoo and close the browser and also finding the time taken to perform the operation
	@Test
	public void openGoogle() {
		Long startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.quit();
		//calculating the total time taken to execute the operation
		Long endTime = System.currentTimeMillis();
		Long totalTime = endTime-startTime;
		System.out.println(totalTime);
	}
	@Test
	public void openBing() {
		Long startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.quit();
		Long endTime = System.currentTimeMillis();
		Long totalTime = endTime-startTime;
		System.out.println(totalTime);
	}
	@Test
	public void openYahoo() {
		Long startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yahoo.com");
		driver.quit();
		Long endTime = System.currentTimeMillis();
		Long totalTime = endTime-startTime;
		System.out.println(totalTime);
	}
}
