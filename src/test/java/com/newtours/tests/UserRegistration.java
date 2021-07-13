package com.newtours.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.newtours.pages.RegistrationPage;

public class UserRegistration {
	
	private WebDriver driver;
	
	@BeforeTest
	public void setupDriver() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		this.driver = new ChromeDriver();
	}
	
	@Test
	public void registrationPageTest() {
		RegistrationPage reg = new RegistrationPage(driver);
		reg.goTo();
		reg.enterUserDetails("John", "Smith");
		reg.enterUserCredentials("smith", "pass=1234");
		reg.submit();
		
	}
	
	@AfterTest
	public void closeBrowser() {
		this.driver.close();
		this.driver.quit();
	}

}
