package LandingPagestepdefinitions;

import static org.testng.Assert.assertEquals;




import java.io.IOException;

import com.aventstack.extentreports.Status;
import com.pages.LandingPage;
import com.pages.LoginPage;
import com.utility.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingPageSteps extends Utility {
	public LandingPage ldp;
	public LoginPage lp;
	public void objectMethod() throws IOException {
    ldp = new LandingPage();
    lp=new LoginPage();
	}
	@Given("Chrome is opened and MagicBrick app is launched")
	public void chrome_is_opened_and_MagicBrick_app_is_launched() throws  InterruptedException,IOException {
		objectMethod();
	
	logger = report.createTest("test01");
		Thread.sleep(5000);
		String actualtitle = ldp.validateLandinPageTitle();
		System.out.println(actualtitle); 
		Thread.sleep(2000); 
		logger.log(Status.INFO, "MagicBricks is opened");
		
		
	}
	
	@Then("User navigates on landing page")
	public void User_navigates_on_landing_page() throws IOException, InterruptedException {
		objectMethod();
		Thread.sleep(5000);
		 logger.log(Status.INFO, "Validating landing page title");
		String actualtitle = ldp.validateLandinPageTitle();
		String expectedtitle = "Real Estate | Property in India | Buy/Sale/Rent Properties | MagicBricks";
		Thread.sleep(2000); 
		 
		 try {
	            assertEquals(actualtitle, expectedtitle);
	            logger.log(Status.PASS, "Step1 is passed");
	            System.out.println(actualtitle);
	            assert true;
	        } catch (AssertionError e) {
	            e.printStackTrace();
	            logger.log(Status.FAIL, "Step1 is failed");
	            captureScreenshotOnFailure();
	            assert false;
	        }
	}
	
	@Then("Landing page fields are enabled")
	public void landing_page_fields_are_enabled() throws IOException, InterruptedException {
	    objectMethod();
	    String actualText = ldp.element();

        String expectedText = "Login";

       Thread.sleep(4000);
       try {
           assertEquals(actualText, expectedText);
           logger.log(Status.PASS, "Step2 is passed");
           System.out.println(actualText);
           assert true;
       } catch (AssertionError e) {
           e.printStackTrace();
           logger.log(Status.FAIL, "Step2 is failed");
           captureScreenshotOnFailure();
           assert false;
       }
//        assertEquals(actualText, expectedText);
//
//        System.out.println(actualText);
        logger.log(Status.INFO, "Step3 is passed");
	}
	
	@When("User clicks on login button")
	public void user_clicks_on_login_button() throws IOException, InterruptedException {
	    objectMethod();
	   ldp.login();
	   Utility.implicitWait();
	  // Thread.sleep(3000);
	   ldp.loginButton();
	    Thread.sleep(4000);
	    logger.log(Status.INFO, "Step4 is passed");
	}
	@Then("User navigates to login page")
	public void user_navigates_to_login_page() throws IOException {
	    objectMethod();
	    String actualtitle = lp.validateLoginPageTitle(); 
	    System.out.println(actualtitle); 
        Utility.implicitWait();
        logger.log(Status.INFO, "Step5 is passed");
	}
		

}	