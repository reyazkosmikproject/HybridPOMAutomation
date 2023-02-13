package com.adactinhotelapp.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Registerpage1 extends Registerpage{
	
	public Registerpage1()
	{
		PageFactory.initElements(driver, this);
	}
	@Test
	public void run() {
		Registerpage obj = new Registerpage();
		obj.registerbtn();
		obj.username("mahesh");
		obj.password("mahesh123");
		obj.confirmpassword("mahesh123");
		obj.fullname("maheshraju");
		obj.emailaddress("maheshraju@gmail.com");
		obj.captchatext("xyz123");
		obj.termsconditions();
		obj.registerbtn();
	}
	
	
	
	
}
