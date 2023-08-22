package com.pages;
import java.io.IOException;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utility.Utility;

public class LoginPage extends Utility   {
	
	
	public LoginPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String validateLoginPageTitle()
	{
		Utility.WindowHandle();
		return  validatePageTitle();
		} 
	


}
