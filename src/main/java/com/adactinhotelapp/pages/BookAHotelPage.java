package com.adactinhotelapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotelPage extends Page {

public BookAHotelPage()
{
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//input[@id='hotel_name_dis']")
WebElement hotel_nameDisplay_Txt;
		
@FindBy(xpath="//input[@id='location_dis']")
WebElement hotel_LocationDisplay_Txt;
	
@FindBy(xpath="//input[@id='room_type_dis']")
WebElement hotel_RoomDisplay_Txt;

@FindBy(xpath="//input[@id='room_num_dis']")
WebElement hotel_NumOfRooms_Txt;

@FindBy(xpath="//input[@id='total_days_dis']")
WebElement hotel_TotalDays_Txt;

@FindBy(xpath="//input[@id='price_night_dis']")
WebElement hotel_PricePerNight_Txt;

@FindBy(xpath="//input[@id='price_night_dis']")
WebElement hotel_TotalPrice_Txt;

@FindBy(xpath="//input[@id='gst_dis']")
WebElement hotel_PriceGST_Txt;

@FindBy(xpath="//input[@id='final_price_dis']")
WebElement hotel_FinalBilledPrice_Txt;

@FindBy(xpath="//input[@id='first_name']")
WebElement hotel_FirstName_Txt;

@FindBy(xpath="//input[@id='last_name']")
WebElement hotel_LastName_Txt;
	
@FindBy(xpath="//textarea[@id='address']")
WebElement hotel_BillingAddress;

@FindBy(xpath="//input[@id='cc_num']")
WebElement hotel_CreditCardNum;

@FindBy(xpath="//select[@id='cc_type']")
WebElement hotel_CreditCardType;

@FindBy(xpath="//select[@id='cc_exp_month']")
WebElement hotel_ExpiryMonth; 	

@FindBy(xpath="//select[@id='cc_exp_year']")
WebElement hotel_ExpiryYear;

@FindBy(xpath="//input[@id='cc_cvv']")
WebElement hotel_Cc_CVV;

@FindBy(xpath="//input[@id='book_now']")
WebElement hotel_BookNow_Btn;

public void hotel_nameDisplay_Txt(String text)
{
	verifyEquals((hotel_nameDisplay_Txt.getText()),text);	
}

public void hotel_LocationDisplay_Txt(String text)
{
	verifyEquals((hotel_LocationDisplay_Txt.getText()),text);	
}

public void hotel_RoomDisplay_Txt(String text)
{
	verifyEquals((hotel_RoomDisplay_Txt.getText()),text);	
}

public void hotel_NumOfRooms_Txt(String text)
{
	verifyEquals((hotel_NumOfRooms_Txt.getText()),text);	
}

public void hotel_TotalDays_Txt(String text)
{
	verifyEquals((hotel_TotalDays_Txt.getText()),text);	
}

public void hotel_PricePerNight_Txt(String text)
{
	verifyEquals((hotel_PricePerNight_Txt.getText()),text);	
}
public void hotel_TotalPrice_Txt(String text)
{
	verifyEquals((hotel_TotalPrice_Txt.getText()),text);	
}

public void hotel_PriceGST_Txt(String text)
{
	verifyEquals((hotel_PriceGST_Txt.getText()),text);	
}

public void hotel_FinalBilledPrice_Txt(String text)
{
	verifyEquals((hotel_FinalBilledPrice_Txt.getText()),text);	
}

public void hotel_FirstName_Txt(String text)
{
	verifyEquals((hotel_FirstName_Txt.getText()),text);
	
}

public void hotel_LastName_Txt(String text)
{
	verifyEquals((hotel_LastName_Txt.getText()),text);	
}


public void hotel_BillingAddress(String text)
{
	type(hotel_BillingAddress,text );
}

public void hotel_CreditCardNum(String text)
{
	type(hotel_CreditCardNum,text);
}

public void hotel_CreditCardType(String text)
{
	select(hotel_CreditCardType,text);
}

public void hotel_ExpiryMonth(String text)
{
	select(hotel_ExpiryMonth,text);
}

public void hotel_ExpiryYear(String text)
{
	select(hotel_ExpiryYear,text);
}

public void hotel_Cc_CVV(String text)
{
	type(hotel_Cc_CVV,text);
}

public void hotel_BookNow_Btn(WebElement hotel_BookNow_Btn)
{
	click(hotel_BookNow_Btn);
}


}


 