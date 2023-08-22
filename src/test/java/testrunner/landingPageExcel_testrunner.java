package testrunner;
import io.cucumber.testng.CucumberOptions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
@CucumberOptions(
features =  "src/test/resources/Features/LandingPage3.feature", 
 glue={"landingpage_excel","apphooks"},
 plugin= {"pretty",

         "json:cucumber-reports/cucumber.json",

         "junit:cucumber-reports/cucumber.xml",

         "html:cucumber-reports/cucumber"}
)

public class landingPageExcel_testrunner extends AbstractTestNGCucumberTests{

}
