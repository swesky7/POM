package com.testNg.com.testNg_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.testNg.lib.AppLib;

public class AbstractBaseTest {
	
	WebDriver driver;
	private AppLib app;
	
	@BeforeTest
	public void setUp() throws Exception {
		//System.setProperty("webdriver.chrome.driver", "/Users/mayurdeshmukh/Documents/Drivers/chromedriver");
		driver = new ChromeDriver();
		app = new AppLib(driver);
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
	
	public AppLib App() {
		return app;
	}

}
