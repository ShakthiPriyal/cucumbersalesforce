package com.cucumber.runner;


	import org.junit.runner.RunWith;
	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;
	@RunWith(Cucumber.class)
	@CucumberOptions(features="/Users/lpg/eclipse-practice-workspace/CucumberFrameworkSalesforce/features/Usermenu.feature",
	                  glue= {"com.cucumber.steps"},
	                  plugin= {"pretty","html:/Users/lpg/eclipse-practice-workspace/CucumberFrameworkSalesforce/target/cucumber-reports/cucumber.html",
	                                    "json:/Users/lpg/eclipse-practice-workspace/CucumberFrameworkSalesforce/target/cucumber-reports/cucumber.json"}
			)
	public class UserMenuRunner {
}
