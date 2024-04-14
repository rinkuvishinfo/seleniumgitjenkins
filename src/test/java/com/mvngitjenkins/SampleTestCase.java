package com.mvngitjenkins;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTestCase {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public static void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		System.out.println("============= BROWSER OPEN SECCESSFULLY =============");
	}
	
	@Test(priority = 1)
	public void veriyPageTitle_01() {
		driver.get("https://www.google.com");
		String pageTitle = driver.getTitle();
		System.out.println("============= PAGE TITLE IS "+pageTitle);
	}
	
	
	@Test(priority = 2)
	public void veriyCurrentURL_02() {
		driver.get("https://www.google.com");
		String currentURL = driver.getCurrentUrl();
		System.out.println("============= CURRENT URL IS "+currentURL);
	}
	
	@AfterMethod
	public static void tearDown() {
		if(driver != null) {
			driver.quit();
			System.out.println("============= BROWSER CLOSE SECCESSFULLY =============");
		}
	}

}
