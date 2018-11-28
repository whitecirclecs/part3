package com.demoaut.newtours.MavenPArt4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyTitle {
	WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		ChromeOptions ChromeOptions = new ChromeOptions();
		ChromeOptions.addArguments("--headless", "window-size=1024,768", "--no-sandbox");
		driver = new ChromeDriver(ChromeOptions);	
		driver.manage().window().maximize();
		driver.get("https://whitecircleschool.com/");		
	}
	
	@Test
	public void titleVerification() {
		String expectedTitle = "White Circle Code School";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
	
	

}
