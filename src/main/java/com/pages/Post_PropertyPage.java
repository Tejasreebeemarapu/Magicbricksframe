package com.pages;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;

public class Post_PropertyPage extends Utility {
	public Post_PropertyPage() throws IOException {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//*[@id='mobile__error']/span")
	private WebElement Error;
	
	public String validatePost_Property_PageTitle() {
	Post_PropertyPage.WindowHandle();
		return validatePageTitle();
	}

	@FindBy(xpath = "(//*[contains(text(), 'Owner')])[2]")
	private WebElement select_button_1;

	public void radioButton1() {
		select_button_1.click();

	}

	@FindBy(xpath = "(//*[contains(text() ,' Sell ')])[2]")
	WebElement select_button_2;

	public void radioButton2() {

		select_button_2.click();

	}

	@FindBy(xpath = "//input[@id='ownerMobile']")
	WebElement MobileNumber;

	public void enterMobileNumber(String num) {

		// MobileNumber.click();
		MobileNumber.sendKeys(num);
	}

	@FindBy(xpath = "//button[@class='pp-form__cta']")
	private WebElement start_now;

	public void start_Now() {
		start_now.click();
	}
	public String Error() {
		String error = Error.getText();
		System.out.println(error);
		return error;
	}

}
