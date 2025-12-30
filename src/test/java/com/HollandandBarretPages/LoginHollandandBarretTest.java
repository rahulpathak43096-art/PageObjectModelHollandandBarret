package com.HollandandBarretPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginHollandandBarretTest {
	WebDriver driver;
	public  LoginHollandandBarretTest(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(id = "username")
	WebElement Emailaddress;
	
	@FindBy(name = "password")
	WebElement Password;
	
	@FindBy(xpath = "//button[normalize-space()='Sign In']")
	WebElement SignIn;
	
	public void login_EasyCal(String uname,String pass) {
		Emailaddress.sendKeys(uname);
		Password.sendKeys(pass);
		SignIn.click();
	}


}
