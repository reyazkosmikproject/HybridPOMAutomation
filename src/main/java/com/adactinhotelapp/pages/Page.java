package com.adactinhotelapp.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestContext;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Page {
	
	public static WebDriver driver;
	
	public static Properties config=new Properties();
	
	public FileInputStream fis;
	
	public static ExtentReports reports;
	
	public static ExtentTest test;
	
	public TopMenu menu;
	
	public ITestContext context;
	
	public Page()
	{
		
		try {
			fis=new FileInputStream(System.getProperty("user.dir")+"src\\test\\resources\\com\\adactinhotelapp\\properties\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			config.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		menu=new TopMenu();
		
	}
	
	public void log(String message)
	{
		test.log(Status.INFO, message);
	}

	public void click(WebElement element)
	{
		log("Clicking the element "+element );
		
		element.click();
		
		log("Clicked the element "+element );
	}
	
	public void type(WebElement element, String text)
	{
		
		log("Entering the text into "+element );
		
		element.sendKeys(text);
		
		log("Entered the text into "+element );
	}
	
	public void select(WebElement element, String value)
	{
		
		log("Selecting the value from dropdown "+element );
		
		new Select(element).selectByVisibleText(value);
		
		log("Selected the value from dropdown "+element );
	}
	
	
	public boolean verifyEquals(String string1, String string2)

	{
		
		
		boolean status= string1.equalsIgnoreCase(string2);
		
		if(status==true)
		{
			log(string1+" is matched with "+string2);
		}
		else
		{
			log(string1+" is not matched with "+string2);
		}
		
		return status;
		
	}
	
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	
	public void setTestContext(ITestContext context)
	{
		this.context=context;
	}
	
	
	
	
	
	
	
}
