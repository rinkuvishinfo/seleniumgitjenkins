package com.mvngitjenkins;

import java.lang.reflect.Method;

import org.testng.annotations.Test;


public class SampleTestCase extends TestBase{
	
	
	
	
	
	@Test(priority = 1)
	public void veriyPageTitle_01(Method method) {
		driver.get("https://www.google.com");
		String pageTitle = driver.getTitle();
		System.out.println("============= PAGE TITLE IS "+pageTitle);
		System.out.println("Test '"+method.getName()+ "' Completed");
	}
	
	
	@Test(priority = 2)
	public void veriyCurrentURL_02() {
		driver.get("https://www.google.com");
		String currentURL = driver.getCurrentUrl();
		System.out.println("============= CURRENT URL IS "+currentURL);
	}
	
	

}
