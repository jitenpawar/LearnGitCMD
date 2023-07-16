package com.qa.BookitAdminPortal.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.DriverSetup;

public class LoginPage extends DriverSetup{
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);          // Due to this Global variable will be equal to local variable
		                                                // WebDriver driver = driver(Local variable)
	}
	
	@FindBy(xpath="//span[contains(text(),'Login')]")
	private WebElement login_page;
	
	@FindBy(xpath="//input[@id='text-field-email']")
	private WebElement email_address;
	
	@FindBy(xpath="//input[@id='text-field-password']")
	private WebElement password;
	
	@FindBy(xpath="//span[contains(text(),'Login')]")
	private WebElement login_button;
	
	public void navigateToLoginPage()
	{
		login_page.click();
	}
	
	public void enterEmailAddress(String email)
	{
		email_address.clear();
		email_address.sendKeys(email);
	}
	
	public void enterPassword(String pass)
	{
		password.clear();
		password.sendKeys(pass);
	}
	
	public void clickOnLoginButton()
	{
		login_button.click();
	}

}
