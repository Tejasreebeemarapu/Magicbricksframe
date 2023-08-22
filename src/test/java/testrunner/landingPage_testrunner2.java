package testrunner;

import org.testng.annotations.Test;


import io.cucumber.testng.CucumberOptions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
@CucumberOptions(
features =  "src/test/resources/Features/LandingPage2.feature", 
 glue={"LandingPageSteps_outline","apphooks"},
 plugin= {"pretty",

         "json:cucumber-reports/cucumber.json",

         "junit:cucumber-reports/cucumber.xml",

         "html:cucumber-reports/cucumber"}
//dryRun=true
)
public class landingPage_testrunner2 extends AbstractTestNGCucumberTests {
  
}
