package testrunner;

import org.testng.annotations.Test;

import io.cucumber.testng.CucumberOptions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
@CucumberOptions(
features =  "src/test/resources/Features/LandingPage3.feature", 
 glue={"LandingPageExcel","apphooks"},
 plugin= {"pretty",

         "json:cucumber-reports/cucumber.json",

         "junit:cucumber-reports/cucumber.xml",

         "html:cucumber-reports/cucumber"}
)

public class landingPage_testrunner3 extends AbstractTestNGCucumberTests{
  
}
