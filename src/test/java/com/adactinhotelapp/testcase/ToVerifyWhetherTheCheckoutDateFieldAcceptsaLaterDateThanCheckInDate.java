package com.adactinhotelapp.testcase;

import org.testng.annotations.Test;

import com.adactinhotelapp.base.BaseTest;
import com.adactinhotelapp.base.Constants;
import com.adactinhotelapp.pages.LoginPage;
import com.adactinhotelapp.pages.SearchHotelPage;
import com.adactinhotelapp.utilities.Utils;

public class ToVerifyWhetherTheCheckoutDateFieldAcceptsaLaterDateThanCheckInDate extends BaseTest{
	
	
	@Test(dataProvider = "getData")
	public void toVerifyWhetherTheCheckoutDateFieldAcceptsaLaterDateThanCheckInDateTest
	(String un,String pwd,String expTitle,String location,String hotels,String noOfRooms,String checkInDate,String checkOutDate,String noOfAdults)
	{
			//loginpage 
		
		LoginPage loginPage=new LoginPage();
		
		//enter username
		
		loginPage.usernameTextBox(un);
		
		//enter password
		
		loginPage.passwordTextBox(pwd);
		
		loginPage.loginButton();
		
		verifyEquals(getTitle(), expTitle);
		
		SearchHotelPage searchHotelPage=new SearchHotelPage();
		
		searchHotelPage.location(location);
		
		searchHotelPage.hotels(hotels);
		
		searchHotelPage.numofrooms(noOfRooms);
		
		searchHotelPage.indate(checkInDate);
		
		searchHotelPage.outdate(checkOutDate);
		
		searchHotelPage.adultroom(noOfAdults);
		
		Utils.captureScreenshot();
		
		searchHotelPage.searchbutton();
		
		
		
		verifyEquals(searchHotelPage.checkInDateError(), Constants.CHECK_IN_DATE_ERROR);
		
		verifyEquals(searchHotelPage.checkOutDateError(), Constants.CHECK_OUT_DATE_ERROR);
		
		Utils.captureScreenshot();
		
	}

}
