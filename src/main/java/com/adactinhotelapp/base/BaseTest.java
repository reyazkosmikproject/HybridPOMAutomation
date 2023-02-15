package com.adactinhotelapp.base;

import java.time.Duration;

import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import com.adactinhotelapp.pages.Page;
import com.adactinhotelapp.reports.ExtentManager;
import com.adactinhotelapp.utilities.Utils;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;

public class BaseTest extends Page {
	

	@BeforeTest
	public void beforeTest(ITestContext context)
	{
		reports=ExtentManager.getReports();
		test=reports.createTest(context.getCurrentXmlTest().getName());
		test.log(Status.INFO, "Starting Tests "+context.getCurrentXmlTest().getName());
		
		context.setAttribute("report", reports);
		context.setAttribute("test", test);
	}
	
	@BeforeMethod
	public void setup()
	{
		
		driver.get(config.getProperty("url"));
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(config.getProperty("implicitWait"))));
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

	@AfterTest
	public void afterTest(ITestContext context)
	{
		reports=(ExtentReports) context.getAttribute("report");
		
		if(reports!=null)
		{
			reports.flush();
		}
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		return Utils.getData("Sheet1", "TC - 102");
		
	}
	
	
	
	
	
	
	
	
	
	

}
