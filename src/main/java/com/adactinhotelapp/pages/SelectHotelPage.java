package com.adactinhotelapp.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectHotelPage extends Page {
	
	@FindBy(xpath="//input[@name='radiobutton_0']")
	WebElement radioButton;
	
	
	@FindBy(xpath="//input[@name='continue']")
	WebElement continueButton;
	
	@FindBy(xpath="//input[@name='cancel']")
	WebElement cancelButton;
	
	
	public void radioButton()
	{
		click(radioButton);
	}
	
	public void continueButton()
	{
		click(continueButton);
	}
	
	public void cancelButton()
	{
		click(cancelButton);
	}
	
	public void verifySelectHotelDetails(String location,String noOfRooms,String arrDate,String depDate)
	{
		
		List<WebElement> allRows=driver.findElements(By.xpath("//form[@name='select_form']/table/tbody/tr[2]/descendant::tr"));
		
		for(int i=1;i<allRows.size();i++)
		{
			
			verifyEquals(driver.findElement(By.xpath("//form[@name='select_form']/table/tbody/tr[2]/descendant::tr/td/input[starts-with(@name,'location_"+"i"+"')]")).getAttribute("value"), location);
			
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
