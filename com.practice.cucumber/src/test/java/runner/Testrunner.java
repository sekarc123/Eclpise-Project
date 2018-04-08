package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features",glue={"stepDefinition"},monochrome = true,
tags={"@Smoke"},
plugin ={"html:target/cucumber/", "json:target/cucumber.json"}
     )
public class Testrunner 
{
	
}
