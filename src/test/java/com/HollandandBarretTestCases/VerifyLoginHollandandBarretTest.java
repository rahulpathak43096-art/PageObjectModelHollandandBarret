package com.HollandandBarretTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.HollandandBarretPages.LoginHollandandBarretTest;

import library.Reusability;
import utility.Helper;

public class VerifyLoginHollandandBarretTest {
	public WebDriver driver;
	@Test
	public void CheckValidUser() {
		WebDriver driver = Helper.startBrowser("chrome", "https://auth.hollandandbarrett.com/u/login?");
		Reusability.capturesscreenshot(driver,"Step1. Login to PracticeTestAutomation Application");
		LoginHollandandBarretTest loginSauceDemo = PageFactory.initElements(driver,LoginHollandandBarretTest.class);
		loginSauceDemo.login_EasyCal("8076995880", "gautam");
		
		Reusability.capturesscreenshot(driver,"Step2. Logout to  Application");
		
	    driver = Helper.startBrowser("FF", "https://auth.hollandandbarrett.com/u/login?");
		Reusability.capturesscreenshot(driver,"Step1. Login to PracticeTestAutomation Application");
		LoginHollandandBarretTest loginSauceDe = PageFactory.initElements(driver,LoginHollandandBarretTest.class);
		loginSauceDe.login_EasyCal("8076995880", "gautam");
		
		Reusability.capturesscreenshot(driver,"Step2. Logout to  Application");
		
		driver = Helper.startBrowser("Edge", "https://auth.hollandandbarrett.com/u/login?");
		Reusability.capturesscreenshot(driver,"Step1. Login to PracticeTestAutomation Application");
		LoginHollandandBarretTest loginSauceDem = PageFactory.initElements(driver,LoginHollandandBarretTest.class);
		loginSauceDem.login_EasyCal("8076995880", "gautam");
		
		Reusability.capturesscreenshot(driver,"Step2. Logout to  Application");	
  }
}
