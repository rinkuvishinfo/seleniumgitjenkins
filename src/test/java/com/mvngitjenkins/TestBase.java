package com.mvngitjenkins;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public static void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		System.out.println("============= BROWSER OPEN SECCESSFULLY =============");
	}
	
	
	@AfterMethod
	public static void tearDown() {
		if(driver != null) {
			driver.quit();
			System.out.println("============= BROWSER CLOSE SECCESSFULLY =============");
		}
	}

}
