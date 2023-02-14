package com.adactinhotelapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePasswordPage extends Page {

	public ChangePasswordPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@name=current_pass']")
	WebElement current_passTextBox;

	@FindBy(xpath = "//input[@name='new_password']")
	WebElement new_passwordTextBox;

	@FindBy(xpath = "//input[@name='re_password']")
	WebElement re_passwordTextBox;

	@FindBy(xpath = "//inputp[@name='change_password_Submit']")
	WebElement change_password_SubmitButton;

	public void current_passTextBox(String text) {
		type(change_password_SubmitButton, text);

	}

	public void new_passwordTextBox(String text) {
		type(new_passwordTextBox, text);

	}

	public void re_passwordTextBox(String text) {
		type(re_passwordTextBox, text);

	}

	public void change_password_SubmitButton() {
		click(change_password_SubmitButton);

	}

}
