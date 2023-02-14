package com.adactinhotelapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends Page {

	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@id='location']")
	WebElement loc;

	@FindBy(xpath = "//select[@id='hotels']")
	WebElement hotels;

	@FindBy(xpath = "//select[@id='room_type']")
	WebElement roomtype;

	@FindBy(xpath = "//select[@id='room_nos']")
	WebElement numofrooms;

	@FindBy(xpath = "//input[@id='datepick_in']")
	WebElement indate;

	@FindBy(xpath = "//input[@id='datepick_out']")
	WebElement outdate;

	@FindBy(xpath = "//select[@id='adult_room']")
	WebElement adultroom;

	@FindBy(xpath = "//select[@id='child_room']")
	WebElement childrenroom;

	@FindBy(xpath = "//input[@id='Submit']")
	WebElement searchbutton;
	
	@FindBy(xpath = "//input[@id='Reset']")
	WebElement resetbutton;

	public void location(String value) {

		select(loc, value);

	}

	public void hotels(String value) {

		select(hotels, value);

	}

	public void roomtype(String value) {

		select(roomtype, value);

	}

	public void numofrooms(String value) {

		select(numofrooms, value);

	}

	public void indate(String value) {

		type(indate, value);

	}

	public void outdate(String value) {

		type(outdate, value);
	}

	public void adultroom(String value) {

		select(adultroom, value);
	}

	public void childrenroom(String value) {

		select(childrenroom, value);
	}

	public void searchbutton() {

		click(searchbutton);

	}
	
	public void resetbutton() {

		click(resetbutton);

	}

}