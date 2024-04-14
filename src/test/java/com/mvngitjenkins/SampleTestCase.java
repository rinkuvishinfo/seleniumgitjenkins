package com.mvngitjenkins;

import org.testng.annotations.Test;


public class SampleTestCase extends TestBase{
	
	
	
	
	
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
	
	

}
