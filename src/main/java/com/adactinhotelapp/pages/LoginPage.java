package com.adactinhotelapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Page {
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory
	
	//@FindBy
	
	@FindBy(xpath="//input[@name='username']")
	WebElement usernameTextBox;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordTextBox;
	
	@FindBy(xpath="//input[@name='login']")
	WebElement loginButton;
	
	@FindBy(xpath = "//a[text()='New User Register Here']")
	WebElement registerLink;
	
	
	@FindBy(xpath = "//a[text()='Forgot Password?']")
	WebElement forgotPasswordLink;
	
	
	public void usernameTextBox(String text)
	{
		
		type(usernameTextBox, text);
		
	}
	
	
	public void passwordTextBox(String text)
	{
		
		type(passwordTextBox, text);
		
	}
	
	public void loginButton()
	{
		click(loginButton);
	}
	
	
	public void registerLink()
	{
		click(registerLink);
	}
	
	public void forgotPasswordLink()
	{
		click(forgotPasswordLink);
	}

}
