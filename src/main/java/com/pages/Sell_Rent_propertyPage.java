package com.pages;
import java.io.IOException;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utility.Utility;


public class Sell_Rent_propertyPage extends Utility {
	public Sell_Rent_propertyPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String validateSellRentPropertyPageTitle()
	{
		Sell_Rent_propertyPage.WindowHandle();
		return  validatePageTitle();
		} 
}
