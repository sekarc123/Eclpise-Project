package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="feature//Application.feature",glue={"stepdefinition"},
//tags={"@changeProfilepicture"},
monochrome = true,
plugin ={"html:target/cucumber/", "json:target/cucumber.json"})
             
             //"html:target/cucumber-html-report",
    		 //"json:target/cucumber.json",
    		 //"usage:target/cucumber-usage.json",
    		 //"junit:target/cucumber-result.xml"})

public class Test {

}
