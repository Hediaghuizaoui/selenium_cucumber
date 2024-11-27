package com.e2eTest.automation;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/spec/features"},
		plugin = {"pretty", "html:target/cucumber-report.html"},
		//glue = {"step_definitions"},
		tags = (""),
		monochrome = true,
		snippets = CAMELCASE
		
		)

public class RunWebSuiteTest {

}
