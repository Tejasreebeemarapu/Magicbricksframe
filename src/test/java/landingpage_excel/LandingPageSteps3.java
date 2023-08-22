package landingpage_excel;
import static org.testng.Assert.assertEquals;


import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;

import com.aventstack.extentreports.Status;
import com.pages.LandingPage;
import com.pages.Post_PropertyPage;
import com.pages.Sell_Rent_propertyPage;
import com.utility.Config;
import com.utility.ExcelReader;
import com.utility.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LandingPageSteps3 extends Utility
{
	public LandingPage ldp;
	public Post_PropertyPage pp;
	public Sell_Rent_propertyPage sp;
	ExcelReader reader;
	public void objectMethod() throws IOException {
		ldp = new LandingPage();
		pp = new Post_PropertyPage();
		sp = new Sell_Rent_propertyPage();
	}
	@Given("Chrome is opened and MagicBrick app is launched")
	public void chrome_is_opened_and_magic_brick_app_is_launched() throws IOException, InterruptedException {
		objectMethod();
		logger = report.createTest("test01");
		Utility.implicitWait();
		String actualtitle = ldp.validateLandinPageTitle();
		System.out.println(actualtitle);
		Utility.implicitWait();
	}

	@Then("User navigates on landing page")
	public void user_navigates_on_landing_page() throws IOException, InterruptedException {
		objectMethod();
		logger.log(Status.INFO, "Validating landing page title");
		Utility.implicitWait();
		logger = report.createTest("test01");
		String actualtitle = ldp.validateLandinPageTitle();
		String expectedtitle = "Real Estate | Property in India | Buy/Sale/Rent Properties | MagicBricks";
		Thread.sleep(3000);
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
		logger.log(Status.INFO, "Step1 is executed");
		
	}

	@When("User clicks on postproperty")
	public void user_clicks_on_postproperty() throws IOException, InterruptedException {
		objectMethod();
		ldp.Post_property();
		Utility.implicitWait();
		System.out.println("step3");
	}

	@Then("User navigates to postproperty page")
	public void user_navigates_to_postproperty_page() throws IOException, InterruptedException {
		objectMethod();
		logger.log(Status.INFO, "Validating landing page title");
		Utility.implicitWait();
		// Thread.sleep(5000);
		String actualtitle = pp.validatePost_Property_PageTitle();
		String expectedtitle = "Post Free Property Ads | Rent & Sell Property Online";
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
		logger.log(Status.INFO, "Step1 is executed");
		Thread.sleep(2000);
	}
	@When("User clicks on Owner button")
	public void user_clicks_on_owner_button() throws InterruptedException, IOException {
		objectMethod();
		  pp.radioButton1();
	       Thread.sleep(3000);
	       pp.radioButton2();
	       Thread.sleep(6000);
	       }
	@When("User fills the form from given sheetname {string} and rownumber {int}")
	public void user_fills_the_form_from_given_sheetname_and_rownumber(String sheetName, Integer rowNumber) throws IOException, InvalidFormatException, InterruptedException {
	    Thread.sleep(10000);
		objectMethod();
	    reader = new ExcelReader();
	    List<Map<String,String>> testData = reader.getData(Config.excelPath, sheetName);
        String mno = testData.get(rowNumber).get("mobilenumber");
        pp.enterMobileNumber(mno);
        Thread.sleep(4000);
        pp.start_Now();
     Thread.sleep(2000);
}
	@Then("User navigates to sell and Rent property")
	public void user_navigates_to_sell_and_Rent_property() throws IOException {
		System.out.println("Navigates to Sell and Rent Your Property");
		objectMethod();
		String actualtitle = sp.validateSellRentPropertyPageTitle();
	//	String Expectedtitle = "Post Free Property Ads | Rent & Sell Property Online";
		String expectedtitle = "Sell and Rent Your Property For Free on Magicbricks";
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
		logger.log(Status.INFO, "Step1 is executed");
		
	}
}