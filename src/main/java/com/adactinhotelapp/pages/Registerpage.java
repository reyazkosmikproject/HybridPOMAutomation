package com.adactinhotelapp.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Registerpage extends Page{

	
	public Registerpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@BeforeTest
	public void reg() {
	driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	@FindBy(xpath="//td[@class=\"login_register\"]")
	WebElement registerbtn;
	
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
	
	public void registerbtn() {
		click(registerbtn);
	}
	
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
