package com.adactinhotelapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopMenu extends Page{
	
	WebDriver driver;
	
	
	@FindBy(xpath="//a[text()='Search Hotel']")
	WebElement searchHotelLink;
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	WebElement bookedItineraryLink;
	
	@FindBy(xpath="//a[text()='Change Password']")
	WebElement changePasswordLink;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logoutLink;
	
	
	
	public SearchHotelPage searchHotelLink()
	{
		
		click(searchHotelLink);
	
		return new SearchHotelPage();
		
	}
	
	public BookedItineryPage bookedItineraryLink()
	{
		
		click(bookedItineraryLink);
	
		return new BookedItineryPage();
		
	}
	
	
	public ChangePasswordPage changePasswordLink()
	{
		
		click(changePasswordLink);
	
		return new ChangePasswordPage();
		
	}
	
	
	public LogoutPage logoutLink()
	{
		
		click(logoutLink);
	
		return new LogoutPage();
		
	}
	

}
