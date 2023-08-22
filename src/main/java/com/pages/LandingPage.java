package com.pages;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;

public class LandingPage  extends Utility{

  
	
	    @FindBy(xpath="//*[@id='commercialIndex']/header/section[1]/div/div[2]/div[2]/a")
        public WebElement Login;

	    @FindBy(xpath="//*[@id='commercialIndex']/header/section[1]/div/div[2]/div[2]/div/div[2]/a")
        WebElement login_button;
	    
	    @FindBy(xpath="(//a[text()='Login'])[1]")
	    WebElement login;
	
	    
	    @FindBy(xpath="//a[text()='Post Property']")
	    WebElement button1;
	    
	    
	public LandingPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	} 
	
	public String validateLandinPageTitle()
	{
		return validatePageTitle();
		} 
public String element() {
	return login.getText();
}

	  public void login()
	    {
	    Login.click();
	    }

	    public LoginPage loginButton() throws IOException
	    {
	    login_button.click();
	    return new LoginPage();

	    }
public Post_PropertyPage Post_property() throws IOException {
	button1.click();
	return new Post_PropertyPage();
}

}


