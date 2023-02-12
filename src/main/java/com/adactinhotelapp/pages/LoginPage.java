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
	

}
