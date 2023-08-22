package LandingPageExcel;
import static org.testng.Assert.assertEquals;



import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map;
import org.openqa.selenium.By;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import com.pages.LandingPage;
import com.pages.Post_PropertyPage;
import com.utility.ExcelReader;
import com.utility.Utility;
import com.utility.Config;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingPageStep3 extends Utility {
	public LandingPage ldp;
	public Post_PropertyPage pp;
	ExcelReader reader;
	public void objectMethod() throws IOException {
	    ldp = new LandingPage();
	    pp=new Post_PropertyPage();
	}
	@Given("Chrome is opened and MagicBrick app is launched")
	public void chrome_is_opened_and_magic_brick_app_is_launched() throws IOException, InterruptedException{
		objectMethod();
		Thread.sleep(5000);
		ldp.browserMaximize();
		String actualtitle = ldp.validateLandinPageTitle();
		System.out.println(actualtitle); 
		Thread.sleep(2000); 
	}
	@Then("User navigates on landing page")
	public void user_navigates_on_landing_page() throws IOException, InterruptedException{
		objectMethod();
		Thread.sleep(5000);
		String actualtitle = ldp.validateLandinPageTitle();
		String expectedtitle = "Real Estate | Property in India | Buy/Sale/Rent Properties | MagicBricks";
		assertEquals(expectedtitle, actualtitle);
		System.out.println(actualtitle);
		Thread.sleep(2000); 
	}
	@When("User clicks on postproperty")
	public void user_clicks_on_postproperty() throws IOException, InterruptedException{
		 objectMethod();
		  ldp.Post_property();
		  Thread.sleep(4000);
	}
	@Then("User navigates to postproperty page")
	public void user_navigates_to_postproperty_page() throws IOException {
		 objectMethod();
		   System.out.println("navigates");
	}
	@When("User clicks on Owner button")
	public void user_clicks_on_owner_button() throws InterruptedException, IOException {
		objectMethod();
    	String MainWindow=driver.getWindowHandle();        

        // To handle all new opened window.                
         Set<String> s1=driver.getWindowHandles();        
        Iterator<String> i1=s1.iterator();        
        while(i1.hasNext())            

        {        
            String ChildWindow=i1.next();        
            if(!MainWindow.equalsIgnoreCase(ChildWindow))            

            {           
                    // Switching to Child window

                    driver.switchTo().window(ChildWindow); 
       pp.radioButton1();
       Thread.sleep(3000);
       pp.radioButton2();
       Thread.sleep(6000);
       
//       pp.EnterMobileNumber(MobileNumber);
//       Thread.sleep(3000);
//       pp.Start_now();
//       Thread.sleep(2000);
        }        

      }
     driver.switchTo().window(MainWindow);
	    
	}
	@When("User fills the form from given sheetname {string} and rownumber {int}")
	public void user_fills_the_form_from_given_sheetname_and_rownumber(String sheetName, Integer rowNumber) throws IOException, InvalidFormatException, InterruptedException {
	    Thread.sleep(10000);
		objectMethod();
	    reader = new ExcelReader();

        
       String MainWindow=driver.getWindowHandle();        

        // To handle all new opened window.                
      Set<String> s1=driver.getWindowHandles();        
        Iterator<String> i1=s1.iterator();        
        while(i1.hasNext())            

        {        
            String ChildWindow=i1.next();        
            if(!MainWindow.equalsIgnoreCase(ChildWindow))            

            {           
                    // Switching to Child window

                    driver.switchTo().window(ChildWindow); 
                    List<Map<String,String>> testData = reader.getData(Config.excelPath, sheetName);
        String mno = testData.get(rowNumber).get("mobilenumber");
        pp.enterMobileNumber(mno);
        Thread.sleep(4000);
        pp.start_Now();
     Thread.sleep(2000);
            }        

        }
        driver.switchTo().window(MainWindow);
	}
	@Then("User navigates to sell and Rent property")
	public void user_navigates_to_sell_and_rent_property() {
		
		
//		 String expectedSell and Rent Your Property For Free on Magicbricks 
		 System.out.println("Navigates to Sell and Rent Your Property");
	}

		

}
