package testRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		//features="Features",
		features=".//Features/Login.feature",
		glue="stepsDefinitions",
		plugin= {"pretty","html:test_output","json:json_report/cucumber.json","junit:junit_xml_report/cucumber.xml"},
		dryRun=false,
		monochrome=true
		)
public class TestRun {

}
