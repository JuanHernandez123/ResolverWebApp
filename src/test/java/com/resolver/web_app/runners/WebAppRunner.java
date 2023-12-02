package com.resolver.web_app.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true, dryRun= false, strict = true, features = { "src/test/java/com/resolver/web_app/featuresFiles"}, 
glue = "com.resolver.web_app.stepDefinitions", 
plugin = {
		"pretty",
		"html:cucumber-htmlreport", 
		"com.cucumber.listener.ExtentCucumberFormatter:target/ExtendReport.html"}, tags= {"@smoke"})

public class WebAppRunner {

}
