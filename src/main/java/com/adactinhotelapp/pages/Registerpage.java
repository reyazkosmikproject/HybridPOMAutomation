package com.adactinhotelapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Registerpage extends Page{

	
	public Registerpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@id=\"username\"]")
	WebElement username;
	
	@FindBy(xpath="//input[@id=\"password\"]")
	WebElement password;
	
	@FindBy(xpath="//input[@id=\"re_password\"]")
	WebElement confirmpass;
	
	@FindBy(xpath="//input[@id=\"full_name\"]")
	WebElement fullname;
	
	@FindBy(xpath="//input[@id=\"email_add\"]")
	WebElement email;
	
	@FindBy(xpath="//input[@id=\"captcha-form\"]")
	WebElement captcha;
	
	@FindBy(xpath="//input[@id=\"tnc_box\"]")
	WebElement agree;
	
	@FindBy(xpath="//input[@id=\"Submit\"]")
	WebElement submit;
	
	@FindBy(xpath="//input[@id=\"Reset\"]")
	WebElement resetBtn;
	
	
	public void username(String user) {
		type(username, user);
	}
	
	public void password(String pass) {
		type(password, pass);
	}
	
	public void confirmpassword(String confpass) {
		type(confirmpass, confpass);
	}
	
	public void fullname(String fname) {
		type(fullname,fname);
	}
	
	public void emailaddress(String eadd) {
		type(email, eadd);
	}
	
	public void captchatext(String captext) {
		type(captcha, captext);
	}
	
	public void termsconditions() {
		click(agree);
	}
	
	public void register() {
		click(submit);
	}
	

	
}
