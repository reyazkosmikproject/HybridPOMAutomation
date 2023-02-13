package com.adactinhotelapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SamplePage {
	
	@FindBy(xpath="//input[@id='abc']")
	WebElement element1;

}
